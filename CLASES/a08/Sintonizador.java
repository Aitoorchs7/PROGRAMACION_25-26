


public class Sintonizador {
    
    private double frecuencia = 80.0;
    private double min;
    private double max;
    
    public Sintonizador(double frecuencia, double min, double max){
        if(frecuencia > max || frecuencia < min){
            this.frecuencia = 80.0;
            System.out.println("La frecuencia no es valida, se ha establecido a 80.0 MHz");
        }else{
            this.frecuencia = frecuencia;
        }
        this.min = min;
        this.max = max;
    }
    public double getFrecuencia(double frecuencia){
        return this.frecuencia;
    }
    public void setFrecuencia(double frecuencia){
        if(this.frecuencia > this.max){
            this.frecuencia = this.min;
        }else if(this.frecuencia < this.min){
            this.frecuencia = this.max;
        }else{
            this.frecuencia = frecuencia;
        }
    }
    
    
    public double getMin(double min){
        return this.min;
    }
     public double setMin(double min){
        if(this.min != 80){
            this.min = 80;
        }else{
            this.min = min;
        }
        return this.min;
    }
     
     
    public double getMax(double max){
        return this.max;
    }
     public double setMax(double max){
        if(this.min != 108.0){
            this.min = 108.0;
        }else{
            this.max = max;
        }
        return this.max;
    }
     
     public void up(){
         this.frecuencia += 0.5;
         if (this.frecuencia > this.max) {
            this.frecuencia = this.min;
        }
     }
     
     public void down(){
         this.frecuencia -= 0.5;
         if (this.frecuencia < this.min) {
            this.frecuencia = this.max;
        }
     }
     
     public void display(){
         System.out.println("La frecuencia es de "+ this.frecuencia +" MHz");
     }
     
     
    
    
    
    
}
