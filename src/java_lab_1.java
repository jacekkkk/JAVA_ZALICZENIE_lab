import java.util.Scanner;
public class java_lab_1 {

    public static void main(String[] args) {
//        ćw.1 napisać po kilka przykładów wypisywania tekstu w konsoli,
//        Użyć każdej z opcji
        System.out.println("Java.");
        System.out.println("krowy.");

        System.out.printf("dzisiaj %s zrobimy %d burgery.\n", "sobie", 2 );
        System.out.printf("robimy %s dziś %d naleśniki.\n", "sobie",4 );

        System.out.print("Jedziemy");
        System.out.print(" na rowerach ");
        System.out.print(" na wycieczkę");



        //cw 2

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        int zmienna1;
        zmienna1 = 8;
        int zmienna2 = 16;
        System.out.println("zmienna1 = " + zmienna1);
        System.out.println("zmienna2 = " + zmienna2);

        int a, b = 5, c, d, e= 15;
        int wynik = b + e;
        System.out.println("wynik = " + wynik);

        int f, g =6, i, p = 12;
        int wynik2 = g * p;
        System.out.println("wynik2 = " + wynik2);



        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
         *
         *
         *
         *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */

        //cw1

        int LiczbaA = 4;
        
        int LiczbaB = 12;
        
        int wynik3 = LiczbaA + LiczbaB;
        
        System.out.println("wynik3 =" + wynik3);

        int wynik4 = LiczbaA - LiczbaB;
        System.out.println("wynik4 =" + wynik4);

        int wynik5 = LiczbaA * LiczbaB;
        System.out.println("wynik5 =" + wynik5);

        int wynik6 = LiczbaA / LiczbaB;
        System.out.println("wynik6 =" + wynik6);

        int wynik7 = LiczbaA % LiczbaB;
        System.out.println("wynik7 =" + wynik7);

        //cw2

        double LiczbaX =20.3;
        
        double LiczbaY = 11.1;
        
        double wynik8 = LiczbaX + LiczbaY;
        
        System.out.println("wynik8 =" + wynik8);

        double wynik9 = LiczbaX - LiczbaY;
        System.out.println("wynik9 =" + wynik9);

        double wynik10 = LiczbaX * LiczbaY;
        System.out.println("wynik10 =" + wynik10);

        double wynik11 = LiczbaX / LiczbaY;
        System.out.println("wynik11 =" + wynik11);

        double wynik12 = LiczbaX % LiczbaY;
        System.out.println("wynik12 =" + wynik12);

        //CW 3


        //zad1

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj Imię: ");
        String Imie = scan.next();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = scan.next();

        System.out.print("Podaj wiek: ");
        int wiek = scan.nextInt();

        System.out.print("Podaj numer indeksu: ");
        int nr_indeksu = scan.nextInt();

        System.out.println(" Imię:" + Imie + " Nazwisko: " + nazwisko + " Wiek: " + wiek + " Nr indeksu: " + nr_indeksu +"");

        System.out.printf("Imię: %s Nazwisko: %s Wiek: %d Nr indeksu %d \n", Imie, nazwisko, wiek, nr_indeksu);



        //zad2
        int zmienna_pierwsza = 3;
        
        int zmienna_druga = 2;
        
        int wynik_dodawania = zmienna_pierwsza + zmienna_druga;
        
        int wynik_odejmowania = zmienna_pierwsza - zmienna_druga;
        
        int wynik_mnozenia = zmienna_pierwsza * zmienna_druga;
        
        int wynik_dzielenia = zmienna_pierwsza / zmienna_druga;
        
        int wynik_modulo = zmienna_pierwsza % zmienna_druga
          

        System.out.println("\n wynik dodawania: " + wynik_dodawania+ "\n wynik odejmowania: " + wynik_odejmowania + "\n wynik mnożenia: " + wynik_mnozenia + "\n wynik dzielenia: " + wynik_dzielenia + "\n wynik modulo: " + wynik_modulo);



        //CW4


        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        int a = 9;
        
        int b = 3;
        
        int c = 3;
        
        int d = a + b + c;
        
        System.out.println(d);
        d = a - b + c;
        System.out.println(d);
        d= a / b * c;
        System.out.println(d);
        d= a * c + b;
        System.out.println(d);
        d = a % c + b;
        System.out.println(d);


        boolean x = true;
        
        boolean y = false;
        
        System.out.println("x && y = " + (x&&y));
        System.out.println("x || y = " + (x||y) );
        System.out.println("!(x && y) = " + !(x && y));
        System.out.println("((x && y) || (!x || y) : " + ((x && y) || (!x || y)));
        System.out.println("!((x || y) || (x || !y) : " + !((x && y) || (!x || y)));
        System.out.println("!((x && y) || (!x || y) : " + !((x && y) || (!x || y)));
        System.out.println("((x && y) %% (x || y) : " + ((x && y) && (x || y)));
        
        
        



    

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        
         int wiek = 23 % 3;
        
        System.out.println(wiek); // 2
        if (wiek == 0) {
            System.out.println("podzielny przez 3");
        } else {
            System.out.println("Niepodzielny przez 3");
        }




         zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

        
        
             int numer_albumu = 57861;
        int parzystosc = (numer_albumu % 2 == 0) ? 0 : 1;
        
        System.out.println("Parzystość: " +parzystosc);

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Podaj swoją wagę:");
        
        double first = scanner.nextDouble();
       
        System.out.println("Podaj swoj wzrost:");
        
        double second = scanner.nextDouble();
        
         double sum = first + second;
        System.out.println("Suma wprowadzonych liczb to " + sum);
        
        CW6
        
        
         /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */

        double[] podatek = new double[5];
        
        podatek[0] = 112.22;
        podatek[1] = 628.21;
        podatek[2] = 5427.61;
        podatek[3] = 104.02;
        podatek[4] = 23.02;
        
        for(int i=0; i < podatek.length; i++) {
            System.out.println(podatek[i]);

    }
}


    









