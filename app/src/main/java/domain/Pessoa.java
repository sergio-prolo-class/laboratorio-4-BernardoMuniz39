package domain;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class Pessoa {
    private String nome;
    private String cpf;
    private String sobreNome;
    private Set<String> emails;

    public Pessoa(String nome, String cpf, String sobreNome, String ... emails) {
        this.nome = nome;
        this.cpf = cpf;
        this.sobreNome = sobreNome;
        this.emails = new HashSet<String>(Arrays.asList(emails));
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Pessoa p))return false;
        return cpf.equals(p.cpf);
    }

    @Override
    public int hashCode(){
        return cpf.hashCode();
    }


}

