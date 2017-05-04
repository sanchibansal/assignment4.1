/**What is displayed when the following code is executed?
The outcome must be one of the following:
A. Compile-time error
B. Run-time error
C. Prints : Parent's method2()
 Parent's method1()
D. Prints : Parent's method2()
 Child's method1()
**/

class Parent{
    private void method1(){
        System.out.println ("Parent's method1()");
    }
    public void method2() {
        System.out.println ("Parent's method2()");
        method1();
    }
}
class Child extends Parent {
    public void method1() {
        System.out.println ("Child's method1()");
    }
    public static void main(String args[]) {
    Parent p = new Child();
    p.method2();
    }
}
/** the expected output will be option (c)
 * Since only parent class has the method2(), it is been called.
  **/