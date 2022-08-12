package day11_stringManipulasion;

public class C07_startsWith
{
    public static void main(String[] args) {
         String input="java gun gectıkce guzellesir";
        System.out.println(input.startsWith("java"));
        System.out.println(input.startsWith(""));
        System.out.println(input.startsWith("gun",5));
    }
}
