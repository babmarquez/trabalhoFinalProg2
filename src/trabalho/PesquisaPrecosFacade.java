/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Ana Paula Fidelis e Bárbara Marquez
 */
public class PesquisaPrecosFacade
{
    private Set<String> salvos;

    public PesquisaPrecosFacade()
    {
        this.salvos = new HashSet<>();
    }

    public Set<String> getSalvos()
    {
        return salvos;
    }   
    
    public Collection pesquisar(String chave)
    {
        ArrayList<CD> result = new ArrayList();
        
        Loja sub = SubmarinoAdapter.getInstance();
        Loja som = SomLivreAdapter.getInstance();        
        
        result.addAll(som.procurar(chave));
        result.addAll(sub.procurar(chave));
        
        return result;
    }
    
    public void salvar(String chave)
    {
        //implementaçao para salvar as pesquisas        
        Date date = new Date();
        DateFormat formato = new SimpleDateFormat("HH:mm");
                
        salvos.add(chave + " - " + formato.format(date));   
    }
    
    public void ler()
    {
        Loja sub = SubmarinoAdapter.getInstance();
        Loja som = SomLivreAdapter.getInstance();
        
        sub.conectar("furb", "furb");
        som.conectar("furb", "furb");
        
        sub.ler();
        som.ler();
        
        //sub.desconectar();
        //som.desconectar();
    }
}