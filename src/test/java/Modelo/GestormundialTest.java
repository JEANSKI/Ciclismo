/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class GestormundialTest {
    
@Test
    public void testInscripcionYGeneracionDeDatosIntegracion() {

        Gestormundial gestor = new Gestormundial();
        Competidor ciclista = new Competidor("Jean", 18, "Colombia", 1.75, 75.0, 500);
        

        gestor.registrarEquipo("Colombia");
        gestor.inscribirCompetidorAEquipo("Colombia", ciclista);
        

        String resultado = gestor.obtenerDatosTodosLosCompetidores();
        

        assertTrue(resultado.contains("Jean"));
        assertTrue(resultado.contains("Colombia"));
    }
}
