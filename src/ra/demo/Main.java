package ra.demo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        //thêm mới push
        stack.push("aa");
        stack.push("bb");
        stack.push("cc");
        //lấy phần tử trên cùng
        System.out.println(stack.pop());//vừa lấy vừa xóa ,ngoại lệ khi rỗng
        System.out.println(stack.peek());//vừa lấy vừa xóa ,ngoại lệ khi rỗng
        int index=stack.search("cc");//kết quả 1
        //Cấu trúc dữ liệu Queue :hàng đợi FIFO
        Queue<String> prioityQueue =new PriorityQueue<>();
        Queue<String> arrayDeque =new ArrayDeque<>();
        //lấy ra phần tử đầu tiên
        System.out.println(arrayDeque.peek());//lấy không xóa
        //Comparator và Comparable
        //Comparator :conpare()
        // Comparable :compareTo()
        //functionalInterface : interface có duy nhất 1 phương thức trừu tượng

    }
}
