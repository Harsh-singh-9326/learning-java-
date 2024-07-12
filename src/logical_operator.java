public class logical_operator {
    public static void main(String[] args) {
        //logcal operator is used to check whether operator is true or false
        //they are used in decsion making
        //logical operator are && || !
        //and operator(&&) if both operand  are true then it will give true
        System.out.println((8>5)&&(7>5));
        System.out.println((8<5)&&(7>5));
        //OR operator(||) if both operand  are False then it will given only False
        System.out.println((8>5)||(7>5));
        System.out.println((8<5)||(7>5));
        System.out.println((8<5)||(7<5));
        //nor gate it will just turn boolean value opposite true become false false become true
        System.out.println(!(8>5));
        System.out.println(!(8<5));


    }}
