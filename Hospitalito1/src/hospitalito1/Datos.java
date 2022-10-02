
package hospitalito1;

import javax.swing.JOptionPane;

public class Datos {
    
    private String nombres;
    private String apellidos;
    private String medico;
    private String ips;

    public Datos(String nom, String apell, String medico, String centro) {
        this.nombres = nom;
        this.apellidos = apell;
        this.medico = medico;
        this.ips = centro;
    }
    
    public String getNom() {
        return nombres;
    }
    public void setNom(String nom) {
        this.nombres = nom;
    }
    public String getApell() {
        return apellidos;
    }
    public void setApell(String apell) {
        this.apellidos = apell;
    }
    public String getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(String medico) {
        this.medico = medico;
    }
    public String getCentro() {
        return ips;
    }

    /**
     * @param centro the centro to set
     */
    public void setCentro(String centro) {
        this.ips = centro;
    }
 
}
