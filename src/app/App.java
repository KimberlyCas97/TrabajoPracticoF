package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class App{
    public static Scanner Teclado = new Scanner(System.in);

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static List<Personaje> recibirArreglo = new ArrayList<Personaje>();
    public static void recibir(){
        JuegoLOTR s = new JuegoLOTR();
        recibirArreglo = s.enviar();
       

    }

        public static void main(String[] args) throws Exception {
    
       
        
        Personaje player1= null;
        Personaje player2= null;

        JuegoLOTR miJuego = new JuegoLOTR();
        int n=0;
        while (n < 2){
            System.out.println(ANSI_BLUE+"Player  " + (n+1)+ "  elija a su luchador" +ANSI_RESET);
            miJuego.inicializarCatalogo();

            miJuego.elegirPersonaje();
            miJuego.luchador();
            recibirArreglo.add(miJuego.personajefinal);
            n++;
            

        }
       
        player1 = recibirArreglo.get(0);

        System.out.println(ANSI_GREEN+ "Luchador1:  " +player1.getNombre() +ANSI_RESET);
        System.out.println(ANSI_GREEN+ "Vestidura VERDE" +ANSI_RESET);

        
        
        player2 = recibirArreglo.get(1);
        System.out.println(ANSI_YELLOW+ "Luchador2:  " +player2.getNombre() +ANSI_RESET);
        System.out.println(ANSI_YELLOW+ "Vestidura AMARILLA" +ANSI_RESET);
        double saludP1 = player1.getSalud();
        double saludP2 = player2.getSalud();
        double danioCausa = 0.0;
        double danioCausa2 = 0.0;
        int staminaP1 = player1.getStamina();
        int staminaP2 = player2.getStamina();
        int energiaMagica1 = 0;
        int energiaMagica2 = 0;
        
       

        if (player1 instanceof IHaceMagia){
           energiaMagica1 = ((IHaceMagia)player1).getEnergiaMagica();

        }
        
        
        if (player2 instanceof IHaceMagia){
           energiaMagica2 = ((IHaceMagia)player2).getEnergiaMagica();
        }

          

        System.out.println(ANSI_RED+"Que comience la Batalla"+ ANSI_RESET);
       
       
        
        
        


        while ((saludP1 >0) && (saludP2 > 0)){

            System.out.println(ANSI_GREEN +player1.getNombre() +" elija su arma: 0 , 1 Ó 2" + ANSI_RESET);
            int ar;
            ar = Teclado.nextInt();
            System.out.println(ANSI_GREEN+"El arma elegida es: " + player1.getArmas().get(ar).getNombre()+ ANSI_RESET);

            if (player1 instanceof IHaceMagia){
             
				if(((IHaceMagia)player1).puedoEjecutarAtaqueEpico(energiaMagica1, staminaP1)){
                    System.out.println(ANSI_PURPLE+ "Ejecutare ataque epico" +ANSI_RESET);
                    ((IHaceMagia)player1).ataqueEpico(player1, player1.getArmas().get(ar), saludP2, staminaP1);
                }
                else {
                    danioCausa = miJuego.resolverSalud(recibirArreglo.get(0), recibirArreglo.get(1), ar, saludP2);
                    if(player2 instanceof ILlevaReliquia){
                        saludP2 = (saludP2 + (saludP2 * ((ILlevaReliquia)player2).getReliquia().getFactorDeDefensa())) - danioCausa; 
                     }
                     else {
                        saludP2 = saludP2 - danioCausa;

                     }
                
            
                    System.out.println(ANSI_YELLOW + " salud total de " + player2.getNombre() + ":" + saludP2 +ANSI_RESET);
                    if (player1.getArmas().get(ar) instanceof IEsMagico){
                        energiaMagica1 = miJuego.resolverEMagica(recibirArreglo.get(0), recibirArreglo.get(1), ar);
                        System.out.println(ANSI_GREEN+ "Energia magica de " +player1.getNombre()+ " : " + energiaMagica1 +ANSI_RESET);

                    }
                    else { System.out.println(ANSI_GREEN +"Energía sin arma mágica:  " + player1.getNombre() + ":" + energiaMagica1 +ANSI_RESET);
                }
                    
                  
                    staminaP2 = miJuego.resolverStamina(recibirArreglo.get(0), recibirArreglo.get(1), ar); 
                    System.out.println(ANSI_YELLOW +"stamina de " + player2.getNombre() + "  : " + staminaP2 +ANSI_RESET); 
                }
                
            }
            else {
                   if (player1 instanceof ILlevaReliquia){
                       danioCausa = miJuego.resolverSalud(recibirArreglo.get(0), recibirArreglo.get(1), ar, saludP2);
                       if(player2 instanceof ILlevaReliquia){
                        saludP2 = (saludP2 + (saludP2 * ((ILlevaReliquia)player2).getReliquia().getFactorDeDefensa())) - danioCausa; 
                        }
                        else {
                        saludP2 = saludP2 - danioCausa;
                        System.out.println(ANSI_YELLOW + "La salud del  " +player2.getNombre() + " es: " + player2.getNombre() + ":" + saludP2 + ANSI_RESET);
                        if(player1.getArmas().get(ar) instanceof IEsMagico){
                            if(player2 instanceof IHaceMagia){
                                energiaMagica2 = energiaMagica2 - ((IEsMagico)player1.getArmas().get(ar)).getEnergiaMagica();
                                System.out.println(ANSI_YELLOW +"Energia magica del  " + player2.getNombre() + " : " +player2.getNombre() + energiaMagica2 + ANSI_RESET);
                            }
                            else {
                                System.out.println(ANSI_YELLOW +player2.getNombre() +  "no hace magia  " +ANSI_RESET);
                            }
                        }
                        else {
                            System.out.println(ANSI_GREEN+ "El arma del  " +player1.getNombre()+ "no es mágica  " +ANSI_RESET);
                        }
                        staminaP2 = miJuego.resolverStamina(recibirArreglo.get(0), recibirArreglo.get(1), ar);
                        System.out.println(ANSI_YELLOW +"stamina de  " +player2.getNombre() +"  : " + staminaP2 +ANSI_RESET);


                     }
                   }
                   else{
                       saludP2 = saludP2 - (player1.getArmas().get(ar).getDanio());
                       if(player1.getArmas().get(ar) instanceof IEsMagico){
                          if(player2 instanceof IHaceMagia){
                            energiaMagica2 = energiaMagica2 - ((IEsMagico)player1.getArmas().get(ar)).getEnergiaMagica();
                            System.out.println(ANSI_YELLOW+ "Energia magica de " +player2.getNombre()+ " : " +player2.getNombre() + ":" + energiaMagica2 +ANSI_RESET);
                           }
                           else {
                            System.out.println(ANSI_YELLOW +player2.getNombre() + "no hace magia " +ANSI_RESET);
                         }
                        }
                        else{
                            System.out.println(ANSI_GREEN+ "El arma de  " +player1.getNombre() + "no es mágica " +ANSI_RESET);
                        }
                        staminaP2 = miJuego.resolverStamina(recibirArreglo.get(0), recibirArreglo.get(1), ar);
                        System.out.println(ANSI_YELLOW+ "stamina de " +player2.getNombre() + " : " + staminaP2 +ANSI_RESET);
                       
                   }

    
            }
        
            System.out.println( ANSI_YELLOW +player2.getNombre() +" elija su arma: 0 , 1 Ó 2" +ANSI_RESET);
            int arr;
            arr = Teclado.nextInt();
            System.out.println(ANSI_YELLOW+ "El arma elegida es: " + player2.getArmas().get(arr).getNombre()+ANSI_RESET);

            if (player2 instanceof IHaceMagia){
             
				if(((IHaceMagia)player2).puedoEjecutarAtaqueEpico2(energiaMagica2, staminaP2)){
                    System.out.println(ANSI_PURPLE+ "Ejecutare ataque epico"+ANSI_RESET);
                    ((IHaceMagia)player2).ataqueEpico2(player2, player2.getArmas().get(arr), saludP1, staminaP2);
                }
                else {
                    danioCausa2 = miJuego.resolverSalud2(recibirArreglo.get(0), recibirArreglo.get(1), arr, saludP1);
                    if(player1 instanceof ILlevaReliquia){
                        saludP1 = (saludP1 + (saludP1 * ((ILlevaReliquia)player1).getReliquia().getFactorDeDefensa())) - danioCausa2; 
                     }
                     else {
                        saludP1 = saludP1 - danioCausa2;

                     }
                
            
                    System.out.println(ANSI_GREEN+" salud total de " +player1.getNombre() + " : " + saludP1 +ANSI_RESET);
                    if (player2.getArmas().get(arr) instanceof IEsMagico){
                        energiaMagica2 = miJuego.resolverEMagica2(recibirArreglo.get(0), recibirArreglo.get(1), arr);
                        System.out.println(ANSI_YELLOW+ "Energia magica de " +player2.getNombre()+ energiaMagica2 +ANSI_RESET);

                    }
                    else { System.out.println(ANSI_YELLOW + "Energía sin arma mágica  " + player2.getNombre()+ " : " + energiaMagica2 +ANSI_RESET);
                }
                    
                  
                    staminaP1 = miJuego.resolverStamina2(recibirArreglo.get(0), recibirArreglo.get(1), arr); 
                    System.out.println(ANSI_GREEN +"stamina de  " +player1.getNombre() + ": " + staminaP1 +ANSI_RESET); 
                }
                
            }
            else {
                   if (player2 instanceof ILlevaReliquia){
                       danioCausa2 = miJuego.resolverSalud2(recibirArreglo.get(0), recibirArreglo.get(1), arr, saludP1);
                       if(player1 instanceof ILlevaReliquia){
                        saludP1 = (saludP1 + (saludP1 * ((ILlevaReliquia)player1).getReliquia().getFactorDeDefensa())) - danioCausa2; 
                        }
                        else {
                        saludP1 = saludP1 - danioCausa2;
                        System.out.println(ANSI_GREEN+ "La salud de " +player1.getNombre()+ " es: " + player1.getNombre() + saludP1 +ANSI_RESET);
                        if(player2.getArmas().get(arr) instanceof IEsMagico){
                            if(player1 instanceof IHaceMagia){
                                energiaMagica1 = energiaMagica1 - ((IEsMagico)player2.getArmas().get(arr)).getEnergiaMagica();
                                System.out.println(ANSI_GREEN+ "Energia magica de "  +player1.getNombre() + " es: " + energiaMagica1 +ANSI_RESET);
                            }
                            else {
                                System.out.println(ANSI_GREEN +player1.getNombre()+ " no hace magia " +ANSI_RESET);
                            }
                        }
                        else {
                            System.out.println(ANSI_YELLOW +"El arma de  "+ player2.getNombre()+ " no es mágica " +ANSI_RESET);
                        }
                        staminaP1 = miJuego.resolverStamina2(recibirArreglo.get(0), recibirArreglo.get(1), arr);
                        System.out.println(ANSI_GREEN+ " stamina de " +player1.getNombre() + " es: " + staminaP1+ANSI_RESET);


                     }
                   }
                   else{
                       saludP1 = saludP1 - (player2.getArmas().get(arr).getDanio());
                       if(player2.getArmas().get(arr) instanceof IEsMagico){
                          if(player1 instanceof IHaceMagia){
                            energiaMagica1 = energiaMagica1 - ((IEsMagico)player2.getArmas().get(arr)).getEnergiaMagica();
                            System.out.println(ANSI_GREEN+ "Energia magica de  " +player1.getNombre() + " : "+ energiaMagica1 +ANSI_RESET);
                           }
                           else {
                            System.out.println(ANSI_GREEN +player1.getNombre() + " no hace magia " +ANSI_RESET);
                         }
                        }
                        else{
                            System.out.println(ANSI_YELLOW+ " El arma de "  + player2.getNombre() +" no es mágica " +ANSI_RESET);
                        }
                        staminaP1 = miJuego.resolverStamina2(recibirArreglo.get(0), recibirArreglo.get(1), arr);
                        System.out.println(ANSI_GREEN+ "stamina de " +player1.getNombre() + " es "+ staminaP1 +ANSI_RESET);
                       
                   }

    
            }



    
        }
        if(saludP1 > saludP2){
            System.out.println(ANSI_GREEN+ "El ganador es: " + player1.getNombre() +ANSI_RESET);
        }
        else{

           if (saludP2 > saludP1){
            System.out.println(ANSI_YELLOW +"El ganador es: " + player2.getNombre()+ANSI_RESET);

           } 
           else{
            System.out.println(ANSI_RED+ "Es un empate" +ANSI_RESET);
           }

        }
    }

 }        