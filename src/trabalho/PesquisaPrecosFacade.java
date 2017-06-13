/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Ana Paula Fidelis, Bárbara Marquez e Dener de Souza
 */
public class PesquisaPrecosFacade
{
    private ArrayList<ResultadoPesquisa> pesquisas;
    private final Path pathArq = Paths.get("formas.dat");

    public PesquisaPrecosFacade()
    {
        this.pesquisas = PersistenciaPesquisa.carregarPesquisas(pathArq);
    }

    public ArrayList<ResultadoPesquisa> getSalvos()
    {
        return pesquisas;
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
    
    public void salvar(String chave, int ordem)
    {
        pesquisas.add(new Pesquisa(chave, ordem));
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