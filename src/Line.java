class Line {
    private int a;
    private int b;
    private int c;

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSlope() {
        return -a/(double)b;
    }

    public boolean isOnLine(int x, int y) {
        if (a * x + b * y + c == 0)
            return true;
        else
            return false;
    }

    public boolean isParallel(Line other) {
        if (other.getSlope() == getSlope())
            return true;
        else
            return false;
    }

    public String toString() {
        return a + "x + " + b + "y + " + c + " = 0";
    }
}
