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
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="Controller de Pessoa", description="Descrição para Controller de Pessoa", tags= {"Pessoa"})
@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService; 
	
	@ApiOperation(value="Busca por Login")
	@GetMapping("/login/{login}")
	public PessoaVO findByLogin(@PathVariable("login") String login) {
		return pessoaService.findByLogin(login);
	}

	@ApiOperation(value="Busca por Id")
	@GetMapping("/id/{id}")
	public PessoaVO findById(@PathVariable("id") Long id) {
		PessoaVO pessoa = pessoaService.findById(id);
		return pessoa;
	}
	
	@ApiOperation(value="Criar nova Pessoa")
	@PostMapping
	public PessoaVO create(@RequestBody PessoaVO pessoa) {
		return pessoaService.create(pessoa);
	}
	
	@ApiOperation(value="Alterar Pessoa")
	@PutMapping
	public PessoaVO update(@RequestBody PessoaVO pessoa) {
		return pessoaService.update(pessoa);
	}
	
}
