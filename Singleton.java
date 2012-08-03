package ua.patterns;

public class Singleton {
  private static Singleton instance;

  private Singleton() {}

  public static synchronized Singleton getInstance() {
    if (null == instance) {
      instance = new Singleton();
    }

    return instance;
  }
}
