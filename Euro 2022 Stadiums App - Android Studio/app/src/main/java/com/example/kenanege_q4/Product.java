package com.example.kenanege_q4;

import java.util.ArrayList;


public class Product
{

    private String stadiumName;
    private String stadiumCapacity;
    private String stadiumLocation;
    private int imageID;
    static int stadiumNumber;

    public Product()
    {
        //https://gelecegiyazanlar.turkcell.com.tr/konu/egitim/android-201/recyclerview-kullanimi
        //https://stackoverflow.com/questions/53036425/how-to-set-two-columns-recyclerview/53036450
    }


    public Product(int imageID, String stadiumName, String stadiumCapacity, String stadiumLocaion)
    {
        this.imageID = imageID;
        this.stadiumName = stadiumName;
        this.stadiumLocation = stadiumLocaion;
        this.stadiumCapacity = stadiumCapacity;
    }

    public String getStadiumName()
    {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName)
    {
        this.stadiumName = stadiumName;
    }

    public String getStadiumCapacity()
    {
        return stadiumCapacity;
    }

    public void setStadiumCapacity(String stadiumCapacity)
    {
        this.stadiumCapacity = stadiumCapacity;
    }

    public String getStadiumLocation()
    {
        return stadiumLocation;
    }

    public void setStadiumLocation(String stadiumLocation)
    {
        this.stadiumLocation = stadiumLocation;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID)
    {
        this.imageID = imageID;
    }

    public static ArrayList<Product> getData()
    {
        ArrayList<Product> productList = new ArrayList<Product>();
        int stadiumPicture[] = {R.drawable.s1, R.drawable.s9,R.drawable.s3,R.drawable.s4,R.drawable.s5,R.drawable.s6, R.drawable.s7, R.drawable.s2, R.drawable.s10,R.drawable.s11,R.drawable.s12, R.drawable.s13};
        String[] stadiumCapacity = {"86.250", "40.000", "47.560", "45.350", "45.330", "45.120", "45.120","45.120", "44.950", "21.282", "21.282", "43.520"};
        String[] stadiumName = {"Lusail Iconic Stadyumu", "Halife Stadyumu", "Sports City Stadyumu", "Education City Stadyumu", "Al-Khor Stadyumu", "Al-Shamal Stadyumu", "Al-Wakrah Stadyumu","Umm Salal Stadyumu", "Doha Port Stadyumu", "Thani bin Jassim Stadyumu", "Ahmed bin Ali Stadyumu", "Katar Üniversitesi Stadyumu"};
        String[] stadiumLocation = {"Lusail", "Doha", "Doha", "Doha", "Al Khor", "Medinet eş Şemal", "Al Wakrah","Umm Salal", "Doha", "Doha", "Al Rayyan", "Doha"};

        for (int i = 0; i < stadiumPicture.length; i++)
        {
            Product temp = new Product();
            temp.setImageID(stadiumPicture[i]);
            temp.setStadiumLocation(stadiumCapacity[i]);
            temp.setStadiumCapacity(stadiumName[i]);
            temp.setStadiumName(stadiumLocation[i]);

            productList.add(temp);

        }

        return productList;


    }
}
