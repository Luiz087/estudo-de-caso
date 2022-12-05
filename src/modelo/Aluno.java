package modelo;

import java.util.ArrayList;

public class Aluno extends Pessoa {

	private Long matricula;
	ArrayList<Float> notasAluno = new ArrayList<>();

	public ArrayList<Float> getNotas() {
		return notasAluno;
	}

	public void setNotas(ArrayList<Float> notas) {
		this.notasAluno = notas;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public void inserirNotas(Float notas) {
		notasAluno.add(notas);
	}
	
	@Override
	public String toString() {
	return "\nNome: " + super.getNome() + "\nMatricula: " + this.matricula + "\nNotas: " + this.notasAluno + "\nEmail: " + super.getEmail() + "\n";
	}

}