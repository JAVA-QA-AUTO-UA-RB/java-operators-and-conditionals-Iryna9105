import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello brave hero!!");
        System.out.println("You have found yourself in a magical forest and many interesting adventures await you!");
        System.out.println("I wish you success and a safe journey!");
        Scanner sc = new Scanner(System.in);

        int health = 100;
        int luck = 50;

        System.out.println("Event1 :Crossroads");
        System.out.println("You were walking along a magical path and came across a crossroads: 1 - Go left, 2 - Go right. Please choose a direction.");

        int crossroads = sc.nextInt();
        if (crossroads == 1) {
            System.out.println("You chose to go left and lost 20 health points.");
            health -= 20;
            System.out.println("Your health:  " + health);
        }
        else if (crossroads == 2) {
            System.out.println("You chose to go right! Congratulations! You found the treasure and received 30 luck points!");
            luck += 30;
            System.out.println("Your luck: " + luck);
        } else {
            System.out.println("You got confused and lost 10 health points.");
            health -= 10;
            System.out.println("Your health:  " + health);
        }

        System.out.println("Event 2:Mysterious well");
        System.out.println("Wow! You've stumbled upon a magic well!");
        System.out.println("You have to make a choice again!");
        System.out.println(" 1 - I will drink water from the well.");
        System.out.println(" 2 - I will ignore the well because I'm not sure about the water quality.");

        int myChoice = sc.nextInt();
        if (myChoice == 1) {
            System.out.println("Congratulations! Magical water gives you 50 health points!");
            health += 50;
            System.out.println("Your health:  " + health);
        } else if (myChoice == 2) {
            System.out.println("Unfortunately, you are tired, so you lose 10 luck points!");
            luck -= 10;
            System.out.println("Your luck: " + luck);
        } else {
            System.out.println("Your points remain unchanged. Continue on your way.");
        }


        }
        // КІНЕЦЬ ПРИКЛАДУ, ВИДАЛІТЬ ПРИКЛАД, ЩОБ В КОДІ БУЛО ТІЛЬКИ ВАШЕ РІШЕННЯ



        // Нижче пишіть ваш код з реалізацією завдання
        // Коли пишете логіку гри - не забувайте періодично запускати програму
        // І переконуватись, що все працює як треба, заодно тестуйте її перебираючи інпути

    }


