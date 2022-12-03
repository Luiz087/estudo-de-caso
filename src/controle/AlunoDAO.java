package controle;

import java.util.ArrayList;

import modelo.IAlunoDAO;
import modelo.Aluno;


public class AlunoDAO implements IAlunoDAO {

	private static ArrayList<Aluno> tabelaAluno;
	private static AlunoDAO instancia;
	ArrayList<Float> notasAluno = new ArrayList<>();

	private AlunoDAO() {
	}

	public static AlunoDAO getInstancia() {

		if (instancia == null) {
			instancia = new AlunoDAO();
			tabelaAluno = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean inserir(Aluno p) {
		if (p != null) {
			tabelaAluno.add(p);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Long matricula, String nome, String email, ArrayList<Float> notas) {
		for (Aluno aluno : tabelaAluno) {
			if (aluno.getMatricula() == matricula) {
				aluno.setNome(nome);
				aluno.setEmail(email);
				aluno.setNotas(notas);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean excluir(Long matricula) {
		for (Aluno aluno : tabelaAluno) {
			if (aluno.getMatricula() == matricula) {
				tabelaAluno.remove(aluno);
				return true;
			}
		}

		return false;
	}

	@Override
	public ArrayList<Aluno> listarAlunos() {
		return tabelaAluno;
	}

}