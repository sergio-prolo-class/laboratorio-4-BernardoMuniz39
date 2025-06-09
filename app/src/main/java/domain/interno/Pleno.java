package domain.interno;

import java.util.HashSet;
import java.util.Set;

public class Pleno extends CLT{
    //associação com senior e junior
    private final Set<Junior> orientados;
    private Senior chefe;
    private Set<Consultoria> intermediarios;


    public Pleno(String nome, String cpf,
                 String sobrenome, double salario,
                 int cargaHoraria, String carteiraTrabalho, Set<String> habilidades, String... emails) {
        super(nome, cpf, sobrenome, salario, cargaHoraria, carteiraTrabalho, habilidades, emails);
        orientados = new HashSet<>();
        intermediarios = new HashSet<>();
    }

    public boolean addOrientado(Junior junior){
        return orientados.add(junior);
    }

    public void setChefe(Senior chefe){
        this.chefe = chefe;
    }
    public boolean addIntermediarios(Consultoria intermediario){
        return intermediarios.add(intermediario);
    }



}
