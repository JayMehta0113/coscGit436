//Bryan Lehosky, Jay Mehta
import java.util.*;
public class InClassExercise {
    public static void main(String [] args) {
        //1 Create an ArrayList called stringArrayList and populate with one through five
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("one");
        stringArrayList.add("two");
        stringArrayList.add("three");
        stringArrayList.add("four");
        stringArrayList.add("five");
        for(int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }
        System.out.println();

        
        //2 You can declare an iterator object using String and use a while loop
        Iterator<String> iterator = stringArrayList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        //3 You can declare a new TreeSet object and use addAll to put elements 
        // of stringArrayList inside tree set, then same steps as question 2
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.addAll(stringArrayList);
        Iterator<String> treeSetIterator = stringTreeSet.iterator();
        while(treeSetIterator.hasNext()) {
            System.out.println(treeSetIterator.next());
        }
        System.out.println();
    }
}