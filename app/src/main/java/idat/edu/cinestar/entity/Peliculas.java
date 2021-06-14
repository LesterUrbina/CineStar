package idat.edu.cinestar.entity;

public class Peliculas {

    private int idPelicula;
    private String nombre;
    private String sinopsis;
    private int imagenId;

    public Peliculas() {
    }

    /*
    public Peliculas() {
        this.idPelicula=0;
        this.nombre="";
        this.sinopsis="";
        this.imagenId=0;
    }
*/
    public Peliculas(int idPelicula, String nombre) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.sinopsis = "";
        this.imagenId = 0;
    }

    public Peliculas(int idPelicula, String nombre, String sinopsis, int imagenId) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.sinopsis = sinopsis;
        this.imagenId = imagenId;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
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

    public int getImagenId() {
        return imagenId;
    }

    public void setImagenId(int imagenId) {
        this.imagenId = imagenId;
    }
}
