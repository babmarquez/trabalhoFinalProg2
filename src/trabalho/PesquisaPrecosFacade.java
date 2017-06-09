/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author anaFidelis
 */
public class PesquisaPrecosFacade {    
    public Collection pesquisar(String chave){
        ArrayList<CD> result = new ArrayList();
        
        Loja sub = SubmarinoAdapter.getInstance();
        Loja som = SomLivreAdapter.getInstance();        
        
        result.addAll(som.procurar(chave));
        result.addAll(sub.procurar(chave));
        
        return result;
    }
    
    public void salvar(){
        //implementaçao para salvar as pesquisas
    }
    
    public void ler(){
        Loja sub = SubmarinoAdapter.getInstance();
        Loja som = SomLivreAdapter.getInstance();
        
        sub.conectar("furb", "furb");
        som.conectar("furb", "furb");
        
        sub.ler();
        som.ler();
    }
}
