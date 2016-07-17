
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
    "creator",
    "height",
    "like_count",
    "duration",
    "fulltitle",
    "playlist_index",
    "view_count",
    "playlist",
    "title",
    "_filename",
    "tags",
    "is_live",
    "id",
    "dislike_count",
    "average_rating",
    "abr",
    "uploader_url",
    "categories",
    "fps",
    "stretched_ratio",
    "age_limit",
    "annotations",
    "webpage_url_basename",
    "acodec",
    "display_id",
    "automatic_captions",
    "description",
    "format",
    "start_time",
    "uploader",
    "format_id",
    "uploader_id",
    "subtitles",
    "thumbnails",
    "license",
    "alt_title",
    "extractor_key",
    "vcodec",
    "thumbnail",
    "vbr",
    "ext",
    "extractor",
    "end_time",
    "webpage_url",
    "formats",
    "resolution",
    "width"
})
public class YoutubeDownloadMetadata  implements DownloadMetadata {

    @JsonProperty("upload_date")
    private String uploadDate;
    @JsonProperty("creator")
    private Object creator;
    @JsonProperty("height")
    private long height;
    @JsonProperty("like_count")
    private long likeCount;
    @JsonProperty("duration")
    private long duration;
    @JsonProperty("fulltitle")
    private String fulltitle;
    @JsonProperty("playlist_index")
    private Long playlistIndex;
    @JsonProperty("view_count")
    private long viewCount;
    @JsonProperty("playlist")
    private String playlist;
    @JsonProperty("title")
    private String title;
    @JsonProperty("_filename")
    private String filename;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("is_live")
    private Object isLive;
    @JsonProperty("id")
    private String id;
    @JsonProperty("dislike_count")
    private long dislikeCount;
    @JsonProperty("average_rating")
    private float averageRating;
    @JsonProperty("abr")
    private long abr;
    @JsonProperty("uploader_url")
    private String uploaderUrl;
    @JsonProperty("categories")
    private List<String> categories = new ArrayList<String>();
    @JsonProperty("fps")
    private long fps;
    @JsonProperty("stretched_ratio")
    private Object stretchedRatio;
    @JsonProperty("age_limit")
    private long ageLimit;
    @JsonProperty("annotations")
    private Object annotations;
    @JsonProperty("webpage_url_basename")
    private String webpageUrlBasename;
    @JsonProperty("acodec")
    private String acodec;
    @JsonProperty("display_id")
    private String displayId;
    @JsonProperty("automatic_captions")
    private AutomaticCaptions automaticCaptions;
    @JsonProperty("description")
    private String description;
    @JsonProperty("format")
    private String format;
    @JsonProperty("start_time")
    private Object startTime;
    @JsonProperty("uploader")
    private String uploader;
    @JsonProperty("format_id")
    private String formatId;
    @JsonProperty("uploader_id")
    private String uploaderId;
    @JsonProperty("subtitles")
    private Subtitles subtitles;
    @JsonProperty("thumbnails")
    private List<Thumbnail> thumbnails = new ArrayList<Thumbnail>();
    @JsonProperty("license")
    private String license;
    @JsonProperty("alt_title")
    private Object altTitle;
    @JsonProperty("extractor_key")
    private String extractorKey;
    @JsonProperty("vcodec")
    private String vcodec;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("vbr")
    private Object vbr;
    @JsonProperty("ext")
    private String ext;
    @JsonProperty("extractor")
    private String extractor;
    @JsonProperty("end_time")
    private Object endTime;
    @JsonProperty("webpage_url")
    private String webpageUrl;
    @JsonProperty("formats")
    private List<Format> formats = new ArrayList<Format>();
    @JsonProperty("resolution")
    private Object resolution;
    @JsonProperty("width")
    private long width;
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
     *     The creator
     */
    @JsonProperty("creator")
    public Object getCreator() {
        return creator;
    }

