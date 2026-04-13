/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Ciclista;
import Modelo.Gestormundial;
import Vista.VistaMundial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class ControladorMundial implements ActionListener {
    
    private VistaMundial vista;
    private Gestormundial modelo;

    public ControladorMundial(VistaMundial vista, Gestormundial modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        this.vista.btnRegistrar.addActionListener(this);
        this.vista.btnMostrarDatos.addActionListener(this);
    }

    public void iniciar() {
        vista.setTitle("Gestión Mundial de Ciclismo - MVC");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegistrar) {
            try {
                String nombre = vista.txtNombre.getText();
                String pais = vista.txtPais.getText();
                int ranking = Integer.parseInt(vista.txtRanking.getText());

                // Ahora usamos Ciclista (la subclase con sobrecarga)
                Ciclista nuevoCiclista = new Ciclista(nombre, pais, ranking);
                
                // Usamos el nuevo método del Gestor
                modelo.registrarParticipante(nuevoCiclista);
                
                JOptionPane.showMessageDialog(vista, "Ciclista registrado con éxito");
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(vista, "Error: El ranking debe ser un número.");
            }
        }
        
        if (e.getSource() == vista.btnMostrarDatos) {
            String resultados = modelo.obtenerDatosParticipantes();
            vista.txtAreaResultados.setText(resultados);
        }
    }
}