// import java.util.*;
// public class op{
//     public static void main(String args[])
//     {
//         Scanner sc= new Scanner(System.in);
//         int n= sc.nextInt();
//         sc.close();
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=n;j++)
//             {
//                 if(i==1 || i==n || j==1 || j==n)
//                 {
//                     System.out.print("* ");
//                 }
//                 else
//                 {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }




// import java.util.*;
// public class op{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
        
//         if(n<2){
//             System.out.println("Second Largest element not found");
//             return;
//         }
//         int []arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         sc.close();
//         int max=arr[0];
//         int max2=arr[0];

//         for(int i=1;i<n;i++){
//             if(arr[i]>max){
//                 max2=max;
//                 max=arr[i];
                
//             }
            
//         }
//         System.out.println("Second Largest: "+max2);
//     }
// }




// import java.util.*;
// public class op{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();

//         int[]arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         sc.close();
//         int pos=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]!=0){
//                 arr[pos]=arr[i];
//                 pos++;
//             }
//         }
//         while(pos<n){
//             arr[pos]=0;
//             pos++;
//         }
//         System.out.println("Modified array:");
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }

//     }
// }




// public class op{
//     public static void main(String[] args) {
//         int[][]matrix=new int[3][3];

//         matrix[0][0]=1;
//         matrix[0][1]=2;
//         matrix[0][2]=3;
//         matrix[1][0]=4;
//         matrix[1][1]=5;
//         matrix[1][2]=6;
//         matrix[2][0]=7;
//         matrix[2][1]=8;
//         matrix[2][2]=9;

//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[i].length;j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }




// public class op
// {
//     public static void main(String[] args) {
        
    
//     {
//         int[][] jaggedArray = new int[3][];
        
//         jaggedArray[0] = new int[] { 1, 2, 3 };
//         jaggedArray[1] = new int[] { 4, 5 };
//         jaggedArray[2] = new int[] { 6, 7, 8, 9 };
        
//         System.out.println("Elements of the Jagged Array:");
//         for (int i = 0; i < jaggedArray.length; i++)
//         {
//             System.out.println("Row " + (i + 1) + ": ");
//             for (int j = 0; j < jaggedArray[i].length; j++)
//             {
//                 System.out.println(jaggedArray[i][j] + " ");
//             }
//           System.out.println();
//         }
//     }
//     }
// }




// import java.util.Scanner;

// public class op{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         int[][] matrix1 = new int[2][2];
//         int[][] matrix2 = new int[2][2];
//         int[][] result = new int[2][2];
        
//         System.out.println("Enter elements for the first 2x2 matrix:");
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 2; j++) {
//                 System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
//                 matrix1[i][j] = scanner.nextInt();
//             }
//         }
        
//         System.out.println("Enter elements for the second 2x2 matrix:");
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 2; j++) {
//                 System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
//                 matrix2[i][j] = scanner.nextInt();
//             }
//         }
        
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 2; j++) {
//                 result[i][j] = 0;
//                 for (int k = 0; k < 2; k++) {
//                     result[i][j] += matrix1[i][k] * matrix2[k][j];
//                 }
//             }
//         }
        
//         System.out.println("Product of the two 2x2 matrices:");
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 2; j++) {
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
        
//         scanner.close();
//     }
// }


// public class op{
//     public static void main(String[] args) {
//         // final int a=1;
//         // a=10;
//         System.out.println(10+10+"hello");
//     }
// }

// import java.util.*;
// public class op{
//     public static void main(String[] args) {
//         // String sc="Hello";
//         StringBuilder sb=new StringBuilder("Hello");
//         sb.append(" World");
//         System.out.println(sb.toString());
        
        
//     }
// }




// public class op{
//     public static void main(String[] args) {
//         // String sc="Hello";
//         StringBuilder sb=new StringBuilder("Hello");
//         sb.insert(5," World");
//         System.out.println(sb.toString());
        
        
//     }
// }



// public class op{
//     public static void main(String[] args) {
//         // String sc="Hello";
//         StringBuilder sb=new StringBuilder("Welcome to the Java World");
//         sb.delete(14,19);
//         System.out.println(sb.toString());
        
        
//     }
// }




// public class op{
//     public static void main(String[] args) {
//         // String sc="Hello";
//         StringBuilder sb=new StringBuilder("Hello aWorld");
//         sb.deleteCharAt(6);
//         System.out.println(sb.toString());
        
        
//     }
// }



// public class op{
//     public static void main(String[] args) {
//         // String sc="Hello";
//         StringBuilder sb=new StringBuilder("Hello");
//         sb.reverse();
//         System.out.println(sb.toString());
        
        
//     }
// }

// import java.util.Scanner;

// public class op{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input the string
//         System.out.print("Enter a string: ");
//         String input = scanner.nextLine();

//         String result = removeDuplicateCharacters(input);

//         System.out.println("String after removing duplicates: " + result);

//         scanner.close();
//     }

//     public static String removeDuplicateCharacters(String str) {
//         StringBuilder unique = new StringBuilder();
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

          
//             if (unique.indexOf(String.valueOf(ch)) == -1) {
//                 unique.append(ch);
//             }
//         }
//         return unique.toString();
//     }
// }


