package domain.interno;

import domain.Pessoa;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private static int countTotal;

    static {
        countTotal = 0;
    }

    private int id;
    private LocalDate dataInicioContrato;

    public Funcionario(String nome, String cpf, String sobrenome, String ... emails){
        super(nome, cpf, sobrenome, emails);
        this.id = countTotal++;
        this.dataInicioContrato = LocalDate.now();
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Funcionario f))return false;
        return id == f.id;
    }

    @Override
    public int hashCode(){
        return id;
    }

}
