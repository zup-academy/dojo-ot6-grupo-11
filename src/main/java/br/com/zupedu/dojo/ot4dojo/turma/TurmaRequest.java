package br.com.zupedu.dojo.ot4dojo.turma;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TurmaRequest {

	@NotBlank
	@Size(max = 50)
	private String nome;
	@NotNull
	private LocalDate dataInicio;
	@NotNull
	private LocalDate dataFim;
	
	public TurmaRequest(String nome, LocalDate dataInicio, LocalDate dataFim) {
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
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
