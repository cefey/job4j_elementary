package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        result = post[post.length - 1] != word[word.length - 1] ? false : true;
        return result;

    }
}