import java.util.ArrayList;
/**
 * @brief [brief description]
 * @details [long description]
 * 
 * @param url [description]
 * @param title [description]
 * 
 * @return [description]
 */

public class UrlTuples {
	private String url;
  	private String title;
  	private ArrayList<UrlTuples> links = new ArrayList<UrlTuples>();

  	/**
  	 * @brief [brief description]
  	 * @details [long description]
  	 * 
  	 * @param url [description]
  	 * @param title [description]
  	 * 
  	 * @return [description]
  	 */
  	public UrlTuples(String url, String title) {
    	this.url = url;
    	this.title = title;
  	}

  	/**
  	 * @brief [brief description]
  	 * @details [long description]
  	 * 
  	 * @param url [description]
  	 * @param title [description]
  	 */
  	public void addLink(String url, String title) {
  		UrlTuples link = new UrlTuples(url, title);

		this.links.add(link);
  	}
  	/**
  	 * @brief [brief description]
  	 * @details [long description]
  	 * @return [description]
  	 */
  	public String get() { return title + " " + url; }

  	/**
  	 * @brief [brief description]
  	 * @details [long description]
  	 * @return [description]
  	 */
  	public String toString() { return title + " " + url; }
  	
  	/**
  	 * @brief [brief description]
  	 * @details [long description]
  	 * @return [description]
  	 */
  	public String getUrl() { return this.url; }

  	/**
  	 * @brief [brief description]
  	 * @details [long description]
  	 * @return [description]
  	 */
  	public String getTitle() { return this.title; }

  	/**
  	 * @brief [brief description]
  	 * @details [long description]
  	 * @return [description]
  	 */
  	public ArrayList<UrlTuples> getUrlList() { return this.links; }

  	/**
  	 * @brief [brief description]
  	 * @details [long description]
  	 * 
  	 * @param url [description]
  	 * @return [description]
  	 */
  	public boolean equals(String url) { return (url == this.url); }

  	/**
  	 * @brief [brief description]
  	 * @details [long description]
  	 * @return [description]
  	 */
  	public int numberOfLinks() { return links.size();}

  	/**
  	 * @brief [brief description]
  	 * @details [long description]
  	 * 
  	 * @param args [description]
  	 */
  	public static void main(String[] args) {
  		UrlTuples test = new UrlTuples("test.html", "test1");

  		test.addLink("test2.html", "test2");
  		test.addLink("test3.html", "test3");
		test.addLink("test4.html", "test4");
		test.addLink("test5.html", "test5");

		for (int i = 0; i<test.numberOfLinks(); i++) {
			System.out.println(test.getUrlList().get(i).getUrl());
		}
  	}
}
