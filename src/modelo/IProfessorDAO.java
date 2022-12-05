package modelo;

import java.util.ArrayList;

public interface IProfessorDAO {
	
	public boolean inserir(Professor p);
	
	public void alterar();
	
	public void excluir();
	
	public ArrayList<Professor> listarProfessores();

}