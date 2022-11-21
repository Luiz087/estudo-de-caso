package modelo;

import java.util.ArrayList;

public interface IAlunoDAO {
	
	public boolean inserir(Aluno p);
	
	public boolean alterar(Aluno p, Long siape);
	
	public boolean excluir(Aluno p, Long siape);
	
	public ArrayList<Aluno> listarAlunos();

}