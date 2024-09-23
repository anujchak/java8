import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<employee>l= List.of(new employee(1,"anuj","dev",100),

                new employee(1,"anuj","dev",100),
                new employee(2,"dudu","HR",1000),
                new employee(3,"bodhi","test",101),
                new employee(4,"ram","dev",10),
                new employee(5,"sam","HR",50),
                new employee(5,"sam","HR",50)
        );
        //System.out.println(l.stream().map(employee::getName).collect(Collectors.toList()));
        //print name of highest salary
        //System.out.println(l.stream().collect(Collectors.maxBy(Comparator.comparing(employee::getSalary))).get().getName());
        //using maxby
        //System.out.println(l.stream().collect(Collectors.maxBy(Comparator.comparing(employee::getRoll))).get());
        // using sorting
        //System.out.println(l.stream().sorted((o1,o2)->o2.getRoll()- o1.getRoll()).findFirst().get());
        //using flatmap
        //System.out.println(l.stream().flatMap(e->e.getemails().stream()).collect(Collectors.toList()));
        Set<employee> s=new HashSet<employee>();
        for(employee e:l)
        {
            s.add(e);
        }
        //System.out.println(s.size());
        //first non repeting element
        String s1="fghafga";
        List<String>l1= Arrays.asList(s1.split(""));
        Map<String,Long>m=l1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //System.out.println(l1.stream().filter(e->m.get(e)==1).findFirst().get());
        //System.out.println(l.stream().collect(Collectors.groupingBy(employee::getDepartment,Collectors.counting())));
        System.out.println(l.stream().collect(Collectors.groupingBy(employee::getDepartment,Collectors.averagingInt(employee::getSalary))));






    }
}