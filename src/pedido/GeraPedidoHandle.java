package pedido;

import orcamento.Orcamento;
import pedido.acao.AcaoAposGerarPedido;
import pedido.acao.EnviarEmailPedido;
import pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandle {

    private List<AcaoAposGerarPedido> acoes;

    //CADA AÇÃO SÃO OS OBJETOS DE SALVAR E ENVIAR EMAIL
    public GeraPedidoHandle(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    //essa classe apenas teria a parte de excuçaõ de comandos, como salvar.
    //construtor com injeção de dependencias: repository, service, etc
    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> {
            a.executarAcao(pedido);
        });
    }
}
