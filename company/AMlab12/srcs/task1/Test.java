package task1;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		People[] students = new Person[6];
		students[0] = new Person("Староволков И. А."); 
		students[1] = new Person("Успенский А.И."); 
		students[2] = new Person("Солдатов Д.П."); 
		students[3] = new Person("Рожков В.А"); 
		students[4] = new Person("Ручкин И.С"); 
		students[5] = new Person("Галдин И.Д");
	
		System.out.println("Результаты студентов: " + Arrays.toString(students) + "\n");
		
		Address[] adr = new Address[4];
		adr[0] = new Address("с. Россия, р. Пыталовского, г. Пыталово, ул. Камышенский 2-й пер, дом 67, квартира 304"); 
		adr[1] = new Address("с. Россия, р. Курагина, г. Курагино, ул. Красных Партизан (Красносельский), дом 198, квартира 559"); 
		adr[2] = new Address("с. Россия, р. Лешунского, г. Лешуконское, ул. Лефортовская пл, дом 115, квартира 98");
		adr[3] = new Address("с. Россия, р. Красногородское, г. Красногородское, ул. Каретный Ряд, дом 143, квартира 776");
		
		for (FullAddress name: adr) {
			String[] word = name.toString().split(",");
			System.out.println(Arrays.toString(word));
		}
		
		Shirt[] shirts = new Shirt[11];
		shirts[0] = new Shirt("S001,Black Polo Shirt,Black,XL"); 
		shirts[1] = new Shirt("S002,BlackPolo Shirt,Black,L"); 
		shirts[2] = new Shirt("S003,Blue Polo Shirt,Blue,XL"); 
		shirts[3] = new Shirt("S004,Blue Polo Shirt,Blue,M");
		shirts[4] = new Shirt("S005,Tan Polo Shirt,Tan,XL"); 
		shirts[5] = new Shirt("S006,Black T-Shirt,Black,XL"); 
		shirts[6] = new Shirt("S007,White TShirt,White,XL"); 
		shirts[7] = new Shirt("S008,White T-Shirt,White,L"); 
		shirts[8] = new Shirt("S009,Green T-Shirt,Green,S"); 
		shirts[9] = new Shirt("S010,Orange T-Shirt,Orange,S"); 
		shirts[10] = new Shirt("S011,Maroon Polo Shirt,Maroon,S");
		
		System.out.println("\n");
		
		for (Shirt name: shirts) {
			String word = name.toString();
			System.out.println(word.strip());
		}
	}
}
