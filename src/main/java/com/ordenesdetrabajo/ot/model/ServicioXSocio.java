package com.ordenesdetrabajo.ot.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
@Entity
public class ServicioXSocio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name = "native",strategy = "native")
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="servicio_id")
    private Servicio servicio;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="socio_id")
    private Socio socio;

    private Categoria categoria;

    public ServicioXSocio() {
    }

    public ServicioXSocio(Servicio servicio, Socio socio, Categoria categoria) {
        this.servicio = servicio;
        this.socio = socio;
        this.categoria = categoria;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
