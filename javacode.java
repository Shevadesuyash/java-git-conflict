public class javacode {

    public static void main(String[] args) {
        System.out.println("Hi My name is suyash ");
        int x=add(2,4);
        int y= op(10,5);
        int q= add1(8);

    }
    public static int add (int a,int b) {
        int add=a+b;
        System.out.println("addition");
        return add;

    }
    public static int op(int a,int b){
        System.out.println("This is operation on int");
        int x=a-b;
        return x;
    }
    public static int add1(int a) {
        return a+2;
    }





}
