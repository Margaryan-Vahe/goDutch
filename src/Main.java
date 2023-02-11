/*
Дано следующее условие: компания друзей посещает ресторан. Они решили разделить счет поровну
и добавить 10 процентов от общей суммы счета в качестве чаевых. Далее друзья равными частями
покрывают общую сумму платежа.
Перейдите в класс GoDutch и напишите программу, которая считывает общую сумму счета и
количество друзей, а затем выводит размер части оплаты.

Рассмотрим некоторые детали:
Программа должна читать данные из System.in
Общая сумма счета не может быть отрицательной. Если введенное значение отрицательное,
программа останавливается и печатает: Bill total amount cannot be negative
Количество друзей не может быть отрицательным или нулевым. Если такое происходит, то
программа останавливается и выводит: Number of friends cannot be negative or zero
Общая сумма счета, количество друзей и часть к оплате являются целыми числами.
*/

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total amount: ");
        int totalAmount = scanner.nextInt();
        System.out.println("Enter number of friends: ");
        int numberOfFriends = scanner.nextInt();
        if (totalAmount < 0) System.out.println("Bill total amount cannot be negative\n");
        if (numberOfFriends <= 0) System.out.println("Number of friends cannot be negative or zero");
        int totalInvoiceAmount = totalAmount / numberOfFriends;
        totalInvoiceAmount = (int) (totalInvoiceAmount + (totalInvoiceAmount * 0.1));
        System.out.println(totalInvoiceAmount);
    }
}