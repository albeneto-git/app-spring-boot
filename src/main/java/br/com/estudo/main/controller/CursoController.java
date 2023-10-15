package br.com.estudo.main.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudo.main.model.Curso;

@RestController
public class CursoController {

	@RequestMapping("/cursos")
	public List<Curso> getTodosCursos(){
		return Arrays.asList(
				new Curso(1, "Learn AWS", "in28minutes"),
				new Curso(2, "Learn Java", "in28minutes"),
				new Curso(3, "Learn API Rest", "in28minutes")
				);
	}
}
