package Zoo;

public class Mamifero extends Animal {

    private Integer cantidadCrias;


    public Mamifero(Integer idAnimal, String nombre, Integer edad, Integer cantidadCrias) {
        super(idAnimal, nombre, edad);
        this.cantidadCrias = cantidadCrias;
    }

    public boolean amamantarMamifero(){
        System.out.println(getNombre() + "amamanta.");
        return true;
    }

    //------------------------------------------------------------------------------------------------------------------
    //GET
    protected Integer getCantidadCrias(){
        return this.cantidadCrias;
    }
    //SET
    protected void setCantidadCrias(Integer newCantidadCrias){
        cantidadCrias = newCantidadCrias;
    }
}
