package CodeChobo.CH07_OOP2;

public class InnerEx6 {
    Object iv = new Object() { void method(){} } ; // 익명 클래스
    static Object cv = new Object() { void method() {} } ; // 익명 클래스

    void myMethod() {
        Object lv = new Object() { void method() {} } ;
    }
}
