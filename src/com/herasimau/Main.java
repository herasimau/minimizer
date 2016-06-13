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
        StringBuilder sb = new StringBuilder();
        char[] chArr = str.toCharArray();
        if(chArr.length==1){
            return str;
        }
        for (int i = 0; i < chArr.length; i++) {
            int count = 1;
            if (i == chArr.length - 1) {
                if (chArr[i] != chArr[i - 1]) {
                    sb.append(chArr[i]);
                }
            }
            if (i + 1 < chArr.length) {
                if (chArr[i] == chArr[i + 1]) {
                    int j = 1;

                    while (j + i < chArr.length) {
                        if (i + j < chArr.length) {
                            if (chArr[i] == chArr[i + j]) {
                                count++;
                                j++;
                            } else {

                                break;
                            }
                        } else {

                            break;
                        }
                    }
                    i += count - 1;
                }

                if (count > 1) {
                    sb.append(chArr[i] + "(" + count + ")");

                } else {
                    sb.append(chArr[i]);
                }

            }

        }
        return sb.toString();
    }


}
