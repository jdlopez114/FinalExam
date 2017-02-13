package nyc.c4q.josiel.finalexam.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import nyc.c4q.josiel.finalexam.R;

public class SettingsViewHolder extends RecyclerView.ViewHolder {

//    private TextView textView;

    public SettingsViewHolder(View itemView) {
        super(itemView);
    }

    public void bind(int position) {
//        textView = (TextView) itemView.findViewById(R.id.settings_item);
        ((TextView) itemView).setText("Settings - " + Integer.toString(position));
    }
}
