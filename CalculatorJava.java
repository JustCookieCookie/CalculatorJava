//Java Program
//File: CalculatorJava

import java.util.Scanner;

class CalculatorJava {
    public static void main(String[] args) {

        //Водный текст
        System.out.println("Это калькулятор!");
        System.out.println("Правила:");
        System.out.println("1. Просто введи нужную строку без знака =");
        System.out.println("2. Между знаками вводи пробел");
        System.out.println("---------------------");

        //Стартовые данные
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        double sum = 0;
        String sign;

        do { 
            
            //Получаем строку и преобразуем ее в массив
            String calcualtorLine = scanner.nextLine();
            String[] answer = calcualtorLine.split(" ");

            //Миниум 3 символа
            if (answer.length < 3) {
                System.out.println("Произошла ошибка!");
                System.out.println("---------------------");
                continue;
            }

            //Обновляем данные
            index = 0;
            sum = 0;

            //Вычисления
            while (index < answer.length) {

                if (sum == 0 && index == 0) {
                    String firstNumber = answer[index];
                    double number1 = Double.parseDouble(firstNumber);

                    index++;
                    sign = answer[index];

                    index++;
                    String secondNumber = answer[index];
                    double number2 = Double.parseDouble(secondNumber);

                    if (sign.equals("+")) {
                        sum = number1 + number2;
                    } else if (sign.equals("-")) {
                        sum = number1 - number2;
                    } else if (sign.equals("*")) {
                        sum = number1 * number2;
                    } else if (sign.equals("/")) {
                        sum = number1 / number2;
                    }

                } else if (index <= answer.length - 2) {

                    index++;
                    sign = answer[index];

                    index++;
                    String numberNumber = answer[index];
                    double numberLast = Double.parseDouble(numberNumber);

                    if (sign.equals("+")) {
                        sum = sum + numberLast;
                    } else if (sign.equals("-")) {
                        sum = sum - numberLast;
                    } else if (sign.equals("*")) {
                        sum = sum * numberLast;
                    } else if (sign.equals("/")) {
                        sum = sum / numberLast;
                    }
                } else {
                    break;
                }

            }

            //Выводим ответ на экран
            System.out.println("Ответ: " + sum);
            System.out.println("---------------------");

        } while (true);
    }
}