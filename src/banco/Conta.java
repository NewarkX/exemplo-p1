package banco;

import java.math.BigDecimal;

public class Conta {

    private BigDecimal saldo = new BigDecimal("0");

    public Conta() {}

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void debitar(BigDecimal valor){
        saldo = saldo.subtract(valor);
    }

    public void creditar(BigDecimal valor){
        saldo = saldo.add(valor);
    }
}
