package logicaNegocio;

public class Leon extends Animal {
     private TipoHabitat habitat;
    public Leon() {
        this.habitat = TipoHabitat.TERRESTRE;
; 
    }

    
    public String emitirSonido() {
        return "Rugido"; 
    }

    
    public String obtenerDieta() {
        return "Carnívoro";
    }

<<<<<<< Updated upstream
  
=======
    public TipoHabitat getHabitat() {
        return habitat;
    }

    @Override
    public String ObtenerDieta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
>>>>>>> Stashed changes
    
}

