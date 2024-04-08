/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validacion;

/**
 *
 * @author User
 */
import controlador.cls_implementos;
import java.util.ArrayList;
public class cls_validacion_implementos {
    private ArrayList<cls_implementos> implementos = new ArrayList<>();
    private boolean val = false;
    private String msn;
    
    
public void validarDatosEntrada(
        String cod, String n, String tipo, String especi, float precioUni
) {
    boolean existeImplemento = false;
    for (cls_implementos implemento : implementos) {
        if (implemento.getCodigoStr().equals(cod)) {
            existeImplemento = true;
            break;
        }
    }

    if (existeImplemento) {
        this.msn = "El implemento con código " + cod + " ya está registrado";
    } else if (cod.equals("") || n.equals("") || tipo.equals("") || especi.equals("") || precioUni <= 0) {
        this.msn = "Debe ingresar todos los datos";
    } else {
        
        this.val = true;
        this.msn = "Los datos del solicitante " + n + " han sido registrados con éxito";
        implementos.add(new cls_implementos(cod, n, especi, precioUni, tipo));
    }
}
    
    public String getMsn(){return this.msn;}
    public boolean getVal(){return this.val;}
}
    