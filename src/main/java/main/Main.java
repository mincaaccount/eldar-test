package main;

import model.TarjetaAmex;
import model.TarjetaDeCredito;
import model.TarjetaNara;
import model.TarjetaVisa;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaVencimientoVisa = LocalDate.of(27, 12, 20);
        TarjetaDeCredito tarjeta1 = new TarjetaVisa("1234 5678 9012 3456", "Marcos Inca", fechaVencimientoVisa);
        LocalDate fechaVencimientoNara = LocalDate.of(23, 12, 20);
        TarjetaDeCredito tarjeta2 = new TarjetaNara("3456 5678 2345 3456", "Juan Manuel", fechaVencimientoNara);
        LocalDate fechaVencimientoAmex = LocalDate.of(24, 12, 20);
        TarjetaDeCredito tarjeta3 = new TarjetaAmex("2345 5678 1234 6784", "Agustin Lopez", fechaVencimientoAmex);

        System.out.println("Información de tarjeta 1:");
        System.out.println(tarjeta1.toString());

        System.out.println("\nInformación de tarjeta 2:");
        System.out.println(tarjeta2.toString());

        System.out.println("\nInformación de tarjeta 3:");
        System.out.println(tarjeta3.toString());

        // Informar si una operación es válida usando tarjeta 1
        double montoOperacion = 800;
        if (tarjeta1.esOperacionValida(montoOperacion)) {
            System.out.println("\nLa operación es válida para tarjeta 1.");
        } else {
            System.out.println("\nLa operación no es válida para tarjeta 1.");
        }

        // Informar si una tarjeta es valida para operar
        if (tarjeta1.esValidaParaOperar()) {
            System.out.println("\nLa tarjeta es valida para operar");
        } else {
            System.out.println("\nLa tarjeta ni es valida para operar");
        }

        // Identificar si una tarjeta es distinta a otra usando tarjeta 2 y 3
        if (tarjeta2.sonDistintas(tarjeta3)) {
            System.out.println("\nLas tarjetas son diferentes");
        } else {
            System.out.println("\nSon las mismas tarjetas");
        }

        // Obtener por medio de un metodo la tasa de una operacion informando marca e importe
        double importeOperacion = 1000;
        double tasaTarjeta1 = tarjeta1.calcularTasaConImporte(importeOperacion);
        System.out.println("\nTasa de tarjeta " + tarjeta1.getMarca() + " para una operación de $" + importeOperacion + " es de " + tasaTarjeta1);

    }
}