package PcgExericio3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int SH,Hrs,T, r;
		Scanner Coiso = new Scanner(System.in);
		do{System.out.println("Quanto tú ganhas por hora meu consagrado? ");
		SH= Coiso.nextInt();
		System.out.println("Quantas horas você fica no trampo, durante o mês? ");
		Hrs = Coiso.nextInt();
		T=(SH*Hrs);
		System.out.println("Seu sálario é de R$"+ T +",00. Caraca, que salário alto ein meu bom.");
		
		System.out.println("Tu que continua? 1-sim 2-nao");
		r = Coiso.nextInt();
		
		}while(r!=1);
		
	
	}
}