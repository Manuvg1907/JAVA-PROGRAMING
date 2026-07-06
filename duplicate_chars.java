

public class duplicate_chars{

public static void main(String[] args){

String s="programming";
char [] ch= s.toCharArray();

for(int i=0;i<ch.length;i++){
    if(ch[i]=='\u0000') continue;
    int count =1;

for(int j=i+1;j<ch.length;j++){
if(ch[i]!=ch[j] && ch[j]!='\u0000')
    count++;
ch[j]='\u0000';

}


if(count>1){
    System.out.println(ch);
}

}

}



}