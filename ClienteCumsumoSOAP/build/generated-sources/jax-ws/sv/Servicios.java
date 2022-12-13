
package sv;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Servicios", targetNamespace = "http://sv/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Servicios {


    /**
     * 
     * @param total
     * @param pago
     * @return
     *     returns int
     */
    @WebMethod(operationName = "ProcesarPago")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ProcesarPago", targetNamespace = "http://sv/", className = "sv.ProcesarPago")
    @ResponseWrapper(localName = "ProcesarPagoResponse", targetNamespace = "http://sv/", className = "sv.ProcesarPagoResponse")
    @Action(input = "http://sv/Servicios/ProcesarPagoRequest", output = "http://sv/Servicios/ProcesarPagoResponse")
    public int procesarPago(
        @WebParam(name = "total", targetNamespace = "")
        int total,
        @WebParam(name = "pago", targetNamespace = "")
        int pago);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "Login")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Login", targetNamespace = "http://sv/", className = "sv.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://sv/", className = "sv.LoginResponse")
    @Action(input = "http://sv/Servicios/LoginRequest", output = "http://sv/Servicios/LoginResponse")
    public Boolean login(
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "username", targetNamespace = "")
        String username);

}
