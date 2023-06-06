package PcgExercico1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner MeuNobre = new Scanner(System.in);
		byte opcao = 1;
		while((opcao != 0) && (opcao <= 10)) {
			System.out.println("Escolha uma opção logo, eu não tenho o dia todo: ");
			System.out.print("(0)");
			System.out.print("(1)");
			System.out.print("(2)");
			System.out.print("(3)");
			System.out.print("(4)");
			System.out.print("(5)");
			System.out.print("(6)");
			System.out.print("(7)");
			System.out.print("(8)");
			System.out.print("(9)");
			System.out.print("(10)");
			System.out.println("(?)Opcao " );
			opcao = MeuNobre.nextByte();
			
			switch(opcao) {
			case 1:
				System.out.println("Seu número por extenso é escrito como UM, meu nobre.");
				break;
			case 2:
				System.out.println("Seu número por extenso é escrito como DOIS, meu nobre.");
				break;
			case 3:
				System.out.println("Seu número por extenso é escrito como TRÊS, meu nobre.");
				break;
			case 4:
				System.out.println("Seu número por extenso é escrito como QUATRO, meu nobre.");
				break;
			case 5:
				System.out.println("Seu número por extenso é escrito como CINCO, meu nobre.");
				break;
			case 6:
				System.out.println("Seu número por extenso é escrito como SEIS, meu nobre.");
				break;
			case 7:
				System.out.println("Seu número por extenso é escrito como SETE, meu nobre.");
				break;
			case 8:
				System.out.println("Seu número por extenso é escrito como OITO, meu nobre.");
				break;
			case 9:
				System.out.println("Seu número por extenso é escrito como NOVE, meu nobre.");
				break;
			case 10:
				System.out.println("Seu número por extenso é escrito como DEZ, meu nobre.");
				break;
			default:
				System.out.println("Essa opção não vale meu rei!");				
				
		MeuNobre.close();
			}
		}
	}

}