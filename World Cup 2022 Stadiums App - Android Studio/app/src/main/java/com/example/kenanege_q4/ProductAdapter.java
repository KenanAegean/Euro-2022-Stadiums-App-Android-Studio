package com.example.kenanege_q4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.security.PublicKey;
import java.util.ArrayList;


public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder>
{

    ArrayList<Product> mProductList;
    LayoutInflater inflater;

    public ProductAdapter(Context context, ArrayList<Product> products)
    {
        inflater = LayoutInflater.from(context);
        this.mProductList = products;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = inflater.inflate(R.layout.item_product_card, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position)
    {
        Product selectedProduct = mProductList.get(position);
        holder.setData(selectedProduct, position);

    }

    @Override
    public int getItemCount() {
        return mProductList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        TextView stadiumName, stadiumCapacity, stadiumLocation;
        ImageView stadiumPicture;

        public MyViewHolder(View itemView)
        {
            super(itemView);
            stadiumName = (TextView) itemView.findViewById(R.id.stadiumName);
            stadiumCapacity = (TextView) itemView.findViewById(R.id.capacity);
            stadiumLocation = (TextView) itemView.findViewById(R.id.stadiumLocation);
            stadiumPicture = (ImageView) itemView.findViewById(R.id.stadiumPicture);



        }

        public void setData(Product selectedProduct, int position)
        {

            this.stadiumName.setText(selectedProduct.getStadiumName());
            this.stadiumCapacity.setText(selectedProduct.getStadiumCapacity());
            this.stadiumLocation.setText(selectedProduct.getStadiumLocation());
            this.stadiumPicture.setImageResource(selectedProduct.getImageID());
        }



        @Override
        public void onClick(View v)
        {
            int position = getAdapterPosition();
            

        }





    }
}
