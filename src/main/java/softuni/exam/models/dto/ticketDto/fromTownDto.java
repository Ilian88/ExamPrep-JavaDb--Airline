package softuni.exam.models.dto.ticketDto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "from-town")
@XmlAccessorType(XmlAccessType.FIELD)
public class fromTownDto {

    @XmlElement(name = "name")
    private String name;

    public fromTownDto() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
