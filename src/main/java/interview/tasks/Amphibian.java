package src.main.java.interview.tasks;

public class Amphibian {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        drive(car);
        flow(boat);
        Amphibious carBoat = new Amphibious() {
            @Override
            public void move() {

                super.move();
            }
        };
        drive(carBoat);
        flow(carBoat);
    }

    static void drive(Car car) {
        car.drive();
    }

    static void flow(Boat boat) {
        boat.flow();
    }

    static class Car {
        void drive() {
            System.out.println("Many code: car drive");
        }
    }

    static class Boat {
        void flow() {
            System.out.println("Many code: boat flow");
        }
    }

    public abstract static class Amphibious {
        protected String name;
        protected int maxSpeed;

        public void move() {
        }
    }

    public static class LandAmphibian extends Amphibious {
        // Дополнительные свойства для перемещения по суше
        private final int numberOfWheels;

        public LandAmphibian(String name, int maxSpeed, int numberOfWheels) {
            this.name = name;
            this.maxSpeed = maxSpeed;
            this.numberOfWheels = numberOfWheels;
        }

        @Override
        public void move() {
            System.out.println("Moving on land " + maxSpeed + "km/h with " + numberOfWheels + " wheels");
        }
    }

    public static class WaterAmphibian extends Amphibious {
        // Дополнительные свойства для перемещения по воде
        private final int numberOfPropellers;

        public WaterAmphibian(String name, int maxSpeed, int numberOfPropellers) {
            this.name = name;
            this.maxSpeed = maxSpeed;
            this.numberOfPropellers = numberOfPropellers;
        }

        @Override
        public void move() {
            System.out.println("Moving on water " + maxSpeed + "km/h with " + numberOfPropellers + " propellers");
        }
    }

    public static void drive(Amphibious vehicle) {
        // Создаем экземпляр амфибии для перемещения по суше
        LandAmphibian landAmphibian = new LandAmphibian("Land Vehicle", 100, 4);
        landAmphibian.move();
    }

    public static void flow(Amphibious vehicle) {
        // Создаем экземпляр амфибии для перемещения по воде
        WaterAmphibian waterAmphibian = new WaterAmphibian("Water Vehicle", 50, 2);
        waterAmphibian.move();
    }
}
