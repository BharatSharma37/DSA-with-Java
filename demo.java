import java.util.*;
public class demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter a :");
        // int a=sc.nextInt();
        // System.out.print("Enter b :");
        // int b=sc.nextInt();
        // int sum=a+b;
        // System.out.println(sum);
        


        // int x=23;
        // int y=25;
        // int sum=x+y;
        // System.out.println();
        // System.out.print("the sum of x and y is ");
        // System.out.println(sum);
        // if(x>20){
        //     System.out.println(true);
        //     System.out.println("the no is bigger than 20");
        // }
        // System.out.print("enter your income : ");
        // float income=sc.nextFloat();
        // if(income<500000){
        //     System.out.println("tax is 0");
        // }else if (income>500000 && income <1000000){
        //     System.out.println("tax is 10%");

        // }else{
        //     System.out.println("tax is 30%");
        // }



        // System.out.println("this program is to find whether the year is leap or not");
        // System.out.println("\nenter the Year");
        // int year=sc.nextInt();
        // if(year%4!=0){
        //     System.out.println("not leap");
          
        // }else if(year%100==0){
        //     if(year%400==0){
        //         System.out.println("leap year");
        //     }else{
        //         System.out.println("not leap");
        //     }
        // }else if(year%4==0){
        //     System.out.println("leap year");
        // }


        // int x;
        // System.out.println("entereing numbers untill found multiple of 10");
        // while (true) {
        //     x=sc.nextInt();
        //     if (x%10==0) {
        //         continue;
                
        //     }
        //     System.out.println("your no is "+x);
        // }


        // int factor=0;
        // System.out.println("checking whether the no is prime or not");
        
        //  int number=sc.nextInt();
        //  for (int i = 1; i <=number; i++) {
        //     if (number%i==0) {
        //         factor++;
        //     }
        //  }
        //  if (factor==2) {
        //     System.out.println("the no is prime");
        //  }else{
        //     System.out.println("the no is not prime");
        //  }

         //more optimised method to find whethere the no is prime or not
        //     int num=sc.nextInt();
        //     boolean prime=true;
        //     if (num <= 1) {
        // prime = false;
        //     }
        //     for (int i = 2; i <= Math.sqrt(num); i++) {
        //         if(num%i==0){
                    
        //             prime=false;
        //             break;
        //         }
                
        //     }
        //     if(prime){
        //         System.out.println("the no is prime");
        //     }else{
        //         System.out.println("the no is not prime");
        //     }


        //star printing patterns
        // *
        // **
        // ***
        // **** 
    int lines=sc.nextInt();
    System.out.println("right angle triangle");
    for (int i = 1; i <= lines; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }



    // ****
    // ***
    // **
    // *
System.out.println("inverted triangles");
    for (int i = 1; i <= lines; i++) {
        for (int j = i; j <= lines; j++) {
            System.out.print("*");
        }
        System.out.println();
    }


    // 1
    // 12
    // 123
    // 1234
    // 12345

    System.out.println("number pattern");
    for (int i = 1; i <= lines; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }


    System.out.println("character pattern");
    // A
    // AB
    // ABC
    // ABCD

    for (int i = 1; i <= lines; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print((char)(64+j));
        }
        System.out.println();
    }



    System.out.println("character pattern 2");
    // A
    // BC
    // DEF
    // GHIJ 
    int count=0;
    for (int i = 1; i <= lines; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print((char)(65+count++));
        }
        System.out.println();
    }


    System.out.println("HOLLOW RECTANGLE pattern");
    // ******
    // *    *
    // *    *
    // ******
    for (int i = 1; i <= lines; i++) {
        for (int j = 1; j <= lines; j++) {
            if (i==1||j==1||j==lines||i==lines) {
                 System.out.print("*");
            }else{
                System.out.print(" ");
            }
           
            
        }
        System.out.println();
    }

    System.out.println("INVERTED & ROTATED HALF-PYRAMID ");
    /*
         *
        **
       ***
      ****
    */
    for (int i = 1; i <= lines; i++) {
        for (int j = i; j <= lines; j++) {
          System.out.print(" ");  
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
        
    }

    System.out.println("INVERTED HALF-PYRAMID with Numbers pattern");
    /*
    12345
    1234
    123
    12
    1
    */
    for (int i = 1; i <= lines; i++) {
        count=1;
        for (int j = i; j <= lines; j++) {
            
            System.out.print(count++);
        }
        System.out.println();
    }

    System.out.println("0-1 Triangle pattern");
    /*
    1
    01
    101
    0101
    10101
    
    */
   int x=0;
   for (int i = 1; i <= lines; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(x);
        x=1-x;
    }
    System.out.println();
   }



   System.out.println("BUTTERFLY pattern");
   /*

   *      *
   **    **
   ***  ***
   ********
   ********
   ***  ***
   **    **
   *      *
   
   */

   for (int i = 1; i <= lines; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");   
    }
    for (int j = 1; j < lines-(i*2); j++) {
          System.out.print(" ");  
        }
    for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
    System.out.println();
   }
//now for the lower half
for (int i = 1; i <= lines; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");   
    }
    for (int j = 1; j < lines-(i*2); j++) {//currently wrong just pasted
          System.out.print(" ");  
        }
    for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
    System.out.println();
   }





//pyrimid patterns
System.out.println("Pyramid Pattern");
for (int i = 1; i <=lines; i++) {//this is for number of lines
    for (int j = i; j <=lines; j++) {//for spaces
        System.out.print(" ");
    }    
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}


    }
}
