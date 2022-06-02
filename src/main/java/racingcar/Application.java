package racingcar;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행

        String[] name = nameExceptionRecursion();
        int numOfGame = numberExceptionRecursion();
        int maxLen = -1;
        Car[] car = new Car[name.length];
        for(int i = 0; i < name.length; i++){
            car[i] = new Car(name[i]);
        }

        for(int i = 0; i < numOfGame; i++){
            for(int j = 0; j < name.length; j++){
                car[j].move();
                car[j].print();
            }
            System.out.println();
        }

        for(int i = 0; i < name.length; i++){
            if(car[i].getPosition() > maxLen){
                maxLen = car[i].getPosition();
            }
        }
        for(int i = 0; i < name.length; i++){
            if(car[i].getPosition() == maxLen){
                System.out.print(car[i].getName());
            }
        }



    }

    private static String[] nameExceptionRecursion() {
        String Input = camp.nextstep.edu.missionutils.Console.readLine();
        String[] name = Input.split(",");
        try{
            for(int i = 0; i < name.length; i++){
                if(name[i].length() > 5){
                    throw new IllegalArgumentException("[ERROR] 이름은 5글자 이내입니다.");
                }
            }
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
            nameExceptionRecursion();
        }
        return name;
    }

    private static int numberExceptionRecursion() {
        String numOfGame = camp.nextstep.edu.missionutils.Console.readLine();
        int numOfGame_int = 0;
        try {
            numOfGame_int = Integer.parseInt(numOfGame);
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] 숫자를 입력하십시오");
            numberExceptionRecursion();
        }
        return numOfGame_int;
    }
}


        /*
        for(iter = 0; iter < numOfGame.length(); iter++){
            if((int)numOfGame.charAt(iter) <= 9 && (int)numOfGame.charAt(iter) >= 0){
                continue;
            }
            break;
        }
        if(iter == numOfGame.length()){
            numOfGame_int = Integer.parseInt(numOfGame);
        }
        */
