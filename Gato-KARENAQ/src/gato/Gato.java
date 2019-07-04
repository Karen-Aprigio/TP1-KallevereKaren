
package gato;

public class Gato {
boolean sexo;
String nome;
int idade;
int codigoderegistro;
Gato mae;
public Gato (String n){
    this.nome= n;
}
public void miar () {
    if (idade>=2) {
        System.out.print ("meow meow meow!");
    }else{
        System.out.print ("miau miau miau");
    }
}


        
    
}
