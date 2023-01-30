/**
 * 
 */
package com.invoicingsystem;

/**
 * @author LAP-7
 *
 */
public class  ProgramStatics {
        private int[] menuSelectionCount = new int[8];

        public void increaseCount(int index) {
            menuSelectionCount[index]++;
        }

        public void showProgramStatistics() {
            System.out.println("Program Statistics: ");
            for (int i = 0; i < menuSelectionCount.length; i++) {
                System.out.println(Menu.mainMenu[i] + " selected " + menuSelectionCount[i] + " times.");
            }
        }
    }

