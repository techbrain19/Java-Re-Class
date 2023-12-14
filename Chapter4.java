class Chapter4{
    public static void chapterFour(String p){
        System.out.println(p);
        System.out.println(p);
    }
    public static void printTime(int hour, int minutes){
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minutes);
        System.out.println("Pm");

    }
    public static void main(String[] args){
        chapterFour("This is part of the example made in chapter4. Dont make me repeat twice!");
        printTime(12,35);
    }
}

