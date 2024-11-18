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

    @Override
    public String obtenerDieta() {
        return "Carnívoro";
    }

    public TipoHabitat getHabitat() {
        return habitat;
    }

    public String ObtenerDieta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

