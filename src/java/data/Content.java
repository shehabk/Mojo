/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Shihab
 */

public class Content {
	
	private byte[] picture;
	private String news;
	
	public Content()
	{
            
	}
	public byte[] getPictur()
	{
		return this.picture;
	}
        public int getPicSize()
        {
            return this.picture.length;
        }
	public void setPicture(byte[] b)
	{
		this.picture= b;
	}
	public void setNews(String x)
	{
		this.news=x;
	}
	public String getNews()
	{
		 return this.news;
	}

}
