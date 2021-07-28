package br.com.zupedu.dojo.ot4dojo.turma;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;

public class TurmaResponse {

    private Long id;
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public TurmaResponse(Turma turma) {
        this.id = turma.getId();
        this.nome = turma.getNome();
        this.dataInicio = turma.getDataInicio();
        this.dataFim = turma.getDataFim();
    }

    public Long getId() {
        return id;
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
