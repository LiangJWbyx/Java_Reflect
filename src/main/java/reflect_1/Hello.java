package reflect_1;
/*
这个是入门级Java反射机制的代码，通过对象来获得类的名字
 */
public class Hello {
    public static void main(String[] args){
        Demo demo = new Demo();
        System.out.println(demo.getClass().getName());//获得类的名字并输出
    }
}
