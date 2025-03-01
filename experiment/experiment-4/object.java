class Student {
  String name;
  int age;

  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  Student() {
    System.out.println(name = "karti");
  }

  public static void main(String[] args) {
    Student karti = new Student();
    System.out.println(karti);
    Student abc = new Student("kartikey", 69);
    System.out.println(abc);
    System.out.println(abc.name);
    System.out.println(abc.age);
    System.out.println(karti);
  }

}
