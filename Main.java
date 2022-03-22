import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    Scanner Obj = new Scanner(System.in); 

  System.out.println("Podaj liczbę:");
  int y = Obj.nextInt();
  float wynik = y%10; 
  System.out.println("Reszta z dzielenia przez 10: "+wynik);
  }
}