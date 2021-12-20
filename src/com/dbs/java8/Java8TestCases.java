package com.dbs.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8TestCases {
	public static void main(String[] args) {
		createEmployeeList();
		
		//filet employee whose age greater than 20 and print employee names
		System.out.println("-filter employee whose age greater than 20 and print employee names-");
		List<String> employeeList = createEmployeeList().stream().filter(emp-> emp.getAge()>20).map(Employee::getName).collect(Collectors.toList());
		employeeList.forEach(e-> System.out.print(e+" "));
		
		
		System.out.println();
		System.out.println("-Given list of employees, count number of employess whose age =25-");
		//Given list of employees, count number of employees whose age =25
		Long employeeCountWhoseAge25 = createEmployeeList().stream().filter(emp -> emp.getAge() ==25).count();
		System.out.println("employeeCountWhoseAge25 "+employeeCountWhoseAge25);
		
		System.out.println("--Given the list of employess, find the employee with name Mary--");
		Optional<Employee> optional = createEmployeeList().stream().filter(emp -> emp.getName().equals("Mary")).findFirst();
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		System.out.println("Maximum age of employee");
		OptionalInt max = createEmployeeList().stream().mapToInt(Employee::getAge).max();
		if(max.isPresent()) {
			System.out.println(max.getAsInt());
		}
		
		System.out.println("--Sort the employess based on the age--");
		System.out.println(createEmployeeList().stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList()));
		System.out.println(createEmployeeList().stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).collect(Collectors.toList()));
		
		System.out.println("Join employee name");
		String empNames = String.join(",", createEmployeeList().stream().map(Employee::getName).collect(Collectors.toList()));
		System.out.println(empNames);
		
		System.out.println("Given the list of employee, group them by empName");
		Map<String, List<Employee>> mapEmployee = createEmployeeList().stream().collect(Collectors.groupingBy(Employee::getName));
		mapEmployee.forEach((name, empList) -> System.out.println("name: "+name + " empList: "+empList));
		System.out.println("----------");
		IntStream.range(1, 20).filter(num -> num%2 != 0).forEach(System.out::println);
		//paralal stream
		//remove duplicate object
		
		String str = "Lorem adipising ipsum dolor sit Lorem amet Consectetur adipising elit Lorem ipsum dolor";
		List <String> list = Stream.of(str).map(w -> w.split("\\s+")).flatMap(Arrays::stream)
            .collect(Collectors.toList());
		System.out.println("list split: "+list);
		List<String> strList = Arrays.asList(str.split(" "));
		System.out.println("strList split: "+strList);
		Map <String, Integer > wordCounter = list.stream()
				.collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
		
		System.out.println("wordCounter: "+ wordCounter); 
		
		List<Integer> intgerList = Arrays.asList(1,3,4,2,1);
		Map<Integer, Integer> map = intgerList.stream().collect(Collectors.toMap(m ->m, m->1, Integer::sum));
		System.out.println("map: "+map);
		
		Map<String, Map<String, List<String>>> map1 = new HashMap<String, Map<String,List<String>>>();
		Map<String, List<String>> map2 = new HashMap<String, List<String>>();
		map2.put("X", Arrays.asList("Anil", "Sadhana", "Mitul"));
		map2.put("Y", Arrays.asList("Raj", "Venkat", "Mitul"));
		
		Map<String, List<String>> map3 = new HashMap<String, List<String>>();
		map3.put("X", Arrays.asList("Anil-1", "Sadhana-1", "Mitul-1"));
		map3.put("Y", Arrays.asList("Raj-1", "Venkat-1", "Mitul-1"));
		map1.put("Test-1", map2);
		map1.put("Test-2", map3);
		System.out.println("---------Testing Map--------");
//		map3.entrySet().stream().sorted(comparingByValue()).
		
		Map<String, Integer> map4 = new HashMap<String, Integer>();
		map4.put("X", 2);
		map4.put("Y", 3);
		map4.put("Z", 1);
		System.out.println("map4: "+map4);
		Map<String, Integer> map6 = new LinkedHashMap<String, Integer>(map4);
		System.out.println("LinkedHashMap: "+map6);
		Map<String, Integer> map5 = map4.entrySet().stream()
		.sorted(Map.Entry.comparingByValue())
		.collect(Collectors
		        .toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
		map4.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b) -> a, LinkedHashMap::new));
		System.out.println("map5: "+map5);
		sortMap();
	}
	
	private static void sortMap() {
		HashMap<String, List<String>> hmap= new HashMap<String, List<String>>();
		List<String> prod1 = new ArrayList<String>();
		prod1.add("xy");
		prod1.add("hi");
//		prod1.add("8");
		hmap.put("Blue magazine", prod1);
		List<String> prod2 = new ArrayList<String>();
		prod2.add("sa");
		prod2.add("hi");
//		prod2.add("7");
		hmap.put("Pink magazine", prod2);
//		List<String> prod3 = new ArrayList<String>();
//		prod3.add("123456789102");
//		prod3.add("8.0");
//		prod3.add("6");
//		hmap.put("Black magazine", prod3);
		System.out.println("---------------------");
		System.out.println("hmap: "+hmap);
		
		
		List<Map.Entry<String, List<String>>> list = new LinkedList<Map.Entry<String, List<String>>>(hmap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, List<String>>>() {

			@Override
			public int compare(Map.Entry<String, List<String>> o1, Map.Entry<String, List<String>> o2) {
				return o1.getValue().get(1).compareTo(o1.getValue().get(1));
			}
		});
		
		Map<String, List<String>> result = new LinkedHashMap<String, List<String>>();
		for ( Map.Entry<String, List<String>> n : list )
		    result.put( n.getKey(), n.getValue() );
		
		System.out.println("result:"+result);
	}

	public static List<Employee> createEmployeeList()
    {
        List<Employee> employeeList=new ArrayList<>();
 
        Employee e1=new Employee("John",21);
        Employee e2=new Employee("Martin",19);
        Employee e3=new Employee("Mary", 25);
        Employee e4=new Employee("Stephan",18);
        Employee e5=new Employee("Gary",26);
 
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
 
        return employeeList;
    }
 
}
class Employee {
    private String name;
    private int age;
 
    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
        public String toString()
    {
        return "Employee Name: "+name+" age: "+age;
    }
}
 