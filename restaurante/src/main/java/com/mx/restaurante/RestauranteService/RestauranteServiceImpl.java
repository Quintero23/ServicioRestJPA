package com.mx.restaurante.RestauranteService;

import com.mx.restaurante.RestauranteBean.Restaurante;
import com.mx.restaurante.RestauranteDao.RestauranteDaoInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;

@Service
@RequiredArgsConstructor
public class RestauranteServiceImpl implements RestauranteServiceInterface{

    private final RestauranteDaoInterface rdi;

    @Override
    public Restaurante crearRestaurante(Restaurante restaurante) {
        return rdi.save(restaurante);
    }

    @Override
    public void eliminarRestaurante(Integer id) {
        rdi.deleteById(id);
    }

    @Override
    public Restaurante updateRestaurat(Restaurante restaurante) {
        System.out.println("entro a update");
        Restaurante restaurantDB = getRestaurant(restaurante.getId_Restaurante());
        if (null == restaurantDB){
            return null;
        }
        restaurantDB.setId_Restaurante(restaurante.getId_Restaurante());
        restaurantDB.setUbicacion(restaurante.getUbicacion());
        restaurantDB.setCapacidad(restaurante.getCapacidad());
        return rdi.save(restaurantDB);
    }

    @Override
    public Restaurante getRestaurant(Integer id) {
        return rdi.findById(id).orElse( null);
    }


}
