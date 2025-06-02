/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author braga
 */

import modelo.*;

/**
 * Clase principal del programa Bank_Boston.
 * Aquí se crean las cuentas, clientes y se prueban los métodos con herencia y polimorfismo.
 */

public class Main {
    public static void main(String[] args) {
        
        // Crear una cuenta corriente y asociarla a un cliente
        CuentaBancaria cuenta1 = new CuentaCorriente("123456789", 1500000);
        Cliente cliente1 = new Cliente("Juan Pérez", "12.345.678-9", cuenta1);

        // Realizar operaciones
        cuenta1.depositar(50000);   // Aumenta saldo en 50.000
        cuenta1.girar(100000);      // Resta 100.000 si hay saldo suficiente

        // Mostrar tipo de cuenta (polimorfismo)
        cuenta1.mostrarTipoCuenta();

        // Mostrar información del cliente (interfaz implementada)
        cliente1.mostrarDatosCliente();

        // Prueba con otra subclase: cuenta de ahorro
        CuentaBancaria cuenta2 = new CuentaAhorro("987654321", 300000);
        Cliente cliente2 = new Cliente("Ana Torres", "22.333.444-5", cuenta2);
        cuenta2.mostrarTipoCuenta();
        cliente2.mostrarDatosCliente();

        // También se puede usar CuentaCredito de igual manera
    }
}
