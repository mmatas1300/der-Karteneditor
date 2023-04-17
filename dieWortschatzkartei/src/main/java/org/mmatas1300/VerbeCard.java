package org.mmatas1300;

public class VerbeCard extends Card{

    private final String typ="Verbe";
    private String infinitiv;
    private String zeitformen;
    private String personalpronomen1;
    private String personalpronomen2;
    private String personalpronomen3;
    private String personalpronomen4;
    private String personalpronomen5;
    private String personalpronomen6;


    public VerbeCard(String wort, String zeitformen, String personalpronomen1, String personalpronomen2, String personalpronomen3, String personalpronomen4, String personalpronomen5, String personalpronomen6, String beispiel, String bild) {
        super("Verbe", wort, beispiel, bild);
        this.infinitiv = this.getWort();
        this.zeitformen = zeitformen;
        this.personalpronomen1 = personalpronomen1;
        this.personalpronomen2 = personalpronomen2;
        this.personalpronomen3 = personalpronomen3;
        this.personalpronomen4 = personalpronomen4;
        this.personalpronomen5 = personalpronomen5;
        this.personalpronomen6 = personalpronomen6;
    }

    public String getTyp() {
        return typ;
    }

    public String getInfinitiv() {
        return infinitiv;
    }

    public void setInfinitiv(String infinitiv) {
        this.infinitiv = infinitiv;
    }

    public String getZeitformen() {
        return zeitformen;
    }

    public void setZeitformen(String zeitformen) {
        this.zeitformen = zeitformen;
    }

    public String getPersonalpronomen1() {
        return personalpronomen1;
    }

    public void setPersonalpronomen1(String personalpronomen1) {
        this.personalpronomen1 = personalpronomen1;
    }

    public String getPersonalpronomen2() {
        return personalpronomen2;
    }

    public void setPersonalpronomen2(String personalpronomen2) {
        this.personalpronomen2 = personalpronomen2;
    }

    public String getPersonalpronomen3() {
        return personalpronomen3;
    }

    public void setPersonalpronomen3(String personalpronomen3) {
        this.personalpronomen3 = personalpronomen3;
    }

    public String getPersonalpronomen4() {
        return personalpronomen4;
    }

    public void setPersonalpronomen4(String personalpronomen4) {
        this.personalpronomen4 = personalpronomen4;
    }

    public String getPersonalpronomen5() {
        return personalpronomen5;
    }

    public void setPersonalpronomen5(String personalpronomen5) {
        this.personalpronomen5 = personalpronomen5;
    }

    public String getPersonalpronomen6() {
        return personalpronomen6;
    }

    public void setPersonalpronomen6(String personalpronomen6) {
        this.personalpronomen6 = personalpronomen6;
    }
}