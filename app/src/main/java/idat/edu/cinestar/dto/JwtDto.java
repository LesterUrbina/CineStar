/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idat.edu.cinestar.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

public class JwtDto implements Serializable {


    private String token;

    private String bearer;

    private String nombreUsuario;

    private List<LinkedHashMap<String, String>> authorities;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public List<LinkedHashMap<String, String>> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<LinkedHashMap<String, String>> authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "JwtDto{" +
                "token='" + token + '\'' +
                ", bearer='" + bearer + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                '}';
    }
}
