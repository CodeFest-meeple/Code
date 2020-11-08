import java.awt.image.RGBImageFilter;
import java.util.*;
public class Challenges {
    public static void main(String args[]){
        //Fibonacci sqaured sequence
        ChallengeOne();
        //Ascii converstion to alphabet
        ChallengeFour();
        // RGB int values convert to Hex colour values
        ChallengeFive();

    }
    //Fibonacci sqaured sequence
    private static void ChallengeOne(){
        System.out.println("\n-----Challenge One---\n");
        int n = 0;
        int temp = 0;
        while(n != 1){
            n++;
        }
        int sum = n + temp;
        System.out.println(sum + ": " +sum*sum);
        int i;
        for(i = 0; i < 8; i++){
            temp = n;
            n = sum;
            sum = n + temp;
            System.out.println(sum + ": " +sum*sum);
        }
    }

    private static void ChallengeTwo(){

    }


    private static void ChallengeThree(){

    }

    //Ascii converstion to alphabet
    private static void ChallengeFour(){
        System.out.println("\n-----Challenge Four---\n");

        int[] values = {71,111,111,100,32,108,117,99,107,32,32,72,101,108,108,111,32,87,111,114,108,100};
        String s = "Good Luck";
        int count= 0;
        for(int i : values){
            if(i == 32){
                count++;
                if(count == 3){
                    System.out.print(s);
                }
            }
            System.out.print((char)i);
        }
    }

    // RGB int values convert to Hex colour values
    private static void ChallengeFive(){
        System.out.println("\n-----Challenge Five---\n");

        int[] data = {255,0,0,255,127,0,255,255,0,0,255,0,0,0,255,46,43,5};

        int R,G,B;
        R = 0;
        G = 0;
        B = 0;
        System.out.println(data.length/3);


    }




    private static void ChallengeSix(){

    }


    private static void ChallengeSeven(){

    }


    private static void ChallengeEight(){

    }
}
