package modelo;

import java.util.ArrayList;

public interface IAlunoDAO {
	
	public boolean inserir(Aluno p);
	
	public boolean alterar(Long matricula);
	
	public boolean excluir(Long matricula);
	
	public ArrayList<Aluno> listarAlunos();

}