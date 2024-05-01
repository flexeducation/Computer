import java.util.Scanner;

public class ComputerTest {
    static Scanner scan = new Scanner(System.in);
	private Computer computers[];
	private int n;
	private Computer t;
	// Hàm nhập vào số n và một mảng gồm thông tin của n máy tính
	public void input()
	{
	    n = Integer.parseInt(scan.nextLine());
	    computers = new Computer[n];
	    String name,manu; int year; String detail; double price;
	    for (int i =0;i<n;i++)
	    {
	        name = scan.nextLine();
	        manu = scan.nextLine();
	        year = Integer.parseInt(scan.nextLine());
	        detail = scan.nextLine();
	        price = Double.parseDouble(scan.nextLine());
	        computers[i] = new Computer(name,manu,year,detail,price);
	    }
	}
	
	// in ra các máy tính, mỗi thông tin của một máy tính trên một dòng
	public void output()
	{
        for (int i=0;i<n;i++)
        {
            computers[i].toString();
        }
	}
	
	// Trả về giá trung bình của các máy tính
	public double getAvgPrice()
	{
	    double s = 0;
	    for (int i=0;i<n;i++)
	    {
	        s = s + computers[i].getPrice();
	    }
		return s/n;
	}
	
	// In ra các máy tính có giá cao nhất
	public void getMaxPrice()
	{
	    double max = computers[0].getPrice();
		for (int i=0;i<n;i++)
		{
		    if (computers[i].getPrice() > max)
		    {
		    max = computers[i].getPrice();
		    }
		}
		for (int i=0;i<n;i++)
		{
		    if (max == computers[i].getPrice())
		    System.out.println(computers[i].toString());
		}
	}
	
	// In ra các máy tính có nhà sản xuất là Dell
	public void getDell()
	{
	    for (int i=0;i<n;i++)
	    {
	        if (computers[i].getManu().equals("Dell"))
	        System.out.println(computers[i].toString());
	    }
	}
	
	// Sắp xếp các máy tính theo chiều giảm dần của giá, và in ra mảng sau khi sắp xếp
	public void sort()
	{
	    t = computers[0];
		for (int i=0;i<n;i++)
		{
		    for (int j=i+1;j<n;j++)
		    {
		        if (computers[i].getPrice() < computers[j].getPrice())
		        {
		        t = computers[j];
		        computers[j] = computers[i];
		        computers[i] = t;
		        }
		    }
		}
		for (int i=0;i<n;i++)
		{
		    System.out.println(computers[i].toString());
		}
	}
	public static void main(String[] args) {
	}
}



