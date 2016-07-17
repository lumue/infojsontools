
package io.github.lumue.infojson;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Accept-Language",
    "Accept-Encoding",
    "Accept",
    "User-Agent",
    "Accept-Charset",
    "Cookie"
})
public class HttpHeaders {

    @JsonProperty("Accept-Language")
    private String acceptLanguage;
    @JsonProperty("Accept-Encoding")
    private String acceptEncoding;
    @JsonProperty("Accept")
    private String accept;
    @JsonProperty("User-Agent")
    private String userAgent;
    @JsonProperty("Accept-Charset")
    private String acceptCharset;
    @JsonProperty("Cookie")
    private String cookie;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The acceptLanguage
     */
    @JsonProperty("Accept-Language")
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * 
     * @param acceptLanguage
     *     The Accept-Language
     */
    @JsonProperty("Accept-Language")
    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * 
     * @return
     *     The acceptEncoding
     */
    @JsonProperty("Accept-Encoding")
    public String getAcceptEncoding() {
        return acceptEncoding;
    }

    /**
     * 
     * @param acceptEncoding
     *     The Accept-Encoding
     */
    @JsonProperty("Accept-Encoding")
    public void setAcceptEncoding(String acceptEncoding) {
        this.acceptEncoding = acceptEncoding;
    }

    /**
     * 
     * @return
     *     The accept
     */
    @JsonProperty("Accept")
    public String getAccept() {
        return accept;
    }

    /**
     * 
     * @param accept
     *     The Accept
     */
    @JsonProperty("Accept")
    public void setAccept(String accept) {
        this.accept = accept;
    }

    /**
     * 
     * @return
     *     The userAgent
     */
    @JsonProperty("User-Agent")
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * 
     * @param userAgent
     *     The User-Agent
     */
    @JsonProperty("User-Agent")
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * 
     * @return
     *     The acceptCharset
     */
    @JsonProperty("Accept-Charset")
    public String getAcceptCharset() {
        return acceptCharset;
    }

    /**
     * 
     * @param acceptCharset
     *     The Accept-Charset
     */
    @JsonProperty("Accept-Charset")
    public void setAcceptCharset(String acceptCharset) {
        this.acceptCharset = acceptCharset;
    }

    /**
     * 
     * @return
     *     The cookie
     */
    @JsonProperty("Cookie")
    public String getCookie() {
        return cookie;
    }

    /**
     * 
     * @param cookie
     *     The Cookie
     */
    @JsonProperty("Cookie")
    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
