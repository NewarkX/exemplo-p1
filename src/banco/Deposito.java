package banco;

import java.math.BigDecimal;

public class Deposito extends TransacaoBancaria{

    public Deposito(BigDecimal valor, Conta origem, Conta destino) {
        super(valor, origem, destino);
    }

    public void executar(){
        getOrigem().creditar(getValor());
    }
}
