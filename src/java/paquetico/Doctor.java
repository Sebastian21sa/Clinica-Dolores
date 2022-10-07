/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetico;

/**
 *
 * @author Sebastian Sanchez
 */
public final class Doctor extends Persona{
    private String nomDoc;
    private String apellDoc;

    public String getNomDoc() {
        return nomDoc;
    }

    public String getApellDoc() {
        return apellDoc;
    }

    public Doctor(String nomDoc, String apellDoc) {
        this.nomDoc = nomDoc;
        this.apellDoc = apellDoc;
    }
    @Override
    public void imprimir(){
        System.out.println("Nombre: "+getNomb1()+
                "\nApellido: "+getApelli1()+
                "\nSexo: "+getSexo()+
                "\nDireccion: "+getDireccion()+
                "\nMotivo Consulta: "+getMotivoConsulta()+
                "\nDoctor:" + nomDoc+apellDoc+
                "\nfecha: "+getFecha());
    }
}
