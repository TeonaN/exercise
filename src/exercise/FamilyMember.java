package exercise;

/*
განსაზღვრეთ კლასი FamilyMember ოთხი დახურული თვისებით: name, lastName, age, status.

დაწერეთ FamilyMember კონსტრუქტორი, რომელიც უზრუნველყოფს თვისებების ინი-
ციალიზაციას.

დაწერეთ მეთოდი, რომელიც family.txt ფაილში დაამატებს FamilyMember-ის ტიპის
ობიექტის ველების მნიშვნელობას ცალკე ხაზზე.
დაწერეთ მეთოდი, რომელიც FamilyMember ტიპის ობექტს საშუალებას მისცემს მიმართოს
FamilyBudget ტიპის ობიექტს და მოსთხოვოს თანხა, თანხის მიღება განხორციელდება იმ
შემთხვევაში თუ money ველში მოთხოვნილ თანხაზე მეტი თანხაა.

ამოცანაში განსაზღვრეთ სხვადასხვა მეთოდები, კლასები, ინტერფეისები თქვენი შეხე-
დულების მიხედვით.
*/

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

class FamilyMember {
    private String name;
    private String lastName;
    private int age;
    private String status;

    FamilyMember(String name, String lastName,int age,String status){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.status = status;
    }

    public void data(){
        try {
            File file = new File("family.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter writer = new PrintWriter(file);

            writer.println(this.name);
            writer.println(this.lastName);
            writer.println(this.age);
            writer.println(this.status);




            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void requestMoney(int someMoney, FamilyBudget obj){
        obj.ifThereIsMoney(someMoney);
    }
}