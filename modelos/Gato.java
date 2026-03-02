package modelos;

public class Gato {

    private String nome;
    private String cor;
    private int idade;

    public Gato (String nome, String cor, int idade){
    
    this.nome = nome;
    this.cor = cor;
    this.idade = idade;
}

    public Gato (){
    this.nome = "Bruce";
    this.cor = "Cinza";
    this.idade = 3;
}


public void emitirsom(){
    System.out.println("Miau miau");
}

public String getnome(){
    return nome;
}

public String getcor(){
    return cor;
}

public int getidade(){
    return idade;
}

public void setnome(String nome){
    this.nome = nome;
}

public void setcor(String cor){
    this.cor = cor;
}

public void setidade(int idade){
    this.idade = idade;
}


@Override
public String toString(){
    return
    "Gato [nome =" + nome +
    "cor = " + cor +
    "idade = " + idade + "]";
}

}