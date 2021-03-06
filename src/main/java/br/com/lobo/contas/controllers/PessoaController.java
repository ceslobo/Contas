package br.com.lobo.contas.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lobo.contas.data.vo.UserVO;
import br.com.lobo.contas.services.PessoaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@Api(value="Controller de Pessoa", tags= {"Pessoa"})
@SwaggerDefinition(tags = {
	    @Tag(name = "Pessoa", description = "Descrição para Controller de Pessoa")
	})
@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService; 
	
	@ApiOperation(value="Busca por Login")
	@GetMapping("/login/{login}")
	public UserVO findByLogin(@PathVariable("login") String login) {
		return pessoaService.findByLogin(login);
	}

	@ApiOperation(value="Busca por Id")
	@GetMapping("/id/{id}")
	public UserVO findById(@PathVariable("id") Long id) {
		UserVO pessoa = pessoaService.findById(id);
		return pessoa;
	}
	
	@ApiOperation(value="Busca Todas as Pessoas")
	@GetMapping("/")
	public List<UserVO> findAll() {
		return pessoaService.findAll();
	}
	
	@ApiOperation(value="Criar nova Pessoa")
	@PostMapping
	public UserVO create(@RequestBody UserVO pessoa) {
		return pessoaService.create(pessoa);
	}
	
	@ApiOperation(value="Alterar Pessoa")
	@PutMapping
	public UserVO update(@RequestBody UserVO pessoa) {
		return pessoaService.update(pessoa);
	}
	
}
