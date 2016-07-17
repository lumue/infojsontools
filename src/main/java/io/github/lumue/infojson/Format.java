
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
    "asr",
    "tbr",
    "protocol",
    "format",
    "format_note",
    "height",
    "preference",
    "format_id",
    "language",
    "http_headers",
    "url",
    "vcodec",
    "abr",
    "width",
    "ext",
    "filesize",
    "fps",
    "acodec",
    "container",
    "player_url",
    "resolution"
})
class Format {

    @JsonProperty("asr")
    private Object asr;
    @JsonProperty("tbr")
    private long tbr;
    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("format")
    private String format;
    @JsonProperty("format_note")
    private String formatNote;
    @JsonProperty("height")
    private long height;
    @JsonProperty("preference")
    private long preference;
    @JsonProperty("format_id")
    private String formatId;
    @JsonProperty("language")
    private Object language;
    @JsonProperty("http_headers")
    private HttpHeaders httpHeaders;
    @JsonProperty("url")
    private String url;
    @JsonProperty("vcodec")
    private String vcodec;
    @JsonProperty("abr")
    private long abr;
    @JsonProperty("width")
    private long width;
    @JsonProperty("ext")
    private String ext;
    @JsonProperty("filesize")
    private long filesize;
    @JsonProperty("fps")
    private long fps;
    @JsonProperty("acodec")
    private String acodec;
    @JsonProperty("container")
    private String container;
    @JsonProperty("player_url")
    private Object playerUrl;
    @JsonProperty("resolution")
    private String resolution;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The asr
     */
    @JsonProperty("asr")
    public Object getAsr() {
        return asr;
    }

    /**
     * 
     * @param asr
     *     The asr
     */
    @JsonProperty("asr")
    public void setAsr(Object asr) {
        this.asr = asr;
    }

    /**
     * 
     * @return
     *     The tbr
     */
    @JsonProperty("tbr")
    public long getTbr() {
        return tbr;
    }

    /**
     * 
     * @param tbr
     *     The tbr
     */
    @JsonProperty("tbr")
    public void setTbr(long tbr) {
        this.tbr = tbr;
    }

    /**
     * 
     * @return
     *     The protocol
     */
    @JsonProperty("protocol")
    public String getProtocol() {
        return protocol;
    }

    /**
     * 
     * @param protocol
     *     The protocol
     */
    @JsonProperty("protocol")
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * 
     * @return
     *     The format
     */
    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    /**
     * 
     * @param format
     *     The format
     */
    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * 
     * @return
     *     The formatNote
     */
    @JsonProperty("format_note")
    public String getFormatNote() {
        return formatNote;
    }

    /**
     * 
     * @param formatNote
     *     The format_note
     */
    @JsonProperty("format_note")
    public void setFormatNote(String formatNote) {
        this.formatNote = formatNote;
    }

    /**
     * 
     * @return
     *     The height
     */
    @JsonProperty("height")
    public long getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    @JsonProperty("height")
    public void setHeight(long height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The preference
     */
    @JsonProperty("preference")
    public long getPreference() {
        return preference;
    }

    /**
     * 
     * @param preference
     *     The preference
     */
    @JsonProperty("preference")
    public void setPreference(long preference) {
        this.preference = preference;
    }

    /**
     * 
     * @return
     *     The formatId
     */
    @JsonProperty("format_id")
    public String getFormatId() {
        return formatId;
    }

    /**
     * 
     * @param formatId
     *     The format_id
     */
    @JsonProperty("format_id")
    public void setFormatId(String formatId) {
        this.formatId = formatId;
    }

    /**
     * 
     * @return
     *     The language
     */
    @JsonProperty("language")
    public Object getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    @JsonProperty("language")
    public void setLanguage(Object language) {
        this.language = language;
    }

    /**
     * 
     * @return
     *     The httpHeaders
     */
    @JsonProperty("http_headers")
    public HttpHeaders getHttpHeaders() {
        return httpHeaders;
    }

    /**
     * 
     * @param httpHeaders
     *     The http_headers
     */
    @JsonProperty("http_headers")
    public void setHttpHeaders(HttpHeaders httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    /**
     * 
     * @return
     *     The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The vcodec
     */
    @JsonProperty("vcodec")
    public String getVcodec() {
        return vcodec;
    }

    /**
     * 
     * @param vcodec
     *     The vcodec
     */
    @JsonProperty("vcodec")
    public void setVcodec(String vcodec) {
        this.vcodec = vcodec;
    }

    /**
     * 
     * @return
     *     The abr
     */
    @JsonProperty("abr")
    public long getAbr() {
        return abr;
    }

    /**
     * 
     * @param abr
     *     The abr
     */
    @JsonProperty("abr")
    public void setAbr(long abr) {
        this.abr = abr;
    }

    /**
     * 
     * @return
     *     The width
     */
    @JsonProperty("width")
    public long getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    @JsonProperty("width")
    public void setWidth(long width) {
        this.width = width;
    }

    /**
     * 
     * @return
     *     The ext
     */
    @JsonProperty("ext")
    public String getExt() {
        return ext;
    }

    /**
     * 
     * @param ext
     *     The ext
     */
    @JsonProperty("ext")
    public void setExt(String ext) {
        this.ext = ext;
    }

    /**
     * 
     * @return
     *     The filesize
     */
    @JsonProperty("filesize")
    public long getFilesize() {
        return filesize;
    }

    /**
     * 
     * @param filesize
     *     The filesize
     */
    @JsonProperty("filesize")
    public void setFilesize(long filesize) {
        this.filesize = filesize;
    }

    /**
     * 
     * @return
     *     The fps
     */
    @JsonProperty("fps")
    public long getFps() {
        return fps;
    }

    /**
     * 
     * @param fps
     *     The fps
     */
    @JsonProperty("fps")
    public void setFps(long fps) {
        this.fps = fps;
    }

    /**
     * 
     * @return
     *     The acodec
     */
    @JsonProperty("acodec")
    public String getAcodec() {
        return acodec;
    }

    /**
     * 
     * @param acodec
     *     The acodec
     */
    @JsonProperty("acodec")
    public void setAcodec(String acodec) {
        this.acodec = acodec;
    }

    /**
     * 
     * @return
     *     The container
     */
    @JsonProperty("container")
    public String getContainer() {
        return container;
    }

    /**
     * 
     * @param container
     *     The container
     */
    @JsonProperty("container")
    public void setContainer(String container) {
        this.container = container;
    }

    /**
     * 
     * @return
     *     The playerUrl
     */
    @JsonProperty("player_url")
    public Object getPlayerUrl() {
        return playerUrl;
    }

    /**
     * 
     * @param playerUrl
     *     The player_url
     */
    @JsonProperty("player_url")
    public void setPlayerUrl(Object playerUrl) {
        this.playerUrl = playerUrl;
    }

    /**
     * 
     * @return
     *     The resolution
     */
    @JsonProperty("resolution")
    public String getResolution() {
        return resolution;
    }

    /**
     * 
     * @param resolution
     *     The resolution
     */
    @JsonProperty("resolution")
    public void setResolution(String resolution) {
        this.resolution = resolution;
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
