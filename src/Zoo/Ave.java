package Zoo;

public class Ave extends Animal implements Oviparo{

    private boolean volar;

    public Ave(Integer idAnimal, String nombre, Integer edad, boolean volar) {
        super(idAnimal, nombre, edad);
        this.volar = volar;
    }



    //------------------------------------------------------------------------------------------------------------------
    //get
    public boolean puedeVolar(){
        return volar;
    }


    //------------------------------------------------------------------------------------------------------------------
    public boolean romperCascaron(){
        System.out.println("rompe cascaron.");
        return true;
    }
    //------------------------------------------------------------------------------------------------------------------
    //Override´s
    @Override
    public void ponerHuevos(){
        System.out.println(getNombre() + " pone huevos.");
    }
}
