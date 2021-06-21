package com.company;
class Main {
    public static void main(String[] args) {
        System.out.println(Enum.XXS + " - " + Enum.XXS.eroSize());
        Enum.XXS.getDescription();
        System.out.println(Enum.XS + ": - " + Enum.XS.eroSize());
        Enum.XS.getDescription();
        System.out.println(Enum.S + " - " + Enum.S.eroSize());
        Enum.S.getDescription();
        System.out.println(Enum.M + " - " + Enum.M.eroSize());
        Enum.M.getDescription();
        System.out.println(Enum.L + " - " + Enum.L.eroSize());
        Enum.L.getDescription();
        Studio man = new Studio();
        Studio woman = new Studio();
        man.dressMan();
        woman.dressWoman();
    }
}

interface ManClothes{
    default void dressMan(){
    }
}

interface WomanClothes{
    default void dressWoman(){
    }
}

abstract class Clothes{
    String Size;
    String Color;
    String Price;
}
class T_shirt extends Clothes implements WomanClothes, ManClothes{

}
class pants extends Clothes implements WomanClothes, ManClothes{

}
class Skirt extends Clothes implements WomanClothes, ManClothes{

}
class Tie extends Clothes implements WomanClothes, ManClothes{

}
class Studio {

    String[] mas = {"Футболка", "штаны", "юбка"};
    String[] mas1 = {"Футболка", "штаны", "галстук"};
    public void dressWoman(){
        System.out.println(" ");
        System.out.println("\n" + "Женская одежда");
        for (String dress:mas){
            System.out.print(dress + " ");
        }

    }
    public void dressMan(){
        System.out.println("\n" + "Мужская одежда");

        for (String dress:mas1){
            System.out.print(dress + " ");
        }}}
enum Enum {
    XXS("32"), XS("34"), S("36"), M("38"), L("40");
    private String chis;

    Enum(String code) {
        this.chis = code;
    }

    public String eroSize() {
        return chis;
    }

    public void getDescription() {
        switch (chis) {
            case "40":
                System.out.println("Взрослый размер");
                System.out.println("---------------");
                break;
            case "38":
                System.out.println("Взрослый размер");
                System.out.println("---------------");
                break;
            case "36":
                System.out.println("Детский размер");
                System.out.println("---------------");
                break;
            case "34":
                System.out.println("Детский размер");
                System.out.println("---------------");
                break;
            case "32":
                System.out.println("Детский размер");
                System.out.println("---------------");
                break;
        }}}