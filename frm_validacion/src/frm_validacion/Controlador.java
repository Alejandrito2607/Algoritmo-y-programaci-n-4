/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frm_validacion;

/**
 *
 * @author rivas
 */
public class Controlador {

    private String id;
    private String nombre;
    private int edad;
    private String email;
    private String apellido;
    private int contacto;
    public Controlador(String id, String nombre, int edad, String email, String apellido, int contacto) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.apellido = apellido;
        this.contacto = contacto;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getContacto() {
        return contacto;
    }
    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    

    
}
