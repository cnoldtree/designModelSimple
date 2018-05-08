package me.tree.designmodelsimple.Builder;

/**
 * Created by tree on 4/26/2018.
 */

public abstract class CarBuilder {
    public abstract CarBuilder buildBrand();

    public abstract CarBuilder buildModel(String model);

    public abstract CarBuilder buildColor(String color);

    public abstract Car create();
}
