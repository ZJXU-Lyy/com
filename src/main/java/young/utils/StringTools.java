package young.utils;

import java.util.List;
import java.util.Set;

import young.utils.ObjectTools.ObjectToStringImp;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: stringTools
 * @Author: Young
 * @Date: 2020-11-20
 * @Time: 17:18
 * @Version: v1.0
 */
public class StringTools {

    public static <T> String listToString(List<T> list, ObjectToStringImp<T> objectToStringImp) {
        StringBuilder result = new StringBuilder();
        if (!ObjectTools.errToNull(list))
            return result.toString();
        result.append("[");
        for (int i = 0; i < list.size(); i++) {
            result.append(objectToStringImp.toString(list.get(i)));
            if (i != list.size() - 1)
                result.append(",");
        }
        result.append("]");
        return result.toString();
    }

    public static <T> String arrayToString(T[] array, ObjectToStringImp<T> objectToStringImp) {
        StringBuilder result = new StringBuilder();
        if (!ObjectTools.errToNull(array))
            return result.toString();
        result.append("[");
        for (int i = 0; i < array.length; i++) {
            result.append(objectToStringImp.toString(array[i]));
            if (i != array.length - 1)
                result.append(",");
        }
        result.append("]");
        return result.toString();
    }

    public static <T> String setToString(Set<T> set, ObjectToStringImp<T> objectToStringImp) {
        T[] array = (T[]) set.toArray();
        return arrayToString(array, objectToStringImp);
    }

    public static <T> String objectToString(T object, ObjectToStringImp<T> objectToStringImp) {
        return objectToStringImp.toString(object);
    }
}
