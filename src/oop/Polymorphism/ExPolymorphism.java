package oop.Polymorphism;

public class ExPolymorphism {
    public static void main(String[] args) {
        Whale whale1 = new Whale();
        whale1.birth();
        whale1.swimming();
        Mammal whale2 = new Whale();
        whale2.birth(); // 이건 가능
//        whale2.swimming(); // 이건 불가능, 업캐스팅되어 자식 클래스의 메소드에는 접근 불가

//        Whale mammal = new Mammal(); // 이렇게 바로 다운캐스팅은 안됨
        Whale mammal = (Whale) whale2; // 업캐스팅된 것을 다시 나 자신으로 되돌릴 때 다운캐스팅 가능

        Mammal[] mammals = {new Whale(), new Whale(), new Squirrel()}; // 여러개의 데이터타입을 하나에 담을 수 있게 업캐스팅

        Whale testWhale = (Whale)mammals[0];
        testWhale.swimming();
    }
}

class Mammal {
    public void birth() {
        System.out.println("출산한다.");
    }
}

class Whale extends Mammal {
    public void swimming() {
        System.out.println("수영한다.");
    }
}

class Squirrel extends Mammal {
    public void flying() {
        System.out.println("다람쥐 날다.");
    }
}