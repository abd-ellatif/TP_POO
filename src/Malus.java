class Malus extends Case{
    public Malus(){this.col = Couleur.Rouge;}
    public void Action(Joueur J){
        J.points = J.points-10;
        if(J.points<0){J.points = 0;}
        J.pos = J.pos-2;
        if(J.pos<0){J.pos = 0;}
    }
}