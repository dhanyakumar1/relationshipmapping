package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelapp.model.Category;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Item;
import com.hotelapp.model.Type;
import com.hotelapp.repository.IHotelRepository;
import com.hotelapp.service.IHotelService;

@SpringBootApplication
public class SpringDatajpaOnetomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetomanyApplication.class, args);
	}
	
	@Autowired
	IHotelService hotelService;
	@Override
	public void run(String... args) throws Exception {
//		Item item1 = new Item("Dosa", Category.BREAKFAST, "South Indian", Type.VEJ, 30);
//		Item item2 = new Item("Lunch", Category.MAINCOURSE, "South Indian", Type.VEJ, 100);
//		Item item3 = new Item("Icecream", Category.BEVERAGES, "ice cream", Type.VEJ, 250);
//		Set<Item> items = new HashSet<>(Arrays.asList(item1,item2,item3));
//
//		Hotel hotel= new Hotel("Udupi", Type.VEJ, "Mangalore", 5, items);
//		//hotelService.addHotel(hotel);
//		
//		Item item4 = new Item("Dosa", Category.BREAKFAST, "South Indian", Type.VEJ, 50);
//		Item item5 = new Item("Idly", Category.BREAKFAST, "South Indian", Type.VEJ, 60);
//		//Item item6 = new Item("Biriyani", Category.MAINCOURSE, "Andhra", Type.NONVEJ, 200);
//		Set<Item> itemList1 = new HashSet<>(Arrays.asList(item4,item5));
//		
//		Hotel hotel1 = new Hotel("Sagar", Type.VEJ, "Davanagere", 4, itemList1);
//		//hotelService.addHotel(hotel1);
//		
//		hotelService.getAll().forEach(System.out::println);
//		System.out.println();
//		
//		hotelService.getByItemName("Dosa").forEach(nhotel->{
//			System.out.println("name "+nhotel.getName());
//			System.out.println("city "+nhotel.getCity());
//			
//			nhotel.getItemList().forEach(nitem ->{
//				System.out.println("item name "+nitem.getItemName());
//				System.out.println("Cusine "+nitem.getCusine());
//				System.out.println("Category "+nitem.getCategory());
//				System.out.println("Price "+nitem.getPrice());
//			});
//		});
//		System.out.println();
//	
//		hotelService.getByType(Type.VEJ).forEach(nhotel->{
//			System.out.println("name "+nhotel.getName());
//			System.out.println("city "+nhotel.getCity());
//			
//			nhotel.getItemList().forEach(nitem ->{
//				System.out.println("item name "+nitem.getItemName());
//				System.out.println("Cusine "+nitem.getCusine());
//				System.out.println("Category "+nitem.getCategory());
//				System.out.println("Price "+nitem.getPrice());
//			});
//		});
//	
	hotelService.getByCusine("South Indian").forEach(System.out::println);
	System.out.println();
	hotelService.getByCategory(Category.BREAKFAST).forEach(System.out::println);
	
	}

}
