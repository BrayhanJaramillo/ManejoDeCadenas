/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodo;

/**
 *
 * @author BRAYHAN
 */
public class Logica {

    String palabra;
    String vocal;

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getVocal() {
        return vocal;
    }

    public void setVocal(String vocal) {
        this.vocal = vocal;
    }

    public Logica(String palabra, String vocal) {
        this.palabra = palabra;
        this.vocal = vocal;
    }

    public Logica() {
    }
}
