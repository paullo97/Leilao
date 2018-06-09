package instituicaofinanceira;

import endereco.Endereco;

public class InstituicaoFinanceira {
	private String nomeInstituicao;
	private String nomeFantasia;
	private int Cnpj;
	private Endereco endereco;
	
	
	
	
	
	
	public InstituicaoFinanceira(String nomeInstituicao, String nomeFantasia, int cnpj, Endereco endereco) {

		this.setNomeInstituicao(nomeInstituicao);
		this.setNomeFantasia(nomeFantasia);
		this.setCnpj(cnpj);
		this.setEndereco(endereco);
		
	}
	public String getNomeInstituicao() {
		return nomeInstituicao;
	}
	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public int getCnpj() {
		return Cnpj;
	}
	public void setCnpj(int cnpj) {
		Cnpj = cnpj;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
