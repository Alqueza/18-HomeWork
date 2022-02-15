public class Main {
    public static void main(String[] args) {

        Cow cow1 = new Cow(150,(byte) 5,"Cow1",'F');
        Cow cow2 = new Cow(120,(byte) 3,"Cow2",'M');
        Cow cow3 = new Cow(111,(byte) 4,"Cow3",'M');
        Cow cow4 = new Cow(145,(byte) 2,"Cow4",'F');
        Cow cow5 = new Cow(80,(byte) 1,"Cow5",'F');
        Cow cow6 = new Cow(115,(byte) 3,"Cow6",'F');

        Sheep sheep1 = new Sheep(45,(byte) 1,"Sheep1",'M');
        Sheep sheep2 = new Sheep(80,(byte) 2,"Sheep2",'M');
        Sheep sheep3 = new Sheep(35,(byte) 3,"Sheep3",'F');
        Sheep sheep4 = new Sheep(55,(byte) 4,"Sheep4",'F');

        Horse horse1 = new Horse(350,(byte) 2,"Horse1",'M',"Black");
        Horse horse2 = new Horse(250,(byte) 1,"Horse2",'M',"Grey");
        Horse horse3 = new Horse(300,(byte) 3,"Horse3",'F',"White");

        Farm farm1 = new Farm("Talas","Adilet",new Sheep[]{sheep1,sheep2,sheep3},
                new Horse[]{horse1,horse2},new Cow[]{cow1,cow2,cow3,cow4,cow5});
        Farm farm2 = new Farm("Osh","Aidin",
                new Sheep[]{sheep4},new Horse[]{horse3},new Cow[]{cow6});

        System.out.println(farm1);
        System.out.println();
        System.out.println(farm2);



    }
}