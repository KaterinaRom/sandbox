package katerinarom.exercises;

import java.util.Scanner;
import java.lang.String;
/**
 Create an object class Car, using the classes Wheel, Engine.
 Methods: move, add_fuel, change_wheel, show info about the car.
 */

final class Engine { //The engine has a number and power, as well as methods for entering engine parameters from the console and converting to a string.
  private int number; //class Engine fields
  private int power;

  Engine( //constructor fields
      int number,
      int power) {
    this.number = number;
    this.power = power;
  }

  static Engine get(Scanner scanner) {
    Engine object = new Engine(0, 0);
    System.out.print("Please enter an engine number: ");
    object.number = scanner.nextInt();
    System.out.print("Please enter an engine power: ");
    object.power = scanner.nextInt();
    return object;
  }

  public String toString() { //method for converting parameters entered from the console into a string (for displaying on the screen)
    return "Engine{" +
        "engine= " + number + "\'" +
        " power=" + power + "\'" +
        '}';
  }
}

final class Wheel {
  public enum Type { Winter, Summer }
  private int diameter;
  private String brand;
  private Type type;

  Wheel (
      int diameter,
      String brand,
      Type type) {
    this.diameter = diameter;
    this.brand = brand;
    this.type = type;
  }


  public String toString() { //concatenation
    String string = "";
    string += brand + "(" + diameter + "): ";
    if (type == Type.Winter) {
      string += "Winter";
    } else {
      string += "Summer";
    } return string;
  }

  public static Wheel get(Scanner scanner) {
    Wheel object = new Wheel(0, " ", Type.Winter);
    System.out.print("Please enter a brand: ");
    object.brand = scanner.next();
    System.out.print("Please enter a diameter: ");
    object.diameter = scanner.nextInt();

    System.out.print("Please enter a type (1) - for winter, (2) - for summer: ");
    while (true) {
      int value = scanner.nextInt();
      if (value == 1) {
        object.type = Type.Winter;
        break;
      }
      if (value == 2) {
        object.type = Type.Summer;
        break;
      }
      System.out.print("You entered a wrong number, please try again.");
    }
    return object;
  }

  public int getDiameter() {
    return this.diameter;
  }
}

class Car {
  private Wheel[] wheels;
  private Engine engine;
  private String brand;
  private int consumption;
  private int fuel_level;

  Car(
      String brand,
      int consumption,
      Engine engine,
      Wheel[] wheels,
      int fuel_level) {
    this.brand = brand;
    this.consumption = consumption;
    this.engine = engine;
    this.wheels = wheels;
    this.fuel_level = fuel_level;
  }

  public String toString() {
    String string;
    string = brand + engine.toString() + ";" + consumption + "L/100km { " + fuel_level + "}; [";
    for (int i = 0; i < 4; i++) {
      string = wheels[i].toString() + " ";
    }
    return string;

  }

  public static Car get(Scanner scanner) {
    Car object = new Car("", 0, new Engine(0, 0), new Wheel[4], 0);
    System.out.print("Please enter a car brand: ");
    object.brand = scanner.next();
    System.out.print("Please enter gasoline consumption per every 100km: ");
    object.consumption = scanner.nextInt();
    System.out.print("Please enter a current gasoline level:");
    object.fuel_level = scanner.nextInt();
    System.out.println("Please enter wheels:");
    for (int i = 0; i < 4; i++) {
      System.out.println("a wheel #" + i);
      object.wheels[i] = Wheel.get(scanner);
    }
    object.engine = Engine.get(scanner);
    return object;
  }

  public void move() {
    if (fuel_level <= 0) {
      System.out.println("No gasoline, the car can't move");
      return;
    }
    for (int i = 1; i < 4; ++i) {
      if (wheels[i].getDiameter() != wheels[i - 1].getDiameter()) {
        System.out.println("The wheels have different diameters, the car can't move");
        return;
      }
    }
    int distance = fuel_level / consumption;
    System.out.println("the car is running " + distance * 100 + "km.");
    fuel_level = 0;
  }

  public void add_fuel(int value) {
    fuel_level += value;
  }

  public void change_wheel(Scanner scanner) {
    System.out.println("Please enter car's wheel number [0-3]:");
    int number;
    while (true) {
      number = scanner.nextInt();
      if (number >= 0 && number <= 3)
        break;
      System.out.println("You entered a wrong number, please try again");
    }
    wheels[number] = Wheel.get(scanner);
  }
}


class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Car car = Car.get(scanner);
    while (true) {
      System.out.println(
          "Please choose a menu item:\n" +
              "0. exit\n" +
              "1. move\n" +
              "2. add_fuel\n" +
              "3. change_wheel\n" +
              "4. show information about a car (a brand too)\n" +
              ": ");
      int choice = scanner.nextInt();
      if (choice == 0)
        break;
      if (choice < 1 || choice > 4) {
        System.out.println("you selected a wrong menu item, please try again.");
        continue;
      }
      switch (choice) {
        case 1:
          car.move();
          break;
        case 2:
          System.out.println("Please enter a gasoline level:");
          int fuel = scanner.nextInt();
          car.add_fuel(fuel);
          break;
        case 3:
          car.change_wheel(scanner);
          break;
        case 4:
          System.out.println(car.toString());
          break;
      }
    }
  }
}
