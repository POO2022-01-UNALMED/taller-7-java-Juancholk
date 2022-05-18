package comunicacion;

public class Alfabeto extends Pictograma{
    private static String [] letras;
    private String interpretacion;

    public Alfabeto(String origen,String interpretacion) {
        super(origen);
        this.interpretacion = interpretacion;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        Alfabeto.letras = letras;
    }

 //   public String getInterpretacion() {
 //       return interpretacion;
  //  }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    public int cantidadLetras(){
        return letras.length;
    }
    @Override
    public String interpretacion(){
        return this.interpretacion;
    }   

    @Override
    public String toString() {
        String cadena="";
        for(int i=0; i<letras.length;i++){
         if(i==letras.length-1){
         cadena=cadena+letras[i];
         }
        cadena=cadena+letras[i]+", ";
                }
        return cadena;
    }


    
}