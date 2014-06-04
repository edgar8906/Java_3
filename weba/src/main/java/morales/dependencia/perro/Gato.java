package morales.dependencia.perro;


public class Gato implements Mascota {
    private String nombre;

    @Override
    public String obtenerRegistro(){
        return "El gato que registraste es: "+nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
