package codigoCinco;

import java.util.Scanner;//Se importa un scanner 

public class Codigo5 {    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //Se agregó el System.in para que nuestros Scanner guerde 
        System.out.print("Introduzca un número: ");
        String ni = s.nextLine();
        int c = Integer.parseInt(ni);//Se agregó parseInt para convertir el String en un valor de tipo int-entero
        
        int afo = 0;
        int numAfo = 0;

        while (c > 0) {
            int digito = c % 10;
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) { //Se eliminan las comillas para que se itere de manera correcta 
                afo++;
            } else {
                numAfo++;
            }
            c /= 10;//se reemplaza ni por c para que siga la iteracion del ciclo
        }

        if (afo > numAfo) {
            System.out.println("El " + ni + " es un número afortunado.");//Se concateno ni en lugar de c para devolver el valor de tipo String
        } else {
            System.out.println("El " + ni + " no es un número afortunado.");
        }
   }//main
}//class