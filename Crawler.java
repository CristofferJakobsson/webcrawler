import java.net.*;
import java.io.*;
import java.util.*;

/**
 * @brief [brief description]
 * @details [long description]
 * 
 */

public class Crawler {
	private int max_depth;
	private String base_href;
	private String init_page;
	private String[] 

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

	public String getPageTitle() {

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