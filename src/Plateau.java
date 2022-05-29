import java.io.IOException;
import java.util.Random;

public class Plateau {
    public Case[] plateau;
    public Plateau() throws IOException {
    plateau = new Case[100];
    plateau[0] = new Depart();
    plateau[99] = new Fin();
    Random rd = new Random();
    int n = 0;
    for (int j = 0;j<5;j++){
    int i = 0;
    while(i<5){
            if(plateau[n]==null){
                Case[] cases_speciaux = {new Saut(), new Malus(), new Bonus(),new QstDef(),new QstImage()};
                plateau[n] = cases_speciaux[j];
                System.out.println(plateau[n].col.name() + ","  + n);
                i++;
            }
            n = rd.nextInt(100);
        }
    }
    int i = 0;
    while(i<73)
    {
        n = rd.nextInt(100);
        if(plateau[n]==null){
            plateau[n] = new Parcours();
            i++;
        }
    } 
    }
    public void afficher(){
        int i;
        for (i=0;i<100;i++){
            plateau[i].afficher();
        }
    }
}
