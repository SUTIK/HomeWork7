package eu.senla.sutko.task7;

public class Robot {
    String name;
    HeadProduction headProduction;
    BodyProduction bodyProduction;

    Robot (String name, HeadProduction headProduction, BodyProduction bodyProduction){
        this.bodyProduction = bodyProduction;
        this.headProduction = headProduction;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Привет, я робот " + name + ",у меня голова " + headProduction + " и тело " + bodyProduction;
    }
}
