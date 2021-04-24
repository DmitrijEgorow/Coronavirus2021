package com.dmitry.viable.coronavirus2021;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomHolder> {
    private List<String> mItems;

    public CustomAdapter(List<String> mItems) {
        this.mItems = mItems;
    }

    @Override
    public int getItemViewType(int position) {
        return position % 4;
    }

    @NonNull
    @Override
    public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0 || viewType == 1) {
            return new CustomHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false));

        } else {
            return new CustomHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_title, parent, false));
        }

    }

    @Override
    public void onBindViewHolder(@NonNull CustomHolder holder, int position) {
        holder.title.setText(mItems.get(position));
    }


    @Override
    public int getItemCount() {
        if (mItems != null) {
            return mItems.size();
        } else {
            return 0;
        }

    }

    class CustomHolder extends RecyclerView.ViewHolder {

        private TextView title;

        public CustomHolder(@NonNull View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.title);

        }
    }
}
