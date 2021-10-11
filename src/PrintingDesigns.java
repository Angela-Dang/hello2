public class PrintingDesigns {
    public static void main(String[] args) {
        int term=8;
        System.out.println("This is the first pattern.");
            for(int i=1; i<=term; i++) {
                for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
         System.out.println("");
     }
         System.out.println("");
        
        System.out.println("This is the second pattern.");
        int i, j;  
        for(i=0; i<term; i++) { 
            for(j=2*(term-i); j>=0; j--) {           
                System.out.print(" "); 
            } 
            for(j=0; j<=i; j++) {       
                System.out.print(" *"); 
            }           
            System.out.println(); 
        } 
        System.out.println("This is the third pattern.");
        for (i=0; i<term; i++) {
            for (j=term-i; j>3; j--) {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ ) {
                System.out.print("* ");
            }
        System.out.println();
        }
    }        
}
    

