
package ru.aksndr.server.jaxws;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "getCourseResponse", namespace = "http://server.aksndr.ru/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCourseResponse", namespace = "http://server.aksndr.ru/")
public class GetCourseResponse {

    @XmlElement(name = "return", namespace = "")
    private String _return;

    /**
     * 
     * @return
     *     returns String
     */
    public String getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(String _return) {
        this._return = _return;
    }

}
