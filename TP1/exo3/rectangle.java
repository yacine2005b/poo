public class rectangle {
    private point lowerLeft;
    private point upperRight;
    private static int nbr = 0;

    
    public rectangle(float x1, float y1, float x2, float y2) {
        this.lowerLeft = new point(x1, y1);
        this.upperRight = new point(x2, y2);
        nbr++;
    }

    
    public rectangle(point lowerLeft, point upperRight) {
        this.lowerLeft = lowerLeft;
        this.upperRight = upperRight;
        nbr++;
    }

    
    public float calculateLength() {
        return Math.abs(upperRight.getX() - lowerLeft.getX());
    }

        public float calculateWidth() {
        return Math.abs(upperRight.getY() - lowerLeft.getY());
    }

        public float calculateSurface() {
        return calculateLength() * calculateWidth();
    }

    
    public static int getNumberOfRectangles() {
        return nbr;
    }
}
