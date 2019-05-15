
package com.coderbd;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CarController {
  List<Car> cars;

    public List<Car> getCars() {
        cars = new ArrayList<>();
        cars.add(new Car("Bd Nano", "Bangladesh will start producing BD"));
        cars.add(new Car("Tata Nano", "Tata nan Project"));
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
  
  
    
}
