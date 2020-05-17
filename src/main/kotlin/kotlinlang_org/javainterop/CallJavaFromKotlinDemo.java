package kotlinlang_org.javainterop;

import java.util.List;

public class CallJavaFromKotlinDemo {
    /********** demo 6 **********/
    public Foo<? extends Bar> a;
    public Foo<? super Bar> b;
    public List c;

    /********** demo 3 **********/
    public void is() {
        System.out.println("is method");
    }

    /********** demo 7 **********/
    public void removeIndices(int[] indices) {
    }

    /********** demo 8 **********/
    public void removeIndicesVarArg(int... indices) {
    }
}

class Foo<T> {
}

class Bar {
}



