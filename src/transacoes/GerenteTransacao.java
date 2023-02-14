package transacoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class GerenteTransacao {

    List<Transacao> list = new ArrayList<Transacao>();

    public GerenteTransacao(){}

    public void executar(){
        for (Transacao t : list){
            t.executar();
        }
        list.clear();
    }

    public void adicionarTransacao(Transacao transacao){
        list.add(transacao);
    }

    public void removerTransacao(Transacao transacao){
        list.remove(transacao);
    }

    public Iterator<Transacao> getTransacoes(){
        List<Transacao> listaImutavel = Collections.unmodifiableList(list);

        return listaImutavel.listIterator();
    }
}
