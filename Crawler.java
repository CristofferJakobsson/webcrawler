import java.net.*;
import java.io.*;
import java.util.*;

/**
 * @brief [brief description]
 * @details [long description]
 * 
 */

public class Crawler {
	int max_depth;
	String base_href;
	String init_page;

	Pattern TITLE = Pattern.compile("<title>(.*?)</title>",
					Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);

	Pattern LINK = 	Pattern.compile("<a(.?*)</a>",
				   	Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);

	/**
	 * @brief [brief description]
	 * @details [long description]
	 * 
	 * @param md [description]
	 * @param bh [description]
	 * @param ip [description]
	 *
	 */
	public Crawler(int md, String bh, String ip) {
		this.max_depth = md;
		this.base_href = bh;
		this.init_page = ip;
	}

	/**
	 * @brief [brief description]
	 * @details [long description]
	 * 
	 * @return [description]
	 */
	public String crawl() {
		Utility page = new Utility();
		URL newurl = page.urlify(base_href + init_page);

		return page.readURL(newurl);
	}

	/**
	 * @brief [brief description]
	 * @details [long description]
	 * 
	 * @param args [description]
	 */

	public static void main(String[] args) {
		
		Crawler c = new Crawler(10, "http://localhost/", "index.html");

		System.out.println(c.crawl());

	}
}