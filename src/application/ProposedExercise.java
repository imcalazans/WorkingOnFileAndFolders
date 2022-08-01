package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class ProposedExercise {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enther a Directory:");
		String path = sc.nextLine();
		List<Product> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			 
			 String line = br.readLine();
			 while(line != null) {
				String[] productVect = line.split(",");
				String name = productVect[0];
				Double price = Double.parseDouble(productVect[1]);
				int quantity = Integer.parseInt(productVect[2]);
//				System.out.println(name +" "+ price +" "+ quantity);
				Product product = new Product(name, price, quantity);
				list.add(product);
				line = br.readLine();
			 }
			 }catch(IOException e) {
			 System.out.println("Erro: " + e.getMessage() );
			 }
		
		path = "c:\\temp\\Summary.csv";
		 try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			 
			 for(Product product: list) {
				 String line = product.getName()+" "+product.getValorTotal();
				 bw.write(line);
				 bw.newLine();
			 } 
		 }catch(IOException e) {
			e.printStackTrace();
		 }

		 sc.close();
	}
}
