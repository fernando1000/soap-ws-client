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
 * <p>Classe Java de ZbrcrmLinesUpdS complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ZbrcrmLinesUpdS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NewLine" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Text" type="{urn:sap-com:document:sap:rfc:functions}char132"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZbrcrmLinesUpdS", propOrder = {
    "newLine",
    "text"
})
public class ZbrcrmLinesUpdS {

    @XmlElement(name = "NewLine", required = true)
    protected String newLine;
    @XmlElement(name = "Text", required = true)
    protected String text;

    /**
     * Obtém o valor da propriedade newLine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewLine() {
        return newLine;
    }

    /**
     * Define o valor da propriedade newLine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewLine(String value) {
        this.newLine = value;
    }

    /**
     * Obtém o valor da propriedade text.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Define o valor da propriedade text.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
