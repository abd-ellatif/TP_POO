class Bonus extends Case{
    public Bonus(){this.col = Couleur.Vert;}
    public void Action(Joueur J){
        J.points = J.points+10;
        J.pos = J.pos+2;
        if (J.pos>99) J.pos =-2;
    };
}