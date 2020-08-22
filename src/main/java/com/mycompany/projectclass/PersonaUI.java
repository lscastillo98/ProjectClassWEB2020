/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectclass;

import DatosDTO.PersonaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Casti
 */
@ManagedBean(name="bkn_personaUI")
public class PersonaUI {
    private String nombre="Luis";
    private String apellido="Castillo";
    private int parametro=100;
    private List<PersonaDTO>lista;
    
    /**
     * @return the lista
     */
    public List<PersonaDTO> getLista() {
        if(lista==null){ //evalua, para evitar N cantidad de instancias
            lista=new ArrayList<PersonaDTO>();
        }
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<PersonaDTO> lista) {
        this.lista = lista;
    }
    
    /**
     * @return the parametro
     */
    public int getParametro() {
        return parametro;
    }

    /**
     * @param parametro the parametro to set
     */
    public void setParametro(int parametro) {
        this.parametro = parametro;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
   
    
}
