package app;

public class AnilloSauron extends AnilloPoder {
    public AnilloSauron(String nombre, double factorDeAtaque, double factorDeDefensa){
     
       super(nombre, factorDeAtaque, factorDeDefensa);
        int energiaMagica = 0;
        this.energiaMagica = energiaMagica;
       
      
    }

    private int energiaMagica;

    @Override
    public int getEnergiaMagica(){
        return energiaMagica;
    }

    @Override
    public void setEnergiaMagica (int energiaMagica){
        this.energiaMagica = energiaMagica;
    }
    
}