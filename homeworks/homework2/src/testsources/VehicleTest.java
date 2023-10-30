import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class VehicleTest {

    @Test
    public void itsCarIsVehicle(){
        Car car = new Car("Toyota", "Corolla", 2012);
        assertThat(car).isInstanceOf(Vehicle.class);
    }
    @Test
    public void itsMotorcycleIsVehicle(){
        Motorcycle motorcycle =  new Motorcycle("Suzuki", "SV 400", 2017);
        assertThat(motorcycle).isInstanceOf(Vehicle.class);
    }

    @Test
    public void itsCarCreateWithFourWheels(){
        Car car = new Car("Toyota", "Corolla", 2012);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
    @Test
    public void itsMotorcycleCreateWithTwoWheels(){
        Motorcycle motorcycle =  new Motorcycle("Suzuki", "SV 400", 2017);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    public void itsCarSpeed(){
        Car car = new Car("Toyota", "Corolla", 2012);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }
    @Test
    public void itsMotorcycleSpeed(){
        Motorcycle motorcycle =  new Motorcycle("Suzuki", "SV 400", 2017);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    public void itsCarParking(){
        Car car = new Car("Toyota", "Corolla", 2012);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
    @Test
    public void itsMotorcycleParking(){
        Motorcycle motorcycle =  new Motorcycle("Suzuki", "SV 400", 2017);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}
