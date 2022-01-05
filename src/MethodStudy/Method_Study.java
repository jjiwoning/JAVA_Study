package MethodStudy;

public class Method_Study {
    private String name;
    private String gender;
    private int age;

    // 기본 생성자
    public Method_Study(){
        name = "NULL";
        gender = "NULL";
        age = 0;
    }

    // 변수를 받는 생성자 name, gender, age
    public Method_Study(String yourName, String yourGender, int yourAge){
        name = yourName;
        gender = yourGender;
        age = yourAge;
    }

    // child의 정보를 불러오는 함수
    public void getInfo(){
        System.out.println("이름: " + name);
        System.out.println("성별: " + gender);
        System.out.println("나이: " + age);
    }
    // 아이 이름 설정 함수
    public void setName(String yourName){
        name = yourName;
    }
    // 아이 성별 설정 함수
    public void setGender(String yourGender){
        gender = yourGender;
    }
    // 아이 나이 설정 함수
    public void setAge(int yourAge){
        age = yourAge;
    }
}
