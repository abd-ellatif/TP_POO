import javax.imageio.ImageIO;
import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.*;
import java.util.Random;
import java.util.StringTokenizer;

class QstImage extends Question{
    protected Image images[];
    protected String mot;
    public QstImage() throws IOException {
        this.col = Couleur.Rose;
        String line;
        BufferedReader fileqsts = null;
        try{

            fileqsts = new BufferedReader(new FileReader("QstsImgs.txt"));
            Random rand = new Random();
            int bcl = rand.nextInt(0,19);
            StringTokenizer token;
            while(bcl != 0){
                fileqsts.readLine();
                bcl--;
            }
            if (( line = fileqsts.readLine()) != null) {
                token = new StringTokenizer(line);
                this.mot = token.nextToken("|");
                this.images[0] = ImageIO.read(new FileInputStream(token.nextToken("|")));
            }
            else{
                fileqsts.reset();
                line = fileqsts.readLine();
                token = new StringTokenizer(line);
                this.mot = token.nextToken("|");
                this.images[0] = ImageIO.read(new FileInputStream(token.nextToken("|")));
            }
            for (int i=0;i<3;i++)
            {
                if (( line = fileqsts.readLine()) != null) {token = new StringTokenizer(line);
                    token.nextToken("|");this.images[1] = ImageIO.read(new FileInputStream(token.nextToken("|")));
                }
                else {
                    fileqsts.reset();
                    fileqsts.readLine();token = new StringTokenizer(line);
                    token.nextToken("|");this.images[1] = ImageIO.read(new FileInputStream(token.nextToken("|")));
                }

                if (( line = fileqsts.readLine()) != null) {token = new StringTokenizer(line);
                    token.nextToken("|");this.images[2] = ImageIO.read(new FileInputStream(token.nextToken("|")));
                }
                else {
                    fileqsts.reset();
                    fileqsts.readLine();token = new StringTokenizer(line);
                    token.nextToken("|");this.images[2] = ImageIO.read(new FileInputStream(token.nextToken("|")));
                }

                if (( line = fileqsts.readLine()) != null) {token = new StringTokenizer(line);
                    token.nextToken("|");this.images[3] = ImageIO.read(new FileInputStream(token.nextToken("|")));
                }
                else {
                    fileqsts.reset();
                    fileqsts.readLine();token = new StringTokenizer(line);
                    token.nextToken("|");this.images[3] = ImageIO.read(new FileInputStream(token.nextToken("|")));
                }
            }

        }catch (FileNotFoundException e) {}
        catch (IOException e) {}
        finally {
            fileqsts.close();
        }




    }
    public void Action(Joueur J){

    };
}