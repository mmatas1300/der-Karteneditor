package org.mmatas1300;

public class Card {

    private String type;
    private char anfangsbuchstabe;
    private String wort;
    private String beispiel;
    private String bild;

    public Card(String type, String wort, String beispiel, String bild){
        this.type = type;
        this.anfangsbuchstabe = wort.charAt(0);
        this.wort = wort;
        this.beispiel = beispiel;
        this.bild = bild;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWort() {
        return wort;
    }

    public void setWort(String wort) {
        this.wort = wort;
    }

    public String getBeispiel() {
        return beispiel;
    }

    public void setBeispiel(String beispiel) {
        this.beispiel = beispiel;
    }

    public String getBild() {
        return bild;
    }

    public void setBild(String bild) {
        this.bild = bild;
    }

    public char getAnfangsbuchstabe() {
        return anfangsbuchstabe;
    }
}