package domain.interno;

import domain.externo.Premium;

import java.util.HashSet;
import java.util.Set;

public class Senior extends CLT{
    private double bonificacao;
    private Set<Pleno> subordinados;
    private Set<Premium> representados;

    public Senior(String nome, String cpf, String sobrenome,
                  double salario, int cargaHoraria,
                  String carteiraTrabalho, Set<String> habilidades,
                  double bonificacao, String... emails) {
        super(nome, cpf, sobrenome, salario, cargaHoraria, carteiraTrabalho, habilidades, emails);
        this.bonificacao = bonificacao;
        this.subordinados = new HashSet<>();
        this.representados = new HashSet<>();
    }

    public boolean addSubordinado(Pleno subordinado){
        return subordinados.add(subordinado);
    }

    public boolean addRepresentado(Premium representado){
        return representados.add(representado);
    }


}
