package legoset;

import jaxb.JAXBHelper;

import java.time.Year;
import java.util.Set;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        LegoSet legoset = new LegoSet();
        legoset.setNumber("75211");
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);
        legoset.setTags(Set.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));
        legoset.setMinifigs(List.of(
                new Minifig(2, "Imperial Mudtrooper"),
                new Minifig(1, "Imperial Pilot"),
                new Minifig(1, "Mimban Stormtrooper")
        ));
        legoset.setWeight(
                new Weight(0.89, "kg")
        );
        legoset.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");

        JAXBHelper.toXML(legoset, System.out);
    }
}
