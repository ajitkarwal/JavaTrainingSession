package JavaBasics;

public class TwoDimensionalArrays {

    public static void main(String[] args) {
        String array[][] = new String[3][5];
        System.out.println("No of rows are  : "+array.length);  // it will give total no of rows

        System.out.println("No of columns are : "+array[0].length); // this will give columns.
                                                    // as array[0] is first row and has four columns
        // 1st row
        array[0][0] ="A";
        array[0][1] ="B";
        array[0][2] ="C";
        array[0][3] ="D";
        array[0][4] ="E";

        //2nd row
        array[1][0] ="F";
        array[1][1] ="G";
        array[1][2] ="H";
        array[1][3] ="I";
        array[1][4] ="J";

        //3rd row
        array[2][0] ="K";
        array[2][1] ="L";
        array[2][2] ="M";
        array[2][3] ="N";
        array[2][4] ="O";

        System.out.println(array[1][3]);

        //to print all the values we need two loops to

        for(int i=0;i< array.length;i++){
            for (int j=0; j<array[0].length; j++){
                System.out.println(array[i][j]);
            }
        }

    }
}
