package idat.edu.cinestar.responses;

public class PeliculaResponse {

    private Integer idPelicula;

    private String codigo;

    private GeneroResponse tbGenero;

    private String nombre;

    private String sinapsis;

    private String duracion;

    private String tipoPelicula;

    private Boolean estado;

    private byte[] imagen;

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

    public GeneroResponse getTbGenero() {
        return tbGenero;
    }

    public void setTbGenero(GeneroResponse tbGenero) {
        this.tbGenero = tbGenero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSinapsis() {
        return sinapsis;
    }

    public void setSinapsis(String sinapsis) {
        this.sinapsis = sinapsis;
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

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
}
