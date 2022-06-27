package homeWork.classHomework;

public class Trissturis {

    int malaViens;
    int malaDivi;
    int malaTris;
    int laukums;

    Trissturis() {
        System.out.println("veidoju trissturi");
    }

    public void printetLaukumu() {
        System.out.println("Trisstura laukums ir " + laukums + "cm2");
    }

    public Trissturis (int malaViens, int malaDivi, int malaTris) {
        this.malaViens = malaViens;
        this.malaDivi = malaDivi;
        this.malaTris = malaTris;
        laukums = (malaViens + malaDivi + malaTris) / 2;

}

    public boolean vienadmalu() {

        if ((malaViens == malaDivi) && (malaViens==malaTris))
            return true;
        else return false;
    }
    public boolean vienadsanu() {

        if ((malaViens == malaDivi) || (malaViens == malaTris) || (malaDivi == malaTris))
            return true;
        else return false;
    }

}