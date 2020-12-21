package br.com.lobo.contas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lobo.contas.data.model.Recebidos;

@Repository
public interface RecebidosRepository extends JpaRepository<Recebidos, Long>{

}
