package modelo;

public class Aluno extends Pessoa {

	private Long matricula;
	private Float notas;

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public Float getNotas() {
		return notas;
	}

	public void setNotas(Float notas) {
		this.notas = notas;
	}
	
	public String mostrarNotas() {
		return null;
		
	}

}
