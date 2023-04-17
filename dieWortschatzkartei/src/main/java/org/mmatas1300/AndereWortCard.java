package org.mmatas1300;

public class AndereWortCard extends Card{

    private String typ;
    private String andereWort;
    private String verwandte;

    public AndereWortCard(String wort, String typ, String verwandte, String beispiel, String bild) {
        super("Andere-Wort", wort, beispiel, bild);
        this.andereWort = this.getWort();
        this.verwandte = verwandte;
        this.typ = typ;
    }

    public String getAndereWort() {
        return andereWort;
    }

    public void setAndereWort(String andereWort) {
        this.andereWort = andereWort;
    }

    public String getVerwandte() {
        return verwandte;
    }

    public void setVerwandte(String verwandte) {
        this.verwandte = verwandte;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }
}