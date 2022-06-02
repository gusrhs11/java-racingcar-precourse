package racingcar;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행

        String[] name = nameExceptionRecursion();

        Car[] car = new Car[name.length];
        for(int i = 0; i < name.length; i++){
            car[i] = new Car(name[i]);
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
}

    private static String numberExceptionRecursion() {
        String numOfGame = camp.nextstep.edu.missionutils.Console.readLine();
        int numOfGame_int;
        try{
            numOfGame_int = Integer.parseInt(numOfGame);
        }catch(IllegalArgumentException e){
            System.out.println("[ERROR] 숫자를 입력하십시오");
            numberExceptionRecursion();
        }
}
