public class Main {
  public static void main(String[] args) {

  }
  public static void printDrivers(Driver[] d) {
    for (int i = 0; i < d.length; i++) {
      if (d[i].getTests() == 1) System.out.println(d.name);
    }
  }
  public static int getAge(Driver d) {
    return 2023 - d.getBirth();
  }
  public static int avgAgeDriver(Driver[] d) {
    int totalAges = 0;

    for (int i = 0; i < d.length; i++) totalAges += getAge(d[i]);

    return totalAges / d.length;
  }
}
