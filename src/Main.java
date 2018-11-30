import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars= new ArrayList<Car>();

        cars.add(new Car(4,Enumerations.CarType.HatchBack, "Volkswagon", "VW", "R"));
        try {
            cars.add(new FamilyCar(4, Enumerations.CarType.Saloon, "Volvo", "CrossCountry", "",1));
        }
        catch (Exception ex)
        {
            System.out.println("Could not add car. Exception thrown:" + ex.getMessage());
        }
        cars.add(new SuperCar(2, Enumerations.CarType.HatchBack, "Audi", "TTS","Quattrosport",300,4 ));

        for (Car car:cars
             ) {
            System.out.println(car.toString());
        }


        System.out.println("this is the fist car index 0:" + cars.get(0));

    }

}
