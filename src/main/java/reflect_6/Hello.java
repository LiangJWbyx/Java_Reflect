package reflect_6;
//取得其它类中的父类
public class Hello {
    public static void main(String[] args){
        Class<?> demo = null;
        try {
            demo = Class.forName("reflect_6.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class<?> tmp = demo.getSuperclass();
        System.out.println("继承的父类为：  "+tmp.getName());
    }
}
