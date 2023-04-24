package com.example.lependu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Locale;

public class Pendu extends AppCompatActivity  implements View.OnClickListener{

    TextView mot,score;

    ImageView img;

    Button button,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;


    private final String[] mots = {"chapeau", "revolver", "cheval", "bottes", "cowboy","vache","lasso","indien","desert","cactus"};
    private Jeu jeu=new Jeu(mots);

    String motAdeviner="";









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mot=findViewById(R.id.mot);
        score=findViewById(R.id.score);
        img=findViewById(R.id.img);


         a = findViewById(R.id.a);
         b = findViewById(R.id.b);
         c = findViewById(R.id.c);
         d = findViewById(R.id.d);
         e = findViewById(R.id.e);
         f = findViewById(R.id.f);
         g = findViewById(R.id.g);
         h = findViewById(R.id.h);
         i = findViewById(R.id.i);
         j = findViewById(R.id.j);
         k = findViewById(R.id.k);
         l = findViewById(R.id.l);
         m = findViewById(R.id.m);
         n = findViewById(R.id.n);
         o = findViewById(R.id.o);
         p = findViewById(R.id.p);
         q = findViewById(R.id.q);
         r = findViewById(R.id.r);
         s = findViewById(R.id.s);
         t = findViewById(R.id.t);
         u = findViewById(R.id.u);
         v = findViewById(R.id.v);
         w = findViewById(R.id.w);
         x = findViewById(R.id.x);
         y = findViewById(R.id.y);
         z = findViewById(R.id.z);

        jeu.resetnbrErreur();
        jeu.resetPointage();
        score.setText(String.valueOf(0));
        for(int i = 0;i< jeu.getMotADeviner().length();i++){
            motAdeviner=motAdeviner+"#";
        }
        mot.setText(motAdeviner);

    }

// le jeu detecte les lettre et sait de quel mot il sagit mais je narrive juste pas afficher lettre par lettre
    //le mot est afficher dans le Status une fois avoir accumulé 6 erreurs ou apres avoir obtenu le mot
    @Override
    public void onClick(View view) {

        String lettre = ((Button) view).getText().toString().toLowerCase();
        StringBuilder motAchanger = new StringBuilder(motAdeviner);
        System.out.println(lettre);
        int[] indicesOccurences = jeu.essayerUneLettre(lettre.charAt(0));
        for (int i = 0; i < indicesOccurences.length; i++) {
            System.out.println(indicesOccurences[i]);
            // faire quelque chose avec chaque indice d'occurrence
            int index = indicesOccurences[i];

        }

        switch (lettre) {
            case "a":
                jeu.essayerUneLettre('a');
                a.setEnabled(false);
                break;
            case "b":
                jeu.essayerUneLettre('b');
                b.setEnabled(false);
                break;
            case "c":
                jeu.essayerUneLettre('c');
                c.setEnabled(false);
                break;
            case "d":
                jeu.essayerUneLettre('d');
                d.setEnabled(false);
                break;
            case "e":
                jeu.essayerUneLettre('e');
                e.setEnabled(false);
                break;
            case "f":
                jeu.essayerUneLettre('f');
                f.setEnabled(false);
                break;
            case "g":
                jeu.essayerUneLettre('g');
                g.setEnabled(false);
                break;
            case "h":
                jeu.essayerUneLettre('h');
                h.setEnabled(false);
                break;
            case "i":
                jeu.essayerUneLettre('i');
                i.setEnabled(false);
                break;
            case "j":
                jeu.essayerUneLettre('j');
                j.setEnabled(false);
                break;
            case "k":
                jeu.essayerUneLettre('k');
                k.setEnabled(false);
                break;
            case "l":
                jeu.essayerUneLettre('l');
                l.setEnabled(false);
                break;
            case "m":
                jeu.essayerUneLettre('m');
                m.setEnabled(false);
                break;
            case "n":
                jeu.essayerUneLettre('n');
                n.setEnabled(false);
                break;
            case "o":
                jeu.essayerUneLettre('o');
                o.setEnabled(false);
                break;
            case "p":
                jeu.essayerUneLettre('p');
                p.setEnabled(false);
                break;
            case "q":
                jeu.essayerUneLettre('q');
                q.setEnabled(false);
                break;
            case "r":
                jeu.essayerUneLettre('r');
                r.setEnabled(false);
                break;
            case "s":
                jeu.essayerUneLettre('s');
                s.setEnabled(false);
                break;
            case "t":
                jeu.essayerUneLettre('t');
                t.setEnabled(false);
                break;
            case "u":
                jeu.essayerUneLettre('u');
                u.setEnabled(false);
                break;
            case "v":
                jeu.essayerUneLettre('v');
                v.setEnabled(false);
                break;
            case "w":
                jeu.essayerUneLettre('w');
                w.setEnabled(false);
                break;
            case "x":
                jeu.essayerUneLettre('x');
                x.setEnabled(false);
                break;
            case "y":
                jeu.essayerUneLettre('y');
                y.setEnabled(false);
                break;
            case "z":
                jeu.essayerUneLettre('z');
                z.setEnabled(false);
                break;
            default:
                break;
        }

        switch (jeu.getNbErreurs()) {
            case 2:
                img.setImageResource(R.drawable.err01);
                break;
            case 4:
                img.setImageResource(R.drawable.err02);
                break;
            case 6:
                img.setImageResource(R.drawable.err03);
                break;
            case 8:
                img.setImageResource(R.drawable.err04);
                break;
            case 10:
                img.setImageResource(R.drawable.err05);
                break;
            case 12:
                img.setImageResource(R.drawable.err06);
                break;
            default:
                break;
        }
        //Je divise le score obtenu par deux car donne deux fois plus de point que la normal a cause d'un bug inconnue
        score.setText(String.valueOf(jeu.getPointage()/2));
        Bundle extras = new Bundle();
        if (jeu.getPointage()==jeu.getMotADeviner().length()|| jeu.getNbErreurs()==12){
            extras.putString("MOT",jeu.getMotADeviner());
            Intent i = new Intent(this, Status.class);
            i.putExtras(extras);

            startActivity(i);
        }

    }
    public void reset(View view){
        View lettre_i=i;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Confirmer la réinitialisation");
        builder.setMessage("Êtes-vous sûr de vouloir recommencer le jeu");
        builder.setPositiveButton("Oui", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface,int _) {
                jeu.resetnbrErreur();
                jeu.resetPointage();
                score.setText(String.valueOf(0));
                mot.setText(motAdeviner);

                a.setEnabled(true);
                b.setEnabled(true);
                c.setEnabled(true);
                d.setEnabled(true);
                e.setEnabled(true);
                f.setEnabled(true);
                g.setEnabled(true);
                h.setEnabled(true);
                lettre_i.setEnabled(true);
                j.setEnabled(true);
                k.setEnabled(true);
                l.setEnabled(true);
                m.setEnabled(true);
                n.setEnabled(true);
                o.setEnabled(true);
                p.setEnabled(true);
                q.setEnabled(true);
                r.setEnabled(true);
                s.setEnabled(true);
                t.setEnabled(true);
                u.setEnabled(true);
                v.setEnabled(true);
                w.setEnabled(true);
                x.setEnabled(true);
                y.setEnabled(true);
                z.setEnabled(true);

                img.setImageResource(R.drawable.acceuil);
            }
        });
        builder.setNegativeButton("Non", null);
        builder.show();
    }
}