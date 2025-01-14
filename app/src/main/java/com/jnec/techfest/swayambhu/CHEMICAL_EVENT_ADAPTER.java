package com.jnec.techfest.swayambhu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Imroz Quazi on 12-03-2018.
 */

public class CHEMICAL_EVENT_ADAPTER extends BaseAdapter {

    private List<Chemical_Event_1> ChemicalEvent1List;
    private Context mcontext;

    public CHEMICAL_EVENT_ADAPTER(List<Chemical_Event_1> ChemicalEvent1List, Context mcontext) {
        this.ChemicalEvent1List = ChemicalEvent1List;
        this.mcontext = mcontext;
    }

    @Override
    public int getCount() {
        return ChemicalEvent1List.size();

    }

    @Override
    public Object getItem(int position)
    {
        return ChemicalEvent1List.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View rowView = view;

        if(rowView == null)
        {
            rowView = LayoutInflater.from(mcontext).inflate(R.layout.layout_item,null);

            TextView name = (TextView) rowView.findViewById(R.id.label);

            ImageView image = (ImageView) rowView.findViewById(R.id.image);


            Picasso.with(mcontext).load(ChemicalEvent1List.get(position).getPathofimage()).into(image);
            name.setText(ChemicalEvent1List.get(position).getName());
        }
        return  rowView;
    }
}
