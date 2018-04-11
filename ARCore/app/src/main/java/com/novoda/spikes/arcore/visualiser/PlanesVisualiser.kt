package com.novoda.spikes.arcore.visualiser

import android.content.Context
import com.google.ar.core.Camera
import com.google.ar.core.Plane
import com.google.ar.core.Session

import com.novoda.spikes.arcore.google.rendering.PlaneRenderer
import com.novoda.spikes.arcore.rendering.ARCoreDataModel

class PlanesVisualiser(private val context: Context) {
    private val planeRenderer = PlaneRenderer()

    fun init() {
        planeRenderer.createOnGlThread(context, "models/trigrid.png")
    }

    fun visualisePlanes(model: ARCoreDataModel) {
        visualisePlanes(model.session, model.camera, model.cameraProjectionMatrix)
    }
    fun visualisePlanes(session: Session, camera: Camera, projmtx: FloatArray) {
        planeRenderer.drawPlanes(session.getAllTrackables(Plane::class.java), camera.displayOrientedPose, projmtx)
    }

}