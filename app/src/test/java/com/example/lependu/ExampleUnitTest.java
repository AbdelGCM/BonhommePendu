package com.example.lependu;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private Jeu jeu;
    private final String[] mots = {"bonjour", "aujourd'hui", "soleil", "pluie", "nuageux"};

    @Before
    public void setUp() {
        jeu = new Jeu(mots);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructeurListeVide() {
        new Jeu(new String[]{});
    }

    @Test
    public void testMotADeviner() {
        String motADeviner = jeu.getMotADeviner();
        assertNotNull(motADeviner);
        assertTrue(motADeviner.length() > 0);
        assertTrue(motADeviner.matches("[a-z]+"));
    }

    @Test
    public void testEssayerUneLettre() {
        int[] indices = jeu.essayerUneLettre('o');
        assertArrayEquals(new int[]{1, 4}, indices);
        assertEquals(2, jeu.getPointage());
        assertEquals(0, jeu.getNbErreurs());

        indices = jeu.essayerUneLettre('x');
        assertNotNull(indices);
        assertEquals(0, indices.length);
        assertEquals(2, jeu.getPointage());
        assertEquals(1, jeu.getNbErreurs());
    }

    @Test
    public void testEstReussi() {
        assertFalse(jeu.estReussi());

        for (char c : "soleil".toCharArray()) {
            jeu.essayerUneLettre(c);
        }

        assertTrue(jeu.estReussi());
    }
}