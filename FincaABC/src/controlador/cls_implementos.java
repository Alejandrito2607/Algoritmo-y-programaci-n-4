/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author User
 */
public class cls_implementos {
    public String codigoStr;
    public String nombreStr;
    public String especiStr;  
    public float PreciUniflt;
    public String tipoStr;

    public cls_implementos(String codigoStr, String nombreStr, String especiStr, float PreciUniflt, String tipoStr) {
        this.codigoStr = codigoStr;
        this.nombreStr = nombreStr;
        this.especiStr = especiStr;
        
        this.PreciUniflt = PreciUniflt;
        this.tipoStr = tipoStr;
    }

    public String getCodigoStr() {
        return codigoStr;
    }

    public void setCodigoStr(String codigoStr) {
        this.codigoStr = codigoStr;
    }

    public String getNombreStr() {
        return nombreStr;
    }

    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }

    public String getEspeciStr() {
        return especiStr;
    }

    public void setEspeciStr(String especiStr) {
        this.especiStr = especiStr;
    }


    public float getPreciUniflt() {
        return PreciUniflt;
    }

    public void setPreciUniflt(float PreciUniflt) {
        this.PreciUniflt = PreciUniflt;
    }

    public String getTipoStr() {
        return tipoStr;
    }

    public void setTipoStr(String tipoStr) {
        this.tipoStr = tipoStr;
    }


    
    
}
