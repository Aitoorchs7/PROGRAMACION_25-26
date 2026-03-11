
package a06;

public class Hora {
    private byte hora;
    private byte minuto;
    private byte segundo;
    
    public Hora(byte h, byte m, byte s){
        this.hora = h;
        this.minuto = m;
        this.segundo= s;
    }
    
    public byte getHora(byte h){
        return this.hora;
    }
    public void setHora(byte h){
        if(23 >= h && h >= 0){
            this.hora = h;
        }else{
            System.out.println("Esta hora es incorrecta, se establecera 0 por defecto");
            this.hora = 0;
        }
    }
    
      public byte getMinuto(byte m){
        return this.minuto;
    }
    public void setMinuto(byte m){
        if(59 >= m && m >= 0){
            this.minuto = m;
        }else{
            System.out.println("Estos minutos son incorrectos, se establecera 0 por defecto");
            this.minuto = 0;
        }
    }
    
      public byte getSegundo(byte s){
        return this.segundo;
    }
    public void setSegudo(byte s){
        if(59 >= s && s >= 0){
            this.segundo = s;
        }else{
            System.out.println("Estos minutos son incorrectos, se establecera 0 por defecto");
            this.segundo = 0;
        }
    }
    
    public void mostrarHora(){
        System.out.println(this.hora+":"+ this.minuto +":"+ this.segundo);
    }
    
    public void siguienteSegundo(){
        this.segundo ++;
        
        if (this.segundo >= 59){
            this.segundo = 0;
            this.minuto++;
            
            if (this.minuto >= 60 ){
                this.minuto = 0;
                this.hora++;
                
                if(this.hora >= 24){
                    this.hora = 0;
                }
            }
        }
    }
    
    
    
}
