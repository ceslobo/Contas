package br.com.lobo.contas.ola;

public class Ola {
	
	private final long id;
	private final String nome;
	
	
	public Ola(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}

}
