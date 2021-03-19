package com.example.hoteleye.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hoteleye.Interface.ItemClickListener;
import com.example.hoteleye.R;
import com.example.hoteleye.ViewModel.RoomNameItem;

import java.util.List;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ReservationRoomAdapter extends RecyclerView.Adapter<ReservationRoomAdapter.ViewHolder> {
    Context context;
    List<RoomNameItem> roomNameItems;
    int index = -1;

    public ReservationRoomAdapter(Context context, List<RoomNameItem> roomNameItems) {
        this.context = context;
        this.roomNameItems = roomNameItems;
    }

    @Override
    public ReservationRoomAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_recyclerview_reservation_room, viewGroup, false);
        ReservationRoomAdapter.ViewHolder viewHolder = new ReservationRoomAdapter.ViewHolder(view);

        return viewHolder;
    }
    @Override
    public  void onBindViewHolder(final ReservationRoomAdapter.ViewHolder viewHolder, final int position) {
        viewHolder.iconName.setText(roomNameItems.get(position).getName());
        if(roomNameItems.get(position).getRoom_status() == 0){
            viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#A9B1DA"));
        }
        if(roomNameItems.get(position).getRoom_status() == 4){
            viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#FFFFAB40"));
        }


        viewHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
//                if(isLongClick)
                if(viewHolder.cardView.getCardBackgroundColor().getDefaultColor()==(Color.parseColor("#A9B1DA")))
                    viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#FFFFAB40"));
                else if(viewHolder.cardView.getCardBackgroundColor().getDefaultColor()==(Color.parseColor("#FFFFAB40")))
                    viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#A9B1DA"));
                Log.e("thanhphan", "onClick: "+viewHolder.cardView.getCardBackgroundColor() );
                Log.e("thanhphan", "onClick: "+viewHolder.cardView.getCardBackgroundColor().getDefaultColor()+" | |"+Color.parseColor("#A9B1DA"));
            }
        });
    }

    @Override
    public int getItemCount() {
        return roomNameItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener,View.OnLongClickListener {

        TextView iconName;
        CardView cardView;
        ItemClickListener itemClickListener;

        public ViewHolder(View itemView) {
            super(itemView);

            iconName = (TextView) itemView.findViewById(R.id.name_item_recyclerview_reservation_room);
            cardView = itemView.findViewById(R.id.bg_item_reservation_room);

            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);

        }

        public void setItemClickListener(ItemClickListener itemClickListener)
        {
            this.itemClickListener = itemClickListener;
        }
        @Override
        public void onClick(View v) {
            itemClickListener.onClick(v,getAdapterPosition(),false);
        }

        @Override
        public boolean onLongClick(View v) {
            itemClickListener.onClick(v,getAdapterPosition(),true);
            return true;
        }
    }
}
