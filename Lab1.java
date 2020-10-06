import java.lang.Math;

class Lab1 {
    public static void main(String[] agrs) {
        Matem maths = new Matem();
        short[] arrayShort = maths.arrayShort();
        System.out.println();
        float[] arrayFloat = maths.arrayFloat();
        System.out.println();
        double[][] arrayDouble = maths.arrayDouble(arrayShort, arrayFloat);
        maths.PrintArrayDouble(arrayDouble);
    }

}
