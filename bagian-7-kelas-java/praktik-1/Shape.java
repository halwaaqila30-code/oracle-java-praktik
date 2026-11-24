public class Shape {
    private int numSides;
    private boolean regular;

    public Shape() {
        this.numSides = 3;
        this.regular = false;
    }

    public Shape(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape(4, true);

        System.out.println("Shape 1 -> sisi: " + s1.getNumSides() + ", beraturan: " + s1.isRegular());
        System.out.println("Shape 2 -> sisi: " + s2.getNumSides() + ", beraturan: " + s2.isRegular());
    }
}