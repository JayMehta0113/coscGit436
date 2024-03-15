import java.util.*;

//6) The function public iterator iterator() is the function needed to implement the iterator. A new iterator is returned
//9) New ArrayIterator is returned.

public class StringArray implements Iterable <String>{
    
    String[] values;

    public StringArray(String[] values){
        super();
        this.values = values;
    }

    public Iterator iterator(){
        return new ArrayIterator();
    }

    class ArrayIterator implements Iterator <String>{
        int current = 0;

        public boolean hasNext(){
            if (current < StringArray.this.values.length){
                return true;
            }
            else{
                return false;
            }
        }

        public String next(){
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return values[current++];
        }

        public void set(int index, String value){
            values[index]=value;
        }

        public int length(){
            return values.length;
        }

    }

    public static void main(String[] args){
        String[] strings = new String[]{"one", "two", "three", "four", "five"};

    StringArray array = new StringArray(strings);
    Iterator<String> iterator = array.iterator();

    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
    }

}

