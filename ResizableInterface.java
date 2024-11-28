package pkg1;
interface Resizable{
	void resizeWidth(int width);
	void resizeHeight(int height);}           //Method definition only
class Rectangle implements Resizable{
	private int width;
	private int height;					// Attributes
	public Rectangle(int width, int height) {
		this.width=width;
		this.height=height;}			// Constructor1 
	public void resizeWidth(int width) {
		this.width=width;}				// Method 1
	public void resizeHeight(int height) {
		this.height=height;}			// Method 2
	public void display() {
		System.out.println("Rectangle Width: "+width);
		System.out.println("Rectangle Height: "+height);}}  // Method 3

public class ResizableInterface {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(5,10);		//Object creation using new
		System.out.println("\nOriginal Rectangle: ");
		r1.display();				// object.method

		r1.resizeWidth(8);
		r1.resizeHeight(12);
		System.out.println("\nResized Rectangle: ");
		r1.display();}}				// object.method
