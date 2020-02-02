package com.euler1;


public class MultiplesOf3And5
{
	 public int GetMultiples()
	 {
		int total = 0; for (int i=1; i<1000; ++i)
		{
			if (i%3 == 0 || i%5 == 0) { total += i; }
		};
	        return total;
	}

}
