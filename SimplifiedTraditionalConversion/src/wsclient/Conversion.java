package wsclient;

import wsproxy.TraditionalSimplifiedWebService;
import wsproxy.TraditionalSimplifiedWebServiceSoap;

public class Conversion {

    private TraditionalSimplifiedWebService service;
    private TraditionalSimplifiedWebServiceSoap pService;

    /**
     * Constructor
     * Get local proxy for web service
     */
    public Conversion() {
        service = new TraditionalSimplifiedWebService();
        pService = service.getTraditionalSimplifiedWebServiceSoap();
    }

    /**
     * Call web service to conversion simplified Chinese to traditional Chinese
     * @param str Simplified Chinese string
     * @return Traditional Chinese string
     */
    public String toTraditional(String str) {
        return pService.toTraditionalChinese(str);
    }

    /**
     * Call web service to conversion traditional Chinese to simplified Chinese
     * @param str Traditional Chinese string
     * @return Simplified Chinese string
     */
    public String toSimplified(String str) {
        return pService.toSimplifiedChinese(str);
    }
}
