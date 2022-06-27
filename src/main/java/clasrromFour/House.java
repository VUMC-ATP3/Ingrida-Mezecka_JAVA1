package clasrromFour;

public class House {
    int stavuSkaits;
    boolean irLifts;
    boolean irAutostavvieta;
    String krasa;
    String ielasNosaukums;
    int majasNumurs;

    public House(int stavuSkaits, boolean irLifts, boolean irAutostavvieta, String krasa, String ielasNosaukums, int majasNumurs) {
        this.stavuSkaits = stavuSkaits;
        this.irLifts = irLifts;
        this.irAutostavvieta = irAutostavvieta;
        this.krasa = krasa;
        this.ielasNosaukums = ielasNosaukums;
        this.majasNumurs = majasNumurs;
    }

    public void printHouse(){
        System.out.println("Mājas adrese ir " + adrese());
        System.out.println("Mājas krāsa ir " + krasa);
        System.out.println("Mājā ir " + stavuSkaits + " " + "stāvi");
        System.out.println("Mājā ir lifts: " + irLifts);
        System.out.println("Pie mājas ir autostāvvieta:  " + irAutostavvieta);


}
public String adrese(){
return ielasNosaukums + " " + majasNumurs;
}
}


