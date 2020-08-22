/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos;

import DatosDTO.PersonaDTO;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Casti
 */
public class Consulta {
        private Conexion conexion;
    
    public List<PersonaDTO> listaPersona(){
        List<PersonaDTO> persona= new ArrayList <PersonaDTO>();
        try {
            Statement s = conexion.conexion().createStatement();
            String consulta = "SELECT id_persona, nombre, apellido, telefono, correo, estado FROM  persona";
            ResultSet r = s.executeQuery(consulta);
            while(r.next()){
                PersonaDTO p = new PersonaDTO();
                p.setId_persona(r.getLong(0));
                p.setNombre(r.getString(1));
                p.setApellido(r.getString(2));
                p.setTelefono(r.getLong(3));
                p.setCorreo(r.getString(4));
                p.setEstado(r.getInt(5));
                persona.add(p);
            }
                
        } catch (Exception ex) {
            System.out.println("Error al realizar la consulta en base de datos" + ex);
        }
        
        return persona;
    }
}
