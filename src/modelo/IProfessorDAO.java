package modelo;

import java.util.ArrayList;

public interface IProfessorDAO {
	
	public boolean inserir(Professor p);
	
	public boolean alterar(Professor p, Long siape);
	
	public boolean excluir(Professor p, Long siape);
	
	public ArrayList<Professor> listarProfessores();

}