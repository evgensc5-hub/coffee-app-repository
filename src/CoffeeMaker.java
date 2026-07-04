public class CoffeeMaker {
    Coffee makecoffe() {
        System.out.println("cafeaua se prepara ...");
        int t = (int) (Math.random() * 100);
        int c = (int) (Math.random()) * 100);
        Coffee coffee = new Coffee(t, c);
        return coffee;

    }
}
