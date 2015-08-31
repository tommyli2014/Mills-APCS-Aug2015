
/**
 * Write a description of class SimmsSong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimmsSong
{
  public static void firstline() {
      System.out.print("There's an old lady who swallowed a ");
    }
  
  public static void idkwhy() {
      System.out.println("I don't know why");
    }
  
  
  public static void swallowthe() {
      System.out.print("She swallowed the ");
    }
  
  public static void die() {
      System.out.println("Perhaps she'll die.");
    }
    
  public static void swallowa() {
      System.out.print("She swallowed a" );
    }
    
  public static void tocatch() {
      System.out.print(" to catch the ");
    }
    
  public static void fly() {
      System.out.print("fly");
    }
  
    public static void spider() {
      System.out.print("spider");
    }
    
    public static void bird(){
      System.out.print("bird");
    }
    
    public static void cat() {
      System.out.print("cat");
    }
    
    public static void dog() {
      System.out.print("dog");
    }
    
    public static void cow() {
      System.out.print("cow");
    }
    
    public static void horse() {
      System.out.print("horse");
    }
    
    public static void period() {
        System.out.println(".");
    }
    
    public static void spiderfly() {
        swallowthe();
        spider();
        tocatch();
        fly();
        period();
        idkwhy();
        System.out.println("Shw swallowed the fly");
        die();
    }
    
    public static void birdspider(){
        swallowthe();
        bird();
        tocatch();
        spider();
        period();
    }
    
    public static void catbird() {
         swallowthe();
        cat();
        tocatch();
        bird();
        period();
    }
    
    public static void main(String[] args) {
        firstline();
        fly();
        System.out.println();
        System.out.println("I don't know why she wallowed the fly");
        die();
        System.out.println("But it's only a fly");
        System.out.println("I think I'll cry");
        System.out.println("She gulped it out of the sky");
        System.out.println("Oh, my!");
        System.out.println();
        
        firstline();
        spider();
        System.out.println();
        System.out.println("That wiggled and jiggled and tickled inside her.");
        spiderfly();
        System.out.println("Gone to the by and by");
        System.out.println("Sigh");
        System.out.println();
        
        firstline();
        bird();
        period();
        System.out.print("How absurd! ");
        swallowa();
        bird();
        System.out.println("!");
        birdspider();
        spiderfly();
        System.out.println("She'll leave us high and dry");
        System.out.println();
        
        firstline();
        cat();
        period();
        System.out.print("Imagine that! ");
        swallowa();
        cat();
        period();
        catbird();
        birdspider();
        spiderfly();
        System.out.println("I hope it's a lie");
        System.out.println();
        
        firstline();
        horse();
        period();
        System.out.println("She died, of course.");
        System.out.println("It was the last course.");
        System.out.println("I'm filled with remorse");
        System.out.println("What's left to say...");
        System.out.println("Even the artist is crying.");
        System.out.println("We'll miss her dearly.");
        System.out.println("It's such a loss.");
        System.out.println("She had no time to floss.");
        System.out.println("She missed out on the sauce");
        System.out.println();
        System.out.println("Moral: Never swallow a horse.");
    }
        
}
