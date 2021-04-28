package com.example.tugas4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<com.example.tugas4.CatalogModel> listItem = new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.rvCon);
        recyclerView.setHasFixedSize(true);
        listItem.addAll(com.example.tugas4.CatalogData.getListDataM());

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        com.example.tugas4.CatalogAdapter catalogAdapter = new com.example.tugas4.CatalogAdapter(com.example.tugas4.CatalogData.getListDataM(), getActivity());
        recyclerView.setAdapter(catalogAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }
}