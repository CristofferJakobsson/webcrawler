import java.net.*;
import java.io.*;
import java.util.*;

/**
 * @brief [brief description]
 * @details [long description]
 * 
 * @param args [description]
 */

public class CrawlerDriver {

	public static void main(String[] args) {
		
		Crawler c = new Crawler(10, "http://localhost/", "index.html");
		
		System.out.println(" ");
		System.out.println(c.crawl());
		System.out.println(" ");

	}
}