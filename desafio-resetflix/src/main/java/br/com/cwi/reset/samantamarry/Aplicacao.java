package br.com.cwi.reset.samantamarry;

import java.time.LocalDate;
import java.time.Month;

public class Aplicacao {

    public static void main(String[] args) {
        FakeDatabase fakeDatabase = new FakeDatabase();

        AtorService atorService = new AtorService(fakeDatabase);

        String nome = "Will Smith";
        LocalDate dataNascimento = LocalDate.of(1968, Month.SEPTEMBER, 25);
       // StatusCarreira statusCarreira = StatusCarreira.EM_ATIVIDADE;
        Integer anoInicioAtividade = 1986;
        //AtorRequest atorRequest = new AtorRequest(nome, dataNascimento, statusCarreira, anoInicioAtividade);

       //atorService.criarAtor(atorRequest);

        //List<Ator> atores = fakeDatabase.recuperaAtores();

        //System.out.println("Deve conter 1 ator, quantidade encontrada: " + atores.size());
        //System.out.println("Primeiro ator deve ser 'Will Smith', valor encontrado: " + atores.get(0).getNome());
    }
}