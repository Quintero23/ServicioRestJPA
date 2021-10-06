package com.mx.restaurante.RestauranteService;

import com.mx.restaurante.RestauranteBean.Restaurante;

public interface RestauranteServiceInterface {

    public Restaurante crearRestaurante(Restaurante restaurante);

    public void eliminarRestaurante(Integer id);

    public Restaurante updateRestaurat(Restaurante restaurante);

    public Restaurante getRestaurant(Integer id);
}
