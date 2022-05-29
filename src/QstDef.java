import java.io.*;
import java.util.Random;
import java.util.StringTokenizer;

class QstDef extends Question{
     protected String definition;
     protected String mot;

    public QstDef() throws IOException {
        this.col = Couleur.Bleu;
        BufferedReader fileqsts = null;
        try
        {
            fileqsts = new BufferedReader(new FileReader(Question.pathQst));
            Random rand = new Random();
            int bcl = rand.nextInt(1,60);
            while (bcl != 0){
                String ligne;
                if ((ligne =fileqsts.readLine()) != null)
                {
                    StringTokenizer token = new StringTokenizer(ligne,"/");
                    this.definition = token.nextToken();
                    this.mot = token.nextToken();
                }
                bcl--;
            }
        }
        catch (IOException e) {}
        finally {
            if (fileqsts != null)
            {
                fileqsts.close();
            }
        }


    }

    public void Action(Joueur J){}
}