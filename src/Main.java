import org.w3c.dom.ls.LSOutput;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        String[] stringAborigens = ("double double double jgjj hjlhjk qrwr ttuttyur uouop p[io]i " +
                "fsdf fsassdf sasvnmnvk fdl;fdl fdkfdnfk dfklfdlfmd dfklddl " +
                "dflkdkfa []poi bnm, as fsdfsdf sfaadgytr kiobjek fnkdls fknsdklfnskl uinxmalssnb dslkmkdn").split(" ");


        System.out.println("\nВаш новый словарь для общения с аборигенами:");

        // Монада
        SortWords(stringAborigens);
    }

    private static void SortWords(String[] stringAborigens) {
        final int[] cnt = {0};
        Arrays.stream(stringAborigens)
                .distinct()// оператор устранения дубликатов
                .map(x -> String.format("%s на аборигенском, это %c", x, 'A' + cnt[0]++))//преобразуем в соответствующие строки
                .sorted(Comparator.naturalOrder())//сортировка аборигенских слов по алфавиту
                .forEach(System.out::println);
    }
}
