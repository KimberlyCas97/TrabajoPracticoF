package app;

public class AnilloPoder extends Reliquia implements IEsMagico {

    //Constructor
    public AnilloPoder(String nombre, double factorDeAtaque, double factorDeDefensa){
      
        super(nombre, factorDeAtaque, factorDeDefensa);
        int energiaMagica = 0;
        this.energiaMagica = energiaMagica;
    }

    //Atributos
    private int energiaMagica;
    @Override

    public int getEnergiaMagica(){
        return energiaMagica;
    }
    @Override
    public void setEnergiaMagica(int energiaMagica){
        this.energiaMagica = energiaMagica;
    }



    
}