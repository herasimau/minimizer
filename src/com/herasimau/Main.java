package com.herasimau;

import java.util.ArrayList;

/**
 * @author herasimau on 12.06.2016.
 * Решение задачи http://vk.com/java_problems?w=wall-60560229_982
 * Дана строка символов. Сожмите ее следующим образом - вместо повторяющихся
 * символов впишите сам символ и круглые скобки, внутри которых будет кол-во повторов данного символа.
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(minimizeString("123"));
        list.add(minimizeString("11"));
        list.add(minimizeString("Jaaaavvvva"));
        list.add(minimizeString("11111111111"));

        for (String s:list) {
            System.out.println(s);
        }

    }

    public static String minimizeString(String str) {
        StringBuilder sb = new StringBuilder(); //используем StringBuilder чтобы работать с одним объектом
        for (int i = 0; i < str.length(); i++) { // проходим по каждому символу циклом
            int runLength = 1; // количесвто повторений
            while (i+1 < str.length() && str.charAt(i) == str.charAt(i+1)) { //пока следующий символ равен текущему инриментируем runLength
                runLength++;
                i++;
            }

            sb.append(str.charAt(i)); // Добавляем символ в билдер
            if(runLength>1){ // Если повторений больше одного добавляем число
                sb.append("("+runLength+")");
            }

        }
        return sb.toString(); // возращаем строку
    }


}
