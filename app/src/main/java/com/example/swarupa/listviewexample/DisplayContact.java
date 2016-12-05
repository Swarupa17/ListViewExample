package com.example.swarupa.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by swarupa on 28-11-2016.
 */

public class DisplayContact extends BaseAdapter {
    private Context mContext;
    private  final String[] Names;
    private final String[] toView ;

    public DisplayContact(Context c, String[] Names,String[] toView) {
        mContext = c;
        this.Names=Names;
        this.toView = toView;
    }

    @Override
    public int getCount() {
        return Names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View Grid;
        LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(view==null)
        {
            Grid = new View(mContext);
            Grid = inflater.inflate(R.layout.activity_listview,null);
            TextView textView = (TextView)Grid.findViewById(R.id.display_name);
            TextView textView1 =(TextView)Grid.findViewById(R.id.person_number);
            textView.setText(Names[i]);
            textView1.setText(toView[i]);
        }
        else
        {
            Grid = (View)view;
        }
        return Grid;
    }
}
