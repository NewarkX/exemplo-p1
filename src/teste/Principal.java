package teste;

import banco.Conta;
import banco.Deposito;
import banco.Transferencia;
import transacoes.GerenteTransacao;

import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) {
        GerenteTransacao gerenteTransacao = new GerenteTransacao();
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        gerenteTransacao.adicionarTransacao(new Deposito(new BigDecimal("100"),conta1,null));
        gerenteTransacao.adicionarTransacao(new Transferencia(new BigDecimal("50"),conta1, conta2));
        gerenteTransacao.executar();
        System.out.println("Conta 1 saldo: " + conta1.getSaldo());
        System.out.println("Conta 2 saldo: " + conta2.getSaldo());
    }
}
