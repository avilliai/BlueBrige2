public class doubleLink {
    public static void main(String[] args) {

    }
}
class HeroD {
    public int number;
    public String name;
    HeroD next;
    HeroD pre;
    public HeroD(int no,String name){
        this.name=name;
        this.number=no;
        this.next=null;

    }

}
class DoubleLinkedManager{
    private HeroD h = new HeroD(0," ");
    public void show(){
        HeroD temp=h.next;
        while (temp!=null){
            System.out.println("查找到数据"+temp.name+temp.number);
            temp=temp.next;
        }
        System.out.println("over");
    }
    //添加一个节点到最后
    public void add(HeroD heroD){
        HeroD temp=h;
        while (temp.next!=null){
            temp=temp.next.next;
        }
        temp.next=heroD;
        heroD.pre=temp;
    }
}