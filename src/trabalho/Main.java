/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package trabalho;

import didatico.SubmarinoProducts;
import conexao.SomLivreServidor;
import java.util.Arrays;

/**
 *
 * @author anaFidelis
 */
public class Main {
    public static void main(String[] args) throws Exception {
        SubmarinoProducts sub = SubmarinoProducts.getInstance();
        
        sub.connect("furb", "furb");
        
        System.out.println(sub.isConnected() ? "Conectado" : "Desconectado");
        
        String[][] matriz = sub.getCDProducts();
        String[] linha;
        
        for (String[] matriz1 : matriz) {
            System.out.println(Arrays.toString(matriz1));
        }
        
        sub.disconnect();
        
        System.out.println(sub.isConnected() ? "Conectado" : "Desconectado");
        
        System.out.println("_________________________________________________________");
        
        SomLivreServidor som = new SomLivreServidor();
        
        som.registrar("furb");
        
        String[] cds = som.buscaCD();
        
        for (String cd : cds) {
            System.out.println(cd);
        }
        
        /*
            Verificar qual a melhor forma para armazenar estas informaçoes(JCF) - PRIORIDADE
            As informaçoes armazenadas teram que ter uma ordem para ser impressas que sera escolhida pelo usuario
            Todas as pesquisas vao ser salvas para possivel consulta posterior com, CHAVE e DATA/HORA (Onde e como armazenar?)
            Deve ter interface grafica
            A busca sera feita pelo nome do ALBUM ou ARTISTA
        */
        
    }
}
