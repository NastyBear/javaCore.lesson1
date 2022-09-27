package lesson1;

public class Let {
    String result;
    private int firstHeight;
    private int secondHeight;

    public Let( int firstHeight, int secondHeight) {
        this.firstHeight = firstHeight;
        this.secondHeight = secondHeight;
    }

    public String doIt(Team team) {
        result = "Команда "+team.getNameTeam() + '\n';
        for (Participant participant : team.getParticipants()) {
            result += "Имя участника "+ participant.getNameParticipant() + '\n';
            int value = participant.getLetParticipantJump();
            firstHurdle(value);
            secondHurdle(value);
        }
        return result;
    }

    private void firstHurdle(int value) {
        if (firstHeight < value) result = result +  "Первое препятсвие преодолел" +  '\n';
        else result+= "Препятсвие не преодолел" + '\n';
    }

    private void secondHurdle (int value) {
        if (secondHeight < value) result = result +  "Второе препятсвие преодолел" + '\n';
        else result+= "Препятсвие не преодолел" + '\n';
    }

}

