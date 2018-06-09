package veiculo;

import leilao.Leilao;

public class Veiculo {

	private String tipo;
	private double preco;
	private String  placa;
	private String cidade;
	private int  ano;
	private double kmrodado;
	private int qtddono;
	private String  cor;
	private Leilao id_leilao;
	private double precoInicial;
	private double precoFinal;
	
	
	
	
	public Veiculo(String tipo, double preco, String placa, String cidade, int ano, double kmrodado, int qtddono,
			String cor, Leilao id_leilao, double precoInicial, double precoFinal) {
		
		
		this.setTipo(tipo);
		this.setPreco(preco);
		this.setPlaca(placa);
		this.setCidade(cidade);
		this.setAno(ano);
		this.setKmrodado(kmrodado);
		this.setQtddono(qtddono);
		this.setCor(cor);
		this.setId_leilao(id_leilao);
		this.setPrecoInicial(precoInicial);
		this.setPrecoFinal(precoFinal);
	

		
		
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getKmrodado() {
		return kmrodado;
	}
	public void setKmrodado(double kmrodado) {
		this.kmrodado = kmrodado;
	}
	public int getQtddono() {
		return qtddono;
	}
	public void setQtddono(int qtddono) {
		this.qtddono = qtddono;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Leilao getId_leilao() {
		return id_leilao;
	}
	public void setId_leilao(Leilao id_leilao) {
		this.id_leilao = id_leilao;
	}
	
	
	
	
	
	
}
