/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho;

import conexao.SomLivreServidor;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author anaFidelis
 */
public class SomLivreAdapter implements Loja{
    private SomLivreServidor som;

    public SomLivreAdapter() {
        som = new SomLivreServidor();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection ler() {
        ArrayList<CD> listaCDs = new ArrayList();
        
        String[] informacoesCDs = som.buscaCD();
        
        //percorre todo o vetor, quebra a string com as informaçoes, cria o objeto CD e adiciona na lista
        for (String informacoesCD : informacoesCDs) {            
            String[] valores = informacoesCD.split("|");
            CD cd = new CD(valores[0], valores[1], Double.parseDouble(valores[2]), "Som Livre");
            listaCDs.add(cd);
        }
        
        return listaCDs;
    }
    
    
}
