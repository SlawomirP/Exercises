package modificators.B;

import modificators.A.ClassA;

public class ClassB {

    void method(){
        ClassA object = new ClassA();

        object.publicV = 1;

        object.publicMethod();
    }
}
