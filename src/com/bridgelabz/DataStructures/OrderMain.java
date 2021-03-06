/******************************************************************************
 *  Purpose:	Unordered Linked List
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   23-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.DataStructures;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import com.bridgelabz.utility.Utility;

public class OrderMain {
	
	public static void main(String[] args) {
		
		try{
			OrderedLinkedList list=new OrderedLinkedList();
			File file=new File("/home/bridgeit/zeeshan/Files/OrderedList.txt");
			String fileString=Utility.readFile(file);
			System.out.println(fileString);
			String []stringArray=fileString.split("\\s");
			String []sortArray=Utility.sortBubbleGenericInt(stringArray);
			System.out.println("After Sorting");
			System.out.println(Arrays.toString(sortArray));
			System.out.println("Enter the Number");
			String number=Utility.inputString();
			list.operation(number, sortArray);
		
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}

	}

}
