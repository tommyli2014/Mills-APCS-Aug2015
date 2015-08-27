
/**
 * Write a description of class mississippi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mississippi
{
    public static void main(String[] args) {
        bigM();
        bigI();
        bigS();
        bigS();
        bigI();
        bigS();
        bigS();
        bigI();
        bigP();
        bigP();
        bigI();
    }
    
    public static void bigM() {
        twoM();
        System.out.println("MM   MM");
        System.out.println("M M M M");
        System.out.println("M  M  M");
        twoM();
        twoM();
        twoM();
    }
    
    public static void twoM() {
        System.out.println("M     M");
    }
    
    public static void bigI() {
        fiveI();
        oneI();
        oneI();
        oneI();
        oneI();
        oneI();
        fiveI();
    }
    
    public static void fiveI() {
        System.out.println("IIIII");
    }
    
    public static void oneI() {
        System.out.println("  I  ");
    }
    
    public static void bigS() {
        fiveS();
        twoS();
        System.out.println("S      ");
        fiveS();
        System.out.println("      S");
        twoS();
        fiveS();
    }
    
    public static void fiveS() {
        System.out.println(" SSSSS ");
    }
    
    public static void twoS() {
        System.out.println("S     S");
    }
    
    public static void bigP() {
        sixP();
        twoP();
        twoP();
        sixP();
        oneP();
        oneP();
        oneP();
    }
    
    public static void sixP() {
        System.out.println("PPPPPP ");
    }
    
    public static void twoP() {
        System.out.println("P     P");
    }
    
    public static void oneP() {
        System.out.println("P      ");
    }
}