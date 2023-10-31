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
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.utils.i */
/* loaded from: classes.dex */
public class C3296i implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final C3214m f8695a;

    /* renamed from: b */
    private final SensorManager f8696b;

    /* renamed from: c */
    private final Sensor f8697c;

    /* renamed from: d */
    private final InterfaceC3297a f8698d;

    /* renamed from: e */
    private float f8699e;

    /* renamed from: com.applovin.impl.sdk.utils.i$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3297a {
        /* renamed from: b */
        void mo6990b();

        /* renamed from: c */
        void mo6989c();
    }

    public C3296i(C3214m c3214m, InterfaceC3297a interfaceC3297a) {
        this.f8695a = c3214m;
        SensorManager sensorManager = (SensorManager) c3214m.m7476L().getSystemService("sensor");
        this.f8696b = sensorManager;
        this.f8697c = sensorManager.getDefaultSensor(1);
        this.f8698d = interfaceC3297a;
    }

    /* renamed from: a */
    public void m6992a() {
        this.f8696b.unregisterListener(this);
        this.f8696b.registerListener(this, this.f8697c, (int) TimeUnit.MILLISECONDS.toMicros(50L));
        this.f8695a.m7430aj().unregisterReceiver(this);
        this.f8695a.m7430aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        this.f8695a.m7430aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: b */
    public void m6991b() {
        this.f8695a.m7430aj().unregisterReceiver(this);
        this.f8696b.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, @Nullable Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f8696b.unregisterListener(this);
        } else if ("com.applovin.application_resumed".equals(action)) {
            m6992a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float max = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f = this.f8699e;
            float f2 = (max * 0.5f) + (f * 0.5f);
            this.f8699e = f2;
            if (f < 0.8f && f2 > 0.8f) {
                this.f8698d.mo6989c();
            } else if (f <= -0.8f || f2 >= -0.8f) {
            } else {
                this.f8698d.mo6990b();
            }
        }
    }
}
