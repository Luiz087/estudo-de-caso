package modelo;

import java.util.ArrayList;

public interface IProfessorDAO {
	
	public boolean inserir(Professor p);
	
	public boolean alterar();
	
	public boolean excluir();
	
	public ArrayList<Professor> listarProfessores();

}