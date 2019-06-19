class OuterClass {
    public static final int CONSTANT=10;
    int x=6;

    static class StaticNestedClass {
        public static int y=6;
        //public static 
        //int z=x;
        int h=CONSTANT;
    }
    
    class InnerClass {
        int g=8;
        int z=CONSTANT;
    }
	
    public static void main(String[] args){
    	OuterClass oc=new OuterClass();
    	OuterClass.StaticNestedClass sc=new OuterClass.StaticNestedClass();
    	OuterClass.InnerClass ic=oc.new InnerClass();
    	System.out.println("x= "+ oc.x);
    	System.out.println("y= "+ sc.y);
    	System.out.println("h= "+ sc.h);
    	System.out.println("g= "+ ic.g);
    	System.out.println("z= "+ ic.z);
    }
}