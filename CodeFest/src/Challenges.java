import java.util.ArrayList;



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
        //convert letters to operator
        ChallengeSix()     
        //adds value within the same interval
        ChallengeSeven();
        //second element to the power of the first element
        ChallengeEight();


        //comparing each digit and subtracting the smaller one from the larger one
        ChallengeTen();

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
        System.out.print(sum*sum+" ");
        int i;
        for(i = 0; i < 8; i++){
            temp = n;
            n = sum;
            sum = n + temp;
            System.out.print(sum*sum +" ");
        }
    }

    private static void ChallengeTwo(){
        System.out.print("\n-----Challenge Two---\n");
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


    //convert letters to operator
    private static void ChallengeSix() {
      System.out.println("\n-----Challenge Six---\n");
      String data = "PU 3 PU 4 AD 7 PU 5 SU 2 PU 3 AD";
      System.out.println(data + " ?");
      String[] arr = data.split(" ");
      ArrayList<Integer> numbers = new ArrayList<Integer>();

      int n = 0;
      int a = 0;

      for (int i = 6; i < arr.length; i++){
    	  String s = arr[i];
    
    	  switch(s){
    		  case "PU":
    			  a = Integer.parseInt(arr[i+1]);
    			  numbers.add(a); break;
    		  case "SU":
    			  a = Integer.parseInt(arr[i+1]);
    			  numbers.add(-a); break;
    		  case "AD": 
    			 for (int j = 0; j < numbers.size(); j++) {
    			  n = n + numbers.get(j);
    		     }  break;
    		  } 	  	         	 
      } 
 	 System.out.println(n);
    }

    private static void ChallengeSeven(){
        System.out.println("\n-----Challenge Seven---\n");

        int[] set = {3,4,5,9,12,15};
        int count = 0;
        int i;
        int a1,a2,a3;
         a1 = 0;
         a2 = 0;
         a3 = 0;
        for(i = 0; i < set.length; i++) {
            count++;
            if(count == 1) {
                System.out.print(set[i]+"-");
                if(a1 < set[i]){
                    a1 = set[i] - a1;
                }else{
                    a1 +=set[i];
                }
            }else if(count == 2) {
                System.out.print(set[i]+"-");
                if(a2 < set[i]){
                    a2 = set[i] - a2;
                }else{
                    a2 +=set[i];
                }
            }else  if(count == 3){
                System.out.print(set[i]+" ");
                if(a3 < set[i]){
                    a3 = set[i] - a3;
                }else{
                    a3 +=set[i];
                }
                count = 0;
                    }
                }
        System.out.printf("%d-%d-%d ",a1,a2,a3);

        a1 = a1;
        a2 = a2;
        a3 = a3;
        int j;
        for(j = set.length/2; j < set.length; j++) {
            count++;
            if(count == 1) {
                if(a1 < set[j]){
                    a1 = set[j] +a1;
                }else{
                    a1 -=set[j];
                }
                System.out.print(a1+"-");
            }else if(count == 2) {
                if(a2 < set[j]){
                    a2 = set[j] + a2;
                }else{
                    a2 -=set[j];
                }
                System.out.print(a2+"-");
            }else  if(count == 3){
                if(a3 < set[j]){
                    a3 = set[j] + a3;
                }else{
                    a3 -=set[j];
                }
                System.out.print(a3+" ");
                count = 0;
            }
        }
            }



    private static void ChallengeNine(){}






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
