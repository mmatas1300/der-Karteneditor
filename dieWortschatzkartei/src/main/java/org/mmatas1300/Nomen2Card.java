package org.mmatas1300;

public class Nomen2Card extends Card{

    private final String typ="Nomen";
    private String mann;
    private String manner;
    private String frau;
    private String frauen;
    private String verwandte;

    public Nomen2Card(String wort, String manner, String frau, String frauen, String verwandte, String beispiel, String bild) {
        super("Nomen-2", wort, beispiel, bild);
        this.mann = "der " + this.getWort();
        this.manner = "die " + manner;
        this.frau = "die " + frau;
        this.frauen = "die " + frauen;
        this.verwandte = verwandte;
    }

    public String getTyp() {
        return typ;
    }

    public String getMann() {
        return mann;
    }

    public void setMann(String mann) {
        this.mann = mann;
    }

    public String getManner() {
        return manner;
    }

    public void setManner(String manner) {
        this.manner = manner;
    }

    public String getFrau() {
        return frau;
    }

    public void setFrau(String frau) {
        this.frau = frau;
    }

    public String getFrauen() {
        return frauen;
    }

    public void setFrauen(String frauen) {
        this.frauen = frauen;
    }

    public String getVerwandte() {
        return verwandte;
    }

    public void setVerwandte(String verwandte) {
        this.verwandte = verwandte;
    }
}