package com.mx.restaurante.RestauranteDao;

import com.mx.restaurante.RestauranteBean.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestauranteDaoInterface extends JpaRepository<Restaurante,Integer> {

    public List<Restaurante> findByCapacidad(Restaurante restaurante);
    public List<Restaurante> findByUbicacion(Restaurante restaurante);


}
