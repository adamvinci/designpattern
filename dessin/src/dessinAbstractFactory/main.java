package dessinAbstractFactory;

public class main {
    public static void main(String[] args) {
        DrawCar drawCar = new DrawCar();
        drawCar.draw(6,new CircleStrategy());
    }
}
