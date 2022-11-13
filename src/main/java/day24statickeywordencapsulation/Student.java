package day24statickeywordencapsulation;



    //Encapsulation=(kapsullemek)"Data Hiding" datalari dis etkenlerden korumak icin,gizlemek icin
    // Data yi neden gizleriz?Data yi dis etkenlerden korumak icin
    //nasil gizleriz ? access modifeir i privat yaparak bunu yapariz
    //private olanlar class in icinden gorunur ,disari cikinca goremeyiz
    // gizlenen data baska classlardan nasil okuruz:bazi ozel yontemlerle ulasiriz yani "get"methodlar olusturarrak
    // okunur hale getirebiliriz,bu methodlara (getter) denir
    // data yi gizledikten sonra baska class lardan nasil degistiririz.
    //bunada set methodlarla yapariz bunada setter denir.
    // variablae data type ile get methodun return type ayni olur
    //  yani prvate string -public string get olur
public class Student {

    public String stdName="Tom Hanks"; //burada public i privat yaparsan kapsullersin.
    private String stdId ="TH202201";
    private double gpa=3.8;
    private boolean retired=false;

    public String getStdId() {   //get methodla hepsini public yaptik maus sag tikla generate ve sec
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {  //hepsi get ile baslar boolean olunca get in basina is gelir false true olacagi icin
        return retired;
    }

        public void setStdId(String stdId) {
            this.stdId = stdId;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        public void setRetired(boolean retired) {
            this.retired = retired;
        }
    }
