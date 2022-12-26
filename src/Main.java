public class Main {
    public static void main(String[] args) {
        //Ejercicio IF
        int numeroIf = -10;

        if(numeroIf > 0){
            System.out.println("El numero es POSITIVO");
        } else if (numeroIf < 0) {
            System.out.println("El numero es NEGATIVO");
        }else{
            System.out.println("El numero es CERO");
        }

        //Ejercicio WHILE
        int numeroWhile = 2;

        while (numeroWhile < 3){
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }

        //Ejercicio DO WHILE
        do {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }while (numeroWhile < 3);

        //Ejercicio FOR

        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1){
            System.out.println(numeroFor);
        }

        //Ejercicio SWITCH
        String estacion = "VERANO";

        switch (estacion) {
            case "INVIERNO" -> System.out.println("Estas en INVIERNO");
            case "VERANO" -> System.out.println("Estas en VERANO");
            case "OTOÑO" -> System.out.println("Estas  en OTOÑO");
            case "PRIMAVERA" -> System.out.println("Estas en PRIMAVERA");
            default -> System.out.println("la opcion no es una estacion del año");
        }
    }
}
