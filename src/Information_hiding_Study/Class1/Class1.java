package Information_hiding_Study.Class1;

public class Class1 {
    private String name;
    private int age;
    private String job;

    public Class1(){
        name = "None";
        age = 0;
        job = "None";
    }

    // Setter(Mutator) 설정부 : 리턴이 없고 매개변수를 받는다.
    public void setInfo(String name, int age, String job){
        this.name = name;
        this.age = age;
        this.job = job;
    }
    // Getter(Accessor) 설정부 : 원래는 각 변수를 리턴해주는데 편의상 프린트로 바꿈 매개변수 없음.
    public void getInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(job);
    }
    // 인텔리제이에 getter 와 setter 자동 완성 기능이 있다. -> 잘 활용하자.
    // generator 에 있다.
}
