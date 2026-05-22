package model;

public class FolhaPagamento extends Funcionario {

    private int id;
    private double descontoFaltas;
    private double valorHorasExtras;
    private double salarioFinal;


    public FolhaPagamento(int id, String nome, String cpf, Cargo cargo, double salarioBase, int faltas, double horasExtrasTotais, double descontoFaltas, double valorHorasExtras, double salarioFinal) {
        super(id, nome, cpf, cargo, salarioBase, faltas, horasExtrasTotais);
        this.id = id;
        this.descontoFaltas = descontoFaltas;
        this.valorHorasExtras = valorHorasExtras;
        this.salarioFinal = salarioFinal;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public double getDescontoFaltas() {
        return descontoFaltas;
    }

    public void setDescontoFaltas(double descontoFaltas) {
        this.descontoFaltas = descontoFaltas;
    }

    public double getValorHorasExtras() {
        return valorHorasExtras;
    }

    public void setValorHorasExtras(double valorHorasExtras) {
        this.valorHorasExtras = valorHorasExtras;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
}
