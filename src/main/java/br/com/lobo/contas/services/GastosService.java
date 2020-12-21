package br.com.lobo.contas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lobo.contas.converter.DozerConverter;
import br.com.lobo.contas.data.model.Gastos;
import br.com.lobo.contas.data.vo.GastosVO;
import br.com.lobo.contas.exceptions.ResourceNotFoundException;
import br.com.lobo.contas.repository.GastosRepository;

@Service
public class GastosService {

	@Autowired
	GastosRepository repository;
	
	public GastosVO findById(Long id) {
		Gastos entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Não existe registro para este Id"));
		return DozerConverter.parseObject(entity, GastosVO.class);
	}
}
