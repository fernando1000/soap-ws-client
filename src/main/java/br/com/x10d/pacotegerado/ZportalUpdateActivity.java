//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.08.03 às 11:55:17 AM BRT 
//


package br.com.x10d.pacotegerado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivityId" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="NewDesc" type="{urn:sap-com:document:sap:rfc:functions}char40" minOccurs="0"/&gt;
 *         &lt;element name="NewNotes" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZbrcrmNotesUpdT" minOccurs="0"/&gt;
 *         &lt;element name="NewStatus" type="{urn:sap-com:document:sap:rfc:functions}char4" minOccurs="0"/&gt;
 *         &lt;element name="SellerId" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "activityId",
    "newDesc",
    "newNotes",
    "newStatus",
    "sellerId"
})
@XmlRootElement(name = "ZportalUpdateActivity")
public class ZportalUpdateActivity {

    @XmlElement(name = "ActivityId", required = true)
    protected String activityId;
    @XmlElement(name = "NewDesc")
    protected String newDesc;
    @XmlElement(name = "NewNotes")
    protected ZbrcrmNotesUpdT newNotes;
    @XmlElement(name = "NewStatus")
    protected String newStatus;
    @XmlElement(name = "SellerId", required = true)
    protected String sellerId;

    /**
     * Obtém o valor da propriedade activityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * Define o valor da propriedade activityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityId(String value) {
        this.activityId = value;
    }

    /**
     * Obtém o valor da propriedade newDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDesc() {
        return newDesc;
    }

    /**
     * Define o valor da propriedade newDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDesc(String value) {
        this.newDesc = value;
    }

    /**
     * Obtém o valor da propriedade newNotes.
     * 
     * @return
     *     possible object is
     *     {@link ZbrcrmNotesUpdT }
     *     
     */
    public ZbrcrmNotesUpdT getNewNotes() {
        return newNotes;
    }

    /**
     * Define o valor da propriedade newNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link ZbrcrmNotesUpdT }
     *     
     */
    public void setNewNotes(ZbrcrmNotesUpdT value) {
        this.newNotes = value;
    }

    /**
     * Obtém o valor da propriedade newStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewStatus() {
        return newStatus;
    }

    /**
     * Define o valor da propriedade newStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewStatus(String value) {
        this.newStatus = value;
    }

    /**
     * Obtém o valor da propriedade sellerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Define o valor da propriedade sellerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerId(String value) {
        this.sellerId = value;
    }

}
