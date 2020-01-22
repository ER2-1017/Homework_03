import java.util.Scanner;
public class Hw03 {
    public static void main(String[] args){
        int play=1;
        do {
            int guess=(int) Math.round(9*Math.random());
            System.out.println("Угадайте c трёх раз число от 0 до 9.");
            int tryCount=2;
            while (tryCount >=0) {
                Scanner scan = (new Scanner(System.in));
                int userAnswer = scan.nextInt();
                if (userAnswer == guess) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (userAnswer > guess) {
                    System.out.println("Вы ввели слишком большое число! Осталось попыток: " + (tryCount));
                    tryCount--;
                } else if (tryCount==0 && userAnswer!=guess){
                    System.out.println("Вы проиграли!");
                    break;
                } else {
                    System.out.println("Вы ввели слишком маленькое число! Осталось попыток: " + (tryCount));
                    tryCount--;
                }
            }

            System.out.println("Сыграть ещё? 1 - да, 0 - нет.");
            Scanner scan = (new Scanner(System.in));
            play = scan.nextInt();
        } while (play==1);
    }
}
