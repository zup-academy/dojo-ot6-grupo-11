package br.com.zupedu.dojo.ot4dojo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zupedu.dojo.ot4dojo.turma.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long>{

	boolean existsByNome(String nome);
	
}
