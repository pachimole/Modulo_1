import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //INGRESAR LOS DATOS POR CONSOLA
        System.out.println("Ingrese Titulo de Libro \nNombre de autor \nStoc disponible \nPrecio de Compora \nPrecio de venta \nSector \nCodigo de 8 digitos ");

        String tituloLibro = scanner.nextLine();
        String nombreAutor = scanner.nextLine();
        int stokDisponible = scanner.nextInt();
        Double precioDeCompra = scanner.nextDouble();
        Double precioDeVenta = scanner.nextDouble();
        String sectorString = scanner.nextLine();
        char sector = sectorString.charAt(0); //--> transforma el String en char
        int codigo = scanner.nextInt();

        Libro libro1 = new Libro(tituloLibro,nombreAutor,stokDisponible,precioDeCompra,precioDeVenta,sector,codigo);

        //----------------------------------------------------------------
        //CONSULTAR PRECIO DE COMPRA
        System.out.println(libro1.consultarPrecioCompra());
        //----------------------------------------------------------------
        //CONSULTAR STOCK ACTUAL
        libro1.cuantoStockHay();


        //----------------------------------------------------------------
        //AGREGAR DATOS A UNA LISTA

        Libro[] libros = new Libro[6];
        libros[0] = libro1;

        //VISUALIZAR LISTA
        for (int i = 0; i < libros.length; i++) {
            System.out.println(libros[i].getTitulo()+"\n"+libros[i].getAutor()+"\n"+libros[i].calcularPrecioFinal());
        }










    }
}