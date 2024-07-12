public class assignment_operator {
    public static void main(String[] args) {
        // assignment operator are used to assign value to variable;
        int age = 20;
        System.out.println(age);
        int Var = age;
        System.out.println(Var);
        Var -= age;   //Var = Var - Age   //20 - 20 = 0
        System.out.println(Var);
        Var += age;   //Var = Var + Age   //0 + 20 = 20
        System.out.println(Var);
        Var *= age;   //Var = Var * Age   //20 * 20 = 400
        System.out.println(Var);
        Var /= age;   //Var = Var / Age   //400 / 20 = 20
        System.out.println(Var);
        Var %= age;   //Var = Var % Age    //20 / 20 = 0
        System.out.println(Var);

    }
}
