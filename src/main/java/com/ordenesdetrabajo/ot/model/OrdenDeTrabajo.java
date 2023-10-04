package com.ordenesdetrabajo.ot.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
public class OrdenDeTrabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;


 private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "cuadrilla_id")
    private Cuadrilla cuadrilla;
    @ManyToOne
    @JoinColumn(name = "servicioxsocio_id")
     private ServicioXSocio servicioXSocio;

private String descripcion;
  private Estado estado;

   public OrdenDeTrabajo() {
   }
//
 public OrdenDeTrabajo(LocalDateTime date,Cuadrilla cuadrilla, ServicioXSocio servicioXSocio, String descripcion, Estado estado) {
      this.date = date;
       this.cuadrilla = cuadrilla;
this.servicioXSocio = servicioXSocio;
     this.descripcion = descripcion;
    this.estado = estado;
 }
//
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
//
//    public Cuadrilla getCuadrilla() {
//        return cuadrilla;
//    }
//
//    public void setCuadrilla(Cuadrilla cuadrilla) {
//        this.cuadrilla = cuadrilla;
//    }
//
//    public ServicioXSocio getServicioXSocio() {
//        return servicioXSocio;
//    }
//
//    public void setServicioXSocio(ServicioXSocio servicioXSocio) {
//        this.servicioXSocio = servicioXSocio;
//    }
//
//    public String getDescripcion() {
//        return descripcion;
//    }
//
//    public void setDescripcion(String descripcion) {
//        this.descripcion = descripcion;
//    }
//
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
