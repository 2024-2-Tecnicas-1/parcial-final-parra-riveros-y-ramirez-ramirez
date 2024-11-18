package logicaNegocio;

class Leon extends Animal {
  
    public Leon() {
        super(); 
    }

    @Override
    public String emitirSonido() {
        return "Rugido"; 
    }

    @Override
    public String ObtenerDieta() {
        return "carnivoro";
    }
}

