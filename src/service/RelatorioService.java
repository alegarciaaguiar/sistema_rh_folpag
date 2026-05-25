package service;

import model.Funcionario;
import model.Presenca;

import java.util.List;

public class RelatorioService {

    public void gerarRelatorioFuncionarios(List<Funcionario> funcionarios) {

        System.out.println("===== RELATÓRIO DE FUNCIONÁRIOS =====");

        for (Funcionario f : funcionarios) {

            System.out.println("ID: " + f.getId());
            System.out.println("Nome: " + f.getNome());
            System.out.println("CPF: " + f.getCpf());
            System.out.println("Cargo: " + f.getCargo().getNome());
            System.out.println("-----------------------------");
        }
    }

    // RELATÓRIO DE FALTAS
    public void gerarRelatorioFaltas(List<Presenca> presencas) {

        System.out.println("===== RELATÓRIO DE FALTAS =====");

        for (Presenca p : presencas) {

            if (!p.isPresente()) {

                System.out.println(
                        p.getFuncionario().getNome()
                                + " faltou."
                );
            }
        }
    }

    // RELATÓRIO DE HORAS EXTRAS
    public void gerarRelatorioHorasExtras(List<Presenca> presencas) {

        System.out.println("===== RELATÓRIO HORAS EXTRAS =====");

        for (Presenca p : presencas) {

            if (p.getHorasExtras() > 0) {

                System.out.println(
                        p.getFuncionario().getNome()
                                + " fez "
                                + p.getHorasExtras()
                                + " horas extras."
                );
            }
        }
    }

    // FUNCIONÁRIOS MAIS FALTOSOS
    public void gerarFuncionariosMaisFaltosos(
            List<Funcionario> funcionarios,
            List<Presenca> presencas) {

        System.out.println("===== FUNCIONÁRIOS MAIS FALTOSOS =====");

        for (Funcionario funcionario : funcionarios) {

            int faltas = 0;

            for (Presenca p : presencas) {

                if (p.getFuncionario().getId() ==
                        funcionario.getId()
                        && !p.isPresente()) {

                    faltas++;
                }
            }

            System.out.println(
                    funcionario.getNome()
                            + " teve "
                            + faltas
                            + " faltas."
            );
        }
    }
}
