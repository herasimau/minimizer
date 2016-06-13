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

    public static String minimizeString(String source) {
        StringBuilder dest = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            int runLength = 1;
            while (i+1 < source.length() && source.charAt(i) == source.charAt(i+1)) {
                runLength++;
                i++;
            }

            dest.append(source.charAt(i));
            if(runLength>1){
                dest.append("("+runLength+")");
            }

        }
        return dest.toString();
    }


}
