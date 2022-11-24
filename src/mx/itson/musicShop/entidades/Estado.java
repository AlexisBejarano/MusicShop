/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.musicShop.entidades;

import com.google.gson.Gson;
import java.util.List;
import mx.itson.musicShop.enumerador.Tipo;


/**
 *
 * @author Alexis Bejarano
 */
public class Estado {
    
    private String producto;
    private String cuenta;
    private String clabe;
    private String moneda;
    private String descripcion;
    private String nombreTienda;
    
    private Cliente cliente;
    
    private Movimiento tipo;
    private List<Movimiento> movimientos;
    private Movimiento movimiento;
    
    
    
    
    
    public Estado deserializar (String json){
        Estado estado = new Estado();
        try{
            estado = new Gson().fromJson(json, estado.getClass());
        }catch(Exception er){
            System.err.print("Ops, a ocurrido un error: " + er.getMessage());
        }
        return estado;
    }
    
    

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the clabe
     */
    public String getClabe() {
        return clabe;
    }

    /**
     * @param clabe the clabe to set
     */
    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    /**
     * @return the moneda
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * @param moneda the moneda to set
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the tipo
     */
    public Movimiento getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Movimiento tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the movimientos
     */
    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * @param movimientos the movimientos to set
     */
    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    /**
     * @return the movimiento
     */
    public Movimiento getMovimiento() {
        return movimiento;
    }

    /**
     * @param movimiento the movimiento to set
     */
    public void setMovimiento(Movimiento movimiento) {
        this.movimiento = movimiento;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the nombreTienda
     */
    public String getNombreTienda() {
        return nombreTienda;
    }

    /**
     * @param nombreTienda the nombreTienda to set
     */
    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }
    
    
    
    
    
    
}
