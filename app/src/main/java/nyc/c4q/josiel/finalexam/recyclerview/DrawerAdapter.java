package nyc.c4q.josiel.finalexam.recyclerview;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

import nyc.c4q.josiel.finalexam.R;
import nyc.c4q.josiel.finalexam.model.DrawerItem;

public class DrawerAdapter extends RecyclerView.Adapter<DrawerViewHolder> {

    private List<DrawerItem> list = new ArrayList<>();

    @Override
    public DrawerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DrawerViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(DrawerViewHolder holder, int position) {
        DrawerItem drawerItem = list.get(position);
        holder.bind(drawerItem);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setList(List<DrawerItem> list){
        this.list = list;
        notifyDataSetChanged();
    }
}
