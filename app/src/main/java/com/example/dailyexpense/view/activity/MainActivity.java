package com.example.dailyexpense.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.dailyexpense.R;
import com.example.dailyexpense.databinding.ActivityMainBinding;
import com.example.dailyexpense.model.Expense;
import com.example.dailyexpense.view.adapter.DailyExpenseAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private DailyExpenseAdapter dailyExpenseAdapter;
    private List<Expense> expenses;
    private List<Expense> expenseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        init();

        initRecyclerView();

    }

    private void init() {
        expenses = new ArrayList<>();
        expenseList = new ArrayList<>();

        Expense expense = new Expense();
        expense.setCategory("Personal Cost");
        expense.setDate("01/02/09");
        expense.setAmount(500);

        Expense expense1 = new Expense();

        expense1.setCategory("Study Cost");
        expense1.setDate("02/02/09");
        expense1.setAmount(350);

        Expense expense2 = new Expense();

        expense2.setCategory("Tour Cost");
        expense2.setDate("07/02/09");
        expense2.setAmount(5000);

        Expense expense3 = new Expense();

        expense3.setCategory("Utility Cost");
        expense3.setDate("01/07/2019");
        expense3.setAmount(380);

        Expense expense4 = new Expense();

        expense4.setCategory("Transport");
        expense4.setDate("01/07/2019");
        expense4.setAmount(368);

        Expense expense5 = new Expense();


        expense5.setCategory("Book Fee");
        expense5.setDate("01/10/2019");
        expense5.setAmount(1500);

        Expense expense6 = new Expense();

        expense6.setCategory("Lost Money");
        expense6.setDate("25/06/2019");
        expense6.setAmount(360);


        expenses.add(expense);
        expenses.add(expense1);
        expenses.add(expense2);
        expenses.add(expense3);
        expenses.add(expense4);
        expenses.add(expense5);
        expenses.add(expense6);

    }

    private void initRecyclerView() {

        expenseList.clear();
        expenseList.addAll(expenses);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        dailyExpenseAdapter = new DailyExpenseAdapter(this, expenseList,binding.totalAmountTV);
        binding.recyclerView.setAdapter(dailyExpenseAdapter);
    }
}
