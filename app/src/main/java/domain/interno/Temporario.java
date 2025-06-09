package domain.interno;

import java.time.LocalDate;

public class Temporario extends Funcionario{
    private LocalDate dataTerminoDeContrato;
    private double valorTotalDoContrato;

    public Temporario(String nome, String cpf, String sobrenome,
                      LocalDate dataTerminoDeContrato, double valorTotalDoContrato,
                      String... emails) {
        super(nome, cpf, sobrenome, emails);
        this.dataTerminoDeContrato = dataTerminoDeContrato;
        this.valorTotalDoContrato = valorTotalDoContrato;
    }
}
