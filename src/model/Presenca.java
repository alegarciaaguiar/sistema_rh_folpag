package model;

import java.time.LocalDate;

public class Presenca extends Funcionario {

    private int id;
    private LocalDate data;
    private boolean presente;
    private double horasExtras;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public Presenca(int id, String nome, String cpf, Cargo cargo, double salarioBase, int faltas, double horasExtrasTotais, LocalDate data, boolean presente, double horasExtras) {
        super(id, nome, cpf, cargo, salarioBase, faltas, horasExtrasTotais);
        this.id = id;
        this.data = data;
        this.presente = presente;
        this.horasExtras = horasExtras;
    }

    public Funcionario getFuncionario() {
        return null;
    }
}
