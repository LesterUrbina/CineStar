package idat.edu.cinestar.dto;

import java.io.Serializable;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class TbPelicula implements Serializable {

    private Integer idPelicula;

    private String codigo;

    private String nombre;

    private String sinopsis;

    private Duration duracion;

    private String tipoPelicula;

    private Boolean estado;

    private byte[] imagen;

    private List<String> peliculaGeneros;

    private List<String> funciones;

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

    public Duration getDuracion() {
        return duracion;
    }

    public void setDuracion(Duration duracion) {
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

    public List<String> getPeliculaGeneros() {
        return peliculaGeneros;
    }

    public void setPeliculaGeneros(List<String> peliculaGeneros) {
        this.peliculaGeneros = peliculaGeneros;
    }

    public List<String> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<String> funciones) {
        this.funciones = funciones;
    }
}
