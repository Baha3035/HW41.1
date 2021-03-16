package kg.megacom;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Comparator<Object> entryComparator = new Comparator<Object>(){

            @Override
            public int compare(Object o1, Object o2) {
                Person first = (Person) o1;
                Person second = (Person) o2;

                return  first.getVIPNumber() - second.getVIPNumber();
            }
        };

        //The greater VIP number, the greater your chance to get in better spots in the

        Person firstParticipant = new Person(1234467843, true, "Andy");
        Person secondParticipant = new Person(1234467845, true, "Marco");
        Person thirdParticipant = new Person(1234467846, true, "Dennis");
        Person fourthParticipant = new Person(1234467841, false, "Michael");
        Person fifthParticipant = new Person(1234467855, false, "Philippe");
        Person sixthParticipant = new Person(1234467875, true, "Marcus");
        Person seventhParticipant = new Person(1234468845, false, "Hugo");
        Person eighthParticipant = new Person(1234467849, false, "Faighell");
        Person ninthParticipant = new Person(1234467865, true, "Antoine");

        Set<Person> entryToClub = new TreeSet<>(entryComparator);
            entryToClub.add(firstParticipant);
            entryToClub.add(secondParticipant);
            entryToClub.add(thirdParticipant);
            entryToClub.add(fifthParticipant);
            entryToClub.add(fourthParticipant);
            entryToClub.add(sixthParticipant);
            entryToClub.add(seventhParticipant);
            entryToClub.add(eighthParticipant);
            entryToClub.add(ninthParticipant);

            for(Person participant : entryToClub){
                System.out.println(participant);
        }
    }
}
