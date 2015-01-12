package quiz;
import java.util.Scanner;
public class Quiz {

   
    public static void main(String[] args) {
        
        int score = 0;
        //this is a variable that shows the value of score in the begining.
        String start = "What's the capital of";
        // this is the part with the start of the question.
        String[] answers = {"Bangkok","Seoul","Paris","Ottawa","Lima","Tokyo","Dublin","Moscow","Freetown","Hanoi"};
        //this is the array for the answers.
        String[] questions = { start + " Thailand?",start + " South Korea?",start + " France?",
            start + " Canada?",start + " Peru?",start + " Japan?", start + " Ireland?",
            start + " Russia?",start + " Sierra Leone?",start + " Vietnam?"};
        //this is the array for the questions.
        for(int i =0;i<10;i++){
        //this makes the next question come forward after you have answerd the previous question.
            Scanner quiz = new Scanner(System.in);
            System.out.println(questions[i]);
            String answer = quiz.nextLine();
            //asks the player the question.
            if (answer.equalsIgnoreCase(answers[i])){
                score++;
                 System.out.println("correct");
            }else{
                System.out.println("false, correct answer: " + answers[i]);
            }  //tells the player if the answerd correct or false.
        }
       System.out.println("score: " + score);
       //prints out the score that the player have got.
       
    }
    
}
