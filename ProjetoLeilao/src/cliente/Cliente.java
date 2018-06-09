package cliente;

import endereco.Endereco;

public class Cliente {
	
		
		private String nome;
		private int cpf;
		private String sobrenome;
		private String username;
		private String email;
		private String senha;
		private Endereco endereco;
		 
		public Cliente(String nome, String sobrenome, String username, String email, String senha, Endereco  endereco) {
			this.setNome(nome);
			this.setSobrenome(sobrenome);
			this.setUsername(username);
			this.setEmail(email);
			this.setSenha(senha);
			this.setEndereco(endereco);
		}
		
	
		
		
		protected String getNome() {
			return nome;
		}
		protected void setNome(String nome) {
			this.nome = nome;
		}
		protected String getSobrenome() {
			return sobrenome;
		}
		protected void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
		protected String getUsername() {
			return username;
		}
		protected void setUsername(String username) {
			this.username = username;
		}
		protected String getEmail() {
			return email;
		}
		protected void setEmail(String email) {
			this.email = email;
		}
		protected String getSenha() {
			return senha;
		}
		protected void setSenha(String senha) {
			this.senha = senha;
		}
		protected Endereco getEndereco() {
			return endereco;
		}
		protected void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}
		
		public int getCpf() {
			return cpf;
		}


		public void setCpf(int cpf) {
			this.cpf = cpf;
		}
		
		
		

}
