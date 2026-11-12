package sistemacarro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Carro>lista = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		int proximoId=1;
		int opcao;
		
		do {
			System.out.println("====SISTEMA DE VEICULOS====");
			System.out.println("1 - Cadastrar veículo");
			System.out.println("2 - Listar veículos");
			System.out.println("3 - Alterar veículos");
			System.out.println("4 - Excluir cadastro");
			System.out.println("0 - Sair");

			System.out.println("====Escolha uma opção====");
			opcao = scan.nextInt();
			scan.nextLine();
			
			if(opcao == 1) {
				System.out.println("====CADASTRAR VEÍCULO====");
				System.out.println("Digite o modelo do veículo: :");
				String modelo = scan.nextLine();
				System.out.println("Cor do veículo: ");
				String cor = scan.nextLine();
				System.out.println("Placa do veículo: ");
				String placa = scan.nextLine();
				System.out.println("Preço do veículo: ");
				double preco = scan.nextDouble();
				
				Carro carro = new Carro(proximoId,modelo,cor,placa,preco);
				lista.add(carro);
				proximoId++;
				
				System.out.println("Veículo cadastrado com sucesso!");

			}
			else if(opcao == 2) {
				System.out.println("====LISTAR VEÍCULOS====");
				if(lista.isEmpty()) {
					System.out.println("Veículo não encontrado!");
				}
				else {
					for(Carro p : lista) {
						System.out.println("VEÍCULO ENCONTRADO!");
						System.out.println("ID: " + p.getId());
						System.out.println("Modelo: " + p.getModelo());
						System.out.println("Cor: " + p.getCor());
						System.out.println("Placa: " + p.getPlaca());
						System.out.println("Preco: " + p.getPreco());
					}
				}
			}
			else if(opcao == 3) {
				System.out.println("====ALTERAR VEÍCULO====");
				System.out.println("Digite o ID do veículo que deseja filtrar: ");
				int idBusca = scan.nextInt();
				scan.nextLine();

				boolean encontrado = false;

				for(Carro p : lista) {
					if(p.getId() == idBusca) {
						System.out.println("-------------------");
						System.out.println("VEÍCULO ENCONTRADO!");
						System.out.println("ID: " + p.getId());
						System.out.println("Modelo: " + p.getModelo());
						System.out.println("Cor: " + p.getCor());
						System.out.println("Placa: " + p.getPlaca());
						System.out.println("Preco: " + p.getPreco());
						
						System.out.println("Digite o novo modelo: ");
						String novoModelo = scan.nextLine();
						System.out.println("Digite a nova cor: ");
						String novaCor = scan.nextLine();
						System.out.println("Digite a nova placa do veículo: ");
						String novaPlaca = scan.nextLine();
						System.out.println("Digite o novo valor do veículo: ");
						double novoPreco = scan.nextDouble();

						p.setModelo(novoModelo);
						p.setCor(novaCor);
						p.setPlaca(novaPlaca);
						p.setPreco(novoPreco);
						
						encontrado = true;
						break;
					}
					System.out.println("Produto atualizado com sucesso!");
				}
			}
			else if(opcao == 4) {
				System.out.println("====DELETAR VEÍCULO====");
				System.out.println("Digite o ID do veículo que deseja excluir: ");
				int idBusca = scan.nextInt();
				scan.nextLine();

				boolean encontrado = false;

				for(Carro p : lista) {
					if(p.getId() == idBusca) {
						System.out.println("VEÍCULO ENCONTRADO!");
						System.out.println("ID: " + p.getId());
						System.out.println("Modelo: " + p.getModelo());
						System.out.println("Cor: " + p.getCor());
						System.out.println("Placa: " + p.getPlaca());
						System.out.println("Preco: " + p.getPreco());

						lista.remove(p);
						
						encontrado = true;
						break;
						
					}
				}
				System.out.println("Produto excluído com sucesso!");
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
