package com.tex.texandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Tavish on 02-Oct-16.
 */
public class BuyFragment extends Fragment{
    private RecyclerView recyclerView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.buy_fragment, container, false);
        recyclerView=(RecyclerView)view.findViewById(R.id.recyclerId);
        final LinearLayoutManager linearLayoutManager= new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        bookListAdapter= new bookListAdapter(getActivity());
        recyclerView.setAdapter(bookListAdapter);
        return view;
    }
}
