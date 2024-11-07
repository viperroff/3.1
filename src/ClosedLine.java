class ClosedLine extends Line {
    @Override
    public double calculateLength() {
        double length = super.calculateLength();
        if (getPoints().size() > 0) {
            length += distance(getPoints().get(getPoints().size() - 1), getPoints().get(0));
        }
        return length;
    }
}