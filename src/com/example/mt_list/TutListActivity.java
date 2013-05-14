package com.example.mt_list;

import android.net.Uri;
import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

public class TutListActivity extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(ArrayAdapter.createFromResource(getApplicationContext(),
                R.array.tut_titles, R.layout.item_list));
    
    }
    
        final String[] links = getResources().getStringArray(R.array.tut_links);
        public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
        	String content = links[position];
            Intent showContent = new Intent(getApplicationContext(),
                    TutViewerActivity.class);
            showContent.setData(Uri.parse(content));
            startActivity(showContent);
            
            getListView().setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                        int position, long id) {
                    // TBD
                }
            });
  }
}