package banco;

import transacoes.Transacao;

import java.math.BigDecimal;

public class Transferencia extends TransacaoBancaria{

    public Transferencia(BigDecimal valor, Conta origem, Conta destino) {
        super(valor, origem, destino);
    }

    public void executar(){
        getOrigem().debitar(getValor());
        getDestino().creditar(getValor());
    }
}
