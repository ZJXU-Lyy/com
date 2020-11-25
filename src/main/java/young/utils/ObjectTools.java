package young.utils;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: objectTools
 * @Author: Young
 * @Date: 2020-11-20
 * @Time: 17:19
 * @Version: v1.0
 */
public class ObjectTools {
    public static boolean errToNull(Object o) {
        try {
            if (o == null)
                throw new Exception("Object is Null");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public interface ObjectToStringImp<T> {
        String toString(T o);
    }
}
