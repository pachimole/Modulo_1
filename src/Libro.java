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
    public Libro(String tituloLibro,String nombreAutor,int stockDisp,Double precioCompra,Double precioVenta,char sector,int codigo){
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
    public boolean hayStockDisponible(){
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
        if(tieneDescuento()){
            return precioVenta*90-precioCompra;
        }
        return precioVenta-precioCompra;
    }
    /*----------------------------------------------------------------
    Consultar si tiene descuento */
    public boolean tieneDescuento(){ return this.sector == 'C';}
    /*----------------------------------------------------------------
    Consultar precio final  con/sin descuento */
    public Double calcularPrecioFinal(){
        if(tieneDescuento()){
            double descuentoDinero = this.precioVenta*0.10;
            System.out.println("El descuento es de " + descuentoDinero);
            return this.precioVenta-descuentoDinero;
        }else{ return this.precioVenta;}
    }
    /*----------------------------------------------------------------
    Consultar ultimos digitos del codigo */
    public String ultimosDigitosCodigo(){
        String codigoATexto = Integer.toString(this.codigo);
        String ultimosDigitos = codigoATexto.substring(4);

        return ("****"+ultimosDigitos);
    }

    //MODIFICAR
    /*----------------------------------------------------------------
    Modificar Titulo */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /*----------------------------------------------------------------
    Modificar Autor */
    public void setAutor(String autor) {
        this.autor = autor;
    }
}