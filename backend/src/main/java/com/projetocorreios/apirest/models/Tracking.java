package com.projetocorreios.apirest.models;
import jdk.jfr.DataAmount;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="trackings")
public class Tracking implements Serializable {

    @Id
    private long trackingCode;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cpf_usuario")
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public long getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(long trackingCode) {
        this.trackingCode = trackingCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
