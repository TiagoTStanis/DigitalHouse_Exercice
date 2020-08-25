package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Lanchonete.Sanduiche;
public class Principal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("Escolha uma opção:");
			System.out.println("[1] Sanduíches\n[2] Massas\n[3] Bolos\n[4] Sair");
			op = sc.nextInt();
			switch(op) {
				case 1: menuSanduiche();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				default:
			}
		}while(op != 4);
		sc.close();
	}
		private static void menuSanduiche() {
			Scanner sc = new Scanner(System.in);
			List<String> ingredientes = new ArrayList<>();
			
			while(ingredientes.size() <= 10) {
				System.out.print("Digite um ingrediente: ");
				ingredientes.add( sc.nextLine() );
				System.out.println("Deseja adicionar outro ingrediente? (s/n)");
				char c = sc.next().charAt(0);
				sc.nextLine();
				if(c == 'n') {
					break;
				}				
			}
			
			Sanduiche sanduiche = new Sanduiche(12.00, ingredientes);
			
			System.out.println("Quantos km de distância da sua casa até a lanchonete?");
			double distancia = sc.nextDouble();
			
			System.out.println("Preço: "+sanduiche.getPreco()+" Tempo para entrega: "+sanduiche.tempo(distancia)+" minutos");
			sc.close();
		}
}