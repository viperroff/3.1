public class Gun {
    private int ammo;
    private int returnedAmmo = 0;
    final int maxAmmo;

    public Gun(){
        this(5, 5);
    }

    public Gun(int ammo, int maxAmmo){
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
    }

    public String getMaxAmmo(){
        return "Максимальное количество патронов: " + this.maxAmmo;
    }

    public String getAmmo(){
        return "Заряжено патронов сейчас: " + this.ammo;
    }

    public String getCharge(){
        String result = this.ammo == 0 ? "пистолет разряжен" : "пистолет заряжен";
        return result;
    }

    public String shoot(){
        String result = "Клац!";
        if(ammo > 0){
            ammo-= 1;
            result = "Бах!";
        }
        return result;
    }

    public String recharge(int ammo){
        String result;
        if(ammo < 0) throw new IllegalArgumentException("Количество патронов не может быть отрицательным");
        if(ammo > this.maxAmmo){
            this.ammo = this.maxAmmo;
            this.returnedAmmo = ammo - this.maxAmmo;
            result = "Пистолет перезаряжен на " + this.ammo + " патронов, возвращено: " + (ammo - this.maxAmmo);
        }else {
            this.ammo = ammo;
            result = "Пистолет перезаряжен на" + this.ammo + "патронов";
        }
        return result;
    }

    public String discharge(){
        this.returnedAmmo = this.ammo;
        this.ammo = 0;
        return "Пистолет был разряжен, было возвращено " + this.returnedAmmo + " патронов";
    }



}
