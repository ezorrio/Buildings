package io.ezorrio.buildings.model;

/**
 * Created by golde on 30.03.2017.
 */

/*
    2.2.1.1. Площадь помещения.
    2.2.1.2. Номер комнаты (сочетание цифр и букв).
    2.2.1.3. Наличие пожарных датчиков.
    2.2.1.4. Кол-во пожарных датчиков (доступен для редактирования при условии наличий этих самых датчиков).
    2.2.1.5. Название компании.
    2.2.1.6. Аренда / собственность.
    2.2.1.7. Количество офисов в нутрии данного офиса – вычисляемый параметр.
     */
public class Office extends Room{
    private boolean canHaveFire;
    private int fireCount;
    private String name;
    private boolean isOwner;
    private int innerOffices;

    public Office(int capacity, boolean canHaveFire, int fireCount, String name, boolean isOwner, int innerOffices){
        super(capacity);
        this.canHaveFire = canHaveFire;
        this.fireCount = fireCount;
        this.name = name;
        this.isOwner = isOwner;
        this.innerOffices = innerOffices;
    }

    public int getFireCount() {
        return fireCount;
    }

    public String getName() {
        return name;
    }

    public boolean isOwner(){
        return isOwner;
    }

    public boolean canHaveFire(){
        return canHaveFire;
    }

    public int getInnerOffices() {
        return innerOffices;
    }

    public void setCanHaveFire(boolean canHaveFire) {
        this.canHaveFire = canHaveFire;
    }

    public void setFireCount(int fireCount) {
        this.fireCount = fireCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(boolean owner) {
        isOwner = owner;
    }
}
