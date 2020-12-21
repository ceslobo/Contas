package br.com.lobo.contas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lobo.contas.data.vo.GastosVO;
import br.com.lobo.contas.services.GastosService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="Controller de Gastos", description="Descrição para Controller de Gastos", tags= {"Gastos"})
@RestController
@RequestMapping("/gastos")
public class GastosController {
	
	@Autowired
	private GastosService gastosService;
	
	@ApiOperation(value="Busca por Id")
	@GetMapping("/id/{id}")
	public GastosVO findById(@PathVariable("id") Long id) {
		GastosVO gastos = gastosService.findById(id);
		return gastos;
	}

}
