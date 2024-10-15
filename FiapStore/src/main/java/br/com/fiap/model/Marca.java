package br.com.fiap.model;

public class Marca {

	private int codigo;
	private String nome;
	private String paisOrigem;
	private String descricao;
	
	public Marca (int codigo, String nome , String paisOrigem , String descricao) {
		this.codigo = codigo;
		this.nome = nome;
		this.paisOrigem = paisOrigem;
		this.descricao = descricao;
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
}
