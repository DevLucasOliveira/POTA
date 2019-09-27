package Aula01;


public class Condicional {

       private String name1,name2;
       private int age1,age2;

    public Condicional(){

    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }

    public int getAge2() {
        return age2;
    }

    public void setAge2(int age2) {
        this.age2 = age2;
    }


    public String pessoamaisVelha(int age1, int age2){
        if(age1>age2)
            return this.name1+" é a pessoa mais velha";
        if(age2>age1)
            return this.name2+" é a pessoa mais velha";
        else
            return "Ambos tem a mesma idade";
    }

}
