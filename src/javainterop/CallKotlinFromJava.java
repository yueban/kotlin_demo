package javainterop;

public class CallKotlinFromJava {
    public static void main(String[] args) {
        /********** demo 1 **********/
        //CallKotlinFromJavaDemo a = new CallKotlinFromJavaDemo();
        //a.setName("demo name");
        //System.out.println(a.getName());
        //a.setTrue(0);
        //System.out.println(a.isTrue());

        /********** demo 2 **********/
        //CallKotlinFromJavaDemoKt.callKotlinFunc();
        //CallKotlinFromJavaDemoKt.getHahaha();

        /********** demo 3 **********/
        //CallKotlinFromJavaDemo a = new CallKotlinFromJavaDemo();
        //System.out.println(a.ID);

        /********** demo 4 **********/
        //Key.COMPARATOR.compare(new Key(1), new Key(2));
        //Singleton.provider = "1";
        //System.out.println(CallKotlinFromJavaDemoKt.MAX);
        //System.out.println(Singleton.CONST);
        //System.out.println(Key.VERSION);
        //Key.foo();
        //Key.Companion.bar();
        //Singleton.foo();
        //Singleton.INSTANCE.bar();

        /********** demo 5 **********/
        //CallKotlinFromJavaDemoKt.testKClass(kotlin.jvm.JvmClassMappingKt.getKotlinClass(String.class));

        /********** demo 6 **********/
        //CallKotlinFromJavaDemoKt.filterValid(new ArrayList<>());
        //CallKotlinFromJavaDemoKt.filterValidInt(new ArrayList<>());
        //CallKotlinFromJavaDemoKt.getX();
        //CallKotlinFromJavaDemoKt.getX_prop();
        //CallKotlinFromJavaDemoKt.y();
        //CallKotlinFromJavaDemoKt.changeY(1);

        /********** demo 7 **********/
        //CKotlinFromJava a1 = new CKotlinFromJava(1);
        //CKotlinFromJava a2 = new CKotlinFromJava(1, 2);
        //a1.f("1");
        //a1.f("1", 2);
        //a1.f("1", 2, "3");

        /********** demo 8 **********/
        //try {
        //    CallKotlinFromJavaDemoKt.testException();
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}

        /********** demo 9 **********/
        //CallKotlinFromJavaDemoKt.testNPE(null);

        /********** demo 10 **********/
        // eg1.
        //Box<Derived> b = CallKotlinFromJavaDemoKt.boxDerived(new Derived());
        //CallKotlinFromJavaDemoKt.unboxBase(b);

        // eg2.
        //Box<? extends Derived> b = CallKotlinFromJavaDemoKt.boxDerived(new Derived());
        //CallKotlinFromJavaDemoKt.unboxBase(b);

        // eg3.
        //Box<Derived> b = CallKotlinFromJavaDemoKt.boxDerived(new Derived());
        ////CallKotlinFromJavaDemoKt.unboxBase(b); // not allowed
        //CallKotlinFromJavaDemoKt.unboxBase(new Box<>(new Base() {
        //}));

        /********** demo 11 **********/
        //CallKotlinFromJavaDemoKt.emptyList();
        //CallKotlinFromJavaDemoKt.testNothing();
    }
}


