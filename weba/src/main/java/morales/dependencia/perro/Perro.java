/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package morales.dependencia.perro;

public class Perro implements Mascota {
    
    
    private String nombre;


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@Override
    public String obtenerRegistro(){
        return "El perrito que registraste es: "+nombre;
    }
    
    
    }
