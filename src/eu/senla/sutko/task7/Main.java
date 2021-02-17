package eu.senla.sutko.task7;

public class Main {
    public static void main(String[] args) {


        Robot robot= new Robot("Bob", HeadProduction.CAT_HEAD, BodyProduction.CAT_BODY);
        Robot robot1= new Robot("Mike",HeadProduction.CAT_HEAD, BodyProduction.DOG_BODY);
        Robot robot2 = new Robot("Pieter",HeadProduction.DOG_HEAD, BodyProduction.CAT_BODY);
        Robot robot3 = new Robot("Ben",HeadProduction.HUMAN_HEAD,BodyProduction.HUMAN_BODY);
        Robot robot4 = new Robot("Ben",HeadProduction.DOG_HEAD,BodyProduction.DOG_BODY);
        Robot robot5 = new Robot("Ben",HeadProduction.HUMAN_HEAD,BodyProduction.DOG_BODY);
        Robot robot6 = new Robot("Ben",HeadProduction.HUMAN_HEAD,BodyProduction.CAT_BODY);
        Robot robot7 = new Robot("Ben",HeadProduction.CAT_HEAD,BodyProduction.HUMAN_BODY);
        Robot robot8 = new Robot("Ben",HeadProduction.DOG_HEAD,BodyProduction.HUMAN_BODY);
        System.out.println(robot.toString());
        System.out.println(robot1.toString());
        System.out.println(robot2.toString());
        System.out.println(robot3.toString());
        System.out.println(robot4.toString());
        System.out.println(robot5.toString());
        System.out.println(robot6.toString());
        System.out.println(robot7.toString());
        System.out.println(robot8.toString());


    }
}
