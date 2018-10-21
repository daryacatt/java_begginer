public class ClassesAndObjects {
    public static void main(String [] args){
        Person person1 = new Person(); //создаем объект класса Person
        //person1.name = "Дарья";
       //person1.age = 20;
        person1.setNameAndAge("Дарья", 20);
        person1.speak();

        Person person2 = new Person(); //создаем объект класса Person
        //person2.name = "Александр";
        //person2.age = 25;
        String s1="Александр";
        person2.setNameAndAge(s1,25);
        person2.speak();

        int years1 = person1.CalculateYearsToRetirement();
        int years2 = person2.CalculateYearsToRetirement();
        System.out.println("До пенсии осталось Дарье: "+years1+" лет");
        System.out.println("До пенсии осталось Александру: "+years2+" лет");

    }
}
class Person {
    String name;
    int age;

    void setNameAndAge(String username, int userage){
        name=username;
        age=userage;
    }

    int CalculateYearsToRetirement(){
        int years = 65-age;
        return years;

    }

    void speak(){  //метод
        for(int i=0; i<3; i++){
        System.out.println("Меня зовут "+name+", "+"мне "+age+" лет");
         }
    }
    void sayHello(){
        System.out.println("Привет!");
    }
}
