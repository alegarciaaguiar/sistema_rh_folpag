import model.Cargo;
import model.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Funcionario> funcionario = new ArrayList<>();

        System.out.println("=== CADASTRO FUNCIONARIO ===");

        System.out.print("ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome:");
        String nome = sc.nextLine();
        sc.nextLine();

        System.out.print("CPF:");
        String cpf = sc.nextLine();
        sc.nextLine();

        System.out.print("Cargo:");
        String nomeCargo = sc.nextLine();

        System.out.print("Salario Base:");
        Double salario = sc.nextDouble();

        Cargo cargo = new Cargo(1, nomeCargo, salario);

        Funcionario funcionario = new Funcionario(id, nome, cpf, cargo, salario, 0, 0);

        funcionario.add(funcionario);
        System.out.println("\n FUNCIONARIO CADASTRADO!");


        System.out.println("\n=== FUNCIONARIO ===");

        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome());

            System.out.println(f.getCargo().getNome());

        }
    }





    }





}
