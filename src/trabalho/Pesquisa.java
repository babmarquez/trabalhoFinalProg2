/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ana Paula Fidelis, Bárbara Marquez e Dener de Souza
 */
public class Pesquisa extends ResultadoPesquisa
{
    private Date dataPesquisa;
    private String termoPesquisa;
    private int ordem;

    public Pesquisa(String termoPesquisa, int ordem)
    {
        this.dataPesquisa =  new Date();
        this.termoPesquisa = termoPesquisa;
        this.ordem = ordem;
    }
    
    public int getOrdem()
    {
        return ordem;
    }
    
    public void setOrdem(int ordem)
    {
        this.ordem = ordem;
    }

    public Date getDataPesquisa()
    {
        return dataPesquisa;
    }

    public void setDataPesquisa(Date dataPesquisa)
    {
        this.dataPesquisa = dataPesquisa;
    }

    public String getTermoPesquisa()
    {
        return termoPesquisa;
    }

    public void setTermoPesquisa(String termoPesquisa)
    {
        this.termoPesquisa = termoPesquisa;
    }
    
    @Override
    public String toString()
    {
        DateFormat formato = new SimpleDateFormat("DD/MM/YYYY HH:mm");
        return "Pesquisa: " + this.getTermoPesquisa() + "(" + this.getOrdem() + ") - Data: " + formato.format(this.getDataPesquisa());
    }
}