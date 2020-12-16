package br.com.lobo.contas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lobo.contas.data.vo.PessoaVO;
import br.com.lobo.contas.services.PessoaService;


@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService; 
	
	@GetMapping("/login/{login}")
	public PessoaVO findByLogin(@PathVariable("login") String login) {
		return pessoaService.findByLogin(login);
	}

	@GetMapping("/id/{id}")
	public PessoaVO findById(@PathVariable("id") Long id) {
		return pessoaService.findById(id);
	}
	
	@PostMapping
	public PessoaVO create(@RequestBody PessoaVO pessoa) {
		return pessoaService.create(pessoa);
	}
	
	@PutMapping
	public PessoaVO update(@RequestBody PessoaVO pessoa) {
		return pessoaService.update(pessoa);
	}
	
}
