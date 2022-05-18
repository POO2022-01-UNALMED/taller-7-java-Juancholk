package comunicacion;

public class Periodico extends Escrito {
    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String origen,String titulo, int paginas, String fecha, String primicia, String interpretacion, String origen, String titulo, String autor, int paginas) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

//    public String getInterpretacion() {
//        return interpretacion;
//    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public int palabrasTotales(int npaginas){
        return this.getPaginas()*10*npaginas;
    }
    public String interpretacion(){
        return this.interpretacion;
    }

    @Override
    public String toString() {
        return this.getOrigen()+"\n"+this.getTitulo()+this.getPaginas()+"\n"+this.fecha+"\n"+this.primicia;
    }
    
}