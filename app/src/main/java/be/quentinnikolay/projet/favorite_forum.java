package be.quentinnikolay.projet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class favorite_forum extends AppCompatActivity {

    private ListView testList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_forum);
        String[] test = {"Forum 1", "Forum 2", "Forum 3", "Forum 4", "Forum 5", "Forum 6", "Forum 7", "Forum 8", "Forum 9"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, test);
        testList = (ListView) findViewById(R.id.listView);
        testList.setAdapter(adapter);
        AdapterView.OnItemClickListener click = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                if(position+1 ==2) {
                    Intent intent = new Intent(favorite_forum.this, MainPage.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(favorite_forum.this, "Forum " + (position + 1) , Toast.LENGTH_SHORT).show();
            }
        };
        testList.setOnItemClickListener(click);
    }
}
