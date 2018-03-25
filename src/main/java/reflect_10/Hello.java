package reflect_10;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
//调用其它类的set和get方法
public class Hello {
    public static void main(String[] args){
        Class<?> demo = null;
        Object object = null;
        try {
            demo = Class.forName("reflect_5.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            object = demo.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        setter(object, "Sex", "男", String.class);
        getter(object, "Sex");

    }

    /**
     * @param object 操作的对象
     * @param att 操作的属性
     */
    public static void getter(Object object, String att){
        try {
            Method method = object.getClass().getMethod("get" + att);
            System.out.println(method.invoke(object));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param object 操作的对象
     * @param att 操作的属性
     * @param value 设置的值
     * @param type 参数的属性
     */
    public static void setter(Object object, String att, Object value, Class<?> type){
        try {
            Method method = object.getClass().getMethod("set"+att, type);
            method.invoke(object, value);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
