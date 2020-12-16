package br.com.lobo.contas.data.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class GastosVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private BigDecimal valorPlanejado;
	private BigDecimal valorRealizado;
	private String obs;
	
		
	public GastosVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GastosVO(Long id, BigDecimal valorPlanejado, BigDecimal valorRealizado, String obs) {
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
