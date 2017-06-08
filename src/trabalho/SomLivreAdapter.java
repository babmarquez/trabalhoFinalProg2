/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho;

import conexao.SomLivreServidor;
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
    
    
}
