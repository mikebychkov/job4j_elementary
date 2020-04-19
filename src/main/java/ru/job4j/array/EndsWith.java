package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        // проверить. что массив word имеет последние элементы одинаковые с post
        int len = word.length - post.length;
        for (int x = post.length - 1; x >= 0; x--) {
            if (word[len + x] != post[x]) {
                result = false;
                break;
            }
        }
        return result;
    }
}