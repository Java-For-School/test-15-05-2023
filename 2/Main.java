public class Main {
  public static void main(String[] args) {

  }
  public static int getMinDiff(int start, int finish) {
    int startMin = start % 100 + (start / 100) * 60;
    int finishMin = finish % 100 + (finish / 100) * 60;

    return finishMin - startMin;
  }
  public static void getMaxDiff(int[] runner1, int[] runner2) {
    int[] diffArr = new int[runner1.length];

    for (int i = 0; i < diffArr.length; i++) {
      diffArr[i] = getMinDiff(runner1[i], runner2[i]);
    }
    int min = diffArr[0];
    int max = diffArr[0];

    for (int i = 0; i < diffArr.length; i++) {
      if (diffArr[i] < min) min = diffArr[i];
      if (diffArr[i] > max) max = diffArr[i];
    }
    
    System.out.println(max - min);
  }
}
