import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Devolucao> bancoDeDados = new ArrayList<>();
        boolean sistemaRodando = true;

        System.out.println("--- SISTEMA DE CONTROLE DE DEVOLUÇÕES G.C MAXX ---");

        while (sistemaRodando) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Registrar Nova Devolução");
            System.out.println("2. Listar Todas as Devoluções");
            System.out.println("3. Atualizar Estado de um Pedido");
            System.out.println("4. Filtrar por Plataforma");
            System.out.println("5. Sair do Sistema");
            System.out.print("Escolha uma opção: ");

            int opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                System.out.println("\n-- NOVO REGISTRO COMPLETO --");

                System.out.print("Plataforma de Venda: ");
                String plataforma = leitor.nextLine();
                System.out.print("Número do Pedido: ");
                String pedido = leitor.nextLine();
                System.out.print("SKU do Produto: ");
                String sku = leitor.nextLine();
                System.out.print("Nome do Produto: ");
                String produto = leitor.nextLine();
                System.out.print("Motivo da Devolução: ");
                String motivo = leitor.nextLine();
                System.out.print("Descrição do Estado Atual: ");
                String estado = leitor.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = leitor.nextInt();
                System.out.print("Valor Unitário (ex: 150,50): ");
                double valor = leitor.nextDouble();
                leitor.nextLine();

                System.out.print("Apto para revenda? (S/N): ");
                String respostaApto = leitor.nextLine();
                boolean apto = respostaApto.toUpperCase().startsWith("S");

                System.out.print("Recebedor do Reembolso: ");
                String recebedor = leitor.nextLine();
                System.out.print("Modalidade de Envio (ex: Full, Chão): ");
                String envio = leitor.nextLine();

                Devolucao nova = new Devolucao(plataforma, LocalDate.now(), pedido, sku, produto, motivo, estado, quantidade, valor, apto, recebedor, envio);
                bancoDeDados.add(nova);
                System.out.println("-> Devolução registrada com sucesso!");

            } else if (opcao == 2) {
                System.out.println("\n--- RELATÓRIO DE DEVOLUÇÕES ---");
                if (bancoDeDados.isEmpty()) {
                    System.out.println("Nenhuma devolução registrada ainda.");
                } else {
                    for (Devolucao item : bancoDeDados) {
                        System.out.println(item.toString());
                    }
                }

            } else if (opcao == 3) {
                System.out.println("\n--- ATUALIZAR PEDIDO ---");
                System.out.print("Digite o Número do Pedido que deseja atualizar: ");
                String buscaPedido = leitor.nextLine();
                boolean pedidoEncontrado = false;

                for (Devolucao item : bancoDeDados) {
                    if (item.numeroPedido.equalsIgnoreCase(buscaPedido)) {
                        pedidoEncontrado = true;
                        System.out.println("Produto encontrado: " + item.nomeProduto + " | Estado atual: " + item.descricaoEstado);

                        System.out.print("Digite a Nova Descrição do Estado: ");
                        item.descricaoEstado = leitor.nextLine();

                        System.out.print("Continua apto para revenda? (S/N): ");
                        String respostaApto = leitor.nextLine();
                        item.aptoRevenda = respostaApto.toUpperCase().startsWith("S");

                        System.out.println("-> Pedido atualizado com sucesso!");
                        break;
                    }
                }

                if (!pedidoEncontrado) {
                    System.out.println("-> Erro: Pedido não encontrado no banco de dados.");
                }

            } else if (opcao == 4) {
                System.out.println("\n--- FILTRO POR PLATAFORMA ---");
                System.out.print("Digite o nome da plataforma (ex: Shopee, Mercado Livre): ");
                String buscaPlataforma = leitor.nextLine();
                boolean encontrou = false;

                System.out.println("\nResultados para '" + buscaPlataforma + "':");
                for (Devolucao item : bancoDeDados) {
                    // O equalsIgnoreCase garante que "shopee" e "Shopee" sejam reconhecidos como iguais
                    if (item.plataformaVenda.equalsIgnoreCase(buscaPlataforma)) {
                        System.out.println(item.toString());
                        encontrou = true;
                    }
                }

                if (!encontrou) {
                    System.out.println("-> Nenhuma devolução encontrada para esta plataforma.");
                }

            } else if (opcao == 5) {
                sistemaRodando = false;
                System.out.println("Encerrando o sistema. Bom descanso!");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
        leitor.close();
    }
}