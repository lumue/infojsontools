
package io.github.lumue.infojson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "upload_date",
    "protocol",
    "extractor",
    "like_count",
    "duration",
    "fulltitle",
    "playlist_index",
    "view_count",
    "playlist",
    "http_headers",
    "_filename",
    "id",
    "dislike_count",
    "comment_count",
    "age_limit",
    "thumbnail",
    "webpage_url_basename",
    "display_id",
    "description",
    "format",
    "preference",
    "uploader",
    "format_id",
    "thumbnails",
    "url",
    "extractor_key",
    "title",
    "ext",
    "webpage_url",
    "formats"
})
public class XhDownloadMetadata  implements DownloadMetadata {

    @JsonProperty("upload_date")
    private String uploadDate;
    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("extractor")
    private String extractor;
    @JsonProperty("like_count")
    private Object likeCount;
    @JsonProperty("duration")
    private float duration;
    @JsonProperty("fulltitle")
    private String fulltitle;
    @JsonProperty("playlist_index")
    private Object playlistIndex;
    @JsonProperty("view_count")
    private long viewCount;
    @JsonProperty("playlist")
    private Object playlist;
    @JsonProperty("http_headers")
    private HttpHeaders httpHeaders;
    @JsonProperty("_filename")
    private String filename;
    @JsonProperty("id")
    private String id;
    @JsonProperty("dislike_count")
    private Object dislikeCount;
    @JsonProperty("comment_count")
    private long commentCount;
    @JsonProperty("age_limit")
    private long ageLimit;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("webpage_url_basename")
    private String webpageUrlBasename;
    @JsonProperty("display_id")
    private String displayId;
    @JsonProperty("description")
    private String description;
    @JsonProperty("format")
    private String format;
    @JsonProperty("preference")
    private long preference;
    @JsonProperty("uploader")
    private String uploader;
    @JsonProperty("format_id")
    private String formatId;
    @JsonProperty("thumbnails")
    private List<Thumbnail> thumbnails = new ArrayList<Thumbnail>();
    @JsonProperty("url")
    private String url;
    @JsonProperty("extractor_key")
    private String extractorKey;
    @JsonProperty("title")
    private String title;
    @JsonProperty("ext")
    private String ext;
    @JsonProperty("webpage_url")
    private String webpageUrl;
    @JsonProperty("formats")
    private List<Format> formats = new ArrayList<Format>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The uploadDate
     */
    @JsonProperty("upload_date")
    public String getUploadDate() {
        return uploadDate;
    }

    /**
     * 
     * @param uploadDate
     *     The upload_date
     */
    @JsonProperty("upload_date")
    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
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
     *     The extractor
     */
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
     *     The likeCount
     */
    @JsonProperty("like_count")
    public Object getLikeCount() {
        return likeCount;
    }

    /**
     * 
     * @param likeCount
     *     The like_count
     */
    @JsonProperty("like_count")
    public void setLikeCount(Object likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * 
     * @return
     *     The duration
     */
    @JsonProperty("duration")
    public float getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    @JsonProperty("duration")
    public void setDuration(float duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The fulltitle
     */
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
     *     The playlistIndex
     */
    @JsonProperty("playlist_index")
    public Object getPlaylistIndex() {
        return playlistIndex;
    }

    /**
     * 
     * @param playlistIndex
     *     The playlist_index
     */
    @JsonProperty("playlist_index")
    public void setPlaylistIndex(Object playlistIndex) {
        this.playlistIndex = playlistIndex;
    }

    /**
     * 
     * @return
     *     The viewCount
     */
    @JsonProperty("view_count")
    public long getViewCount() {
        return viewCount;
    }

    /**
     * 
     * @param viewCount
     *     The view_count
     */
    @JsonProperty("view_count")
    public void setViewCount(long viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * 
     * @return
     *     The playlist
     */
    @JsonProperty("playlist")
    public Object getPlaylist() {
        return playlist;
    }

    /**
     * 
     * @param playlist
     *     The playlist
     */
    @JsonProperty("playlist")
    public void setPlaylist(Object playlist) {
        this.playlist = playlist;
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
     *     The filename
     */
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
     *     The id
     */
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
     *     The dislikeCount
     */
    @JsonProperty("dislike_count")
    public Object getDislikeCount() {
        return dislikeCount;
    }

    /**
     * 
     * @param dislikeCount
     *     The dislike_count
     */
    @JsonProperty("dislike_count")
    public void setDislikeCount(Object dislikeCount) {
        this.dislikeCount = dislikeCount;
    }

    /**
     * 
     * @return
     *     The commentCount
     */
    @JsonProperty("comment_count")
    public long getCommentCount() {
        return commentCount;
    }

    /**
     * 
     * @param commentCount
     *     The comment_count
     */
    @JsonProperty("comment_count")
    public void setCommentCount(long commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 
     * @return
     *     The ageLimit
     */
    @JsonProperty("age_limit")
    public long getAgeLimit() {
        return ageLimit;
    }

    /**
     * 
     * @param ageLimit
     *     The age_limit
     */
    @JsonProperty("age_limit")
    public void setAgeLimit(long ageLimit) {
        this.ageLimit = ageLimit;
    }

    /**
     * 
     * @return
     *     The thumbnail
     */
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
     *     The webpageUrlBasename
     */
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

    /**
     * 
     * @return
     *     The displayId
     */
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
     *     The description
     */
    @Override
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
     *     The uploader
     */
    @JsonProperty("uploader")
    public String getUploader() {
        return uploader;
    }

    /**
     * 
     * @param uploader
     *     The uploader
     */
    @JsonProperty("uploader")
    public void setUploader(String uploader) {
        this.uploader = uploader;
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
     *     The thumbnails
     */
    @JsonProperty("thumbnails")
    public List<Thumbnail> getThumbnails() {
        return thumbnails;
    }

    /**
     * 
     * @param thumbnails
     *     The thumbnails
     */
    @JsonProperty("thumbnails")
    public void setThumbnails(List<Thumbnail> thumbnails) {
        this.thumbnails = thumbnails;
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
     *     The webpageUrl
     */
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
     *     The formats
     */
    @JsonProperty("formats")
    public List<Format> getFormats() {
        return formats;
    }

    /**
     * 
     * @param formats
     *     The formats
     */
    @JsonProperty("formats")
    public void setFormats(List<Format> formats) {
        this.formats = formats;
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
