package banco;

import transacoes.Transacao;

import java.math.BigDecimal;

public abstract class TransacaoBancaria implements Transacao{

    private BigDecimal valor;

    private Conta origem;

    private Conta destino;

    protected TransacaoBancaria(BigDecimal valor, Conta origem, Conta destino) {
        this.valor = valor;
        this.origem = origem;
        this.destino = destino;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Conta getOrigem(){
        return origem;
    }

    public Conta getDestino(){
        return destino;
    }
}
