import java.util.Random;

public class Plateau {
    public Case[] plateau;
    public Plateau(){
    plateau = new Case[100];
    Case case_blanche = new Parcours();
    Case case_rouge= new Malus();
    Case case_verte= new Bonus();
    //Case case_bleue = new QstDef("");
    //Case case_rose = new QstImage();
    Case case_orange = new Saut();
    plateau[0] = new Depart();;
    plateau[99] = new Fin();;
    Case[] cases_speciaux = {case_orange, case_rouge, case_verte};
    Random rd = new Random();
    int n = 0;
    int i=0;
    for (int j = 0;j<3;j++){
    i = 0;
    while(i<5){
            if(plateau[n]==null){
                plateau[n] = cases_speciaux[j];
                System.out.println(plateau[n].col.name() + ","  + n);
                i++;
            }
            n = rd.nextInt(100);
        }
    }
    i = 0;
    while(i<5){
        if(plateau[n]==null){
            plateau[n] = new QstDef("");
                System.out.println(plateau[n].col.name() + "," + n);
                i++;
            }
            n = rd.nextInt(100);
        }
        i = 0;
    while(i<5){
        if(plateau[n]==null){
            plateau[n] = new QstImage();
            System.out.println(plateau[n].col.name() + "," + n);
            i++;
        }
        n = rd.nextInt(100);
    }    
    i = 0;
    while(i<73)
    {
        n = rd.nextInt(100);
        if(plateau[n]==null){
            plateau[n] = case_blanche;
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
