import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        CircleArray cir=new CircleArray(3);
        char key=' ';
        Scanner scanner=new Scanner(System.in);
        boolean loop = true;
        while (loop){
            System.out.println("s显示队列");
            System.out.println("e退出");
            System.out.println("a add");
            System.out.println("g get");
            key=scanner.next().charAt(0);
            switch (key){
            case 's':
                cir.show();
                break;
            case 'a':
                System.out.println("input:");
                int value=scanner.nextInt();
                cir.addQueue(value);
                break;
            case 'g':
                try {
                    int res= cir.getQueue();
                    System.out.println("取得"+res);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
class CircleArray{
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;
    public CircleArray(int maxSize){
        this.arr=new int[maxSize];
        this.maxSize=maxSize;
        this.front=0;
        this.rear=0;
    }
    public boolean isFull(){
        return (rear+1) % maxSize==front;
    }
    public boolean isEmpty(){
        return rear==front;
    }
    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列满");
            return;
        }
        arr[rear]=n;
        rear=(rear+1) % maxSize;
    }
    public int getQueue(){
        if (isFull()){
            throw new RuntimeException("队列空");
        }
        int value=arr[front];
        front=(front+1)%maxSize;
        return value;
    }
    public void show(){
        if (isFull()){
            System.out.println("队列满");
            return;
        }
        for (int i = front; i < front+((rear+maxSize-front) % maxSize); i++) {
            System.out.printf("arr[%d]=%d\n",i%maxSize,arr[i%maxSize]);
        }
    }
}
