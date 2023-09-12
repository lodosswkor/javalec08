public class TestClass implements Cloneable {
    public static void main(String args[]) throws CloneNotSupportedException {
        String a = new String("이종석");
        String b = new String("이종석");
        System.out.println(a==b);
        b = b.concat("TEST"); 
        StringBuilder sb = new StringBuilder("tSE"); 
        StringBuilder sb2 = sb; 
        sb2.append("haak haak");
        System.out.println(sb);

        TestClass test = new TestClass(); 
        TestClass test2 = (TestClass)test.clone(); 



    }
}
