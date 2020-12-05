

public class Uebung_3 {
    public static void main (String[] args){
        railFenceEncoding();
    }

    public static void starsDB(){
        StarsDB stars = new StarsDB(5);
        stars.addStar("Sirius","TYC 5949-2777-1",8.5,-1.46,"Main sequence");
        stars.addStar("Alpha Centauri","TYC 9007-5849-1",4.37,-0.27,"Main sequence");
        stars.addStar("Rigel","TYC 5331-1752-1",860,0.13,"Blue supergiant");
        stars.addStar("Almaaz","TYC 2907-1275-1",2000,2.92,"Yellow supergiant");
        stars.addStar("Luhman 16","WISE J1049-5319A",6.589,14.94,"Brown dwarf");




    }
    public static void showNumbers(){
        int[]data = new int[] {1,2,3,4,2};
        int counter = 0;
        for (int value:data) {
            System.out.print(value);
            counter++;
            if (counter != data.length){
                System.out.print(",");
            }
        }
    }
    public static void railFenceEncoding(){
        String text = "gartenzauntransposition";
        char[] encoded = new char[text.length()];
        int center;
        if (text.length()%2 == 0){
            center = text.length()/2;
        }
        else{
            center = text.length()/2+1;
        }
        for (int i = 0; i < text.length(); i++){
            if (i%2 == 0){
                encoded[i/2] = text.charAt(i);
            }
            else{
                encoded[center+(i/2)] = text.charAt(i);
            }
        }
        System.out.println(String.copyValueOf(encoded));
        char[] decoded = new char[text.length()];
        for (int j = 0; j < encoded.length; j++){
            if (j < center){
                decoded[j*2] = encoded[j];
            }
            else{
                decoded[2*j-encoded.length] = encoded[j];
            }
        }
        System.out.println(String.copyValueOf(decoded));
    }
}
