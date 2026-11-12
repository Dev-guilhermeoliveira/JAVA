package sistemaestudos;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		ArrayList<Produto>produtos = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		int proximoId = 1;
		int opcao;

		do {
			System.out.println("====SISTEMA DE GERENCIAMENTO====");
			System.out.println("--------------------------------");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Alterar");
			System.out.println("4 - Deletar");
			System.out.println("0 - Sair");
			System.out.println("--------------------------------");

			System.out.println("Escolha uma opção:");
			opcao = scan.nextInt();
			scan.nextLine();

			if(opcao == 1) {
				System.out.println("====CADASTRAR====");
				System.out.println("--------------------------------");

				System.out.println("Digite o nome do produto: ");
				String nome = scan.nextLine();
				System.out.println("Digite a categoria do produto: ");
				String categoria = scan.nextLine();
				System.out.println("Digite o preço do produto: R$");
				double preco = scan.nextDouble();
				
				System.out.println("--------------------------------");

				Produto produto = new Produto(proximoId, nome, categoria, preco);
				produtos.add(produto);
				proximoId++;

				System.out.println("Produto cadastrado com sucesso!");

			}
			else if(opcao == 2) {
				System.out.println("====LISTAR====");
				System.out.println("--------------------------------");

				if(produtos.isEmpty()) {
					System.out.println("Lista vazia!");
				}
				else {
					for(Produto p : produtos) {
						System.out.println("====PRODUTO ENCONTRADO====");
						System.out.println("°ID: " + p.getId());
						System.out.println("°NOME: " + p.getNome());
						System.out.println("°CATEGORIA: " + p.getCategoria());
						System.out.println("°PREÇO: R$" + p.getPreco());
						System.out.println("--------------------------------");

					}
				}
			}
			else if(opcao == 3) {
				System.out.println("Digite o ID do produto que deseja alterar");
				int idBusca = scan.nextInt();
				scan.nextLine();

				boolean encontrado = false;

				for(Produto p : produtos) {
					if(p.getId() == idBusca) {
						System.out.println("====PRODUTO ENCONTRADO====");
						System.out.println("°ID: " + p.getId());
						System.out.println("°NOME: " + p.getNome());
						System.out.println("°CATEGORIA: " + p.getCategoria());
						System.out.println("°PREÇO: R$" + p.getPreco());
						System.out.println("--------------------------------");

						System.out.println("NOVO NOME: ");
						String novoNome = scan.nextLine();
						System.out.println("NOVA CATEGORIA: ");
						String novaCategoria = scan.nextLine();
						System.out.println("NOVO PREÇO: R$");
						double novoPreco = scan.nextDouble();

						p.setNome(novoNome);
						p.setCategoria(novaCategoria);
						p.setPreco(novoPreco);

						System.out.println("--------------------------------");
						System.out.println("Produto cadastrado com sucesso!");

						encontrado = true;
						break;

					}
				}
			}
			else if(opcao == 4) {
				System.out.println("====EXCLUIR====");
				System.out.println("Digite o ID do produto que deseja excluir: ");
				int idBusca = scan.nextInt();
				scan.nextLine();

				boolean encontrado = false;

				for(Produto p : produtos) {
					if(p.getId() == idBusca) {
						System.out.println("Produto encontrado!");
						System.out.println("ID: " + p.getId() + "| NOME: " + p.getNome() + "| Preço: R$" + p.getPreco());
						System.out.println("--------------------------------");

						produtos.remove(p);

						System.out.println("Produto excluído com sucesso!");

						encontrado = true;
						break;
					}
				}
			}
			else if(opcao == 0) {
				System.out.println("OBRIGADO POR USAR O NOSSO SISTEMA!");
			}
			else {
				System.out.println("Opção inválida");
			}


			/*System.out.println("");
			*System.out.println("");
			*System.out.println("");
			*/
			
		}while(opcao != 0);

	}

}
