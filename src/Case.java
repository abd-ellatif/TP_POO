abstract class Case{
    public Couleur col;
    public abstract void Action(Joueur J);
    public void afficher(){
        System.out.println(this.col.name());
    }
}