package disquera.beans;

/**
 *
 * @author Jairo
 */
public class cancion {
    private int id;
    private String nombre;
    private double duracion;
    
    public cancion(){
    }
    
    public cancion(int id, String nombre, double duracion){
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getDuracion(){
        return duracion;
    }
    
    public void setDuracion(double duracion){
        this.duracion = duracion;
    }
}
