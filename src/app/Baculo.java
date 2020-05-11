package app;

public class Baculo extends Arma implements IEsMagico{
    public Baculo(String nombre, int danio, int stamina){
     
        super(nombre, danio, stamina);
        int energiaMagica = 0;
        this.energiaMagica = energiaMagica;

    }

    private int energiaMagica;
    public int getEnergiaMagica(){
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica){
        this.energiaMagica = energiaMagica;
    }
}
