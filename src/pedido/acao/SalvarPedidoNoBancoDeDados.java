package pedido.acao;

import pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    //seria recebido no método excutar o repository para salvar
    public void executarAcao(Pedido pedido){
        //aqui ficaria a lógica de salvar pedido
        System.out.println("Salvar pedido no banco de dados");
    }
}
