/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Equipo {
    private String nombrePais;
    private ArrayList<Competidor> competidores;

    public Equipo(String nombrePais) {
        this.nombrePais = nombrePais;
        this.competidores = new ArrayList<>();
    }

    public void agregarCompetidor(Competidor competidor) {
        this.competidores.add(competidor);
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public ArrayList<Competidor> getCompetidores() {
        return competidores;
    }
}
