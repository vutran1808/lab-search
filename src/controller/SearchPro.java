/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import common.Library;
import model.Element;
import view.menu;
/**
 *
 * @author ASUS
 */
public class SearchPro {
        protected Library library;
        protected Algorithm algorithm;
        protected int[] array;
        protected int size_array;
        public void search() {
        final String[] mcSearch = {"Linear Search", "Binary Search", "Exit"};
        class SearchMenu extends menu<String> {

            public SearchMenu() {
                super("Search Option", mcSearch);
            }

            @Override
            public synchronized void execute(int n) {
                algorithm.sort(array);
                library.display(array);
                int value = library.getInt("\nEnter number to find: ", 1, 100);
                switch (n) {
                    case 1:
                        break;
                    case 2:
                        System.out.println("Found value: " + value + " at index: " + algorithm.binarySearch(array, value));
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            }
        }
        SearchMenu sm = new SearchMenu();
        sm.run();
    }
}
