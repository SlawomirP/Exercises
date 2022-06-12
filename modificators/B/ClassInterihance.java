package modificators.B;

import modificators.A.ClassA;

public class ClassInterihance extends ClassA {

    void method (){

        publicV = 1;
        protectedV = 2;

        publicMethod();
        protectedMethod();
    }
}
