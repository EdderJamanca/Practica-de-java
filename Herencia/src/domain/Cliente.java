
package domain;

import java.util.Date;

public class Cliente extends Persona {
    
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    
    public Cliente(Date fechaRagistro,boolean vip,String nmbre,char genero, int edad, String direccion){
        super(nmbre,genero,edad,direccion);
        this.idCliente=++Cliente.contadorCliente;
        this.vip=vip;
        this.fechaRegistro=fechaRagistro;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(this.idCliente);
        sb.append(", fechaRegistro=").append(this.fechaRegistro);
        sb.append(", nombre=").append(this.nmbre);
        sb.append(", vip=").append(this.vip);
        sb.append('}');
        return sb.toString();
    }
    
}
