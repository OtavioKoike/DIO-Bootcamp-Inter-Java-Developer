package one.innovation.digital.poo.pilares.encapsulamento;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(final String nome, final int dia, final int mes, final int ano){
        this.nome = nome;
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }

    public int idade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
