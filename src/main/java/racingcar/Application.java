package racingcar;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
        String Input = camp.nextstep.edu.missionutils.Console.readLine();
        String NumOfgame = camp.nextstep.edu.missionutils.Console.readLine();
        String[] name = Input.split(",");
        Car[] car = new Car[name.length];
        try{
            for(int i = 0; i < name.length; i++){
                if(name[i].length() > 5){
                    throw new IllegalArgumentException("[ERROR] 이름은 5글자 이내입니다.");
                }
            }
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        for(int i = 0; i < name.length; i++){
            car[i] = new Car(name[i]);
        }

    }
}
