import java.util.ArrayList;
import java.util.HashMap;

public class Collections_Study {
    public static void main(String[] args) {
        // 데이터를 효율적으로 관리하게 해주는 클래스 collections
        // list 와 map 이 있다.
        // list : 인터페이스로 이를 구현한 클래스는 인덱스를 이용하여 데이터를 관리한다.
        // vector, ArrayList, LinkedList 가 있다. ArrayList를 자주 쓴다.

        // ArrayList 객체 생성 법, 꺽새 안에 데이터 타입 명시를 해준다.
        ArrayList<String> list1 = new ArrayList<String>();

        // 데이터 추가
        list1.add("Hello");
        list1.add("Tom");
        list1.add("good");

        // 인덱스를 넣어서 데이터를 add할 수 있다.
        list1.add(2, "Jiwon"); // 2번째 인덱스에 들어가게 됨, 앞에 good이 뒤로 밀림
        System.out.println(list1);

        list1.set(1, "TomTom"); // 1번째 인덱스로 들어가는데 기존에 있는 데이터를 제거하고 들어감
        System.out.println(list1);

        // 데이터 추출 -> 제거 아님
        String str = list1.get(2); // 2번째 인덱스 데이터 추출함
        System.out.println(str + " 리스트 내부 데이터: " + list1);

        // 데이터 제거
        str = list1.remove(2);
        System.out.println(str + " 리스트 내부 데이터: " + list1);

        // 리스트 내부 전체 제거
        list1.clear();

        // 데이터 유무 확인
        boolean isReal = list1.isEmpty();
        System.out.println(isReal);

        // Map : 인터페이스로 key를 이용하여 데이터를 관리
        // 특징 : key를 이용한다, key는 중복되면 안된다, 데이터는 중복되도 된다.

        // HashMap 객체 생성법 , 키, 밸류 순서대로 데이터 타입을 적어준다.
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();

        // 데이터 추가
        map1.put(1, "Hello");
        map1.put(2, "Hello");
        map1.put(3, "Java");
        System.out.println(map1);

        // 데이터 교체
        map1.put(3, "Python");
        System.out.println(map1);

        // 데이터 추출
        str = map1.get(3);

        // 데이터 제거
        map1.remove(3);
        System.out.println(map1);

        // 특정 데이터 포함 유무
        isReal = map1.containsKey(2);
        System.out.println(isReal);
        isReal = map1.containsValue("Java");
        System.out.println(isReal);

        // 데이터 전체 제거
        map1.clear();

        // 데이터 유무
        isReal = map1.isEmpty();
        System.out.println(isReal);
    }
}
