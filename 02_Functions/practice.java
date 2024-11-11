class practice{
    static int val = 100;
    public static void main(String[]arg){
        System.out.println("Hello");
        System.out.println("World");
        int a = 9;
        int b = 7;
        add(a,b);
        System.out.println("bye main");
        System.out.println(val);
    }

    public static void add(int a, int b){
        int c = a+b;        
        int d = 8;
        int f = 10;
        sub(d,f);
        System.out.println(c);
        System.out.println("bye add");
    }
    public static void sub(int a, int b){
        int c = b-a;
        int val = 60;
        val = val+5;
        System.out.println("bye sub");
        System.out.println(c);
        System.out.println(val);
    }
}

