package com.hello.megamind.myapplication;

import android.renderscript.Element;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by megamind on 22-01-2016.
 */
public class SimpleRecyclerAdapter extends RecyclerView.Adapter<SimpleRecyclerAdapter.ElementViewHolder> {

    private List<Person> person;
    public SimpleRecyclerAdapter(){
        person = new ArrayList<>(5);
        person.add(new Person("Pranjal"));
        person.add(new Person("Akshay"));
        person.add(new Person("Pravin"));

    }

    @Override
    public ElementViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View rowView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_layout,parent,false);

        return new ElementViewHolder(rowView);
    }

    @Override
    public void onBindViewHolder(ElementViewHolder holder, int position) {

        final Person rowData = person.get(position);
        holder.sampleText.setText(rowData.getText());
        holder.itemView.setTag(rowData);


    }

    @Override
    public int getItemCount() {
        return person.size();
    }

    public static class ElementViewHolder extends RecyclerView.ViewHolder {

        private TextView sampleText;
        public ElementViewHolder(View view){
            super(view);
            sampleText = (TextView) view.findViewById(R.id.text);
        }
    }
}
