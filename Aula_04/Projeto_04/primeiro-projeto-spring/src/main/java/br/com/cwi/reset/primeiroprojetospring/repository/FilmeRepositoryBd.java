package br.com.cwi.reset.primeiroprojetospring.repository;

import br.com.cwi.reset.primeiroprojetospring.domain.Filme;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmeRepositoryBd extends CrudRepository<Filme, Integer> {
    Filme findByNome(String name);

    List<Filme> findByDuracao(Integer duracao);

    List<Filme> findByDescricaoContains(String descricao);

    List<Filme> findByDiretorNomeIgnoringCase(String nomeDiretor);

    List<Filme> findAll();
}