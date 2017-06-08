/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho;

import didatico.SubmarinoProducts;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anaFidelis
 */
public class SubmarinoAdapter implements Loja{
    private SubmarinoProducts sub;

    public SubmarinoAdapter() {
        sub = SubmarinoProducts.getInstance();
    }

    @Override
    public boolean conectar(String usuario, String senha) {
        try {
            sub.connect(usuario, senha);
        } catch (Exception ex) {
            Logger.getLogger(SubmarinoAdapter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return sub.isConnected();
    }

    @Override
    public void desconectar() {
        sub.disconnect();
    }

    @Override
    public Collection procurar(String chave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
