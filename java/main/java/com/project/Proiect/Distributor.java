package com.project.Proiect;

 class Distributor {
    private int id;
    private String Name;
    private int money;



    public Distributor(int id, String name, int money) {
        this.id = id;
        Name = name;
        this.money = money;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    
}
