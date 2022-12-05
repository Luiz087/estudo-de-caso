package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IAlunoDAO {
	
	public boolean inserir(Aluno p);
	
	public void alterar();
	
	public void excluir();
	
	public ArrayList<Aluno> listarAlunos();

}