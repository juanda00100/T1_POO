/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1_poo;
import java.util.Scanner;
/**
 *
 * @author UCA40424
 */
public class T1_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //FIOJDS
Scanner sc = new Scanner(System.in);
        Alumno_controlador c = new Alumno_controlador();
        boolean activo = true;

        System.out.println("=== SISTEMA INSTITUTO INNOVA ===");

        while (activo) {
            System.out.println("\n1.Registrar  2.Listar  3.Salir");
            System.out.print("Opción: ");
            
            if (!sc.hasNextInt()) { System.out.println("Ingrese un número"); sc.next(); continue; }
            int op = sc.nextInt(); sc.nextLine();

            if (op == 1) {
                System.out.print("Nombre: "); String nom = sc.nextLine();
                System.out.print("Apellido: "); String ape = sc.nextLine();
                System.out.print("Tipo doc (DNI/CARNE_RESIDENCIA): "); String tDoc = sc.nextLine().trim();
                if (!Alumno.tipoDocValido(tDoc)) { System.out.println("Tipo inválido"); continue; }

                System.out.print("Número doc: "); String doc = sc.nextLine().trim();
                if (!Alumno.docValido(doc, tDoc)) { System.out.println("Doc debe tener " + (tDoc.equals("DNI")?"8":"11") + " dígitos"); continue; }

                System.out.print("Nivel (A/B/C): "); String niv = sc.nextLine().trim().toUpperCase();
                if (!Alumno.nivelValido(niv)) { System.out.println("Nivel inválido"); continue; }

                System.out.print("Beca (NINGUNA/PARCIAL/TOTAL): "); String bec = sc.nextLine().trim().toUpperCase();
                if (!Alumno.becaValida(bec)) { System.out.println("Beca inválida"); continue; }

                System.out.print("Tarifa: S/ ");
                if (!sc.hasNextDouble()) { System.out.println("Valor numérico requerido"); sc.next(); continue; }
                double tar = sc.nextDouble(); sc.nextLine();
                if (tar < 0) { System.out.println("Tarifa no negativa"); continue; }

                System.out.println(c.agregar(new Alumno(nom, ape, doc, tDoc, niv, bec, tar)));
            }
            else if (op == 2) c.listar();
            else if (op == 3) { activo = false; System.out.println("Saliendo..."); }
            else System.out.println("Opción inválida");
        }
        sc.close();
    }
    
}
