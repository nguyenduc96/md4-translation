package service;

import java.util.HashMap;
import java.util.Map;

public class DictionaryService {
    private Map<String, String> dictionaries = new HashMap<>();

    public DictionaryService() {
        dictionaries.put("hello", "Xin chao");
        dictionaries.put("one", "1");
        dictionaries.put("two", "2");
        dictionaries.put("three", "3");
        dictionaries.put("four", "4");
        dictionaries.put("five", "5");
        dictionaries.put("six", "6");
        dictionaries.put("seven", "7");
        dictionaries.put("eight", "8");
        dictionaries.put("nine", "9");
        dictionaries.put("ten", "10");
        dictionaries.put("duc", "Duc rat la dep trai");
    }

    public String search(String eng) {
        boolean checkKey = dictionaries.containsKey(eng);
        if (checkKey) {
            return dictionaries.get(eng);
        }
        return null;
    }


}
