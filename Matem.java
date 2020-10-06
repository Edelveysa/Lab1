import java.lang.Math;

class Matem {
    short startFromShort = 7;
    final float minFloat = -6.0F;
    final float maxFloat = 5.0F;

    short[] arrayShort() {
        short[] d = new short[8];
        for (int i = 0; i < 8; i++) {
            d[i] = startFromShort;
            startFromShort += 2;

        }
        System.out.println();
        return d;
    }

    float[] arrayFloat() {
        float[] x = new float[14];
        for (int j = 0; j < x.length; j++) {
            x[j] = Randomize();
        }

        System.out.println();
        return x;
    }

    double[][] arrayDouble(short[] arrayShort, float[] arrayFloat) {
        double[][] d = new double[8][14];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                switch (arrayShort[i]) {
                    case 7:
                        d[i][j] = ScaryMath1(arrayFloat[j]);
                        break;
                    case 15:
                    case 17:
                    case 19:
                    case 21:
                        d[i][j] = ScaryMath2(arrayFloat[j]);
                        break;
                    default:
                        d[i][j] = ScaryMath3(arrayFloat[j]);
                        break;
                }
            }
        }
        return d;
    }

    void PrintArrayDouble(double[][] d) {
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(String.format("%.5f", d[i][j]) + "\t");
            }
            System.out.println();
        }
    }

    float Randomize() {
        return (float) (Math.random() * (minFloat - maxFloat) - minFloat);
    }

    double ScaryMath1(float number) {
        return Math.atan(Math.sin(Math.tan(Math.log(Math.abs(number)))));
    }

    double ScaryMath2(float number) {
        return Math.cos(Math.tan(Math.pow(number, number / 2)));
    }

    double ScaryMath3(float number) {
        return Math.pow((0.75 + Math.pow(0.75 / ((Math.sin(number)) / (Math.log(Math.abs(number)) - 2) + 1), Math.cos(Math.log(Math.abs(number))))) / (Math.asin(Math.pow(Math.cos(Math.cos(number + 1)), 2))), 3);
    }
}