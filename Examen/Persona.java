
public class Persona{

    public String name;
    public String status;
    public String adress;
    public int id;
    public int age;

    public Persona(String name,String status,String adress,int id, int age){
        this.name = name;
        this.status = status;
        this.adress = adress;
        this.id = id;
        this.age = age;
    } 

    public String setName(String name){
        this.name = name;
    }
    public String setStatus(String status){
        this.status = status;
    }
    public String setAdress(String adress){
        this.adress = adress;
    }
    public int setId(int id){
        this.id = id;
    }
    public int setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getAdress(){
        return adress;
    }
    public String getStatus(){
        return status;
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }

}