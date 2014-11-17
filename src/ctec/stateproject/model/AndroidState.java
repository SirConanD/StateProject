package ctec.stateproject.model;

import android.app.Application;

public class AndroidState extends Application
{
	private String name, age, phrase, blather;
	
	public void onCreate()
	{
		name = "";
		age = "";
		phrase = "";
		blather = "";
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAge()
	{
		return age;
	}

	public void setAge(String age)
	{
		this.age = age;
	}

	public String getPhrase()
	{
		return phrase;
	}

	public void setPhrase(String phrase)
	{
		this.phrase = phrase;
	}

	public String getBlather()
	{
		return blather;
	}

	public void setBlather(String blather)
	{
		this.blather = blather;
	}

}
