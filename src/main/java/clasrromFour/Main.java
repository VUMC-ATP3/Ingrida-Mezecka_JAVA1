package clasrromFour;

public class Main {

    public static void main(String[] args) {
        House majaViens = new House(4, true, false, "hghghg","hghg", 6);

        majaViens.printHouse();

        House majaDivi = new House(3, false, true, "daudz", "perkona", 4433333);
//
//
//        House majaTris = new House();
//        majaTris.stavuSkaits = 100;
//        majaTris.majasNumurs = 23232;
//        majaTris.ielasNosaukums = "Automatizacijas";
//        majaTris.irLifts = true;
//        majaTris.irAutostavvieta = true;
//        majaTris.krasa = "daudzkrāsaina";
//        majaTris.printHouse();
//        majaTris.stavuSkaits = 333;
//        majaTris.printHouse();

        Velo zzk = new Velo();
        zzk.bremzuTips = 'D';
        System.out.println(zzk.atrums); // VAI
        zzk.printetAtrumu();
        System.out.println("cilveks uzkapj uz velo un sāk mīt padalus");
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.printetAtrumu();
        System.out.println("priekš kaķis, jābremzē");
        zzk.bremzet();
        zzk.bremzet();
        zzk.bremzet();
        zzk.bremzet();
        zzk.printetAtrumu();
        System.out.println(" viss kartiba, kakis aizmuka");

        Velo merida = new Velo();
        merida.bremzuTips = 'V';
        merida.printetAtrumu();

        Velo cits = new Velo();
        cits.bremzuTips = 'S';
        cits.bremzet();


        Koks jaunsKoks = new Koks();
        jaunsKoks.printetKoku();


        Rinkis mansRinkis = new Rinkis(34);
        System.out.println(mansRinkis.PI);

        System.out.println(mansRinkis.radiuss);
        System.out.println(mansRinkis.aprekinatLaukumu());

        Rinkis mansRinkisDivi = new Rinkis();
        System.out.println(mansRinkisDivi.PI);
        mansRinkisDivi.radiuss = 45;
        System.out.println(mansRinkisDivi.radiuss);
        System.out.println(mansRinkisDivi.aprekinatLaukumu());
        System.out.println(mansRinkisDivi.aprekinatRinkaLinijasGarumu());
        Rinkis mansRinkisTris = new Rinkis();
        mansRinkis.printCreatedTime();
        mansRinkisDivi.printCreatedTime();
        mansRinkisTris.printCreatedTime();

        Rinkis mansRinkisCetriArPadotoRadiusu = new Rinkis(12.3);

        Taisnsturis taisnsturisViens = new Taisnsturis(54, 87);
//        taisnsturisViens.malaViens = 12.4;
//        taisnsturisViens.malaDivi = 46;
        System.out.println("taisnsturalaikums" + taisnsturisViens.aprekinatLaukumu());


        Suns reksis = new Suns();
        System.out.println(reksis.vaiRej); //manto visu no Suns klases
        reksis.astesGarums = 10;
        reksis.name = "Reksis";
        reksis.astesGarums = 10;
        System.out.println("reksa astes garums ir" + reksis.astesGarums);
        reksis.printName();

        Punti punts = new Punti();
        System.out.println("Putni izdod skanu");
        punts.izdodSkanu();




}



    }

