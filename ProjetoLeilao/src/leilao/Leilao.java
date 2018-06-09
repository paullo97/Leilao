package leilao;

import java.time.LocalDate;

import endereco.Endereco;
import instituicaofinanceira.InstituicaoFinanceira;

public class Leilao {
	private int id;
	private LocalDate data;
	private Endereco endereco;
	private InstituicaoFinanceira cnpj;
	
	
	
	
	public Leilao(int id, LocalDate data, Endereco endereco, InstituicaoFinanceira cnpj) {
		this.setId(id);
		this.setCnpj(cnpj);
		this.setData(data);
		this.setEndereco(endereco);
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public InstituicaoFinanceira getCnpj() {
		return cnpj;
	}
	public void setCnpj(InstituicaoFinanceira cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
	
}
