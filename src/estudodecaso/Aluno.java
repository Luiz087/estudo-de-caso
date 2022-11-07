package estudodecaso;

public class Aluno extends Pessoa {

	private Integer matricula;
	private Integer falta;
	private Float notas;

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Integer getFalta() {
		return falta;
	}

	public void setFalta(Integer falta) {
		this.falta = falta;
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
