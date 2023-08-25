package taller3.televisores;

public class TV {
	
    private Marca marca;
    private int canal=1;
    private int precio=500;
    private boolean estado;
    private int volumen=1;
    private Control control;
    static int numTV;
    
    public TV(Marca m,boolean e){
        marca=m;
        estado=e;
        numTV++;
    }
    public static int getNumTV(){
        return numTV;
    }
    public static void setNumTV(int n){
        numTV=n;
    }
    public void setMarca(Marca m){
        marca=m;
    }
    public Marca getMarca(){
        return marca;
    }
    public void setCanal(int canal){
    	if(canal>=1 && canal<=120 && estado == true){
            this.canal=canal;}
    }
    public int getCanal(){
        return canal;
    }
    public void setPrecio(int p){
        precio=p;
    }
    public int getPrecio(){
        return precio;
    }
    public void setVolumen(int volumen){
    	if(volumen>=0 && volumen<=7 && estado == true){
            this.volumen=volumen;}
    }
    public int getVolumen(){
        return volumen;
    }
    public void setControl(Control co){
        control=co;
    }
    public Control getControl(){
        return control;
    }
    public void turnOn(){
        estado = true;
    }
    public void turnOff(){
        estado =false;
    }
    public boolean getEstado() {
        return estado;
    }
    public void canalUp(){
        if(canal>=1 && canal<120 && estado == true){
            canal++;
        }

    }
    public void canalDown(){
        if(canal>1 && canal<=120 && estado == true){
            canal--;
        }

    }
    public void volumenUp(){
        if(volumen>=0 && volumen<7 && estado == true){
        volumen++;
        }
    }
    public void volumenDown(){
        if(volumen>0 && volumen<=7 && estado == true){
            volumen--;
        }
    }

}