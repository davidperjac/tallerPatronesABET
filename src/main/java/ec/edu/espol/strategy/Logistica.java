package ec.edu.espol.strategy;


public class Logistica {
    //atributos
    private Distribucion logistica;
    
    //metodos
    public void distribuir() {
        //logica de distribucion 
    }
    
    public void setStrategy (Distribucion distribucion) {
        this.logistica = distribucion;
    }
    
}
