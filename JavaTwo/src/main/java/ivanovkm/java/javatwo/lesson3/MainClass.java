package ivanovkm.java.javatwo.lesson3;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        List<String> cityList = Arrays.asList("Moscow", "London", "St.Petersburg", "Oslo", "Beijing", "Berlin", "Amsterdam", "Hanoi", "Washington", "Washington", "London", "Berlin", "London", "Amsterdam", "Amsterdam", "Beijing", "Oslo", "Hanoi", "Beijing", "Amsterdam");
        Set<String> uniqueCity = new HashSet<String>(cityList);

        System.out.println(System.lineSeparator()+"Список городов:"+System.lineSeparator()+cityList.toString());
        System.out.println(System.lineSeparator()+"Из них уникальные:"+System.lineSeparator()+uniqueCity.toString());
        System.out.println(System.lineSeparator()+"Количество повторов по городам:");
        for (String key : uniqueCity) {
            System.out.println(key + ": " + Collections.frequency(cityList, key));
        }

        System.out.println(System.lineSeparator()+"Задача 2");
        Phonebook phonebook = new Phonebook();

        System.out.println(System.lineSeparator()+"Добавляем записи");
        phonebook.add("Иванов", "+7919821****");
        phonebook.add("Петров", "+7903381****");
        phonebook.add("Петров", "++7905381****");
        phonebook.add("Сидоров", "+7917300****");
        phonebook.add("Кузнецов", "+7****912922");
        phonebook.add("Кузнецов", "+7****512512");

        System.out.println(System.lineSeparator()+"Ищем номера телефона по фамилии");
        System.out.println("Иванов"+phonebook.get("Иванов"));
        System.out.println("Петров"+phonebook.get("Петров"));
        System.out.println("Сидоров"+phonebook.get("Сидоров"));
        System.out.println("Кузнецов"+phonebook.get("Кузнецов"));

        System.out.println(System.lineSeparator()+"Если записи нет");
        System.out.println("Пупкин"+phonebook.get("Пупкин"));
    }
}
