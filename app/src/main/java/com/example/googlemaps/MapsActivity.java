package com.example.googlemaps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng potosi = new LatLng(-19.595660147933927, -65.75733426373499);
        mMap.addMarker(new MarkerOptions().position(potosi).
                title("Potosi Villa Imperial").
                snippet("Hermosa Ciudad Potosi llamada Tambien la Gran Villa Imperial"));
        LatLng benito = new LatLng(-19.591326, -65.757711);
        mMap.addMarker(new MarkerOptions().position(benito).
                title("Zona San Benito ").
                snippet("zona san Benito donde se inicia la entrada de chutillos"));
        LatLng santiago = new LatLng(-19.595666, -65.757292);
        mMap.addMarker(new MarkerOptions().position(santiago).
                title("Zona Villa Santiago").
                snippet("zona villa Santiago "));
        LatLng españa = new LatLng(-19.595015, -65.761697);
        mMap.addMarker(new MarkerOptions().position(españa).
                title("Zona De Villa España").
                snippet("zona de villa de españa tambien existe un coliseo"));


        mMap.moveCamera(CameraUpdateFactory.newLatLng(potosi));
    }
}