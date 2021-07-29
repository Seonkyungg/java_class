public class Test {

    // 입력값과 출력값이 있는경우
    public int sum(int a, int b){
        return a+b;
    }

    // 출력만 있는경우
    public String say(){
        return "Hi";
    }
    
    public static void sum(int a, int b){
        System.out.println(a+"and"+b+"SUM :"+(a+b));
    }
        
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        Test myTest = new Test();
        int c = myTest.sum(a,b);
        String a = myTest.say();

        System.out.println(c);
    }
    
}
