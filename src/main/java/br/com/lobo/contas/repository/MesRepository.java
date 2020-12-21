package br.com.lobo.contas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lobo.contas.data.model.Mes;

@Repository
public interface MesRepository extends JpaRepository<Mes, Long>{

}
