package DizilerPratik;

public class BHarfiYazdirma {
    public static void main(String[] args) {
        String[][] stars = new String[7][4];

        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                if (i == 0 || i ==6 || i==3) {
                    stars[i][j] = " * ";
                    if(j==3) stars[i][j] = "   ";
                
                }else  if (j == 0 || j == 3) {
                    stars[i][j] = " * ";
                } else {
                    stars[i][j] = "   ";
                }
            }
        }
        for (String[] row : stars) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
