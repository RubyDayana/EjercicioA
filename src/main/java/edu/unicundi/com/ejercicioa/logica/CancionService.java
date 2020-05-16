/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.com.ejercicioa.logica;

import edu.unicundi.com.ejercicioa.model.Cancion;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Usuario
 */
@Named(value = "cancionService")
@RequestScoped
public class CancionService {

    private List<Cancion> listaCancion;
    
    public CancionService() {
        listaCancion = new ArrayList<>();
    }
    @PostConstruct
    public void init() {
        listaCancion.add(new Cancion(1, "C1", "3:20","Disco", "Artista1","formato","precio"));
        listaCancion.add(new Cancion(1, "C1", "3:20","Disco", "Artista1","formato","precio"));
        listaCancion.add(new Cancion(1, "C1", "3:20","Disco", "Artista1","formato","precio"));
    }

    public List<Cancion> getListaCancion() {
        return listaCancion;
    }

    public void setListaCancion(List<Cancion> listaCancion) {
        this.listaCancion = listaCancion;
    }
    public void eliminarCancion(Cancion cancion){
        listaCancion.remove(cancion);
    }
    
}
