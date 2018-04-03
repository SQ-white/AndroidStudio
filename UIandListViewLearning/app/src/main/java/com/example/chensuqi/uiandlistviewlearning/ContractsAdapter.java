package com.example.chensuqi.uiandlistviewlearning;

import android.content.Context;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by chensuqi on 2018/3/16.
 */

public class ContractsAdapter extends ArrayAdapter<Contracts> {
    private int resourceId;
    public ContractsAdapter(@NonNull Context context, int resource, @NonNull List<Contracts> objects) {
        super(context, resource, objects);
        resourceId=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Contracts contracts=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
        TextView nickName=(TextView)view.findViewById(R.id.nickName);
        TextView summary=(TextView)view.findViewById(R.id.summary);
        TextView date=(TextView)view.findViewById(R.id.date);

        imageView.setImageResource(R.mipmap.csq);
        nickName.setText(contracts.getNickName());
        summary.setText(contracts.getSummary());
        date.setText(contracts.getDate());
        return view;
    }
}
