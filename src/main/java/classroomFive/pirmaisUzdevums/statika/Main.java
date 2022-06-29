package classroomFive.pirmaisUzdevums.statika;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Auto.klasesNosaukums);
//        Auto masina = new Auto("BMW");
//        System.out.println(masina.klasesNosaukums);
//        masina.klasesNosaukums = "Autoklase_MAINITA";
//        System.out.println(masina.marka);
//        masina.marka = "Golf";
//        System.out.println(masina.marka);
//
//        Auto masinaDivi = new Auto();
//        masinaDivi.marka = "Golf";
//        System.out.println(masinaDivi.klasesNosaukums);

        System.out.println("cik auto objekti uztaisiti: " + Auto.totalCarsCreated);
        Auto masina = new Auto("BMW");
        Auto masinaDivi = new Auto("Golf");
        System.out.println("cik auto objekti uztaisiti?" + Auto.totalCarsCreated);
        Auto masinaTris = new Auto("AUdi");
        Auto masinaCetri = new Auto("Golf2");
        System.out.println("cik tagad?" + Auto.totalCarsCreated);
        Auto.printText();
    }
}
