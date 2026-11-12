package sistemacadastro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Produto>produtos = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		int proximoId = 1;
		int opcao;

		do {
			System.out.println("=====SISTEMA DE GERENCIAMENTO=====");
			System.out.println("1 - Cadastro");
			System.out.println("2 - Listar");
			System.out.println("3 - Alterar");
			System.out.println("4 - Excluir");
			System.out.println("0 - Sair");

			System.out.println("=====SELECIONE UMA OPÇÃO=====");
			opcao = scan.nextInt();
			scan.nextLine();

			if(opcao == 1) {
				System.out.println("=====Cadastro=====");
				System.out.println("------------------------------------");
				System.out.println("Digite o nome do produto: ");
				String nome = scan.nextLine();
				System.out.println("Digite a categoria do produto: ");
				String categoria = scan.nextLine();
				System.out.println("Qual o valor do produto? ");
				double preco = scan.nextDouble();

				Produto produto = new Produto(proximoId,nome,categoria,preco);
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
						System.out.println("Produto encontrado!");
						System.out.println("ID: " + p.getId());
						System.out.println("Nome: " + p.getNome());
						System.out.println("Categoria: " + p.getCategoria());
						System.out.println("Preço: R$" + p.getPreco());
					}
				}
			}
			else if(opcao == 3) {
				System.out.println("=====ALTERAR=====");
				System.out.println("------------------------------------");
				System.out.println("Digite o ID do produto que deseja filtrar: ");
				int idBusca = scan.nextInt();
				scan.nextLine();
				
				boolean encontrado = false;
				
				for(Produto p : produtos) {
					if(p.getId() == idBusca) {
						System.out.println("Produto encontrado!");
						System.out.println("------------------------------------");
						System.out.println("ID: " + p.getId());
						System.out.println("Nome: " + p.getNome());
						System.out.println("Categoria: " + p.getCategoria());
						System.out.println("Preço: R$" + p.getPreco());
						
						System.out.println("------------------------------------");
						System.out.println("NOVO NOME: ");
						String novoNome = scan.nextLine();
						System.out.println("NOVA CATEGORIA: ");
						String novaCategoria = scan.nextLine();
						System.out.println("NOVO PREÇO: R$");
						double novoPreco = scan.nextDouble();
						
						p.setNome(novoNome);
						p.setCategoria(novaCategoria);
						p.setPreco(novoPreco);
						
						encontrado = true;
						break;
					}
				}
				System.out.println("=====PRODUTO ATUALIZADO COM SUCESSO=====");
			}
			else if(opcao == 4) {
				System.out.println("=====EXCLUIR=====");
				System.out.println("------------------------------------");
				System.out.println("Digite o ID do produto que deseja alterar: ");
				int idBusca = scan.nextInt();

				boolean encontrado = false;
				
				for(Produto p : produtos) {
					if(p.getId() == idBusca) {
						System.out.println("Produto encontrado!");
						produtos.remove(p);
					}
					System.out.println("*=====PRODUTO EXCLUÍDO COM SUCESSO!=====*");
					
					encontrado = true;
					break;
				}

			}
			else if(opcao == 0) {
				System.out.println("**OBRIGADO POR USAR NOSSO SISTEMA!**");
			}
			else {
				System.out.println("Opção inválida!");
			}

		}while(opcao != 0);

	}

}
