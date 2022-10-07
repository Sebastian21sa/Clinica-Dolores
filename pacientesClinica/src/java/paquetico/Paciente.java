/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetico;

/**
 *
 * @author Sebastian Sanchez
 */
public final class Paciente extends Persona {

    
    private String centroMedico;
    private String doctor;
    

    public Paciente() {

    }
    @Override
    public void imprimir(){
        System.out.println("Nombre: "+getNomb1()+
                "\nApellido: "+getApelli1()+
                "\nSexo: "+getSexo()+
                "\nDireccion: "+getDireccion()+
                "\nCentro de atencion: "+centroMedico+
                "\nMotivo Consulta: "+getMotivoConsulta()+
                "\nDoctor: "+doctor+
                "\nfecha: "+getFecha());
    }
}
