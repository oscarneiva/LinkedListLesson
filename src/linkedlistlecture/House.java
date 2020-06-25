package linkedlistlecture;

public class House {
    private Double dimensions;
    private Double height;

    public House(Double dimensions, Double height) {
        this.dimensions = dimensions;
        this.height = height;
    }

    public Double getDimensions() {
        return dimensions;
    }

    public void setDimensions(Double dimensions) {
        this.dimensions = dimensions;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
