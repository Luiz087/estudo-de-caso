package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IAlunoDAO {
	
	public boolean inserir(Aluno p);
	
	public boolean alterar(Long matricula, String nome, String email, ArrayList<Float> notas);
	
	public boolean excluir(Long matricula);
	
	public ArrayList<Aluno> listarAlunos();

}