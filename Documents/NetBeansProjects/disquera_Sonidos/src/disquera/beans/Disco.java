package disquera.beans;

public class Disco {
    private int id;
    private String nombre;
    private String artista;
    private int anio;
    private double duracion;
    private int ranking;
    private String genero;
    
    public Disco(){
    }
    
    public Disco(int id, String nombre, String artista, int anio, double duracion, int ranking, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.artista = artista;
        this.anio = anio;
        this.duracion = duracion;
        this.ranking = ranking;
        this.genero = genero;
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
    
    public String getArtista(){
        return artista;
    }
    
    public void setArtista(String artista){
        this.artista = artista;
    }
    
    public int getAnio(){
        return anio;
    }
    
    public void setAnio(int anio){
        this.anio = anio;
    }
    
    public double getDuracion(){
        return duracion;
    }
    
    public void setDuracion(double duracion){
        this.duracion = duracion;
    }
    
    public int getRanking(){
        return ranking;
    }
    
    public void setRanking(int ranking){
        this.ranking = ranking;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setGenero(String genero){ 
        this.genero = genero;
    }
}

