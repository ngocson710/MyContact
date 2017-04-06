package com.example.nson.mycontact.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nson.mycontact.R;
import com.example.nson.mycontact.model.Contact;

import java.util.List;

/**
 * Created by NSON on 06-04-2017.
 */

public class ContactAddapter extends ArrayAdapter<Contact>{
    Context context;
    int resource;
    List<Contact> ArrContact;
    public ContactAddapter(View.OnClickListener context, int resource, List<Contact> objects) {
        super((Context) context, resource, objects);
        this.context= (Context) context;
        this.resource= resource;
        this.ArrContact= objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView== null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
            viewHolder= new ViewHolder();
            viewHolder.imgAvatar = (ImageView) convertView.findViewById(R.id.img_lvavatar);
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.tv_lvname);
            viewHolder.tvPhone = (TextView) convertView.findViewById(R.id.tv_lvphone);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Contact contact= ArrContact.get(position);
        viewHolder.tvName.setText(contact.getmName());
        viewHolder.tvPhone.setText(contact.getmPhone());
        if(contact.getMale()){
            viewHolder.imgAvatar.setBackgroundResource(R.drawable.male);
        }
        else viewHolder.imgAvatar.setBackgroundResource(R.drawable.female);
        return convertView;
    }
    public class ViewHolder{
        ImageView imgAvatar;
        TextView tvName;
        TextView tvPhone;
    }
}
