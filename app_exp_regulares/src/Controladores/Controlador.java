/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author rivas
 */
public class Controlador {

    private String id;
    private String PName;
    private String SName;
    private String PApe;
    private String SApe;
    private int Edad;
    private String email;
    private String contacto;
    private String FDnaci;
    private String city;
    private String PerPro;
    private String Profesion;
    private String Tecnologias;

    public Controlador(String id, String PName, String SName, String PApe, String SApe, int Edad, String email, String contacto, String FDnaci, String city, String PerPro, String Profesion, String Tecnologias) {
        this.id = id;
        this.PName = PName;
        this.SName = SName;
        this.PApe = PApe;
        this.SApe = SApe;
        this.Edad = Edad;
        this.email = email;
        this.contacto = contacto;
        this.FDnaci = FDnaci;
        this.city = city;
        this.PerPro = PerPro;
        this.Profesion = Profesion;
        this.Tecnologias = Tecnologias;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getPApe() {
        return PApe;
    }

    public void setPApe(String PApe) {
        this.PApe = PApe;
    }

    public String getSApe() {
        return SApe;
    }

    public void setSApe(String SApe) {
        this.SApe = SApe;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }



    public String getFDnaci() {
        return FDnaci;
    }

    public void setFDnaci(String FDnaci) {
        this.FDnaci = FDnaci;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPerPro() {
        return PerPro;
    }

    public void setPerPro(String PerPro) {
        this.PerPro = PerPro;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public String getTecnologias() {
        return Tecnologias;
    }

    public void setTecnologias(String Tecnologias) {
        this.Tecnologias = Tecnologias;
    }

}
