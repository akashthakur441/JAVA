class Add{
    static int add(int a,int b)
    {
        for(int i=1; i<=b; i++)
        a++;
        return a;
    }
    public static void main(String args[])
    {
        int a=add(10,30);
        System.out.println(a);
    }
}