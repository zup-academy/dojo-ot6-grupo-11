package br.com.zupedu.dojo.ot4dojo.turma;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zupedu.dojo.ot4dojo.repository.TurmaRepository;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

	@Autowired
	private TurmaRepository turmaRepository;
	
	@PostMapping
	public ResponseEntity<?> inserirTurma(UriComponentsBuilder uriComponentsBuilder, @RequestBody @Valid TurmaRequest request) {
		if(!turmaRepository.existsByNome(request.getNome())) {
			if (request.getDataInicio().isBefore(request.getDataFim()) ) {
				if(!turmaRepository.existsByDataInicio(request.getDataInicio())) {
					Turma turma = request.toModel();
					turmaRepository.save(turma);

					URI uri = uriComponentsBuilder.path("/turmas/{id}").buildAndExpand(turma.getId()).toUri();
					return ResponseEntity.created(uri).body(new TurmaResponse(turma));
				}
			}
		}
		return ResponseEntity.badRequest().build();
		
		
		
	}
}
