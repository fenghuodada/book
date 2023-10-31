package com.facebook.ads.redexgen.p036X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.facebook.ads.redexgen.X.96 */
/* loaded from: assets/audience_network.dex */
public class C445296 implements SensorEventListener {
    public C445296() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        C445498.A0D(sensorEvent.values);
        C445498.A04();
    }
}
