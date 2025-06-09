package domain.interno;

import java.time.LocalDate;

public class Consultoria extends Temporario{
    private Pleno intermediario;
    private int numRelatorios;

    public Consultoria(String nome, String cpf, String sobrenome, LocalDate dataTerminoDeContrato,
                       double valorTotalDoContrato, int numRelatorios, String... emails) {
        super(nome, cpf, sobrenome, dataTerminoDeContrato, valorTotalDoContrato, emails);
        this.intermediario = null;
        this.numRelatorios = numRelatorios;
    }

    public void setIntermediario(Pleno intermediario){
        this.intermediario = intermediario;
    }

}
