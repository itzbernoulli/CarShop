package com.oyinloyeayodeji.www.mycarshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ayo on 13/03/2017.
 */

public class CarShopAdapter extends ArrayAdapter<CarShop> {
    public CarShopAdapter(Context context, List<CarShop> carShops) {
        super(context, 0, carShops);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.service_list_item,parent,false
            );
        }

        CarShop currentCarShop = getItem(position);

        TextView currentServiceCode = (TextView)listItemView.findViewById(R.id.service_and_code);
        currentServiceCode.setText(currentCarShop.getmServiceName() + "(" + currentCarShop.getmCode()+")");

        TextView currentCost = (TextView)listItemView.findViewById(R.id.cost);
        currentCost.setText("$"+currentCarShop.getmCost());

        return listItemView;
    }
}
