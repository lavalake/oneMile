package com.oneMile;

import android.app.Activity;
import android.os.Bundle;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;

public class MainActivity extends MapActivity {
    /** Called when the activity is first created. */


    private MapView mapView;
    private MapController mapController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mapView = (MapView)findViewById(R.id.mapview);
        mapController = mapView.getController();//获取MapController

        Double lng = 126.676530486 * 1E6; //设定地理坐标点
        Double lat = 45.7698895661 * 1E6;
        GeoPoint point = new GeoPoint(lat.intValue(), lng.intValue());


        mapController.setCenter(point); //将这个坐标转化为GeoPoint再使用
        mapController.setZoom(11); //设置放大层级
        mapController.animateTo(point); //将显示区域的中心设置为“显示中心”

        mapView.setSatellite(false);//true则为卫星模式，false则为普通模式
    }
    @Override
    protected boolean isRouteDisplayed() { //统计程序是否显示路径信息
        // TODO Auto-generated method stub
        return false;
    }


}
