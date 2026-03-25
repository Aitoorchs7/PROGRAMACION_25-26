package a07;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Texto {

    Scanner sc = new Scanner(System.in);

    private String contenido;
    private int longitudMaxima;
    private int vocales;
    private LocalDate fechaCreacion;
    private LocalDateTime fechaModificacion;
    private LocalDateTime HoraCreacion;

    public Texto(String texto) {
        this.contenido = texto;
        this.longitudMaxima = 100;
        this.vocales = contarVocales();
        this.fechaCreacion = LocalDate.now();
        this.HoraCreacion = LocalDateTime.now();
        this.fechaModificacion = LocalDateTime.now();
    }


    // Getters y Setters Contenido
    public String getContenido() {
        return contenido;
    }
    public String setContenido(String contenido) {
        if (contenido.length() <= longitudMaxima) {
            this.contenido = contenido;
            this.vocales = contarVocales();
        }else {
            System.out.println("El texto tiene una longitud incorrecta");
        }
        return contenido;
    }

    // Getters y Setters LongitudMaxima
    public int getLongitudMaxima() {
        return longitudMaxima;
    }
    public int setLongitudMaxima(int longitudMaxima) {
        this.contarLetras();
        if (longitudMaxima > 0 && longitudMaxima <= 100) {
            this.longitudMaxima = longitudMaxima;
        }else {
            System.out.println("La longitud máxima debe ser mayor a 0 y menor de 100");
        }
        return longitudMaxima;
    }

    //getters y Setters Vocales
    public int getVocales() {
        return vocales;
    }
    public int setVocales(int vocales) {
        if (vocales >= 0) {
            this.vocales = vocales;
        }else {
            System.out.println("El número de vocales no puede ser negativo");
        }
        return vocales;
    }

    // Getters y Setters FechaCreacion
    public LocalDate getFechaCreacion () {
        return fechaCreacion;
    }
    public LocalDate setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
        return fechaCreacion;
    }

    // Getters y Setters HoraCreacion
    public LocalDateTime getHoraCreacion() {
        return HoraCreacion;
    }

    public LocalDateTime setHoraCreacion(LocalDateTime horaCreacion) {
        this.HoraCreacion = horaCreacion;
        return HoraCreacion;
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }
    public LocalDateTime setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
        return fechaModificacion;
    }


    // Método para contar vocales en el texto
    public int contarVocales(){
        int contador = 0;
        for(int i = 0; i < this.contenido.length(); i++){
            char c  = Character.toLowerCase(this.contenido.charAt(i)); 
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                contador++;
            }
        }
        return contador;
    }
    // Cambiamos a public para poder usarlo desde fuera
    public void addPrincipio(String nuevoTexto) {
        if (this.contenido.length() + nuevoTexto.length() <= this.longitudMaxima) {
            this.contenido = nuevoTexto + this.contenido;
            this.fechaModificacion = LocalDateTime.now(); 
        } else {
            System.out.println("Error: No hay espacio suficiente.");
        }
    }

     public void addFinal(String nuevoTexto) {
        // Validamos que quepa antes de añadirlo
        if (this.contenido.length() + nuevoTexto.length() <= this.longitudMaxima) {
            this.contenido = this.contenido + nuevoTexto;
            this.fechaModificacion = LocalDateTime.now();
        } else {
            System.out.println("Error: No hay espacio suficiente.");
        }
    }
    public void contarLetras() {
        int contador = 0;
        for (int i = 0; i < this.contenido.length(); i++) {
            char c = this.contenido.charAt(i);
            if (Character.isLetter(c)) {
                contador++;
            }
        }
        System.out.println("El texto tiene " + contador + " letras.");
    }

    public void mostrarTexto() {
        System.out.println(contenido);
        System.out.println("Fecha de creación: " + fechaCreacion);
        System.out.println("Hora de creación: " + HoraCreacion);
        System.out.println("Fecha de modificación: " + fechaModificacion);
        System.out.println("El texto tiene " + this.contarVocales() + " vocales.");
    }





    
}

