import java.net.*;
import java.io.*;
import java.util.*;

/**
 * class CrawlerDriver
 * 
 * @created 2014-10-27
 * @edited	2013-10-27
 *
 */

public class CrawlerDriver {

	public static void main(String[] args) {
		

		Crawler c = new Crawler(10, "http://localhost/", "index.html");

		System.out.println(c.crawl());

	}
}