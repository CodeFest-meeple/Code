import java.util.Arrays;

public class Challenges {
    public static void main(String args[]){
        //Fibonacci sqaured sequence
        ChallengeOne();
        //data type with 32bits values in expression
        ChallengeTwo();
        //Degree angles in cartesian plane
        ChallengeThree();
        //Ascii converstion to alphabet
        ChallengeFour();
        // RGB int values convert to Hex colour values
        ChallengeFive();

        ChallengeSeven();
        //second element to the power of the first element
        ChallengeEight();
        
        //comparing each digit and subtracting the smaller one from the larger one
        ChallengeTen()
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
        System.out.println("\n-----Challenge Two---\n");
    int BYTE ,INT ,LONG,SHORT,FLOAT,DOUBLE;
        BYTE = 8;
        INT  = 32;
        LONG = 32;
        SHORT = 16;
        FLOAT = 32;
        DOUBLE = 64;
        System.out.print(((BYTE+BYTE)-(BYTE+BYTE))+INT+" ");
        System.out.print(((LONG+LONG)-(SHORT+INT))+LONG+" ");
        System.out.print(((DOUBLE+FLOAT)-(BYTE+BYTE))+BYTE);
    }


    private static void ChallengeThree(){
        System.out.println("\n-----Challenge Three---\n");
        int[] degrees = {0, 45, 90, 180};
        int x = 0;
        int y = 0;
        for (int degree: degrees) {
            if (degree == 0 || degree == 180) {
                x=1;
                y=0;
            }
            else if (degree == 90 || degree == 225) {
                x=0;
                y=1;
            }
            else {
                x=1;
                y=1;
            }
            System.out.print(degree + " " + x + " " + y + ", ");
        }
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
        int count = 0;

        for(int y : data){
            count++;
            if(count <= 3){
                System.out.print(Integer.toHexString(y));
            if(count ==3){
                System.out.print(",");
                count = 0;
            }
            }
        }
    }




    private static void ChallengeSix(){

    }


    private static void ChallengeSeven(){
        System.out.println("\n-----Challenge Seven---\n");

        int[] set = {3,4,5,9,12,15,6,8,10};






    }

//c= b^a
    private static void ChallengeEight(){
        System.out.println("\n-----Challenge Eight---\n");

        int[] arr = {1, 2, 2};

        int x = 0;
        int y = 0;
        for (int i = 0; i<3; i++) {
            arr[0]=(arr[1] - 1);
            arr[1]=(arr[1] + 1);
            arr[2]=(int) (Math.pow(arr[1], arr[0]));
            System.out.print(arr[0] + "" + arr[1] + "" + arr[2] + ",");
        }
    }
    //comparing each digit and subtracting the smaller one from the larger one
    private static void ChallengeTen(){
        System.out.println("\n-----Challenge Ten---\n");
        
        int[] a = {8, 1, 3, 4, 7, 7, 2};
        int[] b = {3, 7, 2, 6, 1, 3, 9};
        ArrayList<Integer> c = new ArrayList<>();
        for (int i = 0; i<a.length; i++) {
        	if (a[i] >= b[i])
        		c.add(a[i] - b[i]);
        	
        	else if (b[i] > a[i])
        		c.add(b[i] - a[i]);
        }
        System.out.println(c);
        
    }
}
