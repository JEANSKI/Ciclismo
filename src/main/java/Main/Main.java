/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import Modelo.Gestormundial;
import Vista.VistaMundial;
import Controlador.ControladorMundial;
/**
 *
 * @author User
 */
public class Main {
   public static void main(String[] args) {

        Gestormundial modelo = new Gestormundial();
        

        VistaMundial vista = new VistaMundial();
        

        ControladorMundial controlador = new ControladorMundial(vista, modelo);
        

        controlador.iniciar();
    }
}
