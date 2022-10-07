/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetico;

/**
 *
 * @author Sebastian Sanchez
 */
public final class CentroMedico extends Persona {
    private String ips;

    public String getIps() {
        return ips;
    }

    public CentroMedico(String ips) {
        this.ips = ips;
    }
    @Override
    public void imprimir(){
    System.out.println("Nombre: "+getNomb1()+
                "\nApellido: "+getApelli1()+
                "\nSexo: "+getSexo()+
                "\nDireccion: "+getDireccion()+
                "\nCentro medico: "+ips+
                "\nMotivo Consulta: "+getMotivoConsulta()+
                "\nfecha: "+getFecha());}
}
