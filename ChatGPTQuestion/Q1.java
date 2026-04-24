// package ChatGPTQuestion;
// import java.util.Scanner;


// public class Q1 {

    
//     public static void main(String[] args) {
        
//         int sum = 0;
//         int ave;
//         int maxMarks = 0;
//         int minMarks;
//         int passCount = 0;

//         Scanner sc = new Scanner(System.in);
//         int marks[] = new int[5];
//         char Grade[] = new char[5];

//         for (int i = 0; i < marks.length; i++) {
//             marks[i] = sc.nextInt();
//         }

//         minMarks = marks[0];

//         for (int i = 0; i < marks.length; i++) {
//             System.out.print(marks[i] + "   ");
//         }
//         System.out.println(" ");
//         for (int i = 0; i < marks.length; i++) {
//             sum = marks[i] + sum;
//         }
//         ave = sum/marks.length;

//         System.out.println("The average of 5 student marks" + ave);

        

//         for (int i = 0; i < marks.length; i++) {
//             if (maxMarks < marks[i]) {
//                 maxMarks = marks[i];
//             }
//             if (minMarks > marks[i]) {
//                 minMarks = marks[i];
//             }
//             if(marks[i] >= 40){
//                 passCount++;
//             }
//         }



//         System.out.println( "maxMarks =" + maxMarks + 
//                             "/n  minMarks =" + minMarks + 
//                             "/n Number of Student pass in exam" + passCount);
        


//     }
// }
