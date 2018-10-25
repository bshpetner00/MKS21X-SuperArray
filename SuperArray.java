public class SuperArray {
  private String[] data;
  private int size;
  public SuperArray() {
    size = 0;
    data = new String[10];
  }
  public void clear() {
    size = 0;
  }
  public int size() {
    return data.length;
  }
  public boolean isEmpty() {
    return data.length > 0;
  }
  public String toStringDebug() {
    String joke = "[";
    for (String x:data) {
      joke += x;
      joke += ", ";
    }
    joke += "]";
    return joke;
  }
  public String toString() {
    String joke = "[";
    for (String x:data) {
      if (x.equals(null) == false) {
        joke += x;
        joke += ", ";
      }
    }
    joke += "]";
    return joke;
  }

}
