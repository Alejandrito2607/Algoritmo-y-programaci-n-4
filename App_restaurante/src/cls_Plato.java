public class cls_Plato {
    
    private int var_codigoint;
    private String var_nombrestr;
    private float var_precioflt;
    private String var_tipostr;
    
    public cls_Plato(int codigo,String nombre,float precio,String tipo){//Metodo constructor
    
        this.var_codigoint = codigo;
        this.var_nombrestr = nombre;
        this.var_precioflt = precio;
        this.var_tipostr = tipo;
                
    
    }

    //Metodos getters and setters
    
    public int getCodigoInt() {
        return this.var_codigoint;
    }

    public void setVar_codigoint(int var_codigoint) {
        this.var_codigoint = var_codigoint;
    }

    public String getNombreStr() {
        return this.var_nombrestr;
    }

    public void setNombreStr(String var_nombrestr) {
        this.var_nombrestr = var_nombrestr;
    }

    public float getPrecioFlt() {
        return this.var_precioflt;
    }

    public void setPrecioFlt(float var_precioflt) {
        this.var_precioflt = var_precioflt;
    }
  
    public String getTipoStr() {
        return this.var_tipostr;
  }

    public void setTipoStr(String var_tipostr) {
        this.var_tipostr = var_tipostr;
    }
    
    
}
