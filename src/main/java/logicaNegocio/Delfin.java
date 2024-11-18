package logicaNegocio;

public class Delfin extends Animal{
    
    private TipoHabitat habitat;

    private TipoHabitat habitat;

    public Delfin() {
        this.habitat = TipoHabitat.ACUATICO;
    }

    
    public String emitirSonido() {
        return "Chirrido";
    }

<<<<<<< Updated upstream
=======
    
    public String obtenerDieta() {
        return "Pescado";  
        
    }

>>>>>>> Stashed changes
    public TipoHabitat getHabitat() {
        return habitat;
    }

    @Override
    public String obtenerDieta() {
        return "Pescado";
    }

}
