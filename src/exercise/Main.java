package exercise;

class Main {
    public static void main(String[] args) {
        FamilyBudget obj = new FamilyBudget();
        FamilyMember object = new FamilyMember("Eren", "Yeager", 16, "Soilder" );

        obj.setMoney(100);
        obj.getMoney();
        obj.method1();
        obj.changeValue(50000);
        obj.method2();
        System.out.println(obj.getMoney());
        object.data();
        object.requestMoney(10000, obj);
        //A obj = new A();
        //    obj.method1();
        //    System.out.println("Sum " + obj.method2());
        //    System.out.println("Mult " + obj.method3());
        //    obj.method4();

    }
}