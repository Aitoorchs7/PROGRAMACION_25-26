package a03;


public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("00000000A","Aitor",100);
        // cuenta1.saldo =+ 1000;  aquí da error al modificar el saldo porque en la clase, el atributo es privado
        cuenta1.dni = "012345678A";
        cuenta1.nombre = "Dani";

        cuenta1.mostrarDatos();



    }
}
