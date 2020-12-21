package br.com.lobo.contas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lobo.contas.converter.DozerConverter;
import br.com.lobo.contas.data.model.Recebidos;
import br.com.lobo.contas.data.vo.RecebidosVO;
import br.com.lobo.contas.exceptions.ResourceNotFoundException;
import br.com.lobo.contas.repository.RecebidosRepository;

@Service
public class RecebidosService {

	@Autowired
	RecebidosRepository repository;
	
	public RecebidosVO findById(Long id) {
		Recebidos entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Não existe registro para este Id"));
		return DozerConverter.parseObject(entity, RecebidosVO.class);
	}
}
