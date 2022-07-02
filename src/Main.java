import org.w3c.dom.ls.LSOutput;


import java.util.Scanner;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] stringAborigens = ("saasf gsdgd jgjj hjlhjk qrwr ttuttyur uouop p[io]i " +
                "fsdf fsassdf sasvnmnvk fdl;fdl fdkfdnfk dfklfdlfmd dfklddl " +
                "dflkdkfa []poi bnm, as fsdfsdf sfaadgytr kiobjek fnkdls fknsdklfnskl uinxmalssnb dslkmkdn").split(" ");


        System.out.println("\nВаш новый словарь для общения с аборигенами:");

        // Монада
        SortWords(stringAborigens);
    }

    private static void SortWords(String[] stringAborigens) {

        IntStream.range(0, stringAborigens.length)
                .sorted()
                .mapToObj(x -> String.format("%s на аборигенском, это %c", stringAborigens[x], 'A' + x))
                .forEach(System.out::println);

    }
}
