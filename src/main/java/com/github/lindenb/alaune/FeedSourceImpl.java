package com.github.lindenb.alaune;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class FeedSourceImpl implements FeedSource {
	FeedSourceImpl() {
	}
	void read(final Path path) {
		final DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
		final DocumentBuilder db = dbf.newDocumentBuilder();
		try (InputStream in=Files.newInputStream(path)) {
			final Document dom = db.parse(in);
			
			}
		}
}
