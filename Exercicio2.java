package PcgExercicio2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Chapolin = new Scanner(System.in);
	
		
		int Vmax,Vmot,Exc,r;
		System.out.println("02, pode me responder? Qual a velocidade maxima dessa avenida? ");
		Vmax= Chapolin.nextInt();
		System.out.println("E a sua velocidade 02, qual era? ");
		Vmot= Chapolin.nextInt();
		
		Exc= Vmot - Vmax;
		
		do
			{if(Vmot<=Vmax){
			System.out.println("Parabéns 02, você não fez nada mais do que sua obrigação estando no limite de velocidade ");
			}else if(Vmot>Vmax) {
				System.out.println("Putz 02, vai ter que pagar R$"+Exc*5+",00 em multa, SEU VACILO COM PERNA!!!");
			
				System.out.println("Quer continuar? 1-sim 2-nao" );
				r = Chapolin.nextInt();
		
			}while (r !=1);
		
		
			}
	}
}