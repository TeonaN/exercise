package exercise;

/*
განსაზღვრეთ კლასი A: მთელი ტიპის m[15] მასივით; 4 მეთოდით; მეთოდი 1-ის
იმპლემენტაციისთვის გამოიყენეთ ინტერფეისი.

მეთოდი 1: ანიჭებს m მასივის ელემენტებს შემთხვევით მნიშვნელობებს [a; b] შუალე-
დუდან, a და b-ს მნიშვნელობების შეტანა ხდება კლავიატურიდან;

მეთოდი 2: აბრუნებს მასივის იმ ელემენტების მნიშვნელობათა ჯამს, რომლის მნი-
შვნელობა თავის ინდექსზე ნაკლებია;

მეთოდი 3: აბრუნებს მასივის იმ ელემენტების ინდექსების ნამრავლს, რომლის მნი-
შვნელობა თავის ინდექსზე მეტია;

მეთოდი 4: ბეჭდავს მასივში არსებულ ლუწ რიცხვებს.
*/
import java.util.Scanner;
import java.util.Random;

class A {
    public int[] m = new int[15];

    public void method1(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        Random rand = new Random();
        int c = 0;
        if (a>b){
            c = a;
            a = b;
            b = c;

        }
        for (int i = 0; i < m.length; i++){
            m[i] = rand.nextInt(b - a + 1) + a;
            System.out.println(m[i]);
        }

    }

    public int method2(){
        int sum = 0;
        for(int i = 0;  i < m.length; i++){
            if (m[i] < i){
                sum += m[i];
            }
        }
        return sum;
    }

    public int method3(){
        int mult = 1;
        for(int i = 1;  i < m.length; i++){
            if (m[i] > i){
                mult *= i;
            }
        }
        return mult;
    }

    public void method4(){
        System.out.println("Even ");
        for(int i = 0; i < m.length; i++){
            if(m[i] % 2 == 0){
                System.out.println(m[i]);
            }
        }
    }


}
