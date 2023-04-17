package org.mmatas1300;

public class Nomen1Card extends Card{

    private final String typ="Nomen";
    private String sg;
    private String pl;
    private String verwandte;

    public Nomen1Card(String type, String wort, String pl, String verwandte, String beispiel, String bild) {
        super(type, wort, beispiel, bild);
        if (type == "Nomen-pl"){
            this.sg = "-";
            this.pl = "die " + this.getWort();
        } else {
            this.sg = super.getType().substring(6,9) + " " + this.getWort();
            this.pl = "die " + pl;
        }
        this.verwandte = verwandte;
    }

    public String getTyp(){
        return typ;
    }

    public String getSg() {
        return sg;
    }

    public void setSg(String sg) {
        this.sg = sg;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }

    public String getVerwandte() {
        return verwandte;
    }

    public void setVerwandte(String verwandte) {
        this.verwandte = verwandte;
    }
}