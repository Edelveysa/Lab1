import java.lang.Math;

class Matem {
    private short arrayNumber = 7;
    private final float MIN = -6.0F;
    private final float MAX = 5.0F;
    private final a = 8;
    private final b = 14;
   

    short[] arrayShort() {
        short[] d = new short[8];
        for (int i = 0; i < d.length; i++) {
            d[i] = arrayNumber;
            arrayNumber += 2;

        }
        return d;
    }

    float[] arrayFloat() {
        float[] x = new float[14];
        for (int j = 0; j < x.length; j++) {
            x[j] = randomize();
        }

        return x;
    }

    double[][] arrayDouble(short[] arrayShort, float[] arrayFloat) {
        double[][] d = new double[8][14];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                switch (arrayShort[i]) {
                    case 7:
                        d[i][j] = scaryMath1(arrayFloat[j]);
                        break;
                    case 15:
                    case 17:
                    case 19:
                    case 21:
                        d[i][j] = scaryMath2(arrayFloat[j]);
                        break;
                    default:
                        d[i][j] = scaryMath3(arrayFloat[j]);
                        break;
                }
            }
        }
        return d;
    }

    void printArrayDouble(double[][] d) {
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.format("%-10.5f", d[i][j]);
            }
            System.out.println();
        }
    }

    float randomize() {
        return (float) (Math.random() * (MIN - MAX) - MIN);
    }

    double scaryMath1(float number) {
        return Math.atan(Math.sin(Math.tan(Math.log(Math.abs(number)))));
    }

    double scaryMath2(float number) {
        return Math.cos(Math.tan(Math.pow(number, number / 2)));
    }

    double scaryMath3(float number) {
        return Math.pow((0.75 + Math.pow(0.75 / ((Math.sin(number)) / (Math.log(Math.abs(number)) - 2) + 1), Math.cos(Math.log(Math.abs(number))))) / (Math.asin(Math.pow(Math.cos(Math.cos(number + 1)), 2))), 3);
    }
}
