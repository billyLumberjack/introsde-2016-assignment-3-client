
package introsde.assignment.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per updatePerson complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="updatePerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personToUpdate" type="{http://ws.soap.assignment.introsde/}person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePerson", propOrder = {
    "personToUpdate"
})
public class UpdatePerson {

    protected Person personToUpdate;

    /**
     * Recupera il valore della proprietà personToUpdate.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPersonToUpdate() {
        return personToUpdate;
    }

    /**
     * Imposta il valore della proprietà personToUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPersonToUpdate(Person value) {
        this.personToUpdate = value;
    }

}
