package com.unity3d.services.core.sensorinfo;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.properties.C9568a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.sensorinfo.b */
/* loaded from: classes3.dex */
public class C9608b implements SensorEventListener {

    /* renamed from: a */
    private static C9608b f19059a;

    /* renamed from: b */
    private static Sensor f19060b;

    /* renamed from: c */
    private static SensorEvent f19061c;

    /* renamed from: a */
    public static JSONObject m1812a() {
        if (f19061c != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("x", f19061c.values[0]);
                jSONObject.put("y", f19061c.values[1]);
                jSONObject.put("z", f19061c.values[2]);
                return jSONObject;
            } catch (JSONException e) {
                C9549a.m2023a("JSON error while constructing accelerometer data", e);
                return jSONObject;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m1811a(int i) {
        if (f19059a == null) {
            f19059a = new C9608b();
        }
        SensorManager sensorManager = (SensorManager) C9568a.m1959e().getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        f19060b = defaultSensor;
        return sensorManager.registerListener(f19059a, defaultSensor, i);
    }

    /* renamed from: b */
    public static boolean m1810b() {
        return f19059a != null;
    }

    /* renamed from: c */
    public static void m1809c() {
        if (f19059a != null) {
            ((SensorManager) C9568a.m1959e().getSystemService("sensor")).unregisterListener(f19059a);
            f19059a = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            f19061c = sensorEvent;
        }
    }
}
