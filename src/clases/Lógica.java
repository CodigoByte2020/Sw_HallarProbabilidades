package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Software para hallar las probabilidades existentes en un juego de lotería
public class Lógica {

    List<Integer> lista1 = new ArrayList<>();
    List<Integer> lista2 = new ArrayList<>();
    List<Integer> lista3 = new ArrayList<>();
    List<Integer> lista4 = new ArrayList<>();
    List<Integer> lista5 = new ArrayList<>();
    List<Integer> lista6 = new ArrayList<>();

    int cantidad;
    Scanner entrada = new Scanner(System.in);

    public void IngresoDatos() {

        System.out.print("Ingrese cuantas posibilidades tendrá cada jugada: ");
        cantidad = entrada.nextInt();
    }

    public void LlenadoLista() {

        for (int i = 1; i <= cantidad; i++) {
            lista1.add(i);
            lista2.add(i);
            lista3.add(i);
            lista4.add(i);
            lista5.add(i);
            lista6.add(i);
        }
    }

    public void HallarCombinaciones() {

        cantidad = 0;

        for (int i : lista1) {
            for (int j : lista2) {
                for (int k : lista3) {
                    for (int l : lista4) {
                        for (int m : lista5) {
                            for (int n : lista6) {
                                System.out.println(i + " " + j + " " + k + " " + l + " " + m + " " + n);
                                cantidad += 1;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("El número total de combinaciones es: " + cantidad);
    }
}
