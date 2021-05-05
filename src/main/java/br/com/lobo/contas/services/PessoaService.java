package br.com.lobo.contas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lobo.contas.converter.DozerConverter;
import br.com.lobo.contas.data.model.User;
import br.com.lobo.contas.data.vo.UserVO;
import br.com.lobo.contas.exceptions.ResourceNotFoundException;
import br.com.lobo.contas.repository.UserRepository;

@Service
public class PessoaService {
	
	@Autowired
	UserRepository repository;
	
	public UserVO findByLogin(String login) {
		return DozerConverter.parseObject(repository.findByUsername(login), UserVO.class);
	}
	
	public UserVO findById(Long id) {
		User entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Não existe registro para este Id"));
		return DozerConverter.parseObject(entity, UserVO.class);
	}
	
	public List<UserVO> findAll() {
		return DozerConverter.parseListObjects(repository.findAll(), UserVO.class);
	}
	
	public UserVO create (UserVO user) {
		User entity = DozerConverter.parseObject(user, User.class);
		UserVO vo = DozerConverter.parseObject(repository.save(entity), UserVO.class);
		return vo;
	}
	
	public UserVO update (UserVO user) {
		return user;
	}

}
