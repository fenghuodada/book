package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p031c.C3109b;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.utils.n */
/* loaded from: classes.dex */
public class C3336n implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final int f8789a;

    /* renamed from: b */
    private final float f8790b;

    /* renamed from: c */
    private final SensorManager f8791c;

    /* renamed from: d */
    private final Sensor f8792d;

    /* renamed from: e */
    private final Sensor f8793e;

    /* renamed from: f */
    private final C3214m f8794f;

    /* renamed from: g */
    private float[] f8795g;

    /* renamed from: h */
    private float f8796h;

    public C3336n(C3214m c3214m) {
        this.f8794f = c3214m;
        SensorManager sensorManager = (SensorManager) c3214m.m7476L().getSystemService("sensor");
        this.f8791c = sensorManager;
        this.f8792d = sensorManager.getDefaultSensor(9);
        this.f8793e = sensorManager.getDefaultSensor(4);
        this.f8789a = ((Integer) c3214m.m7456a(C3109b.f7970dR)).intValue();
        this.f8790b = ((Float) c3214m.m7456a(C3109b.f7969dQ)).floatValue();
        c3214m.m7430aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        c3214m.m7430aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: a */
    public void m6910a() {
        this.f8791c.unregisterListener(this);
        if (((Boolean) this.f8794f.m7477K().m7806a(C3109b.f7967dO)).booleanValue()) {
            this.f8791c.registerListener(this, this.f8792d, (int) TimeUnit.MILLISECONDS.toMicros(this.f8789a));
        }
        if (((Boolean) this.f8794f.m7477K().m7806a(C3109b.f7968dP)).booleanValue()) {
            this.f8791c.registerListener(this, this.f8793e, (int) TimeUnit.MILLISECONDS.toMicros(this.f8789a));
        }
    }

    /* renamed from: b */
    public float m6909b() {
        return this.f8796h;
    }

    /* renamed from: c */
    public float m6908c() {
        float[] fArr = this.f8795g;
        if (fArr == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(fArr[2] / 9.81f));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, @Nullable Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f8791c.unregisterListener(this);
        } else if ("com.applovin.application_resumed".equals(action)) {
            m6910a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f8795g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f = this.f8796h * this.f8790b;
            this.f8796h = f;
            float abs = Math.abs(sensorEvent.values[0]);
            this.f8796h = Math.abs(sensorEvent.values[2]) + Math.abs(sensorEvent.values[1]) + abs + f;
        }
    }
}
