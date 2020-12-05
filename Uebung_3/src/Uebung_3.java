import java.util.HashMap;
import java.util.Hashtable;

public class Uebung_3 {
    public static void main (String[] args){
        starsDB();
    }

    public static void starsDB(){
        StarsDB stars = new StarsDB(5);
        stars.addStar("Sirius","TYC 5949-2777-1",8.5,-1.46,"Main sequence");
        stars.addStar("Alpha Centauri","TYC 9007-5849-1",4.37,-0.27,"Main sequence");
        stars.addStar("Rigel","TYC 5331-1752-1",860,0.13,"Blue supergiant");
        stars.addStar("Almaaz","TYC 2907-1275-1",2000,2.92,"Yellow supergiant");
        stars.addStar("Luhman 16","WISE J1049-5319A",6.589,14.94,"Brown dwarf");




    }
}
