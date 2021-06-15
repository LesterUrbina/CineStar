package idat.edu.cinestar.responses;

public class PeliculaResponse {

    private Integer idPelicula;

    private String codigo;

    private String nombre;

    private String sinopsis;

    private String duracion;

    private String tipoPelicula;

    private Boolean estado;

<<<<<<< HEAD
    private String imagen;
=======
    private byte[] imagen;
>>>>>>> 43eaa268ecd634ab6d67cedfb61a929598c95041

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getTipoPelicula() {
        return tipoPelicula;
    }

    public void setTipoPelicula(String tipoPelicula) {
        this.tipoPelicula = tipoPelicula;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

<<<<<<< HEAD
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
=======
    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
>>>>>>> 43eaa268ecd634ab6d67cedfb61a929598c95041
        this.imagen = imagen;
    }
}
