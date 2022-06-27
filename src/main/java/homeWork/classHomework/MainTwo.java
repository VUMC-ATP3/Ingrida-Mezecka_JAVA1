package homeWork.classHomework;

public class MainTwo {

    public static void main(String[] args) {
        System.out.println("Pirmais trissturis");

        Trissturis trissturisViens = new Trissturis(){
        };
        trissturisViens.malaViens = 8;
        trissturisViens.malaDivi = 9;
        trissturisViens.malaTris = 10;
        trissturisViens.printetLaukumu();
        System.out.println("vienadsanu?: " + trissturisViens.vienadsanu());
        System.out.println("vienadmalu?: " + trissturisViens.vienadmalu());

        System.out.println("Otrais trissturis");
        Trissturis trissturisDivi = new Trissturis(4, 4, 12){
               };
        trissturisDivi.printetLaukumu();
        System.out.println("vienadsanu?: " + trissturisDivi.vienadsanu());
        System.out.println("vienadmalu?:" + trissturisDivi.vienadmalu());
    }


}
