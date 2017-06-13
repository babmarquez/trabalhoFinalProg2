/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;
import java.util.Comparator;

/**
 *
 * @author Dener
 */
public class CDComparator {
    public static Comparator<CD> VALOR_DESC = new Comparator<CD>(){
        @Override
        public int compare(CD cd1, CD cd2){
            if(cd2.getPreco() > cd1.getPreco())
            {
                return 1;
            }
            else
            {
                return (cd2.getPreco() < cd1.getPreco()) ? -1 : 0;
            }
        }
    };
    
    public static Comparator<CD> NOME_ALBUM_VALOR = new Comparator<CD>(){
        @Override
        public int compare(CD cd1, CD cd2){
            int modelComparation = cd1.getTitulo().compareTo(cd2.getTitulo());
            if (modelComparation == 0){
                return cd1.compareTo(cd2);
            }            
            return modelComparation;
        }
    };
    
    public static Comparator<CD> NOME_ARTISTA_VALOR_DESC = new Comparator<CD>(){
        @Override
        public int compare(CD cd1, CD cd2){
            int modelComparation = cd1.getBanda().compareTo(cd2.getBanda());
            if (modelComparation == 0){
                return VALOR_DESC.compare(cd1, cd2);
            }            
            return modelComparation;
        }
    };
}
