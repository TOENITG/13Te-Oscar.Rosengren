package quiz;
import java.util.Scanner;
public class Quiz {

   
    public static void main(String[] args) {
        int score = 0;
        String start = "What's the capital of";
        String[] answers = {"Bangkok","Seoul","Paris","Ottawa","Lima","Tokyo","Dublin","Moscow","Freetown","Hanoi"};
        String[] questions = { start + " Thailand?",start + " South Korea?",start + " France?",
            start + " Canada?",start + " Peru?",start + " Japan?", start + " Ireland?",
            start + " Russia?",start + " Sierra Leone?",start + " Vietnam?"};
        for(int i =0;i<10;i++){
            Scanner quiz = new Scanner(System.in);
            System.out.println(questions[i]);
            String answer = quiz.nextLine();
            if (answer.equalsIgnoreCase(answers[i])){
                score++;
                 System.out.println("correct");
            }else{
                System.out.println("false");
            }  
        }
       System.out.println("score: " + score);
       
    }
    
}
