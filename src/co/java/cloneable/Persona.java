package co.java.cloneable;

import java.io.Serializable;
import java.util.List;

/***
 * Clase creada para realizar ejemplo
 * de la implementacion de la interfaz cloneable
 * 
 * @author carlos
 */
public class Persona implements Serializable, Cloneable{
    
    private String nombre;
    private String apellidos;
    private String sexo;
    private List<String> personasACargo;

    public Persona(String nombre, String apellidos, String sexo, List<String> personasACargo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.personasACargo = personasACargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<String> getPersonasACargo() {
        return personasACargo;
    }

    public void setPersonasACargo(List<String> personasACargo) {
        this.personasACargo = personasACargo;
    }
    
    /***
     * Se llama al metodo clone
     * el cual se encuentra en la
     * clase Object, y se captura la excepcion ya que este
     * lanza el tipo de excepcion CloneNotSupportedException cuando no
     * encuentra el implmements de la interfaz Cloneable
     * @return 
     */
    public Persona clone(){
        try {
            return (Persona) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
    
    /***
     * Alternativa para la clonacion de un objeto, la copia
     * del objeto por medio de el constructor de la propia clase
     * @param p 
     */
    public Persona (Persona p){
        this.apellidos = p.getApellidos();
        this.nombre = p.getNombre();
        this.sexo = p.getSexo();
        this.personasACargo = p.getPersonasACargo();
    }
    
    @Override
    public String toString() {
        return nombre + apellidos + sexo + personasACargo.toString();
    }    
}
