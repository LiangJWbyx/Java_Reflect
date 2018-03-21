package reflect_7;

import java.lang.reflect.Constructor;
//获得其它类中全部的构造方法
public class Hello {
    public static void main(String[] args){
        Class<?> demo = null;
        try {
            demo = Class.forName("reflect_7.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Constructor<?> constructor[] = demo.getConstructors();
        for (int i = 0; i < constructor.length; i++){
            //从输出的情况可以看出获取的数组是无序的
            System.out.println("构造方法：  "+constructor[i]);
        }
    }
}
