public abstract class Beverage {
    // introducing sizes to the menu
    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    // Added 2 methods - Setter and getter
    public void setSize(Size size) {
        this.size = size;
    }
    public Size getSize() {
        return this.size;
    }

    public abstract double cost();
}
