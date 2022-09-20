interface Human
{
    public void talk();
}
  
interface Animal
{
    public void communicate();
}
  

public class Main
{
    public static void main(String args[])
    {
        Adult John  = new Adult();
        Baby Mike = new Baby();
        Dog Azorel  = new Dog();
        Cat Motan = new Cat();
        Animal Parrot = new TalkingParrot(John);

        System.out.println("John says: ");
        John.talk();
        System.out.println("Mike says: ");
        Mike.talk();
        System.out.println("Azorel says: ");
        Azorel.communicate();
        System.out.println("Motan says: ");
        Motan.communicate();
        System.out.println("Parrot says: ");
        Parrot.communicate();

}}
    

