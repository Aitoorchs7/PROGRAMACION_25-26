package a02;

public class Hora {
    private int horas;
    private int minutos;

    public Hora(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }

    public void inc(){
        this.minutos++;
        if(this.minutos >= 60){
            this.horas++;
            if(this.horas >= 24){
                this.horas = 0;
            }
            this.minutos = 0;

        }
    }
    public int getHoras(){
        return this.horas;
    }
    public int getMinutos(){
        return this.minutos;
    }
    boolean setHoras(int horas){
        if(horas >= 0 && horas <24){
            this.horas = horas;
            return true;
        } else {
            return false;
        }
    }
    boolean setMinutos(int minutos){
        if(minutos >= 0 && minutos <60){
            this.minutos = minutos;
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        String tiempo = this.horas + ":" + this.minutos;
        return tiempo;
    }
    
}

