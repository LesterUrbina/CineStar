package idat.edu.cinestar.entity;

public class Promocion {

    private int idPromocion;
    private String texto;
    private int imgPromoId;

    public Promocion(){}

    public Promocion(int idPromocion, String texto) {
        this.idPromocion = idPromocion;
        this.texto = texto;
        this.imgPromoId=0;
    }

    public Promocion(int idPromocion, String texto, int imgPromoId) {
        this.idPromocion = idPromocion;
        this.texto = texto;
        this.imgPromoId = imgPromoId;
    }

    public int getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(int idPromocion) {
        this.idPromocion = idPromocion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getImgPromoId() {
        return imgPromoId;
    }

    public void setImgPromoId(int imgPromoId) {
        this.imgPromoId = imgPromoId;
    }
}
