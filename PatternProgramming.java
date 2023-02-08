public class PatternProgramming{
    public static void main(String[] args) {
       // int n = 9;
        //square
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        //Right Angle Triangle
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Triangle
        // for (int i = n; i > 0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(" ");
        //     }
        //     if(i<n){
        //         for (int j = 0; j < n-i; j++) {
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        //H pattern
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //        if (j==0||i==(n-1)/2||j==n-1) {
        //         System.out.print("*");
        //        } else {
        //         System.out.print(" ");
        //        }
        //     }
        //     System.out.println();
        // }

        //I pattern
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //        if (i==0||j==(n-1)/2||i==n-1) {
        //         System.out.print("*");
        //        } else {
        //         System.out.print(" ");
        //        }
        //     }
        //     System.out.println();
        // }

        //E pattern
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //        if (i==0||i==(n-1)/2||i==n-1||j==0) {
        //         System.out.print("*");
        //        } else {
        //         System.out.print(" ");
        //        }
        //     }
        //     System.out.println();
        // }

        //F pattern
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //        if (i==0||i==(n-1)/2||j==0) {
        //         System.out.print("*");
        //        } else {
        //         System.out.print(" ");
        //        }
        //     }
        //     System.out.println();
        // }

        //D pattern
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //        if (j==0||i==0 && j<(n-1)/2||i==n-1 && j<(n-1)/2||j==(n-1)/2 && i>0 && i<n-1) {
        //         System.out.print("*");
        //        } else {
        //         System.out.print(" ");
        //        }
        //     }
        //     System.out.println();
        // }

        //S pattern
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //        if (i==0 && j>0 ||j==0 && i<(n-1)/2||j==n-1 && i>(n-1)/2||i==(n-1)/2 && j>0|| i==n-1) {
        //         System.out.print("*");
        //        } else {
        //         System.out.print(" ");
        //        }
        //     }
        //     System.out.println();
        // }

        //Diamond pattern
        // int n=11;
        // for (int i = 0; i < (n-1)/2; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i+j>=(n-1)/2 && j-i <= (n-1)/2) {
        //            System.out.print("*"); 
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for (int i = (n-1)/2; i <= n-1; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i-j <= (n-1)/2 && i+j <= n-1+(n-1)/2) {
        //            System.out.print("*"); 
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Assignment Gate Pattern
        int n=15;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0||j==0||i==n-1||j==n-1||i+j<=(n-1)/2||j-i>=(n-1)/2) {
                   System.out.print("*"); 
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}