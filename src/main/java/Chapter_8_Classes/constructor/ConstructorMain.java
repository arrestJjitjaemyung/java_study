package Chapter_8_Classes.constructor;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor0 = new Constructor();

        Constructor constructor1 = new Constructor(38);

        constructor1.name = "안근수";

        System.out.println(constructor1.name);
        System.out.println(constructor1.num);

        Constructor constructor2 = new Constructor("안근순");

        constructor2.num = 20;

        System.out.println(constructor2.name);
        System.out.println(constructor2.num);

        constructor0.name = "비밀";
        constructor0.num = 10;
        System.out.println(constructor0.name);
        System.out.println(constructor0.num);

        Constructor constructor3 = new Constructor("류유민", 3);
        System.out.println(constructor3.name);
        System.out.println(constructor3.num);

        Constructor constructor4 = new Constructor(30, "비밀");
        System.out.println(constructor4.name + " : " + constructor4.num);

//        constructor0.showInfo();
//        constructor1.showInfo();
//        constructor2.showInfo();
//        constructor3.showInfo();
//        constructor4.showInfo();

        System.out.println(constructor0.showInfo2());
        System.out.println(constructor1.showInfo2());
        System.out.println(constructor2.showInfo2());
        System.out.println(constructor3.showInfo2());
        System.out.println(constructor4.showInfo2());
    }
}
