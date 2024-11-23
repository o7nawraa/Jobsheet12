import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalRespons, sum; //jawaban soal nomor 4
        double average, averageTotal=0, questionTotal=0;
        double[] averageQuestion = new double[6];
        int[][] survey = new int [10][6];
    
    for(int i = 0; i<survey.length; i++) {
        sum=0;
        for (int j = 0; j<survey[i].length; j++) {
            System.out.print("Orang ke " + (i+1) + " Soal ke " + (j+1) + " (jawaban 1-5) = ");
            survey[i][j] = sc.nextInt();

            sum+=survey[i][j];
        }
        average = sum/survey[i].length;
        System.out.println("The average value of respondent " + (i+1) + " is " + average);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        averageTotal+=average;
    }

    for (int j = 0; j<survey[j].length; j++) { 
        sum=0;
        for (int i = 0; i<survey.length; i++) {
            sum+=survey[i][j];
        }
        averageQuestion[j] = (double) sum/survey.length;
        System.out.print("\n Average values for question " + (j+1) + " = " + averageQuestion[j]);
        questionTotal+=averageQuestion[j];
    }
    totalRespons = (averageTotal+questionTotal)/survey.length;
    System.out.println("\n The overall average: " + totalRespons);
    }
}
