public class Incapsulare {
    private String nume;
    private int varsta;
    private String functieInCompanie;
    private double salariu;

    // getters
    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getFunctieInCompanie() {
        return functieInCompanie;
    }

    public double getSalariu() {
        return salariu;
    }

    // setters

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setFunctieInCompanie(String functieInCompanie) {
        this.functieInCompanie = functieInCompanie;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

}