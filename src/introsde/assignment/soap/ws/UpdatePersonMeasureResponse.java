
package introsde.assignment.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per updatePersonMeasureResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="updatePersonMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personMeasure" type="{http://ws.soap.assignment.introsde/}measure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePersonMeasureResponse", propOrder = {
    "personMeasure"
})
public class UpdatePersonMeasureResponse {

    protected Measure personMeasure;

    /**
     * Recupera il valore della proprietà personMeasure.
     * 
     * @return
     *     possible object is
     *     {@link Measure }
     *     
     */
    public Measure getPersonMeasure() {
        return personMeasure;
    }

    /**
     * Imposta il valore della proprietà personMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link Measure }
     *     
     */
    public void setPersonMeasure(Measure value) {
        this.personMeasure = value;
    }

}
