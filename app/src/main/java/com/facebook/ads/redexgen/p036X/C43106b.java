package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6b */
/* loaded from: assets/audience_network.dex */
public final class C43106b implements SensorEventListener {
    public static byte[] A09;
    public static String[] A0A = {"LMEfueB4gayQvpRN8xXm9AklEevQLqxV", "qKD5N87REqvFR6TOuYJE2bL", "", "yxtXe6d26bGgo70LmfUKAtnwRWe4i0hP", "QGB0NXt3pt8pLttf5OCs6Mo1nTnYeT90", "cpHchmbIsy8OjJq5SMyv1Bjwv0Y4tWtv", "hkg18epqSSQRsZzRGzTmSQr5c5v3YJAV", "CsdF03UMAkfQBN54GO6xo56"};
    public C43086Z A00;
    public final Context A01;
    public final SensorManager A02;
    public final C43056W A04;
    public final C43076Y A05;
    public final EnumC43346z A06;
    public final List<Sensor> A07;
    public final Map<Integer, EnumC43146f> A08 = new HashMap();
    public final Handler A03 = new Handler(C43517G.A00().A03().getLooper());

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0A[3].charAt(12) != 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[7] = "dphTU4VZCJVUxlSWVafH1ZM";
            strArr[1] = "vTUzDZVZybplSM6lZClu7qj";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 84);
            i4++;
        }
    }

    public static void A01() {
        A09 = new byte[]{-3, -17, -8, -3, -7, -4};
    }

    static {
        A01();
    }

    public C43106b(Context context, C43056W c43056w, EnumC43346z enumC43346z) {
        this.A01 = context;
        this.A02 = (SensorManager) context.getSystemService(A00(0, 6, 54));
        this.A07 = this.A02.getSensorList(-1);
        this.A04 = c43056w;
        this.A05 = new C43076Y(this.A04, enumC43346z);
        this.A06 = enumC43346z;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.ads.redexgen.X.6Z] */
    @SuppressLint({"CatchGeneralException"})
    public final synchronized void A02(List<EnumC43146f> list) {
        int A02;
        try {
            for (EnumC43146f enumC43146f : list) {
                if (enumC43146f != null && (A02 = enumC43146f.A02()) != -1 && this.A08.get(Integer.valueOf(enumC43146f.ordinal())) == null) {
                    if (A02 == 0) {
                        if (C43096a.A00[enumC43146f.ordinal()] == 1) {
                            this.A05.A02(this.A01);
                        }
                    } else {
                        for (Sensor sensor : this.A07) {
                            if (A02 == sensor.getType()) {
                                this.A00 = new SensorEventListener(this) { // from class: com.facebook.ads.redexgen.X.6Z
                                    public final SensorEventListener A00;

                                    {
                                        this.A00 = this;
                                    }

                                    @Override // android.hardware.SensorEventListener
                                    @SuppressLint({"CatchGeneralException"})
                                    public final void onAccuracyChanged(Sensor sensor2, int i) {
                                        try {
                                            this.A00.onAccuracyChanged(sensor2, i);
                                        } catch (Throwable th) {
                                            C42976O.A03(th);
                                        }
                                    }

                                    @Override // android.hardware.SensorEventListener
                                    @SuppressLint({"CatchGeneralException"})
                                    public final void onSensorChanged(SensorEvent sensorEvent) {
                                        try {
                                            this.A00.onSensorChanged(sensorEvent);
                                        } catch (Throwable th) {
                                            C42976O.A03(th);
                                        }
                                    }
                                };
                                this.A02.registerListener(this.A00, sensor, 3, this.A03);
                                this.A08.put(Integer.valueOf(enumC43146f.ordinal()), enumC43146f);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C42976O.A03(th);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final synchronized void A03(List<EnumC43146f> list) {
        try {
        } catch (Throwable t) {
            C42976O.A03(t);
        }
        if (this.A08 == null) {
            return;
        }
        if (list == null) {
            this.A02.unregisterListener(this.A00);
            this.A05.A01();
            this.A08.clear();
            return;
        }
        for (EnumC43146f enumC43146f : list) {
            if (enumC43146f.A02() != -1) {
                if (enumC43146f.A02() == 0) {
                    this.A08.remove(Integer.valueOf(enumC43146f.ordinal()));
                    if (C43096a.A00[enumC43146f.ordinal()] == 1) {
                        this.A05.A01();
                    }
                }
                Iterator<Sensor> it = this.A07.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Sensor next = it.next();
                        if (enumC43146f.A02() == next.getType()) {
                            this.A02.unregisterListener(this.A00, next);
                            this.A08.remove(Integer.valueOf(enumC43146f.ordinal()));
                            break;
                        }
                    }
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    @SuppressLint({"CatchGeneralException"})
    public final void onSensorChanged(SensorEvent sensorEvent) {
        C434378 c434378;
        if (sensorEvent == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String A00 = this.A01 == null ? A00(0, 0, 32) : this.A01.getPackageName();
            if (this.A06 == EnumC43346z.A0G) {
                c434378 = null;
            } else {
                c434378 = new C434378(A00);
            }
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                this.A04.A02(new C5961Y6(elapsedRealtime, c434378, new C43136e(new float[]{sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]})), EnumC43046V.A03);
            } else if (type == 2) {
                this.A04.A02(new C5961Y6(elapsedRealtime, c434378, new C43136e(new float[]{sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]})), EnumC43046V.A09);
            } else if (type == 4) {
                this.A04.A02(new C5961Y6(elapsedRealtime, c434378, new C43136e(new float[]{sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]})), EnumC43046V.A07);
            } else if (type == 5) {
                this.A04.A02(new C5967YC(elapsedRealtime, c434378, sensorEvent.values[0]), EnumC43046V.A08);
            } else if (type == 6) {
                this.A04.A02(new C5967YC(elapsedRealtime, c434378, sensorEvent.values[0]), EnumC43046V.A05);
            } else if (type == 8) {
                this.A04.A02(new C5967YC(elapsedRealtime, c434378, sensorEvent.values[0]), EnumC43046V.A0B);
            } else if (A0A[2].length() == 30) {
                throw new RuntimeException();
            } else {
                A0A[4] = "bqFyXbextQqAPSTh6NWFJn67Kuv1bHHX";
                if (type == 18) {
                    this.A04.A02(new C5967YC(elapsedRealtime, c434378, sensorEvent.values[0]), EnumC43046V.A0D);
                } else if (type == 20) {
                    this.A04.A02(new C5961Y6(elapsedRealtime, c434378, new C43136e(new float[]{sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2], sensorEvent.values[3]})), EnumC43046V.A06);
                } else if (type == 12) {
                    this.A04.A02(new C5967YC(elapsedRealtime, c434378, sensorEvent.values[0]), EnumC43046V.A0C);
                } else if (type != 13) {
                } else {
                    this.A04.A02(new C5967YC(elapsedRealtime, c434378, sensorEvent.values[0]), EnumC43046V.A04);
                }
            }
        } catch (Throwable th) {
            C42976O.A03(th);
        }
    }
}
