package com.test.gd8_d_0944

import kotlinx.android.synthetic.main.layout_toolkit.view.*
import org.osmdroid.views.MapView
import org.osmdroid.views.overlay.Marker
import org.osmdroid.views.overlay.infowindow.InfoWindow

class CustomInfoWindow(mapView: MapView?): InfoWindow(R.layout.layout_toolkit,mapView) {
    override fun onClose() {
    }

    override fun onOpen(item: Any?) {
        val marker = item as Marker
        val infoWindowData = marker.relatedObject as ModelMain

        val tvNamaLokasi = mView.tvNamaLokasi
        val tvAlamat = mView.tvAlamat
        val imageClose = mView.imageClose

        tvNamaLokasi.text = infoWindowData.strName
        tvAlamat.text = infoWindowData.strVicinity
        imageClose.setOnClickListener{
            marker.closeInfoWindow()
        }
    }
}