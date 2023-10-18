package ejercicio;

import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Ejemplo");
        myList.add("TRES");

        String result = String.join(" ", myList).toLowerCase();

        System.out.println(result);
    }
}
