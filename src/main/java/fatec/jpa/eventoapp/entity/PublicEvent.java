package fatec.jpa.eventoapp.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class PublicEvent extends Event {
}
