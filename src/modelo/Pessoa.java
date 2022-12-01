package modelo;

import java.time.LocalDate;

public abstract class Pessoa {

	private String nome;
	private LocalDate dataDeNasci;
	private String email;
	private Long cpf;

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

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long num) {
		this.cpf = num;
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
