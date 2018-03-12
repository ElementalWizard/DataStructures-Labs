import java.util.Random;
import java.util.Scanner;

public class Race {


    public static void main(String[] args){

        RaceCar car1 = new RaceCar(new Random().nextInt(100),"Pedro");
        RaceCar car2 = new RaceCar(new Random().nextInt(100),"Zap");
        System.out.println(car1.speed);
        System.out.println(car2.speed);
        car1.setSpeed((float)Math.pow(car1.getSpeed(),2.0));
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter car1's name: ");
        car1.carName = scanner.nextLine();
        System.out.println("Enter car2's name: ");
        car2.carName = scanner.nextLine();
        RaceCar[] raceCars = new RaceCar[2];
        raceCars[0]=car1;
        raceCars[1]=car2;
        System.out.println(race(raceCars).carName + " is the winner.");
        scanner.close();
    }

    public static RaceCar race(RaceCar[] cars){
        RaceCar winner = new RaceCar(0,"Dummy");

        for (int i=0;i<cars.length;i++){
            if(cars[i].speed > winner.speed){
                winner = cars[i];
            }

        }

        return winner;
    }


}
