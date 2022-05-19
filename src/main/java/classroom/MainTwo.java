package classroom;

public class MainTwo {
    public static void main(String[] args) {
        String vards = "Ingrida";
        String uzvards = "Mezecka";
        int vecums = 39;
        boolean isPresent = true;

        System.out.println("Vards: " + vards + "\n" + "Uzvards: " + uzvards + "\n"
        + "Vecums: " + vecums + "\n" + "Vai bija nodarbībā?: " + isPresent);
        // %s string

        String teikums = String.format("Vards: %s \n Uzvards %s \n Vecums %s \n isPresent", vards, uzvards, vecums);

        System.out.println(teikums);

        System.out.println(2*(2+2));
        System.out.println(teikums);
    }
}
