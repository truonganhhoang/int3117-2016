package com.andy;

import java.util.Set;
import java.util.TreeSet;

public class JaccardEngine 
{
	
	public double jaccardIndex(String d1, String d2)
	{
		Set<String> s1 = toSet(d1);
		Set<String> s2 = toSet(d2);
		
		return jaccardIndex(s1, s2);
	}

	//https://en.wikipedia.org/wiki/Jaccard_index
	private double jaccardIndex(Set<String> s1, Set<String> s2) {
		
		int c = 0;
		
		for(String x: s1)
			if(s2.contains(x)) c++;
		
		int s = s1.size() + s2.size() - c;
		
		return c/(double)(s==0 ? 1 : s);
	}

	private Set<String> toSet(String s) {
		Set<String> res = new TreeSet<String>();
		
		for(String sk: s.split("\\s+"))
		{
			res.add(sk.toLowerCase());
		}
		
		return res;
	}
	
	
}
