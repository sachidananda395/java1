public class K5{
public static void main(String[] args){
int num1=Integer.parseInt(args[0]);
int factn=1;
for(int i=1;i<num1+1;i++){
factn=factn*i;
}
System.out.println(factn);
}
}