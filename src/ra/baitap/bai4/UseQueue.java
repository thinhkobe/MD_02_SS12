package ra.baitap.bai4;

import java.util.*;

public class UseQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập đoạn text cần kiểm tra");
        String text=sc.nextLine().trim().toLowerCase();
        Queue<Character> queueChar= new LinkedList<>();
        Stack<Character> stackChar=new Stack<>();
        char[] strings=text.toCharArray();
        for (int i = 0; i < strings.length; i++) {
            queueChar.offer(strings[i]);
            stackChar.push(strings[i]);
        }
        boolean check=true;
        for (int i = 0; i < strings.length; i++) {
            if (!queueChar.remove().equals(stackChar.pop())){
               check=false;
                break;
            }
        }
        if (check){
            System.out.println("là chuỗi Palindrome");
        }else{
            System.out.println(" không phải là chuỗi Palindrome");

        }


    }
}
