import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

  }
  public static void getHealthy() {
    Scanner scanner = new Scanner(System.in);
    int healthyCount = 0;
    int totalCount = 0;
    while (healthyCount < 10) {
      String name = scanner.nextLine();
      int calories = scanner.nextInt();
      int fat = scanner.nextInt();
    
      if (calories < 130 && fat < 5) {
        healthyCount++;
        System.out.println(name);
      }

      totalCount++;
    }

    System.out.println(totalCount);
  }
}
