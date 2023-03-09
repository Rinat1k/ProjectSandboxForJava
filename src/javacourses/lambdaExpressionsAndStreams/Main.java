package javacourses.lambdaExpressionsAndStreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(new User("Leo Messi"));
        userArrayList.add(new User("Cristiano Ronaldo"));
        userArrayList.add(new User("Ronaldo"));
        userArrayList.add(new User("Ibra"));

        var userArrayListWithoutRonaldo =
                userArrayList
                        .stream()
                        .filter(user -> !user.getName().contains("Cristiano"))
                        .collect(Collectors.toCollection(ArrayList::new));

        Map<Integer, Integer> integerMap = new LinkedHashMap<>(10, 0.75f, true);
        integerMap.put(1, 1);
        integerMap.put(3, 3);
        integerMap.put(4, 4);
        integerMap.put(7, 7);
        integerMap.put(-1, -1);
        var value = integerMap.get(4);

        userArrayList.stream()
                .filter(user -> user.getName().split(" ").length < 2)
                .forEach(System.out::println);

        var myStream = userArrayList.stream();
        var myStream2 = Stream.of(new User("1"), new User("1"), new User("1"));
        double[] doubleArray = new double[10];
        var myStream3 = Arrays.stream(doubleArray);
        System.out.println(myStream3.filter(element -> element > 0).count());

        Arrays.stream(new int [] {1,2,4,5,6,6,6,6,6,7,8,9}).distinct().forEach(System.out::print);

    }
}
