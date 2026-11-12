package sistemacinema;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Produto>produtos = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		int proximoId=1;
		int opcao=0;
		
		do {
			System.out.println("=====SISTEMA DE GERENCIAMENTO!=====");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Atualizar");
			System.out.println("4 - Excluir");
			System.out.println("0 - Sair");
			
			System.out.println("ESCOLHA UMA OPÇÃO!");
			opcao = scanner.nextInt();
			scanner.nextLine();
			//int opcao = scanner.nextInt();
			
			
			if(opcao == 1) {
				System.out.println("Nome do produto: ");
				String nome = scanner.nextLine();
				
				System.out.println("Preco do produto: ");
				double preco = scanner.nextDouble();
				
				Produto produto = new Produto(proximoId, nome, preco);
				produtos.add(produto);
				proximoId++;
				
				System.out.println("Produto cadastrado com sucesso!");
			}
			else if(opcao == 2) {
				System.out.println("=====LISTA DE PRODUTOS=====");
				
				if(produtos.isEmpty()) {
					System.out.println("Não há produtos cadastrados!");
				}
				else {
					for(Produto p : produtos) {
						System.out.println("-----------------");
						System.out.println("ID: " + p.getId());
						System.out.println("Nome: "+ p.getNome());
						System.out.println("Preço: " + p.getPreco());
					}
				}
				
			}
			else if(opcao == 3) {
				System.out.println("=====ATUALIZAR PRODUTOS=====");
				
				System.out.println("Digite o ID do produto: ");
				int idBusca = scanner.nextInt();
				scanner.nextLine();
				
				boolean encontrado = false; //aqui serve para controlar se o sistema encontrou o ID cadastrado, por isso começa em falso até encontrar um verdadeiro.
				
				for(Produto p : produtos) {
					if(p.getId() == idBusca) {
						System.out.println("=====PRODUTO ENCONTRADO=====");
						System.out.println("Nome atual: " + p.getNome());
						System.out.println("Preco atual: R$" + p.getPreco());
						
						System.out.println("Digite o novo nome: ");
						String novoNome = scanner.nextLine();
						System.out.println("Digite o novo preço: R$");
						double novoPreco = scanner.nextDouble();
						scanner.nextLine();
						
						p.setNome(novoNome);
						p.setPreco(novoPreco);
						
						System.out.println("*PRODUTO ATUALIZADO!*");
						
						encontrado = true; //recebeu o boolean verdadeiro, pois foi encontrado
						break;
						
					}
					//se for diferente de encontrado, mostre...
					if(!encontrado) {
						System.out.println("Produto não encontrado!");
					}
				}
				
			}
			else if(opcao == 4) {
				System.out.println("=====EXCLUIR PRODUTO=====");
				
				System.out.println("Digite o ID produto que deseja excluir: ");
				int idBusca = scanner.nextInt();
				scanner.nextLine();
				
				boolean encontrado = false;
				
				for(Produto p : produtos) {
					if(p.getId() == idBusca) {
						System.out.println("=====PRODUTO ENCONTRADO=====");
						System.out.println("ID: " + p.getId());
						System.out.println("Nome: " + p.getNome());
						System.out.println("Preço: R$" + p.getPreco());
						
						produtos.remove(p); // remover o produto, que é chamado "p"
						
						System.out.println("Produto excluído com sucesso!");
						
						encontrado = true;
						break;
					}
					if(!encontrado) {
						System.out.println("Produto não encontrado!");
					}
				}
				
			}
			else if(opcao == 0) {
				System.out.println("Obrigado por utilizar nosso sistema!");
			}
			else {
				System.out.println("Opção inválida!");
			}
			
		}while(opcao != 0);
	}
}
