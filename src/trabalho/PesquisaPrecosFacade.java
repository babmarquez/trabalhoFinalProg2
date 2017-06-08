/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho;

/**
 *
 * @author anaFidelis
 */
public class PesquisaPrecosFacade {
    public void pesquisar(String chave){
        Loja sub = new SubmarinoAdapter();
        Loja som = new SomLivreAdapter();
        
        sub.procurar(chave);
        som.procurar(chave);
    }
    
    public void salvar(){
        //implementaçao para salvar as pesquisas
    }
    
    public void ler(){
        Loja sub = new SubmarinoAdapter();
        Loja som = new SomLivreAdapter();
        
        sub.ler();
        som.ler();
    }
}
