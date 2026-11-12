package sistemaloja;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Produto>produtos = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		int proximoId=1;
		int opcao;
		
		do {
			System.out.println("=====SISTEMA DE GERENCIAMENTO=====");
			System.out.println("1 - cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Alterar");
			System.out.println("4 - Excluir");
			System.out.println("0 - Sair");
			
			System.out.println("Escolha uma opção!");
			opcao = scan.nextInt();
			scan.nextLine();
			
			if(opcao == 1) {
				System.out.println("=====CADASTRAR PRODUTOS=====");
				System.out.println("Digite o nome do produto: ");
				String nome = scan.nextLine();
				
				System.out.println("Preço do produto: ");
				double preco = scan.nextDouble();
				
				Produto produto = new Produto(proximoId, nome, preco);
				produtos.add(produto);
				proximoId++;
				
				System.out.println("Produto cadastrado com sucesso!");
			}
			else if(opcao == 2) {
				System.out.println("=====LISTAR PRODUTOS=====");
				
				if(produtos.isEmpty()) {
					System.out.println("Produto não encontrado :/");
				}
				else {
					for(Produto p : produtos) {
						System.out.println("Produto encontrado!");
						System.out.println("ID: " + p.getId());
						System.out.println("Nome: " + p.getNome());
						System.out.println("Preço: R$" + p.getPreco());
					}
				}
			}
			else if(opcao == 3) {
				System.out.println("=====ALTERAR=====");
				System.out.println("Digite o ID do produto que deseja alterar: ");
				int idBusca = scan.nextInt();
				scan.nextLine();
				
				boolean encontrado = false;
				
				for(Produto p : produtos) {
					if(p.getId() == idBusca) {
						System.out.println("=====PRODUTO ENCONTRADO=====");
						System.out.println("ID: " + p.getId());
						System.out.println("Nome: " + p.getNome());
						System.out.println("Preço atual R$: " + p.getPreco());
						
						System.out.println("Digite o novo nome: ");
						String novoNome = scan.nextLine();
						System.out.println("Digite o novo preço: R$");
						double novoPreco = scan.nextDouble();
						
						p.setNome(novoNome);
						p.setPreco(novoPreco);
						
						System.out.println("PRODUTO ATUALIZADO COM SUCESSO!");
						
						encontrado = true;
						break;
					}
					if(!encontrado) {
						System.out.println("Produto não encontrado.");
					}
				}
			}
			else if(opcao == 4) {
				System.out.println("=====EXCLUIR PRODUTO=====");
				System.out.println("Digite o ID do produto que deseja excluir: ");
				int idBusca = scan.nextInt();
				scan.nextLine();
				
				boolean encontrado = false;
				
				for(Produto p : produtos) {
					if(p.getId() == idBusca) {
						System.out.println("=====PRODUTO ENCONTRADO=====");
						System.out.println("ID: " + p.getId());
						System.out.println("Nome: " + p.getNome());
						System.out.println("Preço: R$" + p.getPreco());
						
						produtos.remove(p);
						
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
				System.out.println("Obrigado por utilziar nosso sistema!");
			}
			else {
				System.out.println("Selecione uma opção válida!");
			}
			
		}while(opcao != 0);

	}

}
