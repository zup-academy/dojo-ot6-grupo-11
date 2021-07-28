package br.com.zupedu.dojo.ot4dojo.turma;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

	@PostMapping
	public ResponseEntity<?> inserirTurma(@RequestBody @Valid TurmaRequest request) {
		return ResponseEntity.created(null);
	}
}
