package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeMachine {
    private List<Coffee> coffee;

    public CoffeeMachine(List<Coffee> coffee) {
        this.coffee = coffee;
    }

    public void On() {
        System.out.println("Кофемашина готова к работе");


        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Выберите напиток" + coffee.toString());
            int choice;
            try {
                choice = sc.nextInt();
                if (choice > coffee.size()) {
                    System.out.println("Такого номера не существует. Введите корректный номер");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Вы ошиблись с выбором, введите число");
                continue;
            }
            double money;
            do {
                System.out.println("Ваш выбор " + coffee.get(choice).getName() + ", стоимость " + coffee.get(choice).getPrice() + ". Внесите сумму для продолжения");
                money = 0;
                try {
                    sc = new Scanner(System.in);
                    money = sc.nextDouble();
                } catch (Exception e) {
                    System.out.println("Вы ошиблись, введите число");
                    continue;
                }
            } while (money == 0);

            while (true) {
                if (money < coffee.get(choice).getPrice()) {
                    while (money != coffee.get(choice).getPrice()) {
                        System.out.println("У вас недостаточно средств. Попробуйте еще раз");
                        try {
                            money = sc.nextDouble();
                        } catch (Exception e) {
                            System.out.println("Вы ошиблись, введите число");
                            continue;
                        }
                    }
                } else if (money > coffee.get(choice).getPrice()) {
                    System.out.println("Ваш напиток готовится, подождите");
                    getDrink();
                    System.out.println("Ваша сдача равна " + (money - coffee.get(choice).getPrice()) + ". Заберите деньги");
                    break;
                } else {
                    System.out.println("Ваш напиток готовится, подождите");
                    getDrink();
                    break;
                }

            }

            int result;
            System.out.println("Желаете продолжить? 1 - Да, 2 - Нет");
            try {
                result = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Вы ошиблись, будет совершен выход");
                result = 2;
            }
            if (result == 1) {
                continue;
            } else {
                break;
            }

        }

    }


    public void Off() {
        System.out.println("Кофемашина выключена");


    }

    public void getDrink() {
        System.out.println("Ваш напиток готов, приятного аппетита!");


    }


}
