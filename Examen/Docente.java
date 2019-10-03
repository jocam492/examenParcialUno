import Persona;

public class Docente extends Persona{

    public String escolaridad;
    public String sex;
    public int yearExperince;

    public Docente(String name,String status,String adress,int id, int age, String escolaridad, String sex, int yearExperience){

            this.escolaridad = escolaridad;
            this.sex = sex;
            this.yearExperience = yearExperience;
            super(name,status,adress,id,age);
            this.name =  name;
            this.status = status;
            this.adress = adress;
            this.id = id;
            this.age = age;
    }
     
    public String setEscolaridad(String escolaridad){
        this.escolaridad = escolaridad;
    }
    public int setSex(int sex){
        this.sex = sex;
    }
    public int setYearexperience(int yearExperience){
        this.yearExperience = yearExperience;
    }

    public String getEscolaridad(){
        return escolaridad;
    }
    public int getSex(){
        return sex;
    }
    public int getYearExperience(){
        return yearExperience;
    }



}