class Test1 {
    void show(){
        System.out.println("1");
    }
        public static void main(String[] args) {
            Test1 t1=new Test1();
            t1.show();
    
            XYZ x=new XYZ();
            x.show();
        }

    }
    
class XYZ extends Test1{
    void show(){
        System.out.println("2");
    }
    
}

