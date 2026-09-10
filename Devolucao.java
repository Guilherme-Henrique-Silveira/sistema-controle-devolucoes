import java.time.LocalDate;

public class Devolucao {
    String plataformaVenda;
    LocalDate dataTriagem;
    String numeroPedido;
    String skuProduto;
    String nomeProduto;
    String motivoDevolucao;
    String descricaoEstado;
    int quantidade;
    double valorUnitario;
    double valorTotal;
    boolean aptoRevenda;
    String recebedorReembolso;
    String modalidadeEnvio;

    // Construtor: Cria a "linha" nova e preenche os dados
    public Devolucao(String plataformaVenda, LocalDate dataTriagem, String numeroPedido, String skuProduto, String nomeProduto, String motivoDevolucao, String descricaoEstado, int quantidade, double valorUnitario, boolean aptoRevenda, String recebedorReembolso, String modalidadeEnvio) {
        this.plataformaVenda = plataformaVenda;
        this.dataTriagem = dataTriagem;
        this.numeroPedido = numeroPedido;
        this.skuProduto = skuProduto;
        this.nomeProduto = nomeProduto;
        this.motivoDevolucao = motivoDevolucao;
        this.descricaoEstado = descricaoEstado;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.aptoRevenda = aptoRevenda;
        this.recebedorReembolso = recebedorReembolso;
        this.modalidadeEnvio = modalidadeEnvio;

        // A automação acontecendo aqui: o sistema calcula o valor total sozinho!
        this.valorTotal = this.quantidade * this.valorUnitario;
    }

    // Método que formata como essa devolução vai aparecer na tela para você ler
    @Override
    public String toString() {
        return "Plataforma: " + plataformaVenda + " | Pedido: " + numeroPedido + " | Produto: " + nomeProduto +
                " | Motivo: " + motivoDevolucao + " | Estado: " + descricaoEstado + " | Qtd: " + quantidade +
                " | Unit: R$ " + valorUnitario + " | Apto: " + (aptoRevenda ? "Sim" : "Não") +
                " | Reembolso: " + recebedorReembolso + " | Envio: " + modalidadeEnvio +
                " | Total: R$ " + String.format("%.2f", valorTotal);
    }
}