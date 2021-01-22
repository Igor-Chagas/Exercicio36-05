import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double preco, valorPagar;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Por favor, escolha um numero de 1 a 5:");
		int a = sc.nextInt();
		System.out.println("Por favor, a quantidade desejada:");
		int qtd = sc.nextInt();
		
		if (a != 1 && a != 2 && a != 3&& a != 4 && a != 5 ) {
			System.out.println("Por favor, escolha um numero de 1 a 5:");
			a = sc.nextInt();
		}
		
		if (a == 1) {
			 preco = 4.00;
			 valorPagar = qtd*preco;
		}
			else {
			if (a == 2) {
				preco = 4.5;
				valorPagar = qtd*preco;
			}
			else {
			if (a == 3)	{
				preco = 5.00;
				valorPagar = qtd*preco;
			}	
			else if (a == 4) {	
				preco = 2.00;
				valorPagar = qtd*preco;
			}
			else  {
				preco = 1.50;
				valorPagar = qtd*preco;	
			}
			
			}
			}
		System.out.printf("Total: %.2f\n", valorPagar);
			sc.close();
					}
	}


