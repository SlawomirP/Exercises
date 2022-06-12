package modificators.A;

public class ClassNoMod {

    void method (){
        ClassA object = new ClassA();

        object.publicV = 1;
        object.protectedV = 2;
        object.noModV = 3;

        object.publicMethod();
        object.protectedMethod();
        object.noModMethod();
    }

}
