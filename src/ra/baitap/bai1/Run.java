package ra.baitap.bai1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Run {
    static Queue<String> list=new LinkedList<>();
     static    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        while (true){
            System.out.println("------menu-----");
            System.out.println("1.thêm vào mảng" +
                    "2.in các phần tử trong mảng " +
                    "3.thoát");
            System.out.println("nhập lựa chọn");
            int choice= Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:

                    save();
                    break;
                case 2:
                    print();
                    break;
                case 3:
                    break;

                default:
                    System.err.println("nhập sai lựa chọn");
            }
        }
    }
    private static void save(){
        System.out.println("nhập chuỗi cần thêm");
        String s=sc.nextLine();
        list.offer(s);
    }

    private static  void  print(){
        for (String s : list) {
            System.out.println(s);
        }
    }

}
