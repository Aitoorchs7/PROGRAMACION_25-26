package a03;

public class HoraExacta extends Hora {
    int segundos;

    public HoraExacta (int horas, int minutos,int segundos){
        super(horas,minutos);
        this.segundos = segundos;
    }
    boolean setSegundos(int segundos){
        if(segundos >= 0 && segundos < 60){
            this.segundos = segundos;
            return true;
        }else{
            return false;
        }
    }
    public int getSegundos(){
        return this.segundos;
    }
    @Override
    public void inc(){
        this.segundos++;
        if(this.segundos >= 60){
            super.inc();
            this.segundos = 0;
        };
    }
    @Override
    public String toString() {
        String tiempo = super.getHoras() + ":" + super.getMinutos() + ":" + this.segundos;
        return tiempo;
    }
    @Override
    public boolean equals(Object otro){ {
        HoraExacta otraHora = (HoraExacta) otro;
        boolean iguales;

        if(this.getHoras() == otraHora.getHoras() && this.getMinutos() == otraHora.getMinutos()){// indicamos que sea igual en horas y minutos
            iguales = true;
        } else {
            iguales = false;
        }
        return iguales;
    }
}
}