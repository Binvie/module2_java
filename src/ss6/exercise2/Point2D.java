package ss6.exercise2;

public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[]{x,y};
    }
    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                "\n array (" + x + ',' + y + ')'+
        '}';
    }
}
