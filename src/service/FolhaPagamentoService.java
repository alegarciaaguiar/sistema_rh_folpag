package service;

import model.Funcionario;

public class FolhaPagamentoService {

    public double calcularSalario(
            Funcionario funcionario) {

        double desconto =
                funcionario.getFaltas() * 100;

        double extra =
                funcionario.getHorasExtrasTotais() * 50;

        return funcionario.getSalarioBase()
                - desconto
                + extra;
    }
}