    /**
     * 
     * @param creator
     *     The creator
     */
    @JsonProperty("creator")
    public void setCreator(Object creator) {
        this.creator = creator;
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
     *     The likeCount
     */
    @JsonProperty("like_count")
    public long getLikeCount() {
        return likeCount;
    }

    /**
     * 
     * @param likeCount
     *     The like_count
     */
    @JsonProperty("like_count")
    public void setLikeCount(long likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * 
     * @return
     *     The duration
     */
    @JsonProperty("duration")
    public long getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    @JsonProperty("duration")
    public void setDuration(long duration) {
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
    public String getPlaylist() {
        return playlist;
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
     *     The tags
     */
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The isLive
     */
    @JsonProperty("is_live")
    public Object getIsLive() {
        return isLive;
    }

    /**
     * 
     * @param isLive
     *     The is_live
     */
    @JsonProperty("is_live")
    public void setIsLive(Object isLive) {
        this.isLive = isLive;
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
    public long getDislikeCount() {
        return dislikeCount;
    }

    /**
     * 
     * @param dislikeCount
     *     The dislike_count
     */
    @JsonProperty("dislike_count")
    public void setDislikeCount(long dislikeCount) {
        this.dislikeCount = dislikeCount;
    }

    /**
     * 
     * @return
     *     The averageRating
     */
    @JsonProperty("average_rating")
    public float getAverageRating() {
        return averageRating;
    }

    /**
     * 
     * @param averageRating
     *     The average_rating
     */
    @JsonProperty("average_rating")
    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
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
     *     The uploaderUrl
     */
    @JsonProperty("uploader_url")
    public String getUploaderUrl() {
        return uploaderUrl;
    }

    /**
     * 
     * @param uploaderUrl
     *     The uploader_url
     */
    @JsonProperty("uploader_url")
    public void setUploaderUrl(String uploaderUrl) {
        this.uploaderUrl = uploaderUrl;
    }

    /**
     * 
     * @return
     *     The categories
     */
    @JsonProperty("categories")
    public List<String> getCategories() {
        return categories;
    }

    /**
     * 
     * @param categories
     *     The categories
     */
    @JsonProperty("categories")
    public void setCategories(List<String> categories) {
        this.categories = categories;
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
     *     The stretchedRatio
     */
    @JsonProperty("stretched_ratio")
    public Object getStretchedRatio() {
        return stretchedRatio;
    }

    /**
     * 
     * @param stretchedRatio
     *     The stretched_ratio
     */
    @JsonProperty("stretched_ratio")
    public void setStretchedRatio(Object stretchedRatio) {
        this.stretchedRatio = stretchedRatio;
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
     *     The annotations
     */
    @JsonProperty("annotations")
    public Object getAnnotations() {
        return annotations;
    }

    /**
     * 
     * @param annotations
     *     The annotations
     */
    @JsonProperty("annotations")
    public void setAnnotations(Object annotations) {
        this.annotations = annotations;
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
     *     The automaticCaptions
     */
    @JsonProperty("automatic_captions")
    public AutomaticCaptions getAutomaticCaptions() {
        return automaticCaptions;
    }

    /**
     * 
     * @param automaticCaptions
     *     The automatic_captions
     */
    @JsonProperty("automatic_captions")
    public void setAutomaticCaptions(AutomaticCaptions automaticCaptions) {
        this.automaticCaptions = automaticCaptions;
    }

    /**
     * 
     * @return
     *     The description
     */
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
     *     The startTime
     */
    @JsonProperty("start_time")
    public Object getStartTime() {
        return startTime;
    }

    /**
     * 
     * @param startTime
     *     The start_time
     */
    @JsonProperty("start_time")
    public void setStartTime(Object startTime) {
        this.startTime = startTime;
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
     *     The uploaderId
     */
    @JsonProperty("uploader_id")
    public String getUploaderId() {
        return uploaderId;
    }

    /**
     * 
     * @param uploaderId
     *     The uploader_id
     */
    @JsonProperty("uploader_id")
    public void setUploaderId(String uploaderId) {
        this.uploaderId = uploaderId;
    }

    /**
     * 
     * @return
     *     The subtitles
     */
    @JsonProperty("subtitles")
    public Subtitles getSubtitles() {
        return subtitles;
    }

    /**
     * 
     * @param subtitles
     *     The subtitles
     */
    @JsonProperty("subtitles")
    public void setSubtitles(Subtitles subtitles) {
        this.subtitles = subtitles;
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
     *     The license
     */
    @JsonProperty("license")
    public String getLicense() {
        return license;
    }

    /**
     * 
     * @param license
     *     The license
     */
    @JsonProperty("license")
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * 
     * @return
     *     The altTitle
     */
    @JsonProperty("alt_title")
    public Object getAltTitle() {
        return altTitle;
    }

    /**
     * 
     * @param altTitle
     *     The alt_title
     */
    @JsonProperty("alt_title")
    public void setAltTitle(Object altTitle) {
        this.altTitle = altTitle;
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
     *     The vbr
     */
    @JsonProperty("vbr")
    public Object getVbr() {
        return vbr;
    }

    /**
     * 
     * @param vbr
     *     The vbr
     */
    @JsonProperty("vbr")
    public void setVbr(Object vbr) {
        this.vbr = vbr;
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
     *     The endTime
     */
    @JsonProperty("end_time")
    public Object getEndTime() {
        return endTime;
    }

    /**
     * 
     * @param endTime
     *     The end_time
     */
    @JsonProperty("end_time")
    public void setEndTime(Object endTime) {
        this.endTime = endTime;
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

    /**
     * 
     * @return
     *     The resolution
     */
    @JsonProperty("resolution")
    public Object getResolution() {
        return resolution;
    }

    /**
     * 
     * @param resolution
     *     The resolution
     */
    @JsonProperty("resolution")
    public void setResolution(Object resolution) {
        this.resolution = resolution;
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
