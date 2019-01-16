/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author sportak
 */
public class Seguro implements Serializable {

    private int id;
    private String nif;
    private String nombre;
    private String ape1;
    private String ape2;
    private int numHijos;
    private AsistenciaMedica asis;

    public Seguro() {
    }

    public Seguro(int id, String nif, String nombre, String ape1, String ape2, int numHijos, AsistenciaMedica asis) {
        this.id = id;
        this.nif = nif;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.numHijos = numHijos;
        this.asis = asis;
    }

    public AsistenciaMedica getAsis() {
        return asis;
    }

    public void setAsis(AsistenciaMedica asis) {
        this.asis = asis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    @Override
    public String toString() {
        return "Seguro{" + "id=" + id + ", nif=" + nif + ", nombre=" + nombre + ", ape1=" + ape1 + ", ape2=" + ape2 + ", numHijos=" + numHijos + ", asis=" + asis + '}';
    }

}
