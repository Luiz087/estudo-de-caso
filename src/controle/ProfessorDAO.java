package controle;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Aluno;
import modelo.IProfessorDAO;
import modelo.Professor;

public class ProfessorDAO implements IProfessorDAO {
	
	Scanner leitura = new Scanner(System.in);
	private static ArrayList<Professor> tabelaProfessor;
	private static ProfessorDAO instancia;
	Professor listaP = null;
	String numProfessor = null;

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
	public void alterar() {
		if(!tabelaProfessor.isEmpty()) {
			for (int i = 0; i < tabelaProfessor.size(); i++) {
				listaP = tabelaProfessor.get(i);
				System.out.println("[ " + i + " ] - " + listaP.getNome());
			}
			System.out.println("Qual professor deseja alterar: ");
			numProfessor = leitura.nextLine();
			
			Professor cont = tabelaProfessor.get(Integer.valueOf(numProfessor));
			
			System.out.println("Insira novo nome: ");
			String nome2 = leitura.nextLine();
			System.out.println("Matéria nova: ");
			String materia2 = leitura.nextLine();
			System.out.println("Telefone novo: ");
			String telefone2 = leitura.nextLine();
			System.out.println("Conteúdo novo: ");
			String conteudo2 = leitura.nextLine();
			System.out.println("Email novo: ");
			String email2 = leitura.nextLine();
			if (!nome2.isEmpty() && !email2.isEmpty() && !materia2.isEmpty() && !telefone2.isEmpty()
					&& !conteudo2.isEmpty()) {
				cont.setNome(nome2);
				cont.setMaterias(materia2);
				cont.setTelefone(telefone2);
				cont.setConteudo(conteudo2);
				cont.setEmail(email2);
			} else {
				System.out.println("Algum dado não foi inserido corretamente.\nVoltando para a tela inicial...\n");
			}
		} else {
			System.out.println("\nLista vazia.");
		}
	}

	@Override
	public void excluir() {
		if(!tabelaProfessor.isEmpty()) {
			for (int i = 0; i < tabelaProfessor.size(); i++) {
				listaP = tabelaProfessor.get(i);
				System.out.println("[ " + i + " ] - " + listaP.getNome());
			}
			System.out.println("Qual professor deseja excluir: ");
			int numProfessor = leitura.nextInt();
			leitura.nextLine();
			
			tabelaProfessor.remove(numProfessor);
		}

	}

	@Override
	public ArrayList<Professor> listarProfessores() {
		return tabelaProfessor;
	}

}