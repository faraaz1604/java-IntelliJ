package NestedClasses.LocalClasses;

import java.util.ArrayList;
import java.util.List;

public class ExpenseTracker {

    public void printExpenseReport(){
        List<String> categories = List.of("Transportation" , "Books", "food","Entertainment");
        List<Integer> amounts = List.of(500 , 200, 100,250);

        class Expense{
            private String category;
            private int amount;

            public Expense(String category, int amount) {
                this.category = category;
                this.amount = amount;
            }


            public int getAmount() {
                return amount;
            }

            public void print(){
                System.out.println("Category: "+ category + "| amount: "+ amount);
            }



            @Override
            public String toString() {
                return "Expense{" +
                        "category='" + category + '\'' +
                        ", amount=" + amount +
                        '}';
            }


        }
        List<Expense> expenses = new ArrayList<>();
        for(int i =0; i < categories.size(); i++){
            expenses.add(new Expense(categories.get(i),amounts.get(i)));
        }
        int total = 0;
        System.out.println("----- Expense Report -----");
        for (Expense e: expenses){
            System.out.println(e);
            total += e.getAmount();

        }
        System.out.println("total spent :" + total);



    }


}
