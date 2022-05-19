abstract class Case{
    public Couleur col;
    public abstract void Action();
    public void afficher(){
        System.out.println(this.col.name());
    }
}