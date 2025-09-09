public class Libro {

    //
    private String titulo;
    private String autor;
    private int stock;
    private Double precioCompra;
    private Double precioVenta;
    private char sector;
    private int codigo;

    //constructor
    public Libro(String tituloLibro,String nombreAutor,int stockDisp,double precioCompra,double precioVenta,char sector,int codigo){
        this.titulo = tituloLibro;
        this.autor = nombreAutor;
        this.stock = stockDisp;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.sector = sector;
        this.codigo = codigo;
    }

    //CONSULTAS
    /*----------------------------------------------------------------
    Consultar titulo */
    public String getTitulo(){
        return this.titulo;
    }
    /*----------------------------------------------------------------
    Consultar autor */
    public String getAutor(){
        return this.autor;
    }
    /*----------------------------------------------------------------
    Consultar sector */
    public char getSector(){
        return this.sector;
    }
    /*----------------------------------------------------------------
    Consultar stok */
    public Boolean hayStockDisponible(){
        return stock > 0;
    }
    /*----------------------------------------------------------------
    Consultar precio de compra */
    public Double consultarPrecioCompra(){
        return this.precioCompra;
    }
    /*----------------------------------------------------------------
    Consultar precio de venta */
    public Double consultarPrecioVenta(){
        return this.precioVenta;
    }
    /*----------------------------------------------------------------
    Consultar ganancia */
    public Double calcularGanancia(){
        return precioVenta-precioCompra;
    }
    /*----------------------------------------------------------------
    Consultar si tiene descuento */
    public Boolean tieneDescuento(){
        return this.sector == "C";
    }
    /*----------------------------------------------------------------
    Consultar precio final  con/sin descuento */
    public Double calcularPrecioFinal(){
        if(tieneDescuento()){
            double descuentoDinero = this.precioVenta*0.10;
            System.out.println("en $ el descuento es de "+descuentoDinero);
            return this.precioVenta-descuentoDinero;
        }else{
            return this.precioVenta;
        }
    }



    //modificar




}
