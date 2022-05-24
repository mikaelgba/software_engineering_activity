package ufpb.br;

public class Michael {

    private static String name = "michael Uewerton Targino de Oliveira";
    private static int numberOne = 1;
    private static int numberTwo = 2;
    private static int numberthree;

    public static int SumNuberMichael(){
        return numberthree = numberOne + numberTwo;
    }

    public static String printName(){
        return getName();
    }

    public static String getName() {
        return name;
    }

    public static void main(String[] args){
        System.out.println(printName());
        System.out.println(SumNuberMichael());
    }
}