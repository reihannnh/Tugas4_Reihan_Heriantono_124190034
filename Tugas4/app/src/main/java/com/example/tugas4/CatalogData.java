package com.example.tugas4;

import java.util.ArrayList;

public class CatalogData {
    private static  String[] namaData = new String[]{"Iphone 12 Pro Max 256gb White", "Iphone 12 Pro Max 256gb Pacific Blue", "Iphone Xs Max 256gb Gold", "Iphone 11 128gb", "Iphone Xs 256gb Gold", "Iphone 11 256gb", "Iphone 12 Pro Max 512gb Pacific Blue", "Iphone 12 Pro Max 512gb White"};

    private static int[] gambarData = new int[]{R.drawable.ip_1, R.drawable.ip_2, R.drawable.ip_3, R.drawable.ip_4, R.drawable.ip_3, R.drawable.ip_4, R.drawable.ip_2, R.drawable.ip_1};

    public static ArrayList<CatalogModel> getListDataM(){
        CatalogModel catModel = null;
        ArrayList<CatalogModel> listMouse = new ArrayList<CatalogModel>();
        for ( int i = 0; i < namaData.length; i++){
            catModel = new CatalogModel();
            catModel.setGambarItem(gambarData[i]);
            catModel.setNamaItem(namaData[i]);
            listMouse.add(catModel);
        }
        return listMouse;
    }
}