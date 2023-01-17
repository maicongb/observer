import pedido.GeraPedido;
import pedido.GeraPedidoHandle;
import pedido.acao.EnviarEmailPedido;
import pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Essas informações serão repassadas pelo usuário
        String cliente = "MAICON";
        BigDecimal valorOrcamento = new BigDecimal("500");
        int quantidadeItens  = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);

        //LISTA DE AÇÕES
        GeraPedidoHandle handle = new GeraPedidoHandle(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(),
                              new EnviarEmailPedido())
        )       ;
        handle.execute(gerador);


    }
}