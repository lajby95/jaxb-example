package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;

//@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Minifig {
    @XmlAttribute
    private int count;

    @XmlValue
    private String name;

    public Minifig(int count, String name) {
        this.count = count;
        this.name = name;
    }
}
