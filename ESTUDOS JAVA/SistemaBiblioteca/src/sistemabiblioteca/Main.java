package sistemabiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Produto>produtos = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		int proximoId=1;
		int opcao;
		
		do {
			System.out.println("=====SISTEMA PARA BIBLIOTECA=====");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Alterar");
			System.out.println("4 - Excluir");
			System.out.println("0 - sair");
			
			System.out.println("Escolha uma opção: ");
			opcao = scan.nextInt();
			scan.nextLine();
			
			if(opcao == 1) {
				System.out.println("=====CADASTRAR PRODUTO=====");
				System.out.println("Digite o nome do produto: ");
				String nome = scan.nextLine();
				
				System.out.println("Digite o preço do produto: R$");
				double preco = scan.nextDouble();
				
				Produto produto = new Produto(proximoId, nome, preco);
				produtos.add(produto);
				proximoId++;
				
				System.out.println("Produto cadastrado com sucesso!");
			}
			else if(opcao == 2) {
				System.out.println("=====LISTAR=====");
				if(produtos.isEmpty()) {
					System.out.println("Produto não encontrado!");
				}
				else {
					for(Produto p : produtos) {
						System.out.println("=====PRODUTO ENCONTRADO=====");
						System.out.println("ID: " + p.getId());
						System.out.println("Nome: " + p.getNome());
						System.out.println("Preco: R$" + p.getPreco());
					}
				}
			}
			else if(opcao == 3) {
				System.out.println("=====ALTERAR=====");
				System.out.println("Digite o ID que deseja alterar: ");
				int idBusca = scan.nextInt();
				scan.nextLine();
				
				boolean encontrado = false;
				
				for(Produto p : produtos) {
					if(p.getId() == idBusca) {
						System.out.println("=====PRODUTO ENCONTRADO!=====");
						System.out.println("ID: " + p.getId());
						System.out.println("Nome: " + p.getNome());
						System.out.println("Preco: R$" + p.getPreco());
						System.out.println("-----------------------------");
						
						System.out.println("Digite o novo nome: ");
						String novoNome = scan.nextLine();
						System.out.println("Digite o novo preço: ");
						double novoPreco = scan.nextDouble();
						
						p.setNome(novoNome);
						p.setPreco(novoPreco);
						
						System.out.println("Produto atualizado com sucesso!");
						
						encontrado = true;
						break;
					}
				}
				if(!encontrado){
					System.out.println("Produto não encontrado!");
				}
			}
			else if(opcao == 4) {
				System.out.println("=====EXCLUIR=====");
				System.out.println("Digite o ID que deseja excluir: ");
				int idBusca = scan.nextInt();
				scan.nextLine();
				
				boolean encontrado = false;
				
				for(Produto p : produtos) {
					if(p.getId() == idBusca) {
						System.out.println("=====PRODUTO ENCONTRADO!=====");
						System.out.println("ID: " + p.getId());
						System.out.println("Nome: " + p.getNome());
						System.out.println("Preco: R$" + p.getPreco());
						System.out.println("-----------------------------");
						
						produtos.remove(p);
						
						System.out.println("Produto excluído com sucesso!");
						
						encontrado = true;
						break;
					}
				}
				if(!encontrado){
					System.out.println("Produto não encontrado!");
				}
			}
			else if(opcao == 0) {
				System.out.println("Obrigado por utilizar nosso sistema!");
			}
			else {
				System.out.println("Escolha uma opção válida");
			}
			
		}while(opcao != 0);

	}

}
