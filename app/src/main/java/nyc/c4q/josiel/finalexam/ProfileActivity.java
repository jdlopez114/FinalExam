package nyc.c4q.josiel.finalexam;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.josiel.finalexam.model.DrawerItem;
import nyc.c4q.josiel.finalexam.recyclerview.DrawerAdapter;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    private ArrayList<DrawerItem> list = new ArrayList<>();
    private DrawerLayout drawerLayout;
    private RecyclerView recyclerView;
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton logoutButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_drawer_view);
        setViews();
        addListItems();
        setTitle("Profile");

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
//        DrawerAdapter adapter = new DrawerAdapter();
//        adapter.setList(list);
//        recyclerView.setAdapter(adapter);
        recyclerView.setAdapter(new DrawerAdapter());


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        logoutButton.setOnClickListener(this);
    }

    public void addListItems(){
        list.add(new DrawerItem(R.string.button_1,R.drawable.button_1));
        list.add(new DrawerItem(R.string.button_2,R.drawable.button_2));
        list.add(new DrawerItem(R.string.button_3,R.drawable.button_3));
        list.add(new DrawerItem(R.string.logout,R.drawable.logout));

    }


    private void setViews() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        recyclerView = (RecyclerView) findViewById(R.id.profile_rv);
        button1 = (ImageButton) findViewById(R.id.button_1);
        button2 = (ImageButton) findViewById(R.id.button_2);
        button3 = (ImageButton) findViewById(R.id.button_3);
        logoutButton = (ImageButton) findViewById(R.id.logout_button);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:
                Toast.makeText(getApplicationContext(), "Selected Heart Activity", Toast.LENGTH_LONG).show();
                break;
            case R.id.button_2:
                Toast.makeText(getApplicationContext(), "Selected Message Activity", Toast.LENGTH_LONG).show();
                break;
            case R.id.button_3:
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), SettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.logout_button:
                Toast.makeText(getApplicationContext(), "Selected Logout Activity", Toast.LENGTH_LONG).show();
                finishAffinity();
        }

    }
}
