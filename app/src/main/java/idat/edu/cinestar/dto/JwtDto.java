/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idat.edu.cinestar.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class JwtDto implements Serializable {


    private String token;

    private String bearer;

    private String nombreUsuario;

    public List<String> authorities;

//    public JwtDto(String token, String nombreUsuario, Collection<? extends GrantedAuthority> authorities) {
//        this.token = token;
//        this.nombreUsuario = nombreUsuario;
//        this.authorities = authorities;
//    }

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

//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
//        this.authorities = authorities;
//    }


    @Override
    public String toString() {
        return "JwtDto{" +
                "token='" + token + '\'' +
                ", bearer='" + bearer + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                '}';
    }
}
