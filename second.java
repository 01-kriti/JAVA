// import java.util.*;

// public class second {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n1 = sc.nextInt();
//         // int n2 = sc.nextInt();
//         // System.out.println(n1&n2);
//         // System.out.println(n1|n2); 
//         // System.out.println(n1^n2);
//         if(n1%2==0){
//             System.out.println("Even");
//         }
//         else{
            
//             System.out.println("Odd");

//         }
//         sc.close();
//     }
// }


// import java.util.*;
// public class second{
//     public static void main( String args[]){
//         Scanner sc=new Scanner (System.in);
//         int a=sc.nextInt();
//         switch(a){
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid Input");  
//                 break;
//         }
//         sc.close();
//     }
// }

// import java.util.*;
// public class second{
//     public static void main( String args[]){
//         Scanner sc=new Scanner (System.in);
//         int a=sc.nextInt();
//         for(int i=1;i<=a;i++){
//             System.out.println(i);
//         }
//         sc.close();
//     }
//     }

// import java.util.*;
// public class second{
//     public static void main( String args[]){
//         String cars[]={"Range Rover","Mercedes","Ferrari","Bentley","Porsche","G Wagon","BMW","Lamborghini"};

//         for(String i:cars){
//             System.out.println(i);
//         }
//     }
// }



// public class second{
//     public static void main( String args[]){
//         int i=1;
//       while(i<6){
//         System.out.println(i);
//         i++;
//       }

//     }
// }


// public class second{
//     public static void main( String args[]){
//      int i=1;
//      do{
//         System.out.println(i);
//         i++;
//      }
//      while(i<=5);
    
//     }
// }


// public class second{
//     public static void main( String args[]){
//        for(int i=1;i<10;i++){
//         if(i==5){
//             break;
//         }
//         System.out.println(i);
//        }
//     }
// }


// public class second{
//     public static void main( String args[]){
//        for(int i=1;i<10;i++){
//         if(i==5){
//             continue;
//         }
//         System.out.println(i);
//        }
//     }
// }


// public class second{
//    public static int add(int a,int b){
//     return a+b;
//    }
//    public static void main(String[] args) {
//     int a=4;
//     int b=7;
//     System.out.println(add(a,b));
//    }
// }

// import java.util.Scanner;

// public class second{
//         public static void main(String args[]){
//                 Scanner n=new Scanner(System.in);
//                 int sc=n.nextInt();
//                 n.close();
//                 for(int i=0;i<sc;i++){
//                         for(int j=0;j<i+1;j++){
//                                 System.out.print("* ");
//                         }
//                         System.out.println("");
//                 }
// }}





// import java.util.Scanner;
// public class second{
//         public static void main(String args[]){
//                 Scanner sc=new Scanner(System.in);
//                 int n=sc.nextInt();
//                 sc.close();
//                  int i=0;
//                 while(i<n)
//                 {
//                     int j=0;
//                     while(j<i+1)
//                     {
//                         System.out.print(i+1);
//                         j++;
//                     }
//                     i++;
//                     System.out.print("\n");
//                 }
// }}



import java.util.*;
public class second {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}


// import java.util.*;
// public class second{
//     public static void main(String args[])
//     {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         sc.close();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<i+1;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//         for(int i=n-1;i>=1;i--)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }

// import java.util.*;
// public class second{
//     public static void main(String args[])
//     {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         sc.close();
//         for(int i=0;i<n;i++){
//             for(int j=1;j<=n-i-1;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i+1;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }


// import java.util.*;
// public class second {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.close();
        
//         for (int i = n - 1; i >= 0; i--) {  
//             for (int j = 1; j <= n - i - 1; j++) {
//                 System.out.print(" ");  
//             }
//             for (int j = 1; j <= 2 * i + 1; j++) {
//                 System.out.print("*");  
//             }
//             System.out.print("\n");
//         }
//     }
// }


// import java.util.*;
// public class second {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.close();
//         for(int i=0;i<n;i++){
//                         for(int j=1;j<=n-i-1;j++){
//                             System.out.print(" ");
//                         }
//                         for(int j=1;j<=2*i+1;j++){
//                             System.out.print("*");
//                         }
//                         System.out.print("\n");
//                     }
//         for (int i = n - 2; i >= 0; i--) {  
//             for (int j = 1; j <= n - i - 1; j++) {
//                 System.out.print(" ");  
//             }
//             for (int j = 1; j <= 2 * i + 1; j++) {
//                 System.out.print("*");  
//             }
//             System.out.print("\n");
//         }
//     }
// }

