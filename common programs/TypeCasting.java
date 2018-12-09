class Parent {
    void Show() {
        System.out.println("Parent class show method");
    }
    void Display() {
        System.out.println("parent class display method");
    }
}
class ChildExtendsParents {
    void Show() {
        System.out.println("child class show method");
    }
    void Print() {
        System.out.println("child class print method");
    }
}
class TypeCasting {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.Show();
        p.Display();
       // p.Print();
    }
}