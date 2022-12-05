package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IAlunoDAO {
	
	public boolean inserir(Aluno p);
	
	public boolean alterar();
	
	public boolean excluir();
	
	public ArrayList<Aluno> listarAlunos();

}