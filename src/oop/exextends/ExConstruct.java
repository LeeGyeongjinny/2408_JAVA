package oop.exextends;

public class ExConstruct {
    public static void main(String[] args) {
        Whale2 whale2 = new Whale2();
        whale2.print();
    }
}

class Animal {
//    public Animal() {} // 디폴트 생성자가 없으면 에러나니까 만들어준다
    public Animal(int a) {
        // 상속받는 것이 없어서 super() 없음
        System.out.println("Animal");
    } // int a 가 들어가서 디폴트 생성자가 없어짐
}

class Mammal2 extends Animal {
    protected String name = "Mammal";

    public Mammal2() {
        // super(); 가 생략되어있다.
        super(1); // 해당하는 부모의 생성자를 직접 호출한다
        System.out.println("Mammal2");
    }
}

class Whale2 extends Mammal2 {
    protected String name = "Whale2";

    public Whale2() {
        // super(); 가 생략되어있다.
        System.out.println("Whale2");
    }

    public void print(){
        String name = "print";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}