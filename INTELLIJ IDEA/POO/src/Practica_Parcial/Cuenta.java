package Practica_Parcial;

import java.util.ArrayList;

public class Cuenta {
        private String numeroCuenta;
        private ArrayList<Transaccion> transaccion = new ArrayList<>();


    public Cuenta(String numeroCuenta, ArrayList<Transaccion> transaccion) {
        this.numeroCuenta = numeroCuenta;
        this.transaccion = transaccion;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public ArrayList<Transaccion> getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(ArrayList<Transaccion> transaccion) {
        this.transaccion = transaccion;
    }
}


