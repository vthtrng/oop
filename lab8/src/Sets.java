import java.util.*;

public class Sets {
    public static Set<Integer> intersection(Set<Integer> first,
                                                  Set<Integer> second) {
        Set<Integer> intersection = new Set<Integer>;
        return  intersection.addAll(first.retainAll(second);
    }

    public static Set<Integer> union(Set<Integer> first,
                                     Set<Integer> second) {
        Set<Integer> union = new Set<Integer>;
        return union.add(first.addAll(second));
    }


}
