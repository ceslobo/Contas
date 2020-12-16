package br.com.lobo.contas.data.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gastos implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="valor_planejado")
	private BigDecimal valorPlanejado;
	
	@Column(name="valor_realizado")
	private BigDecimal valorRealizado;
	
	private String obs;
	
		
	public Gastos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gastos(Long id, BigDecimal valorPlanejado, BigDecimal valorRealizado, String obs) {
		super();
		this.id = id;
		this.valorPlanejado = valorPlanejado;
		this.valorRealizado = valorRealizado;
		this.obs = obs;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getValorPlanejado() {
		return valorPlanejado;
	}

	public void setValorPlanejado(BigDecimal valorPlanejado) {
		this.valorPlanejado = valorPlanejado;
	}

	public BigDecimal getValorRealizado() {
		return valorRealizado;
	}

	public void setValorRealizado(BigDecimal valorRealizado) {
		this.valorRealizado = valorRealizado;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
	
	
	

}
