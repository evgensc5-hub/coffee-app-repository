public class DrimkCoffee {
    void drinkCoffee(Coffee coffee) throws TemperatureException, ConcentrationException{
        if (coffee.getTemp() > 65) {
    throw new TemperatureException(coffee.getTemp(),"Cafeaua e prea fierbinte. 0 aruncam!");

        }else {
            System.out.println("t: "+ coffee.getTemp());
        }
        if(coffee.getConc() > 55){
            throw new ConcentrationException(coffee.getConc(), "Concentratia mare. 0 aruncam!");

        }else {
            System.out.println("c: " + coffee.getConc());
        }
    }
}
