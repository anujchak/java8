import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class test2 {
    public static void main(String args[])
    {
        int arr[]=new int[5];
        Arrays.fill(arr,1);
        //System.out.println(Arrays.toString(arr));
        int arr1[]={3,5,1,2,4,5,3};
        int arr2[]={6,3,7,5,1,8,8};
        //find highest element
        //System.out.println(Arrays.stream(arr1).boxed().sorted(Comparator.reverseOrder()).findFirst().get());
        //find 3rd higest
        //System.out.println(Arrays.stream(arr1).distinct().boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().get());
        //print common elements in 2 array using set
        Set<Integer>s=new HashSet<>();
        Arrays.stream(arr1).forEach(e->s.add(e));
        //System.out.println(Arrays.stream(arr2).distinct().boxed().filter(e->!s.add(e)).collect(Collectors.toList()));
        //using anymatch
        //System.out.println(Arrays.stream(arr1).distinct().boxed().filter(e->Arrays.stream(arr2).boxed().anyMatch(n->n==e)).collect(Collectors.toList()));
        //dublicates in a single array using set
        Set<Integer>s1=new HashSet<>();
        //System.out.println(Arrays.stream(arr1).boxed().filter(e->!s1.add(e)).distinct().collect(Collectors.toList()));
        //dublicates in a single array using hashmap
        Map<Integer,Long>m=Arrays.stream(arr1).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //System.out.println(m.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).collect(Collectors.toList()));
        //reverase a array
        int arr3[]={4,3,2,1};
        //System.out.println(Arrays.toString(arr3));
        IntStream.range(0,arr3.length/2).forEach(e->
                {
                   int temp = arr3[e];
                    arr3[e] = arr3[arr3.length - 1-e];
                    arr3[arr3.length - 1] = temp;
                }
                );


        //System.out.println( Arrays.toString(arr3));
        String arr4[]={"apple","ball","cat","kkuf"};
        System.out.println(Arrays.stream(arr4).mapToInt(String::length).average().orElse(0));

    }
}
