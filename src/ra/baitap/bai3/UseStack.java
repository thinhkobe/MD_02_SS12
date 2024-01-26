package ra.baitap.bai3;

import java.util.Scanner;
import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack<String> text= new Stack<>();
        System.out.println("số lượng từ cần nhập");
        int number= Integer.parseInt(sc.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println("nhập từ thứ "+(i+1));
            text.push(sc.nextLine());
        }
        System.out.println("mảng đã nhập"+text);
        for (int i = 0; i < number; i++) {
            System.out.print( text.pop()+" ");
        }

    }
}
