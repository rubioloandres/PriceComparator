
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.2.2
 * Fri Aug 07 19:53:22 ART 2020
 * Generated source version: 3.2.2
 */

@XmlRootElement(name = "healthResponse", namespace = "http://ws.das.edu.ubp.ar/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "healthResponse", namespace = "http://ws.das.edu.ubp.ar/")

public class HealthResponse {

    @XmlElement(name = "return")
    private java.lang.String _return;

    public java.lang.String getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.String new_return)  {
        this._return = new_return;
    }

}

