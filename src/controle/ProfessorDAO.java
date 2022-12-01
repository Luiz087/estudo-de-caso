package controle;

import java.util.ArrayList;


import modelo.IProfessorDAO;
import modelo.Professor;

public class ProfessorDAO implements IProfessorDAO {

	private static ArrayList<Professor> tabelaProfessor;
	private static ProfessorDAO instancia;

	private ProfessorDAO() {
	}

	public static ProfessorDAO getInstancia() {

		if (instancia == null) {
			instancia = new ProfessorDAO();
			tabelaProfessor = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean inserir(Professor p) {
		if (p != null) {
			tabelaProfessor.add(p);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Long siape, String materias, String conteudo, String telefone) {
		for (Professor professor : tabelaProfessor) {

			if (professor.getSiape() == siape) {
				professor.setMaterias(materias);
				professor.setConteudo(conteudo);
				professor.setTelefone(telefone);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean excluir(Long siape) {
		for (Professor professor : tabelaProfessor) {
			if (professor.getSiape() == siape) {
				tabelaProfessor.remove(professor);
				return true;
			}
		}

		return false;
	}

	@Override
	public ArrayList<Professor> listarProfessores() {
		return tabelaProfessor;
	}

}