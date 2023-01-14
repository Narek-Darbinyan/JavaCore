package homework2;

public class FigurePainter1 {
    void figureOne(int n, char $) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print($ + " ");
            }
            System.out.println();
        }

        }


        void figureTwo () {
        for (int i = 0; i < 15; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

        void figureThree () {
            for (int i = 0; i < 5; i++) {
                for (int j = 4; j > i; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            }

        }
    }




