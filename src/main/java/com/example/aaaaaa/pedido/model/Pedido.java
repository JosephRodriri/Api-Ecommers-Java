package com.example.aaaaaa.pedido.model;


import com.example.aaaaaa.Usuario.Usuario;
import com.example.aaaaaa.pedido.Factory.EstadoFactory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.sql.RowSet;

@Entity
@Getter
@Setter
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descripcion;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Transient
    private EstadoPedido comportamiento;

    public void setEstado(String estado) {
        this.estado = estado;
        this.comportamiento = EstadoFactory.obtenerEstado(estado);
    }

    public void avanzarEstado() {
        this.estado = comportamiento.avanzarEstado();
        this.comportamiento = EstadoFactory.obtenerEstado(this.estado);
    }


}
