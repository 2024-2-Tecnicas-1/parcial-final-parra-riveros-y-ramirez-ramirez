package logicaNegocio;

public class Delfin extends Animal{

    private TipoHabitat habitat;

    public Delfin() {
        this.habitat = TipoHabitat.ACUATICO;
    }

    @Override
    public String emitirSonido() {
        return "Chirrido";
    }

    public TipoHabitat getHabitat() {
        return habitat;
    }

    @Override
    public String obtenerDieta() {
        return "Pescado";
    }

}
