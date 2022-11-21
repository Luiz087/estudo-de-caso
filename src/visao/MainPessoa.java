package visao;

import java.time.LocalDate;
import java.util.Scanner;

import controle.ProfessorDAO;
import modelo.Pessoa;
import modelo.Professor;

public class MainPessoa {

	public static void main(String[] args) {

		// Viabilizando leitura via Scanner
		Scanner leitura = new Scanner(System.in);

		// Instanciando objeto pessoa
		Pessoa pessoa = new Pessoa();
		Professor professor = new Professor();

		System.out.println("Deseja cadastrar qual tipo de usuário:\n1- Professor\n2- Aluno");
		Integer cont = Integer.valueOf(leitura.nextLine());

		if (cont == 1) { // Professor
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
			cont = leitura.nextInt();
			
			if (cont == 1) {
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

			// Fecha leitura
			leitura.close();

			// Insere pessoa no 'banco' fake
			ProfessorDAO banco = ProfessorDAO.getInstancia();
			banco.inserir(professor);
		}
	}
}
