package br.com.zupedu.dojo.ot4dojo.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zupedu.dojo.ot4dojo.turma.Turma;
import org.springframework.stereotype.Repository;


@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long>{

	boolean existsByNome(String nome);
	boolean existsByDataInicio(LocalDate dataInicio);
	
}
