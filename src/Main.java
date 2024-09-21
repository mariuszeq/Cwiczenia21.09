import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //    ln = endl;
        System.out.println("Cwiczenia");
        System.out.println("1 - pomnoz");
        System.out.println("2 - dodaj");
        System.out.println("3 - podziel");
        System.out.println("4 - odejmij");

        Scanner scanner = new Scanner(System.in);

        int kalkulator = scanner.nextInt();
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();

        if(kalkulator == 1){
        float x = a * b;
        System.out.println(x);
    } else if (kalkulator == 2) {
        float x = a + b;
        System.out.println(x);
    } else if (kalkulator == 3) {
        float x = a / b;
        System.out.println(x);
    } else if (kalkulator == 4) {
        float x = a - b;
        System.out.println(x);
    } else {
        System.out.println("Nie ta liczba");
    }


        int wylosowana = (int)(Math.random()*100+1);

        int wpisanaliczba = scanner.nextInt();
        if( wylosowana == wpisanaliczba ) {
            System.out.println("gratulacje trafiles");
        }else {
            System.out.println("nie trafiles");
        }
        System.out.println("wylosowana liczba wynosi " + wylosowana);



        String wyrazeniewarunkowe = wpisanaliczba == wylosowana ?"dobrze":"zle";
        System.out.println(wyrazeniewarunkowe);



        int roznica = wylosowana>wpisanaliczba ? wylosowana - wpisanaliczba:wpisanaliczba - wylosowana;
        roznica = roznica/10;
        switch (roznica) {
            case 0: {
                System.out.println("bardzo blisko");
                break;
            }
            case 1: {
                System.out.println("dosc blisko");
                break;
            }
            case 2: {
                System.out.println("niedaleko");
                break;
            }
            case 3: {
                System.out.println("daleko");
                break;
            }
            default: {
                System.out.println("bardzo daleko");
                break;
            }
        }

        System.out.println(
                switch (roznica){
                    case 0 -> "Brawo";
                    case 1 -> "Bardzo blisko";
                    case 2 -> "Dość blisko";
                    default -> "Słabo";
                }
        );


        System.out.println("1 - losuj 10 razy");
        System.out.println("2 - losuj do skutku");
        int wybor = scanner.nextInt();
        if (wybor == 1) {


            for (int i = 0; i < 10; i++) {
                wpisanaliczba = scanner.nextInt();
                if (wpisanaliczba < wylosowana) {
                    System.out.println("liczba jest wieksza");
                } else if (wpisanaliczba > wylosowana) {
                    System.out.println("liczba jest mniejsza");
                } else {
                    System.out.println("Gratulacje trafiles liczbe");
                    break;
                }

            }

        }else {
            while (wpisanaliczba != wylosowana){
                wpisanaliczba = scanner.nextInt();
                if(wpisanaliczba < wylosowana){
                    System.out.println("liczba jest wieksza");
                }else if(wpisanaliczba > wylosowana){
                    System.out.println("liczba jest mniejsza");
                }else {
                    System.out.println("Gratulacje");
                }
            }


        }


    }
}