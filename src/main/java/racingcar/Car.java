package racingcar;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }
    public void move(){
        int randNum = camp.nextstep.edu.missionutils.Randoms.pickNumberInRange(0, 9);
        if(randNum >= 4){
            position++;
            return;
        }
    }
    public void print(){
        System.out.print(name + " : ");
        for(int i = 0; i < position; i++){
            System.out.print('-');
        }
        System.out.println();
    }

    public int getPosition(){
        return position;
    }

    // 추가 기능 구현
}
