package lesson1;

public class Team {
    private String nameTeam;
    private Participant [] participants;

    public Team(String nameTeam, Participant [] participants) {
        this.nameTeam = nameTeam;
        this.participants = participants;
    }

    public Participant[] getParticipants() {
        return participants;
    }

    public String getNameTeam() {
        return nameTeam;
    }
}
