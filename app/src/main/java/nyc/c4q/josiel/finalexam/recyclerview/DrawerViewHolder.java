package nyc.c4q.josiel.finalexam.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import nyc.c4q.josiel.finalexam.R;
import nyc.c4q.josiel.finalexam.model.DrawerItem;

public class DrawerViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;
    private ImageView imageView;

    public DrawerViewHolder(ViewGroup parent) {
        super (createView(parent));
        textView = (TextView) itemView.findViewById(R.id.rv_text);
        imageView = (ImageView) itemView.findViewById(R.id.rv_image);
    }


    private static View createView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.nav_item_view, parent, false);
    }

    public void bind(DrawerItem drawerItem) {
        textView.setText(drawerItem.getDrawerDescription());
        imageView.setImageResource(drawerItem.getImageId());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //where I would slick on nav items
            }
        });
    }

}
