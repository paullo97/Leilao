package imovel;

import endereco.Endereco;
import leilao.Leilao;

public class Imovel {
	private String tipo;
	private String tamanho;
	private int qtdcomodo;
	private Endereco endereco;
	private	String descri��o;
	private double precoInicial;
	private double precoFinal;
	private Leilao id_leilao;
	
	
	
	
	
	public Imovel(String tipo, String tamanho, int qtdcomodo, Endereco endereco, String descri��o, double precoInicial,
		 Leilao id_leilao) {
		
		this.setTipo(tipo);
		this.setTamanho(tamanho);
		this.setQtdcomodo(qtdcomodo);
		this.setEndereco(endereco);
		this.setDescri��o(descri��o);
		this.setPrecoInicial(precoInicial);
		this.setPrecoFinal(precoInicial);
		this.setId_leilao(id_leilao);
		
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public int getQtdcomodo() {
		return qtdcomodo;
	}
	public void setQtdcomodo(int qtdcomodo) {
		this.qtdcomodo = qtdcomodo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getDescri��o() {
		return descri��o;
	}
	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}
	public double getPrecoInicial() {
		return precoInicial;
	}
	public void setPrecoInicial(double precoInicial) {
		this.precoInicial = precoInicial;
	}
	public double getPrecoFinal() {
		return precoFinal;
	}
	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}
	public Leilao getId_leilao() {
		return id_leilao;
	}
	public void setId_leilao(Leilao id_leilao) {
		this.id_leilao = id_leilao;
	}
	
	
	
	
	
}
