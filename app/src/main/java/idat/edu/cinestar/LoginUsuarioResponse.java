package idat.edu.cinestar;

import com.google.gson.annotations.SerializedName;

public class LoginUsuarioResponse {

    @SerializedName("mensaje")
    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
