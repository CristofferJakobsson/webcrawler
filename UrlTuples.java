import java.util.ArrayList;
public class UrlTuples {
    /**
     * @brief A data structure consisting of a 3-tuple
     * @details An inductive datastructure designed to store the URL, title and all links of a page.
     * 
  	 * @param url The url of current page.
  	 * @param title The title of current page.
  	 * 
  	 * @return A UrlTuples object with the aforementioned parameters.
  	 */
  	public UrlTuples(String url, String title) {
    	this.url = url;
    	this.title = title;
  	}

  	/**
  	 * @brief Method to add a link to the links ArrayList.
  	 * @details 
  	 * 
  	 * @param url The URL of the page that is to be added to ArrayList "links"
  	 * @param title The title of the page that is to be added to ArrayList "links"
  	 */
  	public void addLink(String url, String title) {
  		UrlTuples link = new UrlTuples(url, title);
		  this.links.add(link);
  	}
  	/**
  	 * @brief brief description
  	 * @details long description
  	 * @return description
  	 */
  	public String get() { return url + " " + title; }

  	/**
  	 * @brief Concatenates URL and title of current object to a single string.
  	 * @details 
  	 * @return A single string consisting of the URL and title.
  	 */
  	public String toString() { return url + " " + title; }
  	
  	/**
  	 * @brief Extracts the URL from current object.
  	 * @details 
  	 * @return The URL of current object.
  	 */
  	public String getUrl() { return this.url; }

  	/**
  	 * @brief Extracts the title from current object.
  	 * @details 
  	 * @return The title of current object.
  	 */
  	public String getTitle() { return this.title; }

  	/**
  	 * @brief Extracts the ArrayList conatining all links in the page from current object.
  	 * @details 
  	 * @return The ArrayList containing all links in current object.
  	 */
  	public ArrayList<UrlTuples> getUrlList() { return this.links; }

  	/**
  	 * @brief Method to compare equality of a specified string with the url variable of current object.
  	 * @details 
  	 * 
  	 * @param url String used for comparison
  	 * @return Boolean value true if the strings match, false otherwise.
  	 */
  	public boolean equals(String url) { return (url == this.url); }

  	/**
  	 * @brief Method to check number of links in a page.
  	 * @details 
  	 * @return An integer representing the number of elements in ArrayList links.
  	 */
  	public int numberOfLinks() { return links.size();}

  	/**
  	 * @brief Main method. Creates a UrlTuples object with parameters specified form input.
  	 * @details Method that creates an instance of a UrlTuple object with parameters specified from input.
  	 * 
  	 * @param args 
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
