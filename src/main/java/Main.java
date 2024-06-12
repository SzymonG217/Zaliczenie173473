import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Podaj liczbę: ");
    Scanner scanner = new Scanner(System.in);
    int liczba = scanner.nextInt();
    if (liczba > 0) {
      System.out.println("Liczba jest dodatnia");
    } else if (liczba < 0) {
      System.out.println("Liczba jest ujemna");
    } else if (liczba == 0) {
      System.out.println("Liczba jest równa 0");
    }
  }
}