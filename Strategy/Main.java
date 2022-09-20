interface ShootType
{
    public void shoot();
}

interface RunningType
{
    public void run();
}

public class Main
{
    public static void main(String args[])
    {
        RunningType fast = new FastRunning();
        RunningType slow = new SlowRunning();
        ShootType shoot = new FootShoot();
  
        Sportsman CR7 = new FootballPlayer(shoot,slow);
  
        CR7.shoot();
        CR7.run();
  
        CR7.setRunningType(fast);
        CR7.run();
    }
}