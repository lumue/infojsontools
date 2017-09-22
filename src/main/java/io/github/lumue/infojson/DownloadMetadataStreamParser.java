package io.github.lumue.infojson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.function.Function;

/**
 * parse metadata from inputstream
 */
@SuppressWarnings("WeakerAccess")
public class DownloadMetadataStreamParser implements Function<InputStream,DownloadMetadata>{

	private static final ObjectMapper DEFAULT_MAPPER = new ObjectMapper();
	private final ObjectMapper objectMapper;

	public DownloadMetadataStreamParser(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	public DownloadMetadataStreamParser() {
		this(DEFAULT_MAPPER);
	}

	@Override
	public DownloadMetadata apply(InputStream stream)  {

			BufferedReader br=null;
			try {
				br = new BufferedReader(new InputStreamReader(stream));
				return objectMapper.readValue(stream,DownloadMetadataBean.class);
			} catch (Error|RuntimeException|IOException e) {
				try {
					if(br!=null)
						br.close();
				} catch (IOException ex) {
					try {
						e.addSuppressed(ex);
					} catch (Throwable ignore) {}
				}
				throw new RuntimeException(e);
			}
	}

	

}
