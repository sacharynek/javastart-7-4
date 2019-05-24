import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int liczba = 0;
        while(flag){
            System.out.println("Podaj liczbę");
            liczba = sc.nextInt();

            if(liczba <= 200 && liczba >=100 && liczba % 3 == 0){
                System.out.println("Liczba jest ok");
                flag = false;
            }else{
                if(liczba > 200){
                    System.out.println("Liczba jest za duża");
                }

                if(liczba <100){
                    System.out.println("Liczba jest za mała");
                }

                if(liczba % 3 != 0){
                    System.out.println("Liczba nie jest podzielna przez 3");
                }
            }

        }
    }
}
