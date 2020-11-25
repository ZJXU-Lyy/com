package young.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: ioTools
 * @Author: Young
 * @Date: 2020-11-20
 * @Time: 15:29
 * @Version: v1.0
 */
public class IoTools {
    static Scanner scanner;

    public static Scanner getScanner() {
        if (scanner == null)
            scanner = new Scanner(System.in);
        return scanner;
    }

    public static void close() {
        try {
            if (ObjectTools.errToNull(scanner)) {
                scanner.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner = null;
        }
    }

    public static void inWhile(inWhileImp inWhileImp) {
        while (getScanner().hasNext()) {
            inWhileImp.input();
        }
    }

    public static int inInt() {
        return getScanner().nextInt();
    }

    public static short inShort() {
        return getScanner().nextShort();
    }

    public static long inLong() {
        return getScanner().nextLong();
    }

    public static float inFloat() {
        return getScanner().nextFloat();
    }

    public static double inDouble() {
        return getScanner().nextDouble();
    }

    public static String inNext() {
        return getScanner().next();
    }

    public static String inLine() {
        return getScanner().nextLine();
    }

    public static BigInteger inBigInteger() {
        return getScanner().nextBigInteger();
    }

    public static BigDecimal inBigDecimal() {
        return getScanner().nextBigDecimal();
    }

    public static void out(Object o) {
        System.out.println(o);
    }

    public static <T> void out(T o, ObjectTools.ObjectToStringImp<T> objectToStringImp) {
        System.out.println(StringTools.objectToString(o, objectToStringImp));
    }

    public static void out(String val) {
        System.out.println(val);
    }

    public static void out(String val, Object non) {
        System.out.print(val);
    }

    public static void err(Object o) {
        System.err.println(o);
    }

    public static <T> void err(T o, ObjectTools.ObjectToStringImp<T> objectToStringImp) {
        System.err.println(StringTools.objectToString(o, objectToStringImp));
    }

    public static void err(String val) {
        System.err.println(val);
    }

    public static void err(String val, Object non) {
        System.err.print(val);
    }

    public static void format(String format, Object... args) {
        System.out.printf(format, args);
    }

    public static void ln() {
        System.out.println();
    }

    public static void tag(List<String> tags, List<String> values) {
        tag(tags, values, "->");
    }

    public static void tag(List<String> tags, List<String> values, String spt) {
        try {
            if (tags == null || values == null)
                throw new Exception("param is null");
            if (tags.size() != values.size())
                throw new Exception("length is exception");
            for (int i = 0; i < tags.size(); i++) {
                tag(tags.get(i), spt, values.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void tag(String tag, String spt, String val) {
        out(tag + spt + val);
    }

    public static void tag(String tag, String val) {
        tag(tag, "->", val);
    }

    public interface inWhileImp {
        void input();
    }
}
