public class Circle implements Comparable<Circle> {
   public  atributWarga RT1, RT2, RT3, RT4, RT5, RT6;
   
   public Circle(atributWarga RT1, atributWarga RT2){
       this.RT1 = RT1;
       this.RT2 = RT2;
   }
   public Circle(atributWarga RT1, atributWarga RT2, atributWarga RT3){
       this.RT1 = RT1;
       this.RT2 = RT2;
       this.RT3 = RT3;
   }
   public Circle (atributWarga RT1, atributWarga RT2, atributWarga RT3, atributWarga RT4){
       this.RT1 = RT1;
       this.RT2 = RT2;
       this.RT3 = RT3;
       this.RT4 = RT4;
   }
   public Circle (atributWarga RT1, atributWarga RT2, atributWarga RT3, atributWarga RT4, atributWarga RT5){
       this.RT1 = RT1;
       this.RT2 = RT2;
       this.RT3 = RT3;
       this.RT4 = RT4;
       this.RT5 = RT5;
   }
    public Circle (atributWarga RT1, atributWarga RT2, atributWarga RT3, atributWarga RT4, atributWarga RT5, atributWarga RT6){
       this.RT1 = RT1;
       this.RT2 = RT2;
       this.RT3 = RT3;
       this.RT4 = RT4;
       this.RT5 = RT5;
       this.RT6 = RT6;
   }
    public void setRT1(atributWarga RT1){
        this.RT1 = RT1;
    }
    public void setRT2(atributWarga RT2){
        this.RT2 = RT2;
    }
    public void setRT3(atributWarga RT3){
        this.RT3 = RT3;
    }
    public void setRT4(atributWarga RT4){
        this.RT4 = RT4;
    }
    public void setRT5(atributWarga RT5){
        this.RT5 = RT5;
    }
    public void setRT6(atributWarga RT6){
        this.RT6 = RT6;
    }
    public atributWarga getRT1(){
        return RT1;
    }
    public atributWarga getRT2(){
        return RT2;
    }
    public atributWarga getRT3(){
        return RT3;
    }
    public atributWarga getRT4(){
        return RT4;
    }
    public atributWarga getRT5(){
        return RT5;
    }
    public atributWarga getRT6(){
        return RT6;
    }   

    @Override
    public int compareTo(Circle t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
