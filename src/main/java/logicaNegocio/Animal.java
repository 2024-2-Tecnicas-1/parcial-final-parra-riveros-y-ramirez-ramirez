package logicaNegocio;

public abstract class Animal {
    public abstract String emitirSonido();
    
    public abstract String ObtenerDieta();

    public Animal() {
    }
    
   public TipoHabitat getHabitat(){
       return habitat;
   }
}
