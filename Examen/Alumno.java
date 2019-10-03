import Persona;

public class Alumno extends Persona{

    public String sexo;
    public int altura;

    public Alumno( String name,String status,String adress,int id, int age,String sexo,int altura) {
        this.sex = sexo;
        this.altura = altura;
        super(name,status,adress,id,age);
        this.name =  name;
        this.status = status;
        this.adress = adress;
        this.id = id;
        this.age = age;
    }
     public String setSexo(String sexo){
         this.sexo = sexo;
     }
     public int setAltura(int altura){
         this.altura = altura;
     }

     public String getSexo(){
         return sexo;
     }
     public int getAltura(){
         return altura;
     }

}