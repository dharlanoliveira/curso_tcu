package curso._3_stream.operacoes_basicas;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class Main {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));

        //1. Map
        /*menu._3_stream()
                .map((d) -> d.getName())
                .forEach(System.out::println);*/

        /*menu._3_stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);*/

        /*System.out.println(menu._3_stream()
                .mapToInt(Dish::getCalories)
                .sum());*/

        //2. Filter
        /*menu._3_stream()
                .filter((d) -> d.getType().equals(Dish.Type.MEAT))
                .collect(Collectors.toList())
                .forEach(System.out::println);*/

        //3. Sort

        /*menu._3_stream()
                .sorted(comparing(Dish::getCalories))
                .forEach(System.out::println);*/

        /*menu._3_stream()
                .sorted(comparing(Dish::getCalories).reversed())
                .forEach(System.out::println);*/

        /*menu._3_stream()
                .sorted(comparing(Dish::getCalories).reversed())
                .limit(3)
                .forEach(System.out::println);*/

        //4. Só é atravessado uma única vez

        /*Stream<Dish> _3_stream = menu._3_stream();
        _3_stream.forEach(System.out::println);
        _3_stream.forEach(System.out::println);*/

        //5 AnyMatch, AllMatch e NoneMatch

        /*System.out.println(menu
                ._3_stream()
                .anyMatch(Dish::isVegetarian));*/

        /*System.out.println(menu
                ._3_stream()
                .anyMatch((d) -> !d.isVegetarian()));*/

        /*System.out.println(menu
                ._3_stream()
                .allMatch(Dish::isVegetarian));*/

        /*System.out.println(menu
                ._3_stream()
                .noneMatch(Dish::isVegetarian));*/

        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);

        //6. Findfirst and optional


        /*Optional<Integer> firstSquareDivisibleByThree
                = someNumbers._3_stream()
                .map(x -> x * x)
                .filter(x -> x % 3 == 0)
                .findFirst(); // 9*/

        /*System.out.println(firstSquareDivisibleByThree
             .orElse(1));*/

        /*System.out.println(firstSquareDivisibleByThree
                .orElseThrow(() -> new RuntimeException("Falha")));*/


        //7. Reducing

        /*System.out.println(someNumbers._3_stream().reduce(0, (a, b) -> a + b));
        System.out.println(someNumbers._3_stream().reduce(1, (a, b) -> a + b));
        System.out.println(someNumbers._3_stream().reduce(0, Integer::sum));
        someNumbers._3_stream().reduce(Integer::sum).ifPresent(System.out::println);
        someNumbers._3_stream().reduce(Integer::max).ifPresent(System.out::println);
        someNumbers._3_stream().reduce(Integer::min).ifPresent(System.out::println);*/


    }

}
