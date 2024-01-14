package com.mycompany.expensetracker;
import java.util.ArrayList;

public class ExpenseTracker {
    private final ArrayList<Double> expenses;
    private final ArrayList<Double> incomes;
    private double balance;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
        incomes = new ArrayList<>();
        balance = 0;
    }

    public void addExpense(double expense) {
        expenses.add(expense);
        balance -= expense;
    }

    public void addIncome(double income) {
        incomes.add(income);
        balance += income;
    }

    public double getBalance() {
        return balance;
    }

    public void printExpenses() {
        System.out.println("Expenses: ");
        for (double expense : expenses) {
            System.out.println(expense);
        }
    }

    public void printIncomes() {
        System.out.println("Incomes: ");
        for (double income : incomes) {
            System.out.println(income);
        }
    }
}


