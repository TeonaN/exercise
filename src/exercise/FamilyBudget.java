package exercise;

/*
განსაზღვრეთ კლასი FamilyBudget: მთელი ტიპის დახური money ცვლადით. ააგეთ მეთოდები

რომლებიც საშუალებას იძლევა money ცვლადში მნიშვნელობის მინიჭების, შეცვლის, მიღე-
ბის.

დაწერეთ მეთოდი, რომელიც დაადგენს FamilyBudget მდგომარეობას money თვისების
მიხედვით. (თუ money მეტია 40 000-ზე მდიდარი, თუ მოთავსებულია 10000-დან 40 000-
მდე საშუალო, წინააღმდეგ შემთხვევაში ღარიბი).
დაწერეთ მეთოდი, რომელიც budget.txt ფაილში შეინახავს მოთხოვნი FamilyBudget-ის
money თვისების მდგომარეობას, ყოველი მისი ცვლილების დროს.
*/
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

class FamilyBudget {
    private int money;
    private int a;

    public void setMoney(int num) {
        this.money = num;
    }

    public int getMoney() {
        return this.money;
    }



    public void method1(){
        if (money >= 40000){
            System.out.println("Wealthy");
        }
        else if (money >= 10000 && money < 40000){
            System.out.println("Middle class");
        }
        else{
            System.out.println("Poor");
        }
    }

    public void method2(){
        try {
            File file = new File("budget.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter writer = new PrintWriter(file);

            writer.println(a);




            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeValue(int change){
        a = this.money += change;
    }

    public void ifThereIsMoney(int someMoney){
        if (this.money > someMoney){
            System.out.println("blaa "+this.money);
        }
    }
}




