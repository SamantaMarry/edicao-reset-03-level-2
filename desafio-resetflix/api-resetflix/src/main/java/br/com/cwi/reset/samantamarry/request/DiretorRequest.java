package br.com.cwi.reset.samantamarry.request;



import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;

public class DiretorRequest {


    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo Nome.")
    private String nome;


    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo Data de Nascimento.")
    @Past(message = "Não é possível cadastrar não nascidos.")
    private LocalDate dataNascimento;

    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo Ano Inicio de Atividade.")
    private Integer anoInicioAtividade;


    public DiretorRequest(String nome, LocalDate dataNascimento, Integer anoInicioAtividade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoInicioAtividade = anoInicioAtividade;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Integer getAnoInicioAtividade() {
        return anoInicioAtividade;
    }
}
