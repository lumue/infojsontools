package io.github.lumue.infojson;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by lm on 17.07.16.
 */
public interface DownloadMetadata {
	@JsonProperty("display_id")
	String getDisplayId();

	@JsonProperty("extractor")
	String getExtractor();

	@JsonProperty("playlist")
	Object getPlaylist();

	@JsonProperty("description")
	String getDescription();

	@JsonProperty("format")
	String getFormat();

	@JsonProperty("extractor_key")
	String getExtractorKey();

	@JsonProperty("title")
	String getTitle();

	@JsonProperty("playlist_index")
	Object getPlaylistIndex();

	@JsonProperty("thumbnail")
	Object getThumbnail();

	@JsonProperty("ext")
	String getExt();

	@JsonProperty("fulltitle")
	String getFulltitle();


	@JsonProperty("webpage_url")
	String getWebpageUrl();

	@JsonProperty("_filename")
	String getFilename();

	@JsonProperty("format_id")
	String getFormatId();


	@JsonProperty("id")
	String getId();

	@JsonProperty("webpage_url_basename")
	String getWebpageUrlBasename();
}
