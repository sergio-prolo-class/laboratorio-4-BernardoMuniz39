package domain.interno;

import java.util.Set;

public class Junior extends CLT{
    //ASOCIAÇÃO COM PLENO
    private Pleno orientador;


    public Junior(String nome, String cpf, String sobrenome,
                  double salario, int cargaHoraria,
                  String carteiraTrabalho, Set<String> habilidades, String... emails) {
        super(nome, cpf, sobrenome, salario, cargaHoraria, carteiraTrabalho, habilidades, emails);
        orientador = null;
    }

    public void setOrientador(Pleno orientador){
        this.orientador = orientador;
    }

}
