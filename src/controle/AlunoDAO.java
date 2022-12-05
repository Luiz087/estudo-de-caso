package controle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import modelo.IAlunoDAO;
import modelo.Aluno;

public class AlunoDAO implements IAlunoDAO {

	Scanner leitura = new Scanner(System.in);
	private static ArrayList<Aluno> tabelaAluno;
	private static AlunoDAO instancia;
	ArrayList<Float> notasAluno = new ArrayList<>();
	ArrayList<Float> notasAlterar = new ArrayList<>();
	String numAluno = null;
	Aluno listaA = null;
	
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
	public void alterar() {
		if(!tabelaAluno.isEmpty()) {
			for (int i = 0; i < tabelaAluno.size(); i++) {
				listaA = tabelaAluno.get(i);
				System.out.println("[ " + i + " ] - " + listaA.getNome());
			}
			System.out.println("Qual aluno deseja alterar: ");
			numAluno = leitura.nextLine();
			
			Aluno cont = tabelaAluno.get(Integer.valueOf(numAluno));
			
			System.out.println("Insira novo nome:");
			String nomeAlt = leitura.nextLine();
			System.out.println("Insira novo email:");
			String emailAlt = leitura.nextLine();
			System.out.println("Quantas notas deseja inserir:");
			Integer qtdNotas = Integer.valueOf(leitura.nextLine());
			for (int i = 0; i < qtdNotas; i++) {
				System.out.println("Nota " + (i + 1) + ":");
				Float notasAlt = Float.parseFloat(leitura.nextLine());
				notasAlterar.add(notasAlt);

			}
			if (!nomeAlt.isEmpty() && !emailAlt.isEmpty() && !notasAlterar.isEmpty()) {
				cont.setEmail(emailAlt);
				cont.setNome(nomeAlt);
				cont.setNotas(notasAlterar);
			} else {
				System.out.println("Algum dado não foi inserido corretamente.\nVoltando para a tela inicial...\n");
			}
		} else {
			System.out.println("\nLista vazia.");
		}	
	}

	@Override
	public void excluir() {
		if(!tabelaAluno.isEmpty()) {
			for (int i = 0; i < tabelaAluno.size(); i++) {
				listaA = tabelaAluno.get(i);
				System.out.println("[ " + i + " ] - " + listaA.getNome());
			}
			System.out.println("Qual aluno deseja excluir: ");
			int excluirAluno = leitura.nextInt();
			leitura.nextLine();
			
			tabelaAluno.remove(excluirAluno);
		}
	}

	@Override
	public ArrayList<Aluno> listarAlunos() {
		return tabelaAluno;
	}

}