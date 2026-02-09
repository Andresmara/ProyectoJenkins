package example;

public class MiClase {

    public static boolean dia_laboral(String dia) {
        switch (dia) {
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
                return true;
            case "Sabado":
            case "Domingo":
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(dia_laboral("Lunes"));
        System.out.println(dia_laboral("Domingo"));
    }
}
