package comunicacion;
public class Fabula extends Escrito {
    private String enseñanza;
    private String interpretacion;

    public Fabula(String enseñanza, String interpretacion, String origen, String titulo, String autor, int paginas) {
        super(origen, titulo, autor, paginas);
        this.enseñanza = enseñanza;
        this.interpretacion = interpretacion;
    }

    public String getEnseñanza() {
        return enseñanza;
    }

    public void setEnseñanza(String enseñanza) {
        this.enseñanza = enseñanza;
    }

//    public String getInterpretacion() {
//        return interpretacion;
//    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public int palabrasTotales(int npaginas){
        return this.getPaginas()*1*npaginas;
    }
    public String interpretacion(){
        return this.interpretacion;
    }

    @Override
    public String toString() {
        return this.getOrigen()+"\n"+this.getTitulo()+this.getPaginas()+"\n"+this.enseñanza;
    }
    
}