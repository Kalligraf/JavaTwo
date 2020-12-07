package ivanovkm.java.javatwo.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
//Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
public class Phonebook {
    private final HashMap<String, List<String>> phonebook;

    public Phonebook(){
        this.phonebook = new HashMap<>();
    }
//В этот телефонный справочник с помощью метода add() можно добавлять записи.
    public void add(String surname, String number){
        if(phonebook.containsKey(surname)){
            List<String> numbers = phonebook.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println(String.format("Номер %s добавлен для фамилии %s", number, surname));
            } else {
                System.out.println(String.format("Номер %s уже существует для фамилии %s", number, surname));
            }
        } else {
            phonebook.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Номер %s добавлен для фамилии %s", number, surname));
        }
    }
//С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть
//несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
    public List<String> get(String surname){
        if(phonebook.containsKey(surname)){
            return phonebook.get(surname);
        } else {
            System.out.println(String.format("В справочнике нет записи для фамилии %s", surname));
            return new ArrayList<>();
        }
    }
}
