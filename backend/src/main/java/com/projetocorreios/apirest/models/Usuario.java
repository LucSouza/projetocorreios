package com.projetocorreios.apirest.models;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="usuarios")

public class Usuario implements Serializable  {

    @Id
    @Column(name = "cpf_usuario")
    private long cpf;
    private String senha;
    private String nome;
    private String email;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name="cpf_usuario", referencedColumnName = "cpf_usuario")
    private List<Tracking> trackings = new ArrayList<>();

    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Tracking> getTrackings() {
        return trackings;
    }

    public void setTrackings(List<Tracking> trackings) {
        this.trackings = trackings;
    }
}


