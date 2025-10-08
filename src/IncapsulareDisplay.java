public class IncapsulareDisplay {
    public static void main(String[] args) {

        Incapsulare objIncapsulare = new Incapsulare();

        System.out.println(objIncapsulare.getNume());
        System.out.println(objIncapsulare.getVarsta());
        System.out.println(objIncapsulare.getFunctieInCompanie());
        System.out.println(objIncapsulare.getSalariu());

        System.out.println("----------------");
        System.out.println("----------------");

        objIncapsulare.setNume("Andrei");
        objIncapsulare.setVarsta(45);
        objIncapsulare.setFunctieInCompanie("Contabil");
        objIncapsulare.setSalariu(25000.0);

        System.out.println(objIncapsulare.getNume());
        System.out.println(objIncapsulare.getVarsta());
        System.out.println(objIncapsulare.getFunctieInCompanie());
        System.out.println(objIncapsulare.getSalariu());


    }
}