/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.com.ejercicioa.beans;

import edu.unicundi.com.ejercicioa.logica.CancionService;
import edu.unicundi.com.ejercicioa.model.Cancion;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Usuario
 */
@Named(value = "formularioTabla")
@RequestScoped
public class formularioTabla {

    private List<Cancion> listaCancion;

    @Inject
    private CancionService service;
    private Cancion cancion;

    @PostConstruct
    public void init() {
        this.listaCancion = service.getListaCancion();
        
        this.service.eliminarCancion(cancion);
    }

    public formularioTabla() {
    }

    public List<Cancion> getListaCancion() {
        return listaCancion;
    }

    public void setListaCancion(List<Cancion> listaCancion) {
        this.listaCancion = listaCancion;
    }
}
