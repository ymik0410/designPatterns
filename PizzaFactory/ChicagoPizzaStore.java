public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return ChicagoStylePepperoniPizza();
        } else return null;
    }
}