package collection.custom_iterable;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomIterable implements Iterable<String > {
  private String [] elements={"Apple","Banana"};

  @Override
  public Iterator<String> iterator() {
    return new Iterator<String>() {
      private int index=0;
      @Override
      public boolean hasNext() {
        return index<elements.length;
      }

      @Override
      public String next() {
        if(!hasNext())throw new NoSuchElementException();
        return elements[index++];
      }
    };
  }
}
