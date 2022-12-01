package visao;

import java.time.LocalDate;

import java.util.Scanner;

import controle.AlunoDAO;
import controle.ProfessorDAO;
import modelo.Aluno;
import modelo.IProfessorDAO;
import modelo.Professor;

public class MainPessoa {

	private static AlunoDAO bdAluno;
	private static ProfessorDAO bdProfessor;

	public static void main(String[] args) {

		// Viabilizando leitura via Scanner
		Scanner leitura = new Scanner(System.in);

		Integer contMenu = Integer.MAX_VALUE;
		while (contMenu != 3) {
			System.out.println("\nBem vindo a escola Pablo Escobar, onde nosso intuito é traf... te ensinar");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Menu:\n1-Opções de Aluno\n2-Opções de Professor\n3-Sair");
			contMenu = Integer.valueOf(leitura.nextLine());

			switch (contMenu) {
			case 1:
				Aluno aluno = new Aluno();
				Long matricula2 = null;
				System.out.println("1-Listar Aluno\n2-Alterar Aluno\n3-Excluir Aluno\n4-Incluir Aluno\n5-Voltar");
				Integer contAluno = Integer.valueOf(leitura.nextLine());
				switch (contAluno) {
				case 1: // Listar
					bdAluno = AlunoDAO.getInstancia();
					if (bdAluno.listarAlunos().size() == 0) {
						System.out.println("nenhum aluno cadastrado");
					} else {
						for (Aluno alunoListar : bdAluno.listarAlunos()) {
							System.out.println(alunoListar.toString());
						}
					}

					break;

				case 2: // Alterar
					System.out.println("Insira a matrícula do aluno:");
					matricula2 = Long.valueOf(leitura.nextLine());
					bdAluno.alterar(matricula2);
					break;
				case 3: // Excluir
					System.out.println("Insira a matrícula do aluno:");
					matricula2 = Long.valueOf(leitura.nextLine());
					bdAluno.excluir(matricula2);
					break;
				case 4:
					// Lendo nome
					System.out.println("Insira nome:");
					String nomeAluno = leitura.nextLine();
					if (!nomeAluno.isEmpty()) {
						aluno.setNome(nomeAluno);
					}

					// Lendo Cpf
					System.out.println("Insira Cpf:");
					String cpfAluno = leitura.nextLine();
					if (!cpfAluno.isEmpty()) {
						aluno.setCpf(Long.parseLong(cpfAluno));
					}

					// Lendo dados da data
					System.out.println("Insira data de nascimento:");
					System.out.println("Insira dia:");
					String diaStr2 = leitura.nextLine();
					System.out.println("Insira mês:");
					String mesStr2 = leitura.nextLine();
					System.out.println("Insira ano:");
					String anoStr2 = leitura.nextLine();

					// Criando uma data
					if (!diaStr2.isEmpty() && !mesStr2.isEmpty() && !anoStr2.isEmpty()) {
						int ano = Integer.parseInt(anoStr2);
						int mes = Integer.parseInt(mesStr2);
						int dia = Integer.parseInt(diaStr2);
						LocalDate data = LocalDate.of(ano, mes, dia);
						aluno.setDataDeNasci(data);
					}

					// Lendo Siape
					System.out.println("Insira matrícula:");
					String matricula = leitura.nextLine();
					if (!matricula.isEmpty()) {
						aluno.setMatricula(Long.parseLong(matricula));
					}

					// Lendo email
					System.out.println("Insira email:");
					String emailProfessor = leitura.nextLine();
					if (!emailProfessor.isEmpty()) {
						aluno.setEmail(emailProfessor);
					}

					System.out.println("1- Exibir informações e concluir\n2- Apenas concluir o cadastro: ");
					Integer contExibirAluno = Integer.valueOf(leitura.nextLine());

					if (contExibirAluno == 1) {
						// Exibicao dos atributos do objeto pessoa
						System.out.println("- INFORMAÇÕES DO(A) PROFESSOR(A)");
						System.out.println("Nome: " + aluno.getNome());
						System.out.println("Cpf: " + aluno.getCpf());
						System.out.println("Data de nascimento: " + aluno.getDataDeNasci().toString());
						System.out.println("E-mail: " + aluno.getEmail());
						System.out.println("Matrícula:" + aluno.getMatricula().toString());
					}

					// Insere pessoa no 'banco' fake
					bdAluno = AlunoDAO.getInstancia();
					bdAluno.inserir(aluno);
					break;
				case 5:
					System.out.println("Você escolheu voltar.[[");
					break;

				}
				break;
			case 2:
				Long siape2 = null;
				Professor professor = new Professor();
				String materia2 = null, conteudo2 = null, telefone2 = null;

				System.out.println("1-Listar Professor\n2-Alterar Professor\n3-Excluir Professor\n4-Incluir Professor\n5-Voltar");
				Integer contProfessor = Integer.valueOf(leitura.nextLine());
				switch (contProfessor) {
				case 1:
					bdProfessor = ProfessorDAO.getInstancia();
					if (bdProfessor.listarProfessores().size() == 0) {
						System.out.println("nenhum professor cadastrado");
					} else {
						for (Professor professorListar : bdProfessor.listarProfessores()) {
							System.out.println(professorListar.toString());
						}
					}

					break;
				case 2:
					System.out.println("Insira o siape do professor:");
					siape2 = Long.valueOf(leitura.nextLine());
					System.out.println("Matéria nova:");
					materia2 = leitura.nextLine();
					System.out.println("Telefone novo:");
					telefone2 = leitura.nextLine();
					System.out.println("Conteúdo novo:");
					conteudo2 = leitura.nextLine();
					bdProfessor.alterar(siape2, materia2, conteudo2, telefone2);
					break;
				case 3:
					System.out.println("Insira o siape do professor:");
					siape2 = Long.valueOf(leitura.nextLine());
					bdProfessor.excluir(siape2);
					break;
				case 4:
					// Lendo nome
					System.out.println("Insira nome:");
					String nome = leitura.nextLine();
					if (!nome.isEmpty()) {
						professor.setNome(nome);
					}

					// Lendo Cpf
					System.out.println("Insira Cpf:");
					String cpf = leitura.nextLine();
					if (!cpf.isEmpty()) {
						professor.setCpf(Long.parseLong(cpf));
					}

					// Lendo dados da data
					System.out.println("Insira data de nascimento:");
					System.out.println("Insira dia:");
					String diaStr = leitura.nextLine();
					System.out.println("Insira mês:");
					String mesStr = leitura.nextLine();
					System.out.println("Insira ano:");
					String anoStr = leitura.nextLine();

					// Criando uma data
					if (!diaStr.isEmpty() && !mesStr.isEmpty() && !anoStr.isEmpty()) {
						int ano = Integer.parseInt(anoStr);
						int mes = Integer.parseInt(mesStr);
						int dia = Integer.parseInt(diaStr);
						LocalDate data = LocalDate.of(ano, mes, dia);
						professor.setDataDeNasci(data);
					}

					// Lendo Siape
					System.out.println("Insira Siape:");
					String siape = leitura.nextLine();
					if (!siape.isEmpty()) {
						professor.setSiape(Long.parseLong(siape));
					}

					// Lendo email
					System.out.println("Insira email:");
					String email = leitura.nextLine();
					if (!email.isEmpty()) {
						professor.setEmail(email);
					}

					// Lendo telefone
					System.out.println("Insira telefone:");
					String tele = leitura.nextLine();
					if (!tele.isEmpty()) {
						professor.setTelefone(tele);
					}

					// Lendo materias
					System.out.println("Insira matérias (se houver mais de uma separar com 'e' ou ','):");
					String materias = leitura.nextLine();
					if (!materias.isEmpty()) {
						professor.setMaterias(materias);
					}

					// Lendo conteudos
					System.out.println("Insira Conteúdo:");
					String conteudo = leitura.nextLine();
					if (!conteudo.isEmpty()) {
						professor.setConteudo(conteudo);
					}

					System.out.println("1- Exibir informações e concluir\n2- Apenas concluir o cadastro: ");
					Integer contExibirProfessor = Integer.valueOf(leitura.nextLine());

					if (contExibirProfessor == 1) {
						// Exibicao dos atributos do objeto pessoa
						System.out.println("- INFORMAÇÕES DO(A) PROFESSOR(A)");
						System.out.println("Nome: " + professor.getNome());
						System.out.println("Cpf: " + professor.getCpf());
						System.out.println("Data de nascimento: " + professor.getDataDeNasci().toString());
						System.out.println("E-mail: " + professor.getEmail());
						System.out.println("Siape:" + professor.getSiape().toString());
						System.out.println("Matérias: " + professor.getMaterias());
						System.out.println("Conteúdos:" + professor.getConteudo());
						System.out.println("Telefone:" + professor.getTelefone());
					}

					// Insere pessoa no 'banco' fake
					bdProfessor = ProfessorDAO.getInstancia();
					bdProfessor.inserir(professor);
					break;
				case 5:
					System.out.println("Você escolheu voltar.");
					break;
				}

			case 3:
				System.out.println("Você escolheu sair.\nObrigado e até logo!");
				break;
			}
		}

		leitura.close();

	}
}
