package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes.dex */
final class zzcbz implements SensorEventListener {
    private final SensorManager zza;
    private final Display zzc;
    private float[] zzf;
    private Handler zzg;
    private zzcby zzh;
    private final float[] zzd = new float[9];
    private final float[] zze = new float[9];
    private final Object zzb = new Object();

    public zzcbz(Context context) {
        this.zza = (SensorManager) context.getSystemService("sensor");
        this.zzc = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzf == null) {
                this.zzf = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.zzd, fArr);
        int rotation = this.zzc.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.zzd, 2, 129, this.zze);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.zzd, 129, 130, this.zze);
        } else if (rotation != 3) {
            System.arraycopy(this.zzd, 0, this.zze, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.zzd, 130, 1, this.zze);
        }
        float[] fArr2 = this.zze;
        float f = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f;
        float f2 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f2;
        float f3 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f3;
        synchronized (this.zzb) {
            System.arraycopy(this.zze, 0, this.zzf, 0, 9);
        }
        zzcby zzcbyVar = this.zzh;
        if (zzcbyVar != null) {
            zzcbyVar.zza();
        }
    }

    public final void zza(zzcby zzcbyVar) {
        this.zzh = zzcbyVar;
    }

    public final void zzb() {
        if (this.zzg != null) {
            return;
        }
        Sensor defaultSensor = this.zza.getDefaultSensor(11);
        if (defaultSensor == null) {
            zzbzt.zzg("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        zzflv zzflvVar = new zzflv(handlerThread.getLooper());
        this.zzg = zzflvVar;
        if (this.zza.registerListener(this, defaultSensor, 0, zzflvVar)) {
            return;
        }
        zzbzt.zzg("SensorManager.registerListener failed.");
        zzc();
    }

    public final void zzc() {
        if (this.zzg == null) {
            return;
        }
        this.zza.unregisterListener(this);
        this.zzg.post(new zzcbx(this));
        this.zzg = null;
    }

    public final boolean zzd(float[] fArr) {
        synchronized (this.zzb) {
            float[] fArr2 = this.zzf;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }
}
