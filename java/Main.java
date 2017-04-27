class Main {
  public static void main(String[] args) {
    System.out.println("hello");
    try {
      Thread.sleep(1000*10);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
