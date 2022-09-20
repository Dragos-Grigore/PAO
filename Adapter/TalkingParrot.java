  
class TalkingParrot implements Animal 
{
    Human parrot;
    public TalkingParrot(Human parrot)
    {
        this.parrot = parrot;
    }
  
    public void communicate()
    {
        parrot.talk();
    }
}