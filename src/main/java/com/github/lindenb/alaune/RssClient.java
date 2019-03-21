package com.github.lindenb.alaune;

import java.nio.file.Files;
import java.nio.file.Path;

public class RssClient {
/** where is the configuration directory */
private Path configDir;
/** where is the output directory */
private Path outputDir;
public RssClient() {
	}

public Path getConfigDir() {
	return configDir;
	}

public void execute(Path p ) {
	
}

public void executeAll() {
	Files.list(getConfigDir()).
		filter(P->P.getFileName().toString().endsWith("")).
		forEach(P->execute(P));
	}

}
