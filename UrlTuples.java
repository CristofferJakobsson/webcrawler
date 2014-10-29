import java.util.ArrayList;

public class UrlTuples {
	private String url;
  	private String title;
  	private ArrayList<UrlTuples> links = new ArrayList<UrlTuples>();

  	public UrlTuples(String url, String title) {
    	this.url = url;
    	this.title = title;
  	}

  	public void addLink(String url, String title) {
  		UrlTuples link = new UrlTuples(url, title);

		this.links.add(link);
  	}


  	public String get() 						{ return title + " " + url; }
  	public String toString()					{ return title + " " + url; }
  	public String getUrl() 						{ return this.url; }
  	public String getTitle() 					{ return this.title; }
  	public ArrayList<UrlTuples> getUrlList() 	{ return this.links; }
  	public boolean equals(String url) 			{ return (url == this.url); }
  	public int numberOfLinks()					{ return links.size();}

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
