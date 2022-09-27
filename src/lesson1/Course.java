package lesson1;

public class Course {
    public static void main(String[] args) {
        Participant [] participant = new Participant[4];
        participant[0]=new Participant("Mike",100);
        participant[1] = new Participant("Pit",120);
        participant[2]= new Participant("Jil",110);
        participant[3] = new Participant("Ann",115);
        Team team = new Team("Victory",participant);

        Let let = new Let(90,115);
        String result = let.doIt(team);
        System.out.println(result);
    }

}
