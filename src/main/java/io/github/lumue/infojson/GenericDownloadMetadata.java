
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
    "display_id",
    "extractor",
    "playlist",
    "protocol",
    "format",
    "url",
    "extractor_key",
    "title",
    "playlist_index",
    "thumbnail",
    "ext",
    "fulltitle",
    "filesize",
    "webpage_url",
    "_filename",
    "format_id",
    "http_headers",
    "id",
    "webpage_url_basename"
})
public class GenericDownloadMetadata implements DownloadMetadata {

    @JsonProperty("display_id")
    private String displayId;
    @JsonProperty("extractor")
    private String extractor;
    @JsonProperty("playlist")
    private String playlist;
    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("format")
    private String format;
    @JsonProperty("url")
    private String url;
    @JsonProperty("extractor_key")
    private String extractorKey;
    @JsonProperty("title")
    private String title;
    @JsonProperty("playlist_index")
    private Long playlistIndex;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("ext")
    private String ext;
    @JsonProperty("fulltitle")
    private String fulltitle;
    @JsonProperty("filesize")
    private long filesize;
    @JsonProperty("webpage_url")
    private String webpageUrl;
    @JsonProperty("_filename")
    private String filename;
    @JsonProperty("format_id")
    private String formatId;
    @JsonProperty("http_headers")
    private HttpHeaders httpHeaders;
    @JsonProperty("id")
    private String id;
    @JsonProperty("webpage_url_basename")
    private String webpageUrlBasename;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The displayId
     */
    @Override
    @JsonProperty("display_id")
    public String getDisplayId() {
        return displayId;
    }

    /**
     * 
     * @param displayId
     *     The display_id
     */
    @JsonProperty("display_id")
    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }

    /**
     * 
     * @return
     *     The extractor
     */
    @Override
    @JsonProperty("extractor")
    public String getExtractor() {
        return extractor;
    }

    /**
     * 
     * @param extractor
     *     The extractor
     */
    @JsonProperty("extractor")
    public void setExtractor(String extractor) {
        this.extractor = extractor;
    }

    /**
     * 
     * @return
     *     The playlist
     */
    @Override
    @JsonProperty("playlist")
    public String getPlaylist() {
        return playlist;
    }

    @Override
    public String getDescription() {
        return "";
    }

    /**
     * 
     * @param playlist
     *     The playlist
     */
    @JsonProperty("playlist")
    public void setPlaylist(String playlist) {
        this.playlist = playlist;
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
    @Override
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
     *     The extractorKey
     */
    @Override
    @JsonProperty("extractor_key")
    public String getExtractorKey() {
        return extractorKey;
    }

    /**
     * 
     * @param extractorKey
     *     The extractor_key
     */
    @JsonProperty("extractor_key")
    public void setExtractorKey(String extractorKey) {
        this.extractorKey = extractorKey;
    }

    /**
     * 
     * @return
     *     The title
     */
    @Override
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The playlistIndex
     */
    @Override
    @JsonProperty("playlist_index")
    public Long getPlaylistIndex() {
        return playlistIndex;
    }

    /**
     *
     * @param playlistIndex
     *     The playlist_index
     */
    @JsonProperty("playlist_index")
    public void setPlaylistIndex(Long playlistIndex) {
        this.playlistIndex = playlistIndex;
    }

    /**
     * 
     * @return
     *     The thumbnail
     */
    @Override
    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     *
     * @param thumbnail
     *     The thumbnail
     */
    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * 
     * @return
     *     The ext
     */
    @Override
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
     *     The fulltitle
     */
    @Override
    @JsonProperty("fulltitle")
    public String getFulltitle() {
        return fulltitle;
    }

    /**
     * 
     * @param fulltitle
     *     The fulltitle
     */
    @JsonProperty("fulltitle")
    public void setFulltitle(String fulltitle) {
        this.fulltitle = fulltitle;
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
     *     The webpageUrl
     */
    @Override
    @JsonProperty("webpage_url")
    public String getWebpageUrl() {
        return webpageUrl;
    }

    /**
     * 
     * @param webpageUrl
     *     The webpage_url
     */
    @JsonProperty("webpage_url")
    public void setWebpageUrl(String webpageUrl) {
        this.webpageUrl = webpageUrl;
    }

    /**
     * 
     * @return
     *     The filename
     */
    @Override
    @JsonProperty("_filename")
    public String getFilename() {
        return filename;
    }

    /**
     * 
     * @param filename
     *     The _filename
     */
    @JsonProperty("_filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * 
     * @return
     *     The formatId
     */
    @Override
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
     *     The id
     */
    @Override
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The webpageUrlBasename
     */
    @Override
    @JsonProperty("webpage_url_basename")
    public String getWebpageUrlBasename() {
        return webpageUrlBasename;
    }

    /**
     * 
     * @param webpageUrlBasename
     *     The webpage_url_basename
     */
    @JsonProperty("webpage_url_basename")
    public void setWebpageUrlBasename(String webpageUrlBasename) {
        this.webpageUrlBasename = webpageUrlBasename;
    }

    @JsonAnyGetter
    @Override
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
