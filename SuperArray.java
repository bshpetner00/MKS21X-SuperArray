public class SuperArray {
  private String[] data;
  private int size;
  public SuperArray() {
    size = 0;
    data = new String[10];
  }
  public SuperArray(int capacity) {
  	size = 0;
  	data = new String[capacity];
  	catch(NegativeArraySizeException e) {
      System.out.println("Size can't be negative... try again fam.");
    }
  }
  public void clear() {
    size = 0;
    data = new String[10];
  }
  public int size() {
    return size;
  }
  public boolean isEmpty() {
    return size == 0;
  }
  public boolean add(String str) {
  	if (size < data.length) {
  		data[size] = str;
  		size += 1;
  		return true;
  	}
  	else if (size >= data.length) {
  		resize();
  		add(str); //dank recursion >:)
  	}
  	return false;
  }
  public String toStringDebug() {
    String joke = "[";
	    for (int i = 0; i < data.length-1;i++) {
	        joke += data[i];
	        joke += ", ";
	      }
	    joke += data[data.length-1];
    joke += "]";
    return joke;
  }
  public String toString() {
    String joke = "[";
    if (data[0] != null) {
	    for (int i = 0; i < size-1;i++) {
	        joke += data[i];
	        joke += ", ";
	      }
	    joke += data[size-1];
	    }
    joke += "]";
    return joke;
  }
  public String get(int i) {
    if (i < 0 || i >= size()) {
      return null;
    }
    return data[i];
  }
  public String set(int i, String s) {
  	String oldVal = data[i];
    if (i < 0 || i >= size()) {
      return null;
    }
    else {
      data[i] = s;
      return oldVal;
    }
  }
  private void resize() {
  	String[] resizedArray = new String [data.length*2+1];
  	int i = 0;
  	for (String s:data) {
  		resizedArray[i] = data[i];
  		i++;
  	}
  	data = resizedArray;
  }
  public boolean contains(String str) {
  	boolean bool = false;
  	for (String s:data) {
  		if (s.equals(str)) {
  			bool = true;
  		}
  	}
  	return bool;
  }
  public int indexOf(String str) {
  	int i = 0;
  	while (i < data.length-1) {
  		if (data[i].equals(str)) {
  			return i;
  		}
  		i++;
  	}
  	return -1;
  }
  public int lastIndexOf(String str) {
  	int i = data.length-1;
  	while (i > 0) {
  		if (data[i].equals(str)) {
  			return i;
  		}
  		i -= 1;
  	}
  	return -1;
  }
  public void add(int i, String s) {
    if (i < 0 || i > size()) {
      System.out.println("try a different index buddy, this one's no good");
    }
    resize();
    String[] pebbles = new String[data.length];
    int special = 0;
    for (int index = 0; index < data.length; index++) {
      if (index == i) {
      	pebbles[index] = s;
      }
      else {
      	pebbles[index] = data[special];
      	special += 1;
      }
    }
    data = pebbles;
  }
  public String remove(int index) {
  	if (index < 0 || index > size()) {
      return null;
    }
  	String deadMan = data[index];
  	String[] shorty = new String[data.length];
  	int i = 0;
  	int oldEye = 0;
  	while (oldEye < data.length) {
  		if (oldEye != index) {
  			shorty[i] = data[oldEye];
  			i++;
  			oldEye++;
  		}
  		else {
  			oldEye++;
  		}
  	}
  	data = shorty;
  	return deadMan;
  }
  public boolean remove(String deadMan) {
  	if (this.contains(deadMan)) {
  		this.remove(this.indexOf(deadMan));
  		return true;
  	}
  	else {
  		return false;
  	}
  }
}
