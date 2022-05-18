package comunicacion;
public class Libro extends Escrito {
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String co_autor, String editorial, String edicion, String interpretacion, String origen, String titulo, String autor, int paginas) {
        super(origen, titulo, autor, paginas);
        this.co_autor = co_autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }

    public String getCo_autor() {
        return co_autor;
    }

    public void setCo_autor(String co_autor) {
        this.co_autor = co_autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

//    public String getInterpretacion() {
//        return interpretacion;
//    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public int palabrasTotales(int npaginas){
        return this.getPaginas()*2*npaginas;
    }
    public String interpretacion(){
        return this.interpretacion;
    }

    @Override
    public String toString() {
        return this.getOrigen()+"\n"+this.getTitulo()+this.getPaginas()+"\n"+this.co_autor+"\n"+this.edicion+"\n"+this.editorial;
    }
    
}