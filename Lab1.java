class Lab1 {
    public static void main(String[] agrs) {
        Matem maths = new Matem();
        short[] arrayShort = maths.arrayShort();
        float[] arrayFloat = maths.arrayFloat();
        double[][] arrayDouble = maths.arrayDouble(arrayShort, arrayFloat);
        maths.PrintArrayDouble(arrayDouble);
    }
}
