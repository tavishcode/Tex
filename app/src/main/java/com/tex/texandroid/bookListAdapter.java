package com.tex.texandroid;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tavish on 02-Oct-16.
 */
public class bookListAdapter extends RecyclerView.Adapter <bookListAdapter.ViewHolderEventList> {

    private ArrayList<Book> events_upcoming_list=new ArrayList<>();
    private LayoutInflater layoutInflater;
    public bookListAdapter(Context context)
    {
        layoutInflater= LayoutInflater.from(context);
    }

    public void setBook_upcoming_list(ArrayList<Book> events_upcoming_list)
    {
        this.events_upcoming_list=events_upcoming_list;
    }

    @Override
    public ViewHolderEventList onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=layoutInflater.inflate(R.layout.book_item,parent, false);
        ViewHolderEventList viewHolder= new ViewHolderEventList(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolderEventList holder, int position) {
        Book current_event= events_upcoming_list.get(position);
        holder.event_name.setText(current_event.name);
        String image_url=current_event.link;
    }
    @Override
    public long getItemId(int position)
    {
        return position;
    }
    @Override
    public int getItemCount()
    {
        if(events_upcoming_list!=null) {
            return events_upcoming_list.size();
        }
        else
        {
            return 0;
        }
    }

    class ViewHolderEventList extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView event_image;
        private TextView event_name;
        public ViewHolderEventList(final View itemView)
        {
            super(itemView);
            event_name=(TextView)itemView.findViewById(R.id.event_name);
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            Context context= v.getContext();
            Book event=events_upcoming_list.get(getAdapterPosition());
        }
    }
}
