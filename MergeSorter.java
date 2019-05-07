import java.io.*;
import java.util.*;
import static java.lang.System.*;
public class MergeSorter
{
	String[] a;
	int aLength;
public MergeSorter(String[] arr, int count)
	{
		a = arr;
		aLength = count;
	}	
public void sort()
{
	if (aLength <= 1) 
		return;
		 
	String[] first = new String[aLength/2];       		
	String[] second = new String[aLength - first.length]; 
	arraycopy(a, 0, first, 0, first.length);
	arraycopy(a, first.length, second, 0, second.length);
	
	MergeSorter firstSorter = new MergeSorter(first, first.length);
	MergeSorter secondSorter = new MergeSorter(second, second.length);
	firstSorter.sort();
	secondSorter.sort();
	merge(first,second);
		 
}	 
private void merge(String[] first,String[] second)
{
	int iFirst = 0, iSecond = 0, j = 0 ;
	while(iFirst <first.length && iSecond < second.length)
	{
		if (first[iFirst].compareTo(second[iSecond]) < 0)
			{
				a[j] = first[iFirst];
				iFirst ++;
			}
		else		 
			{
				a[j] = second[iSecond];
				iSecond ++;
			}
		j++;
	}
	arraycopy(first, iFirst, a, j, first.length - iFirst);
	arraycopy(second, iSecond,a, j, second.length - iSecond);
}
}