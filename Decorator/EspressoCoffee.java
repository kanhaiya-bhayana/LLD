/**
 * The class EspressoCoffee implements the interface Coffee.
 */
public class EspressoCoffee implements Coffee{
    @Override
    public double getCost(){
        return 5.0;
    }

    @Override
    public String getDescription(){
        return "Espresso Coffee";
    }
}
