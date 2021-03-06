package br.com.zupedu.dojo.ot4dojo.turma;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TurmaRequest {

	@NotBlank
	@Size(max = 50)
	private String nome;
	
	@NotNull
	private LocalDate dataInicio;
	
	@NotNull
	private LocalDate dataFim;


	@Deprecated
	public TurmaRequest() {
	}

	@JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
	public TurmaRequest(String nome, LocalDate dataInicio, LocalDate dataFim) {
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	
	public Turma toModel() {
		return new Turma(nome, dataInicio, dataFim);
	}
	
	public String getNome() {
		return nome;
	}
	
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	
	public LocalDate getDataFim() {
		return dataFim;
	}

}
