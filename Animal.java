public class Animal {
    String name;

    public void setName(String name){
        this.name = name;
    }
    public static void main(String[] args){
        Animal cat = new Animal();
        cat.setName("boby");
        Animal seonkyung = new Animal();
        seonkyung.setName("20 이선경");

        System.out.println(cat.name);
        System.out.println(seonkyung.name);
    }
}