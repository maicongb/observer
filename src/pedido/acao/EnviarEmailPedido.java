package pedido.acao;

import pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        //aqui ficaria a lógica de enviar pedido
        System.out.println("Enviar pedido");
    }
}
