/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1_poo;

/**
 *
 * @author UCA40424
 */
public class Alumno {

    // Atributos privados → Encapsulamiento
    private String nombre;
    private String apellido;
    private String documento;
    private String tipo_Documento; // "DNI" o "CARNE_RESIDENCIA"
    private String nivel_economico; // "A", "B", "C"
    private String tipo_Beca; // "NINGUNA", "PARCIAL", "TOTAL"
    private double tarifa_Base;
    private double monto_Pagar;
    private String beca;
    private String nivel;
    private String monto;

    // Constructor con parámetros
    public Alumno(String nombre, String apellido, String documento, String tipoDocumento,
                  String nivel_economico, String tipoBeca, double tarifaBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.tipo_Documento = tipoDocumento;
        this.nivel_economico = nivel_economico;
        this.tipo_Beca = tipoBeca;
        this.tarifa_Base = tarifaBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo_Documento() {
        return tipo_Documento;
    }

    public void setTipo_Documento(String tipo_Documento) {
        this.tipo_Documento = tipo_Documento;
    }

    public String getNivel_economico() {
        return nivel_economico;
    }

    public void setNivel_economico(String nivel_economico) {
        this.nivel_economico = nivel_economico;
    }

    public String getTipo_Beca() {
        return tipo_Beca;
    }

    public void setTipo_Beca(String tipo_Beca) {
        this.tipo_Beca = tipo_Beca;
    }

    public double getTarifa_Base() {
        return tarifa_Base;
    }

    public void setTarifa_Base(double tarifa_Base) {
        this.tarifa_Base = tarifa_Base;
    }

    public double getMonto_Pagar() {
        return monto_Pagar;
    }

    public void setMonto_Pagar(double monto_Pagar) {
        this.monto_Pagar = monto_Pagar;
    }

    // Método para calcular automáticamente el monto a pagar
    public static boolean docValido(String doc, String tipo) {
        if (doc == null) return false;
        if (tipo.equals("DNI")) return doc.length() == 8;
        return doc.length() == 11;
    }

    public static boolean nivelValido(String n) { return n.equals("A") || n.equals("B") || n.equals("C"); }
    public static boolean becaValida(String b) { return b.equals("NINGUNA") || b.equals("PARCIAL") || b.equals("TOTAL"); }
    public static boolean tipoDocValido(String t) { return t.equals("DNI") || t.equals("CARNE_RESIDENCIA"); }

    public String getDocumento() { return documento; }

    public String toString() {
        return nombre + " " + apellido + " | " + documento + " | Nivel: " + nivel + " | Beca: " + beca + " | Pagar: S/ " + monto;
    }
}
