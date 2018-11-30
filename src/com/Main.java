package com;

public class Main {
    static Data data=new FileSystem();
    public static void main(String[] args) {
        System.out.println(data.getData());
    }
}
interface Data{
    String getData();
}
class Db implements Data{
    String getFromTable(){
        return "data from table";
    }
    @Override
    public String getData() {
        return getFromTable();
    }
}
class FileSystem implements Data{
    String getDataFromFS(){
        return "get data from FS";
    }
    @Override
    public String getData() {
        return getDataFromFS();
    }
}




















