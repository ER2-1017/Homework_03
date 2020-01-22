import java.util.Scanner;
public class Hw03words {
    public static void main(String[] args){
        String[] words={"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int play=1;
        do{
            int j=(int)Math.round(25*Math.random());
            System.out.println(words[j]);
            System.out.println("Guess a word, it can be fruit or a vegatable");
            int i=0;
            String userAnswer="user";
            while(!userAnswer.equals(words[j])) {
                Scanner scan = (new Scanner(System.in));
                userAnswer = scan.next();
                if (userAnswer.equals(words[j])) {
                    System.out.println("You won!");
                    break;
                } else {
                    System.out.println("You are wrong! The "+(i+1)+"-th letter is "+words[j].charAt(i));
                    i++;
                }
            }
            System.out.println("Play more?");
            Scanner scan1 = (new Scanner(System.in));
            play = scan1.nextInt();

        } while (play==1);

    }
}
