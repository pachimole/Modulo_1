public class Libro {

    private String titulo;
    private String autor;
    private int stock;
    private double precioCompra;
    private double precioVenta;
    private char sector;

    //constructor

    public Libro(String tituloLibro,String nombreAutor,int stockDisp,double precioCompra,double precioVenta,char sector){
        this.titulo = tituloLibro;
        this.autor = nombreAutor;
        this.stock = stockDisp;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.sector = sector;

    }

    //consultas

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public Boolean hayStockDisponible(){
        return stock >= 0;
    }

    //CalcularGanancias
    public double calcularGanancia(){
        return precioVenta-precioCompra;
    }



}
