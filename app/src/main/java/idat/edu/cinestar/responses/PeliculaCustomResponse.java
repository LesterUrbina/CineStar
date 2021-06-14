package idat.edu.cinestar.responses;

import java.util.List;

public class PeliculaCustomResponse {
    private PeliculaResponse tbPelicula;
    private List<GeneroResponse> generoList;

    public PeliculaResponse getTbPelicula() {
        return tbPelicula;
    }

    public void setTbPelicula(PeliculaResponse tbPelicula) {
        this.tbPelicula = tbPelicula;
    }

    public List<GeneroResponse> getGeneroList() {
        return generoList;
    }

    public void setGeneroList(List<GeneroResponse> generoList) {
        this.generoList = generoList;
    }
}
