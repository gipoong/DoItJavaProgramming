package chapter12;

public class GenericPrinter<T extends Material> {

    private T material;

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return this.material;
    }

    public String toString() {
        return material.toString();
    }
}
