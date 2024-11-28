package pkg1;


class Outer{
	void display() {
		System.out.println("Outer class display method");}
	class Inner{
		void display() {
			System.out.println("Inner class display method");}}}

public class NestedClass {
	public static void main(String[] args) {
		Outer o1=new Outer();
		o1.display();
		Outer.Inner i1=o1.new Inner();    // object is of type Outer.Inner
		i1.display();}}
