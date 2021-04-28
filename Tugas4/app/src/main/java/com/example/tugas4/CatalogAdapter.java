package com.example.tugas4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CatalogAdapter extends RecyclerView.Adapter<CatalogAdapter.ViewHolder> {
    private Context context;
    ArrayList catModels = new ArrayList<CatalogModel>();

    public CatalogAdapter(ArrayList<CatalogModel> listDataM, Context context) {
        this.catModels = listDataM;
        this.context = context;
    }

    public Context getContext(){
        return context;
    }

    public void setContext(Context context){
        this.context = context;
    }

    public ArrayList<CatalogModel> getCatModels() {
        return catModels;
    }

    public void setCatModels(ArrayList<CatalogModel> catModels) {
        this.catModels = catModels;
    }

    @NonNull
    @Override
    public com.example.tugas4.CatalogAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_catalog_list, parent,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.tugas4.CatalogAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(getCatModels().get(position).getGambarItem()).into(holder.gambar);
        holder.text.setText(getCatModels().get(position).getNamaItem());
    }

    @Override
    public int getItemCount() {
        return getCatModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView gambar;
        private TextView text;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.rv_gambar);
            text = itemView.findViewById(R.id.rv_nama);
        }
    }
}