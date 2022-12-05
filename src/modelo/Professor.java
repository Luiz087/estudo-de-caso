package modelo;

public class Professor extends Pessoa {

	private Long siape;
	private String materias;
	private String conteudo;
	private String telefone;

	public Long getSiape() {
		return siape;
	}

	public void setSiape(Long siape) {
		this.siape = siape;
	}

	public String getMaterias() {
		return materias;
	}

	public void setMaterias(String materias) {
		this.materias = materias;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Nome: " + super.getNome() + "\nSiape: " + this.siape + "\nMatéria: " + this.materias + "\nConteúdo: " + this.conteudo + "\nTelefone: " + this.telefone + "\nEmail: " + super.getEmail();
	}

}
