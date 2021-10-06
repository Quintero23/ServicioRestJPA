package com.mx.restaurante.RestauranteControlador;

import com.mx.restaurante.RestauranteBean.Restaurante;
import com.mx.restaurante.RestauranteService.RestauranteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
//pedro alberto sandoval cayetano
//06/10/2021

@RestController
@RequestMapping(value = "/Restaurante")
public class RestauranteControlador {

    @Autowired
    RestauranteServiceInterface rsi;

    @PostMapping(value = "/registrar")
    public ResponseEntity<Restaurante> crearProducto(@RequestBody Restaurante restaurante){
        Restaurante restauranteCreado = rsi.crearRestaurante(restaurante);
        return ResponseEntity.status(HttpStatus.CREATED).body(restauranteCreado);
    }

    @DeleteMapping(value = "/eliminar/{id}")
    public ResponseEntity<String> eliminarProducto(@PathVariable("id") Integer id){
        rsi.eliminarRestaurante(id);
        return ResponseEntity.ok("El cliente con id :"+id + " fue eliminado");
    }

    @RequestMapping(value = "/{actualizar/{id}")
    public ResponseEntity<Restaurante> actualizarRestaurante(@PathVariable("id")Integer id,@RequestBody Restaurante restaurante){
        restaurante.setId_Restaurante(id);
        Restaurante restauranteDB = rsi.updateRestaurat(restaurante);
        if (restauranteDB == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(restauranteDB);
    }



}
