class tpp<T>{
    void genericPrint(T t){
        System.out.println(t);
    }
    public static void main(String[] args) {
        tpp obj=new tpp();
        obj.genericPrint("HI");
        obj.genericPrint(1000);
    }
}
