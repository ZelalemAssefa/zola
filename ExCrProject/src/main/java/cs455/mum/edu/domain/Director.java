package cs455.mum.edu.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Dir")
public class Director extends Artist{

}
