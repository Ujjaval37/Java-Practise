package com.menu.snackjava;

	import java.util.*;
	import java.util.Scanner;

	interface Snack
	{
		public void snackItems();
	}

	interface Meal
	{
		public void mealItems();
	}

	interface Chat
	{
		public void chatItems();
	}

	interface Juice
	{
		public void juiceItems();
	}


	public class PractiseExample implements Snack,Meal,Chat,Juice {
		static int i;
		static int quan,q;
		
		static Scanner sc=new Scanner(System.in);

		
		public void snackItems()
		{	
			System.out.println("Enter the Snack Item");
			q=sc.nextInt();
			switch(q)
			{
			case 1:
			{
				System.out.println("Enter the quantity of Samosa");
				quan=sc.nextInt();
				System.out.println(" 1 Samosa Price :10  "+"\n"+quan+ " Samosa price is "+(10*quan));
				break;
			}
				case 2:
				{
					System.out.println("Enter the quantity of Pizza");
					quan=sc.nextInt();
					System.out.println(" 1 Pizza Price :120  "+"\n"+quan+ " Pizza price is "+(120*quan));
					break;
				}
					
			}
			
		}
		
		public void mealItems()
		{
			System.out.println("Enter the Meal Item");
			q=sc.nextInt();
			switch(q)
			{
			case 1:
			{
				System.out.println("Enter the quantity of Thali");
				quan=sc.nextInt();
				System.out.println(" 1 Thali Price :120  "+"\n"+quan+ " Thali price is "+(120*quan));
				break;
			}
				case 2:
				{
					System.out.println("Enter the quantity of Dosa");
					quan=sc.nextInt();
					System.out.println(" 1 Dosa Price :100  "+"\n"+quan+ " Dosa price is "+(100*quan));
					break;
				}
					
			}
			
		}
		
		public void chatItems()
		{
			System.out.println("Enter the Chat Item");
			q=sc.nextInt();
			switch(q)
			{
			case 1:
			{
				System.out.println("Enter the quantity of Aloo");
				quan=sc.nextInt();
				System.out.println(" 1 Aloo Price :50  "+"\n"+quan+ " Aloo price is "+(50*quan));
				break;
			}
				case 2:
				{
					System.out.println("Enter the quantity of xyz");
					quan=sc.nextInt();
					System.out.println(" 1 xyz Price :40  "+"\n"+quan+ " xyz price is "+(40*quan));
					break;
				}
					
			}
			
		}
		
		public void juiceItems()
		{
			System.out.println("Enter the Juice Item");
			q=sc.nextInt();
			switch(q)
			{
			case 1:
			{
				System.out.println("Enter the quantity of Juice");
				quan=sc.nextInt();
				System.out.println(" 1 Juice Price :30  "+"\n"+quan+ " Juice price is "+(30*quan));
				break;
			}
				case 2:
				{
					System.out.println("Enter the quantity of Tea");
					quan=sc.nextInt();
					System.out.println(" 1 Tea Price :15  "+"\n"+quan+ " Tea price is "+(15*quan));
					break;
				}
				
					
			}
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			PractiseExample p=new PractiseExample();
			
			
			System.out.println("Welcome to Restaurant");
			System.out.println("1.Snack Items");
			System.out.println("2.Meal/Lunch");
			System.out.println("3.Chaat");
			System.out.println("4.Juices/Tea/Coffee");
			
			System.out.println("Enter the input : ");
			i=sc.nextInt();
			
				
			
			switch(i)
			{
			case 1:
			{
				p.snackItems();
				break;
			}
			case 2:
			{
				p.mealItems();
				break;
			}
			case 3:
			{
				p.chatItems();
				break;
			}
			case 4:
			{
				p.juiceItems();
				break;
			}
			case 5:
				break;
			default:
				System.out.println("Please enter a valid option");
			
			}
		
			

	}
	}


