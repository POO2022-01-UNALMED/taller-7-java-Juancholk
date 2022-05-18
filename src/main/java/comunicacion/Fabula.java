package comunicacion;
public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;

    public Fabula(String ensenanza, String interpretacion, String origen, String titulo, String autor, int paginas) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
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
        return this.getOrigen()+"\n"+this.getTitulo()+this.getPaginas()+"\n"+this.ensenanza;
    }
    
}