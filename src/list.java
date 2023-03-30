public class list {


    public static void main(String[] args) {
        Hero hero=new Hero(1,"a");
        Hero hero1=new Hero(2,"b");
        Hero hero3=new Hero(4,"d");
        Hero hero2=new Hero(3,"c");

        HeroManager hm=new HeroManager();
        hm.add(hero);
        hm.add(hero1);
        hm.add(hero2);
        hm.add(hero3);
        hm.show();
    }



}
class Hero {
    public int number;
    public String name;
    Hero next;
    Hero header=null;
    public Hero(int no,String name){
        this.name=name;
        this.number=no;
        this.next=null;

    }

}
class HeroManager{
    private Hero head =new Hero(0,null);
    public void add(Hero h){
        Hero temp=head;
        while (true){
            if (temp.next==null){
                break;
            }else {
                temp=temp.next;
            }
        }
        temp.next=h;
    }
    public void show(){
        Hero temp=head.next;
        while (temp!=null){
            System.out.println("查找到数据"+temp.name+temp.number);
            temp=temp.next;
        }
        System.out.println("over");
    }
    public void show1(){
        Hero temp=head.next;
        while (temp!=null){
            System.out.println("查找到数据"+temp.name+temp.number);
            temp=temp.next;
        }
        System.out.println("over");
    }
    public void insert(Hero hero){
        Hero temp=head;
        boolean flag=false;
        while (true){
            if (temp.next==null){
                break;
            }
            if (temp.next.number>hero.number){
                break;
            }else if(temp.next.number==hero.number){
                System.out.println("编号已存在");
                flag = true;
                break;
            }
            temp=temp.next;
        }
        if (!flag){
            hero.next=temp.next;
            temp.next=hero;
        }
    }
}
