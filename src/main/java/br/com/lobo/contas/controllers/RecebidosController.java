package br.com.lobo.contas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lobo.contas.data.vo.RecebidosVO;
import br.com.lobo.contas.services.RecebidosService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="Controller de Recebidos", description="Descrição para Controller de Recebidos", tags= {"Recebidos"})
@RestController
@RequestMapping("/recebidos")
public class RecebidosController {
	
	@Autowired
	private RecebidosService recebidosService;
	
	@ApiOperation(value="Busca por Id")
	@GetMapping("/id/{id}")
	public RecebidosVO findById(@PathVariable("id") Long id) {
		RecebidosVO recebidos = recebidosService.findById(id);
		return recebidos;
	}

}
