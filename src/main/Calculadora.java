package main;

import org.apache.log4j.Logger;

public class Calculadora {
    private static final Logger logger = Logger.getLogger(Calculadora.class);

    private int valor1;
    private int valor2;

    public Calculadora(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int sumar(){
        return valor1 + valor2;
    }

    public int restar(){
        return valor1 - valor2;
    }

    public int multiplicar(){
        return valor1 * valor2;
    }

    public int dividir(){
        logger.info("Empezamos a dividir: " + valor1 + " / " + valor2);
        double resultado;
        try{
            resultado = valor1 / valor2;
        } catch (Exception e) {
            logger.error("Ocurrió un error al dividir: ", e);
            return 0;
        }
        logger.debug("Terminamos de dividir con exito!");
        return (int) resultado;
    }
}
