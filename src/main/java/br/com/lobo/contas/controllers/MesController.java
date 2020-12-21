package br.com.lobo.contas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lobo.contas.data.vo.MesVO;
import br.com.lobo.contas.services.MesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="Controller de Mês", description="Descrição para Controller de Mês", tags= {"Mês"})
@RestController
@RequestMapping("/mes")
public class MesController {

	@Autowired
	private MesService mesService; 
	
	@ApiOperation(value="Busca por Id")
	@GetMapping("/id/{id}")
	public MesVO findById(@PathVariable("id") Long id) {
		MesVO mes = mesService.findById(id);
		return mes;
	}
	
}
