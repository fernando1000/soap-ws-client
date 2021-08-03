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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ZbrcrmNotesUpdS complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ZbrcrmNotesUpdS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="LinesTab" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZbrcrmLinesUpdT"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZbrcrmNotesUpdS", propOrder = {
    "type",
    "linesTab"
})
public class ZbrcrmNotesUpdS {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "LinesTab", required = true)
    protected ZbrcrmLinesUpdT linesTab;

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtém o valor da propriedade linesTab.
     * 
     * @return
     *     possible object is
     *     {@link ZbrcrmLinesUpdT }
     *     
     */
    public ZbrcrmLinesUpdT getLinesTab() {
        return linesTab;
    }

    /**
     * Define o valor da propriedade linesTab.
     * 
     * @param value
     *     allowed object is
     *     {@link ZbrcrmLinesUpdT }
     *     
     */
    public void setLinesTab(ZbrcrmLinesUpdT value) {
        this.linesTab = value;
    }

}
