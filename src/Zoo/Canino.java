package Zoo;

public class Canino extends Mamifero implements Viviparo{

    public Canino(Integer idAnimal, String nombre, Integer edad, Integer cantidadCrias) {
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
