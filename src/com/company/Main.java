package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Здравствуйте, как вас зовут?");
        Scanner word = new Scanner(System.in);
        String name = word.nextLine();
        System.out.println("Сколько вам лет?");
        int age = word.nextInt();
        System.out.println("Какая температура на улице?");
        int temperature = word.nextInt();
        if (temperature > 30 || temperature < -20 && age <= 20 || age > 45 ) {
            System.out.println(name + " Вы не можете выйти на прогулку");
        }
        else if (temperature <= 0 || temperature > 28 && age < 20 ) {
            System.out.println(name + " Вы не можете выйти на прогулку");
        }
        else if (temperature < -10 || temperature > 25 && age >= 45) {
            System.out.println(name + " Вы не можете выйти на прогулку");
        } else {
            System.out.println(name + " Вы можете пойти в гости");
        }

    }
}
