package lesson5;

public class Staff {
    public static void main(String[] args) {
        Staff[] personal = new Staff[5];
        personal[0] = new Staff("Ivanov Ivan Ivanovich", "Engineer", "ivanov@gmail.com", "+375(22)321-12-94","1500 рублей",40);
        personal[1] = new Staff("Smirnov Denis Stanislavovich", "Director", "smirnov@gmail.com", "+375(29)333-52-75","3500 рублей",52);
        personal[2] = new Staff("Mironov Alexander Viktorovich", "Master", "mironov@gmail.com", "+375(44)847-99-41","1300 рублей",43);
        personal[3] = new Staff("Vinokurova Darya Fedorovna", "Instructor", "vinokurova@gmail.com", "+375(22)184-15-11","1500 рублей",33);
        personal[4] = new Staff("Selihova Lida Andreevna", "Cleaner", "selihova@gmail.com", "+375(33)431-11-42","400 рублей",58);
        for (int i = 0; i < personal.length; i++)
            if (personal[i].age > 40)
                personal[i].print();
    }
    private String full_name;
    private String post;
    private String email;
    private String telephone;
    private String salary;
    private int age;
    private int i=0;
    public Staff(String full_name, String post, String email, String telephone, String salary, int age) {
        this.full_name = full_name;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    public void print(){
        System.out.println("ФИО: "+full_name+"\n"+"Должность: "+post+"\n"+"Электронная почта: "+email+"\n"+"Телефон: "+telephone+"\n"+"Зарплата: "+salary+"\n"+"Возраст: "+age+"\n"+"-----------------------------");
    }
}

