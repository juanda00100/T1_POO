/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1_poo;
import java.util.ArrayList;
/**
 *
 * @author UCA40424
 */
class Alumno_controlador {
    private ArrayList<Alumno> lista = new ArrayList<>();

    public String agregar(Alumno a) {
        for (Alumno x : lista) if (x.getDocumento().equals(a.getDocumento())) return "Documento duplicado";
        lista.add(a);
        return " Alumno registrado";
    }

    public void listar() {
        if (lista.isEmpty()) System.out.println("No hay registros");
        else { for (Alumno a : lista) System.out.println(a); }
    }
}
