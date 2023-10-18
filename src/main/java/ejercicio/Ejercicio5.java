package ejercicio;

public class Ejercicio5 {
    public static void main(String[] args) {
        String[] myArray = {"Ejemplo", "TRES"};

        String resultado = String.join(" ", myArray).toLowerCase();

        System.out.println(resultado);
    }
}
