abstract class Sportsman
{
    ShootType shootType;
    RunningType runningType;
  
    public Sportsman(ShootType shootType,
                RunningType runningType)
    {
        this.shootType = shootType;
        this.runningType = runningType;
    }

    
    public void shoot()
    {

        shootType.shoot();
    }
    public void run()
    {
  
        runningType.run();
    }

    public void setShootType(ShootType shootType)
    {
        this.shootType = shootType;
    }
    public void setRunningType(RunningType runningType)
    {
        this.runningType  = runningType;
    }
}