package io.github.lumue.infojson;


import java.util.Map;

/**
 * Created by lm on 17.07.16.
 */
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

	String getFulltitle();

	String getWebpageUrl();

	String getFilename();

	String getFormatId();

	String getId();

	String getWebpageUrlBasename();

	Map<String, Object> getAdditionalProperties();
}
