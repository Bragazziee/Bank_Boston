/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author braga
 */
public class Cliente implements IMostrarDatos {
    private String nombre;
    private String rut;
    private CuentaBancaria cuenta;

    public Cliente(String nombre, String rut, CuentaBancaria cuenta) {
        this.nombre = nombre;
        this.rut = rut;
        this.cuenta = cuenta;
    }

    @Override
    public void mostrarDatosCliente() {
        System.out.println("Nombre: " + nombre);
        System.out.println("RUT: " + rut);
        System.out.println("Cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo: $" + cuenta.getSaldo());
    }
}
