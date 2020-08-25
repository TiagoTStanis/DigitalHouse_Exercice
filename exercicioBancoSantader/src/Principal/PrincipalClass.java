package Principal;

import Banco.ContaCorrente;
import Banco.ContaPoupanca;
import Banco.Conta;
import Banco.Cliente;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PrincipalClass {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		List<Cliente> cliente = new ArrayList<>();
		
		System.out.printf("**** Menu Principal *****\n");
		System.out.printf("[ 1 ] Registrar Novo Cliente\n");
		System.out.printf("[ 2 ] Movimentar Conta\n");
		System.out.printf("[ 0 ] Encerrar o Programa\n");
		System.out.printf("\nOpção Desejada: ");
		
		int op = sc.nextInt();
		sc.nextLine();
		
		switch(op) {
		case 1:
			System.out.printf("Digite o sobrenome: ");
			String nome = sc.nextLine();
			
			System.out.printf("Digite o CPF: ");
			Integer cpf = sc.nextInt();
			sc.nextLine();
			
			System.out.printf("Digite o RG: ");
			Integer rg = sc.nextInt();
			sc.nextLine();
			
			System.out.printf("Digite o número do cliente: ");
			Integer numero = sc.nextInt();
			sc.nextLine();
			
			System.out.printf("Cliente ira fazer um deposito inicial?: ");
			System.out.printf("Y/N ?");
			char op1 = sc.next().charAt(0);
			
			switch(op1) {
			case 'Y':
				System.out.printf("Digite a quantidade: ");
				double sal = sc.nextDouble();
				cliente.add(new Cliente(numero, nome, rg, cpf, new Conta(sal))); 
				
				}
			}
			
			System.out.println("Cliente cadastrado com êxito...");
		}
		
		
		sc.close();
	}

}
