package negocio;

public class Carro {
    private int potencia;
    private double velocidad;

    void acelerar() {
        velocidad = +potencia;
    }

    void frenar() {
        velocidad /= 2;
    }

    /*Metodo para establecer valor set() siempres es void siempre recibe parametro parameto generalmete es del miso tipo de atributo*/

    public void setPotencia(int potencia) {
        this.potencia = potencia;

    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    /*Metodo obtener el valor get()simpre retorna el valor el tiempo de retorno geralmente es del mismo tipo del atributo */

    public int getPotencia() {
        return potencia;
    }
    public double getVelocidad() {
        return velocidad;
    }
}
