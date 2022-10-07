/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetico;

/**
 *
 * @author Sebastian Sanchez
 */
abstract class Persona {

    private String nomb1;
    private String apelli1;
    private String sexo;
    private String direccion;
    private String motivoConsulta;
    private int fecha;

    public Persona(String nomb1, String apelli1, String sexo, String direccion, String motivoConsulta, int fecha) {
        this.nomb1 = nomb1;
        this.apelli1 = apelli1;
        this.sexo = sexo;
        this.direccion = direccion;
        this.motivoConsulta = motivoConsulta;
        this.fecha = fecha;
    }

    public String getNomb1() {
        return nomb1;
    }

    public String getApelli1() {
        return apelli1;
    }
    public void mostrar(){}

    public String getSexo() {
        return sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public int getFecha() {
        return fecha;
    }
    
    public void imprimir(){}
}
