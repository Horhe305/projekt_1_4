import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    Scanner Obj = new Scanner(System.in); 
    double a, b, wynik;

  System.out.println("Podaj liczbę A:");
    a = Obj.nextDouble();
    System.out.println("Podaj liczbę B:");
    b = Obj.nextDouble();

    System.out.println("Co chcesz zrobic?");
    System.out.println("1 - Liczba A do potęgi B");
    System.out.println("2 - suma pierwiastków");
    System.out.println("3 - MAX");
    System.out.println("4 - iloraz");
    
    int y = Obj.nextInt();

    if(y==1)
    {
      wynik = Math.pow(a, b);
      System.out.println("Wynik: "+wynik);
      }
     else if(y==2)
      {
        wynik = Math.pow(a, 2)+Math.pow(b, 2);
   System.out.println("Wynik: "+wynik);
      }
    else if(y==3)
      {
        boolean x = a>b;
        if(x==true) System.out.println("A jest MAX i wynosi: "+a);
        else System.out.println("B jest MAX i wynosi: "+b);
      }
    }
  }

