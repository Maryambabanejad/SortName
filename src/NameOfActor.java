import java.util.Arrays;

public class NameOfActor {
    public static void main(String[] args) {
        String[] castnames = new String[7];
        castnames[0] = "Zarei Merila";
        castnames[1] = "Moadi peyman";
        castnames[2] = "Brofe ziba";
        castnames[3] = "Hoseini Shahab";
        castnames[4] = "Ezati Javad";
        castnames[5] = "hatami leila";
        castnames[6] = "Hejazifar Hadi";
        Arrays.sort(castnames);
        for (int number =0 ; number < castnames.length ; number++){
        System.out.println((number+1) + ":" +castnames[number]);
    }
}
}
