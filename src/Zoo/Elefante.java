package Zoo;

public class Elefante extends Mamifero implements Viviparo{

    public Elefante(Integer idAnimal, String nombre, Integer edad, Integer cantidadCrias) {
        super(idAnimal, nombre, edad, cantidadCrias);
    }
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public Integer parir() {
        return 0;
    }

    @Override
    public Integer gestar() {
        return 0;
    }
}
