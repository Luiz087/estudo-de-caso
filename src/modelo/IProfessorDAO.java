package modelo;

import java.util.ArrayList;

public interface IProfessorDAO {
	
	public boolean inserir(Professor p);
	
	public boolean alterar(Long siape);
	
	public boolean excluir(Long siape);
	
	public ArrayList<Professor> listarProfessores();

}