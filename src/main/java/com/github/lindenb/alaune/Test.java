package com.github.lindenb.alaune;

import java.net.URL;

import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

public class Test {
public static void main(String[] args) {
		try {
	  URL feedUrl = new URL(args[0]);

      SyndFeedInput input = new SyndFeedInput();
      SyndFeed feed = input.build(new XmlReader(feedUrl));

      System.out.println(feed);
		} catch(final Throwable err)  {
			err.printStackTrace();
		}
		
}
}
