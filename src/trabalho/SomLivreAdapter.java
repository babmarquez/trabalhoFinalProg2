/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho;

import conexao.SomLivreServidor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Pattern;

/**
 *
 * @author anaFidelis
 */
public class SomLivreAdapter implements Loja{
    private SomLivreServidor som;
    private ArrayList<CD> listaCDs;
    
    private static SomLivreAdapter uniqueInstance;

    private SomLivreAdapter() {
        som = new SomLivreServidor();
    }
    
    //permite apenas uma instancia deste objeto
    public static SomLivreAdapter getInstance(){
         if (uniqueInstance == null)
            uniqueInstance = new SomLivreAdapter();
        
        return uniqueInstance; 
    }

    @Override
    public boolean conectar(String usuario, String senha) {
        return som.registrar(usuario);
    }

    @Override
    public void desconectar() {
        //nao ha metodo de desconectar
    }

    @Override
    public Collection procurar(String chave) {
        ArrayList<CD> cdsBusca = new ArrayList();
        
        for (CD cd : listaCDs) {
            if (cd.equals(chave))
                cdsBusca.add(cd);
        }
        
        return cdsBusca;
    }

    @Override
    public Collection ler() {
        listaCDs = new ArrayList();
        
        String[] informacoesCDs = som.buscaCD();
        
        //percorre todo o vetor, quebra a string com as informaçoes, cria o objeto CD e adiciona na lista
        for (String informacoesCD : informacoesCDs) {            
            String[] valores = informacoesCD.split(Pattern.quote("|"));
            CD cd = new CD(valores[0], valores[1], Double.parseDouble(valores[2]), "Som Livre");
            listaCDs.add(cd);
        }
        
        return listaCDs;
    }
    
    
}
