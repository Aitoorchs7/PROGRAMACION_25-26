package herencias.a04;

public abstract class Instrumento {
    private Notas[] notas = new Notas[LONGITUD];
    private static final int LONGITUD = 7;
    private int numNotas = 0;

    public void add(Notas nota){
        if(numNotas < LONGITUD){
            notas[numNotas] = nota;
            numNotas++;
        } else {
            System.out.println("No se pueden agregar más notas, el instrumento está lleno.");
        }
    }


    public abstract void interpretar();

    //getters
    public Notas[] getNotas() {
        return notas;
    }
    public int getNumNotas() {
        return numNotas;
    }  
    
    // setters
    public void setNotas(Notas[] notas) {
        if(notas.length <= LONGITUD && notas.length >= 0){
            this.notas = notas;
            this.numNotas = notas.length;
            for(int i = 0; i < notas.length; i++){
                if(notas[i] == null){
                    this.numNotas++;
                }
            }
        } else {
            System.out.println("No se pueden establecer más notas");
        }
    }
    
        public void setNumNotas(int numNotas) {
            if(numNotas >= 0 && numNotas <= LONGITUD){
                this.numNotas = numNotas;
            } else {
                System.out.println("El número de notas debe estar entre 0 y " + LONGITUD + ".");
            }
        
    }




}
