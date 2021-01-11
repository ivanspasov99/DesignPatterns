package III;

public class decoratorPatternMain {

    public static void main(String arg[]) {
        Beverage beverage = new Espresso();

        System.out.printf("Desc: %s\nPrice: %f\n\n\n" , beverage.getDesc(), beverage.cost());

        beverage = new Mocha(beverage);

        System.out.printf("Desc: %s\nPrice: %f\n\n\n" , beverage.getDesc(), beverage.cost());

        beverage = new Cream(beverage);

        System.out.printf("Desc: %s\nPrice: %f\n\n\n" , beverage.getDesc(), beverage.cost());
    }
}