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
public class CompetidorTest {
    

    @Test
    public void testActualizarRankingSumaSimple() {

        Competidor ciclista = new Competidor("Rigoberto", 37, "Colombia", 1.73, 66.0, 100);
        
        ciclista.actualizarRanking(50);
        
        assertEquals(150, ciclista.getRankingMundial());
    }

    @Test
    public void testActualizarRankingConMultiplicador() {
        Competidor ciclista = new Competidor("Rigoberto", 37, "Colombia", 1.73, 66.0, 100);
        
 
        ciclista.actualizarRanking(50, 2.0); 
        
        assertEquals(200, ciclista.getRankingMundial());
    }
}
