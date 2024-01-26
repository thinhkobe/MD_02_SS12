package ra.baitap.QueueFake;

public class MyQueue implements Solution{
    Node front;
    Node rear;

    public MyQueue() {
    }

    public MyQueue(Node front, Node rear) {
        this.front = front;
        this.rear = rear;
    }



    //enQueue là hàm thực hiện chèn 1 phần tử. Trong hàng đợi liên kết vòng , luôn được chèn vào vị trí Rear.
    @Override
    public void enQueue(int data) {
    Node newNode=new Node(data);
    if (rear==null){
        this.front=newNode;
        this.rear=newNode;
    return;
    }
    rear.link=newNode;
    rear=newNode;

    }
//kiem tra hang doi

    @Override
    public void deQueue() {
        if (front==null){
            System.out.println("trong");
            return;
        }
        front=front.link;
    }

    @Override
    public void displayQueue() {
        Node temp=front;
        if (temp==null){
            System.out.println("trong");
            return;
        }
        while (temp !=null){
            System.out.println(temp.data+" ");
            temp=temp.link;
        }
    }
}
