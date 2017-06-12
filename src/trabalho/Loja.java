/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho;

import java.util.Collection;

/**
 *
 * @author Ana Paula Fidelis e Bárbara Marquez
 */
public interface Loja
{
    public boolean conectar(String usuario, String senha);
    public void desconectar();
    public Collection procurar(String chave);
    public Collection ler();
}