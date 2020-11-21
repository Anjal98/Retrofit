package com.example.retrofitrc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.ViewHolder> {
    private ArrayList<model> albumModels = new ArrayList<>();
    private Context context;

    public AlbumsAdapter(Context context, ArrayList<model> albumModels){
       this. albumModels = albumModels;
       this.context = context;
    }
    @NonNull
    @Override
    public AlbumsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.albums_list_item, viewGroup, false);
        return new AlbumsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumsAdapter.ViewHolder viewHolder, int i) {
        viewHolder.album_user_id.setText(albumModels.get(i).getUserId());
        viewHolder.album_id.setText(albumModels.get(i).getId());
        viewHolder.title.setText(albumModels.get(i).getTitle());
    }

    @Override
    public int getItemCount() {
        return albumModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView album_user_id, album_id, title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            album_user_id = (TextView)itemView.findViewById(R.id.album_user_id);
            album_id = (TextView)itemView.findViewById(R.id.album_id);
            title = (TextView)itemView.findViewById(R.id.title);
        }
    }
}
