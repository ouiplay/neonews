package net.aplicacionesutiles.neonews.Clases;

import java.net.URL;

/**
 * Created by PatxiRodriguez on 7/6/15.
 */
public class Noticias  {

    private Integer logoMedio;
    private String titular;
    private String noticia;
    private String urlWeb;

    public Noticias(){}

    public Noticias(Integer logoMedio, String titular, String noticia, String urlWeb) {
        this.logoMedio = logoMedio;
        this.titular = titular;
        this.noticia = noticia;
        this.urlWeb = urlWeb;
    }

    public Integer getLogoMedio() {
        return logoMedio;
    }

    public void setLogoMedio(Integer logoMedio) {
        this.logoMedio = logoMedio;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public String getUrlWeb() {
        return urlWeb;
    }

    public void setUrlWeb(String urlWeb) {
        this.urlWeb = urlWeb;
    }
}
