package io.github.lumue.infojson;


import java.util.List;
import java.util.Map;

/**
 * metadata parsed from *.info.json files
 */
@SuppressWarnings("WeakerAccess")
public interface DownloadMetadata {

	String getDisplayId();

	String getExtractor();

	String getPlaylist();

	String getDescription();

	String getFormat();

	String getExtractorKey();

	String getTitle();

	Long getPlaylistIndex();

	String getThumbnail();

	String getExt();

	String getUploadDate();

	long getLikeCount();

	String getFulltitle();

	String getWebpageUrl();

	String getFilename();

	String getFormatId();

	List<String> getTags();

	List<String> getCategories();

	String getId();
	
	String getUploader();

	long getAgeLimit();

	String getWebpageUrlBasename();

	Map<String, Object> getAdditionalProperties();
}
