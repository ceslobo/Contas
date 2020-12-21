package br.com.lobo.contas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lobo.contas.converter.DozerConverter;
import br.com.lobo.contas.data.model.Mes;
import br.com.lobo.contas.data.vo.MesVO;
import br.com.lobo.contas.exceptions.ResourceNotFoundException;
import br.com.lobo.contas.repository.MesRepository;

@Service
public class MesService {
	
	@Autowired
	MesRepository repository;
	
	public MesVO findById(Long id) {
		Mes entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Não existe registro para este Id"));
		return DozerConverter.parseObject(entity, MesVO.class);
	}

}
