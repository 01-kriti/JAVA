// import java.util.StringTokenizer;

// public class basics {
//     public static void main(String[] args) {
//         StringTokenizer st=new StringTokenizer("This is stringTokenizer");
//         if(st.hasMoreTokens()){
//             System.out.println(st.nextToken());
//         }
//         else{
//             System.out.println("not available");
//         }
//         System.out.println(st.hasMoreTokens());
//         System.out.println(st.nextToken());
//         System.out.println(st.nextToken());

//         System.out.println(st.countTokens());
//         int i=st.countTokens();
//         for( ;i>0;i--){
//             System.out.println(st.nextToken());
//         }
//         StringTokenizer st=new StringTokenizer("apple,orange,banana,grape",",");
//         while(st.hasMoreTokens()){
//             System.out.println(st.nextToken());
//         }

//     }
// }


// import java.util.*;
// public class basics{
//     public static void main(String[] args) {
//         StringTokenizer st=new StringTokenizer("apple,banana|red,,black");
//         System.out.println(st.nextToken());


//     }

// }



// import java.util.StringTokenizer;

// public class basics {
//     public static void main(String[] args) {
//         String mixedString = "abc123def45gh6ij78";
        
//         StringTokenizer st = new StringTokenizer(mixedString, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        
//         System.out.println("Extracted Numbers:");
//         while (st.hasMoreTokens()) {
//             System.out.println(st.nextToken());
//         }
//     }
// }





// import java.util.*;

// public class basics {
//     public static void main(String[] args) {
//         String text = "john.doe@example.com; alice_smith@gmail.com, bob123@company.net";

//         StringTokenizer st = new StringTokenizer(text, " ,;");
//         ArrayList<String> emails = new ArrayList<>();

//         while (st.hasMoreTokens()) {
//             String token = st.nextToken();
//             if (token.contains("@")) {
//                 emails.add(token);
//             }
//         }

//         System.out.println("Extracted Emails:");
//         for (String email : emails) {
//             System.out.println(email);
//         }
//     }
// }



// import java.util.StringTokenizer;

// public class basics {
//     public static void main(String[] args) {
//         String numbers = "12, 45; 78 90, 33";

//         StringTokenizer st = new StringTokenizer(numbers, " ,;");
//         int sum = 0;

//         while (st.hasMoreTokens()) {
//             sum += Integer.parseInt(st.nextToken());
//         }

//         System.out.println("Sum of numbers: " + sum);
//     }
// }



// static boolean oddPairExists(String str) {
//     for (int i = 0; i < str.length() - 1; i++) {
//         if (Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i + 1))) {
//             int num1 = Character.getNumericValue(str.charAt(i));
//             int num2 = Character.getNumericValue(str.charAt(i + 1));

//             if (num1 % 2 != 0 && num2 % 2 != 0) {
//                 return true; // Found adjacent odd digits
//             }

//             // Check for multi-digit odd numbers
//             int j = i - 1;
//             while (j >= 0 && Character.isDigit(str.charAt(j))) {
//                 if (Character.getNumericValue(str.charAt(j)) % 2 != 0) {
//                     return true;
//                 }
//                 j--;
//             }
//         }
//     }
//     return false; // No adjacent odd pairs found
// }


