package com.example.lependu;
import java.util.Random;

public class Jeu {
    private final String motÀDeviner;
    private int pointage;
    private int nbErreurs;

    public Jeu(String[] mots) {
        if (mots.length == 0) {
            throw new IllegalArgumentException("La liste de mots est vide.");
        }
        Random rand = new Random();
        int index = rand.nextInt(mots.length);
        motÀDeviner = mots[index];
        pointage = 0;
        nbErreurs = 0;
    }

    public int getPointage() {
        return pointage;
    }

    public int getNbErreurs() {
        return nbErreurs;
    }

    public String getMotADeviner() {
        return motÀDeviner;
    }

    public void resetPointage() {pointage=0;};

    public void resetnbrErreur(){nbErreurs=0;}

    public int[] essayerUneLettre(char lettre) {
        int[] indices = new int[motÀDeviner.length()];
        int nbOccurrences = 0;
        for (int i = 0; i < motÀDeviner.length(); i++) {
            if (motÀDeviner.charAt(i) == lettre) {
                indices[nbOccurrences] = i;
                nbOccurrences++;
                pointage++;
            }
        }
        if (nbOccurrences == 0) {
            nbErreurs++;
        }
        int[] indicesOccurences = new int[nbOccurrences];
        for (int i = 0; i < nbOccurrences; i++) {
            indicesOccurences[i] = indices[i];
        }
        return indicesOccurences;
    }

    public boolean estReussi() {
        return pointage == motÀDeviner.length();
    }
}

