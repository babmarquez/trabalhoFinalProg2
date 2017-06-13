/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Barbara
 */
class PersistenciaPesquisa
{
    public static ArrayList<ResultadoPesquisa> carregarPesquisas(Path path)
    {
        ArrayList<ResultadoPesquisa> result;
        try
        {
            ObjectInputStream file = new ObjectInputStream(new FileInputStream(path.toFile()));
            result = (ArrayList<ResultadoPesquisa>)file.readObject();
            file.close();
        } catch (FileNotFoundException fnfe) {
            //Logger.getLogger(Exe5.class.getName()).log(Level.WARNING, "NÃ£o encontrou. Deve ser a primeira execuÃ§Ã£o. Logo serÃ¡ criado.");
            result = new ArrayList();
        } catch (IOException ioe) {
            //Logger.getLogger(Exe5.class.getName()).log(Level.SEVERE, null, ioe);
            result = new ArrayList();
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(Exe5.class.getName()).log(Level.SEVERE, null, ex);
            result = new ArrayList();
        }
        return result;
    }
    
    public static void salvarPesquisas(ArrayList<ResultadoPesquisa> pesquisas, Path path)
    {
        try
        {
            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(path.toFile()));
            // grava um único objeto: o ArrayList, que agrega todos os objetos criados
            file.writeObject(pesquisas);
            file.close();
        } catch (IOException ex) {
            //Logger.getLogger(Exe5.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
}