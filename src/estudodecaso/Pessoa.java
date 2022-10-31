package estudodecaso;

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private LocalDate dataDeNasci;
	private String cpf;
	private String senha;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNasci() {
		return dataDeNasci;
	}

	public void setDataDeNasci(LocalDate dataDeNasci) {
		this.dataDeNasci = dataDeNasci;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void definirNome() {

	}

}
