package taller3.televisores;

public class Marca {
	
    private String nombre;
    
    public Marca(String str){
        nombre= str;
    }
    public void setNombre(String str){
        nombre=str;
    }
    public String getNombre(){
        return nombre;
    }
}