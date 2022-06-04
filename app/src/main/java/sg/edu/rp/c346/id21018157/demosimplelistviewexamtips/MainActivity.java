package sg.edu.rp.c346.id21018157.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    Button btn;
    ArrayList<String> ExamTipsArray;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);
        btn = findViewById(R.id.button);

        ExamTipsArray = new ArrayList<>();
        ExamTipsArray.add("Don't just read the code, code it as much as possible during each practical session");
        ExamTipsArray.add("Seek help from the lecturer ASAP, don't wait till you lost in the jungle");
        ExamTipsArray.add("Prepare your template source code for each topic");
        ExamTipsArray.add("Create a few empty Android projects to speed up your coding during the exam");
        ExamTipsArray.add("Ensure that your Android Studio is up and running before the exam");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ExamTipsArray);
        lvExamTips.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExamTipsArray.add("new update");  //remove, add etc all have to be followed by notify
                adapter.notifyDataSetChanged();
            }
        });
    }
}