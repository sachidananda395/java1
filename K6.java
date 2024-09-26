public class K6{
public static void main(String[] args){
String s1="object";
int n=s1.length();
for(int i=0;i<n;i++){

String s2=s1.substring(0,i+1);

System.out.println(s2);
}


}
}