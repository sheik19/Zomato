package com.zomato.pages;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Pdfreader {
	
		
		private static String FILE_PATH_NAME = "C:\\Users\\optimum\\Downloads";
		public static String text;
		
		public static void main(String[] args) throws IOException {
			readTextFromPdfFile();
	    }
		
		private static void readTextFromPdfFile() {
	        File myFile = new File(FILE_PATH_NAME);
	        try (PDDocument doc = PDDocument.load(myFile)) {

	        	System.out.println(">>> Get All Text from PDF document -> \n");
	        	
	        	PDFTextStripper stripper = new PDFTextStripper();
	             text= stripper.getText(doc);
	            text.contains("selenium");
	          
	            
	            for(int i=1; i<=doc.getNumberOfPages(); i++) {
	            	
	                stripper.setStartPage(i);
	                stripper.setEndPage(i);
	                if(text.contains("selenium")) {
	                	
	                }
	                if(text.contains("Spring")) {
	                	
	                }
	                if(text.contains("Python")) {
	                	
	                }
	             
	            }
	        }catch(Exception e) {
	        	System.out.println(e);
	        }
		}
	}


