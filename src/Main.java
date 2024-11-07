public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 3);

        System.out.println("Первая дробь: " + fraction1);
        System.out.println("Вторая дробь: " + fraction2);
        System.out.println("Результат сложения: " + fraction1.sum(fraction2));


        //3.1.2

        ClosedLine closedLine = new ClosedLine();
        closedLine.addPoint(new Point(0, 0));
        closedLine.addPoint(new Point(3, 0));
        closedLine.addPoint(new Point(3, 4));
        closedLine.addPoint(new Point(0, 4));

        System.out.println("Длина замкнутой ломаной: " + closedLine.calculateLength());


        //3.1.3

        City a = new City("Нью-Йорк");
        City b = new City("Лос-Анджелес");
        City c = new City("Саратов");

        a.addConnection(b, 1000);
        b.addConnection(c, 2800);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //3.1.4

        GunMachine gun1 = new GunMachine();
        System.out.println(gun1.shoot());
        GunMachine gun2 = new GunMachine(300, 30);
        System.out.println(gun2.shootTimes(5));

        //3.1.5

        Points points1 = new Points(1, 2, 3);

    }
}