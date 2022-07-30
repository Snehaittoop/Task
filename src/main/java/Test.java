public interface Test {
    void hello(String name);
}
class Test1 implements Test{
    public void hello(String x){
        System.out.println("hello " +x);
    }

    public static void main(String[] args) {
        Test1 ob=new Test1();
        ob.hello("sneha");
    }
}
