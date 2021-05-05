package br.com.lobo.contas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lobo.contas.converter.DozerConverter;
import br.com.lobo.contas.data.model.Pessoa;
import br.com.lobo.contas.data.vo.PessoaVO;
import br.com.lobo.contas.exceptions.ResourceNotFoundException;
import br.com.lobo.contas.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	PessoaRepository repository;
	
	public PessoaVO findByLogin(String login) {
		PessoaVO pessoa = new PessoaVO();
		pessoa.setKey(1L);
		pessoa.setLogin(login);
		pessoa.setNome("Carlos Lobo");
		pessoa.setSenha("ffgghhrrt!!@@##");
		return pessoa;
		
	}
	
	public PessoaVO findById(Long id) {
		Pessoa entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Não existe registro para este Id"));
		return DozerConverter.parseObject(entity, PessoaVO.class);
	}
	
	public List<PessoaVO> findAll() {
		return DozerConverter.parseListObjects(repository.findAll(), PessoaVO.class);
	}
	
	public PessoaVO create (PessoaVO pessoa) {
		Pessoa entity = DozerConverter.parseObject(pessoa, Pessoa.class);
		PessoaVO vo = DozerConverter.parseObject(repository.save(entity), PessoaVO.class);
		return vo;
	}
	
	public PessoaVO update (PessoaVO pessoa) {
		return pessoa;
	}

}
