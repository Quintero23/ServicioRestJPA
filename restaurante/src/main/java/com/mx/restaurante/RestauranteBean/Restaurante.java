package com.mx.restaurante.RestauranteBean;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "restaurante")
@AllArgsConstructor @NoArgsConstructor
@Builder
@Data
public class Restaurante {
    @Id
    private Integer id_Restaurante;
    @Column
    private String ubicacion;
    @Column
    private Long capacidad;




}
