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

    private Integer cpf_usuario;

    public Integer getCpf_usuario() {
        return cpf_usuario;
    }

    public void setCpf_usuario(Integer cpf_usuario) {
        this.cpf_usuario = cpf_usuario;
    }

    public Tracking() {
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
