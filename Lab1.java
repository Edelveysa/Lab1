class Lab1{
    
    public static void main(String[] args){

        short firstnumber = 7;
        short[] d1 = new short[8];
        for(int i = 0; i < 8; i++){
            d1[i] = firstnumber;
            firstnumber += 2;
        }

        float[] x = new float[14];
        for(int j = 0; j<14; j++){x[j] = (float)(Math.random()*11-6);}

        double[][] d = new double[8][14];
        for(int i = 0; i<8; i++){
            for(int j = 0; j<14; j++){
                switch (d1[i]){
                    case 7:
                        d[i][j]=Math.atan(Math.sin(Math.tan(Math.log(Math.abs(x[j])))));
                        break;
                    case 15:
                    case 17:
                    case 19:
                    case 21:
                        d[i][j]=Math.cos(Math.tan(Math.pow(x[j], x[j]/2)));
                        break;
                    default: d[i][j]=Math.pow( (0.75+Math.pow(0.75/((Math.sin(x[j]))/(Math.log(Math.abs(x[j]))-2)+1),Math.cos(Math.log(Math.abs(x[j]))))) / (Math.asin(Math.pow(Math.cos(Math.cos(x[j]+1)), 2))), 3);
                        break;
                }
            }
        }

        for(int i = 0; i<8; i++){
            for(int j = 0; j<14; j++){
                System.out.print(String.format("%.5f", d[i][j])+"\t");

            }
            System.out.println();
        }



    }
}
