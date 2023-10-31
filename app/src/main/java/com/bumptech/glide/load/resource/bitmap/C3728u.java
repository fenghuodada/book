package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.util.Log;
import androidx.annotation.GuardedBy;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bumptech.glide.load.resource.bitmap.u */
/* loaded from: classes.dex */
public final class C3728u {

    /* renamed from: g */
    public static final boolean f9693g;

    /* renamed from: h */
    public static final boolean f9694h;

    /* renamed from: i */
    public static final File f9695i;

    /* renamed from: j */
    public static volatile C3728u f9696j;

    /* renamed from: k */
    public static volatile int f9697k;

    /* renamed from: a */
    public final boolean f9698a;

    /* renamed from: b */
    public final int f9699b;

    /* renamed from: c */
    public final int f9700c;
    @GuardedBy("this")

    /* renamed from: d */
    public int f9701d;
    @GuardedBy("this")

    /* renamed from: e */
    public boolean f9702e = true;

    /* renamed from: f */
    public final AtomicBoolean f9703f = new AtomicBoolean(false);

    static {
        int i = Build.VERSION.SDK_INT;
        f9693g = i < 29;
        f9694h = i >= 26;
        f9695i = new File("/proc/self/fd");
        f9697k = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
        if (r2 == false) goto L15;
     */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3728u() {
        /*
            r26 = this;
            r0 = r26
            r26.<init>()
            r1 = 1
            r0.f9702e = r1
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            r0.f9703f = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r2 == r4) goto L17
            goto L5b
        L17:
            java.lang.String r5 = "SC-04J"
            java.lang.String r6 = "SM-N935"
            java.lang.String r7 = "SM-J720"
            java.lang.String r8 = "SM-G570F"
            java.lang.String r9 = "SM-G570M"
            java.lang.String r10 = "SM-G960"
            java.lang.String r11 = "SM-G965"
            java.lang.String r12 = "SM-G935"
            java.lang.String r13 = "SM-G930"
            java.lang.String r14 = "SM-A520"
            java.lang.String r15 = "SM-A720F"
            java.lang.String r16 = "moto e5"
            java.lang.String r17 = "moto e5 play"
            java.lang.String r18 = "moto e5 plus"
            java.lang.String r19 = "moto e5 cruise"
            java.lang.String r20 = "moto g(6) forge"
            java.lang.String r21 = "moto g(6) play"
            java.lang.String[] r2 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.Iterator r2 = r2.iterator()
        L45:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5b
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = android.os.Build.MODEL
            boolean r4 = r5.startsWith(r4)
            if (r4 == 0) goto L45
            r2 = r1
            goto L5c
        L5b:
            r2 = r3
        L5c:
            if (r2 != 0) goto La1
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 27
            if (r2 == r4) goto L66
            r2 = r3
            goto L9e
        L66:
            java.lang.String r5 = "LG-M250"
            java.lang.String r6 = "LG-M320"
            java.lang.String r7 = "LG-Q710AL"
            java.lang.String r8 = "LG-Q710PL"
            java.lang.String r9 = "LGM-K121K"
            java.lang.String r10 = "LGM-K121L"
            java.lang.String r11 = "LGM-K121S"
            java.lang.String r12 = "LGM-X320K"
            java.lang.String r13 = "LGM-X320L"
            java.lang.String r14 = "LGM-X320S"
            java.lang.String r15 = "LGM-X401L"
            java.lang.String r16 = "LGM-X401S"
            java.lang.String r17 = "LM-Q610.FG"
            java.lang.String r18 = "LM-Q610.FGN"
            java.lang.String r19 = "LM-Q617.FG"
            java.lang.String r20 = "LM-Q617.FGN"
            java.lang.String r21 = "LM-Q710.FG"
            java.lang.String r22 = "LM-Q710.FGN"
            java.lang.String r23 = "LM-X220PM"
            java.lang.String r24 = "LM-X220QMA"
            java.lang.String r25 = "LM-X410PM"
            java.lang.String[] r2 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.String r4 = android.os.Build.MODEL
            boolean r2 = r2.contains(r4)
        L9e:
            if (r2 != 0) goto La1
            goto La2
        La1:
            r1 = r3
        La2:
            r0.f9698a = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lb1
            r1 = 20000(0x4e20, float:2.8026E-41)
            r0.f9699b = r1
            r0.f9700c = r3
            goto Lb9
        Lb1:
            r1 = 700(0x2bc, float:9.81E-43)
            r0.f9699b = r1
            r1 = 128(0x80, float:1.8E-43)
            r0.f9700c = r1
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C3728u.<init>():void");
    }

    /* renamed from: a */
    public final boolean m6533a(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        int i3;
        boolean z5;
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        } else if (!this.f9698a) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        } else if (!f9694h) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        } else {
            if (f9693g && !this.f9703f.get()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed by app state");
                }
                return false;
            } else if (z2) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                }
                return false;
            } else {
                int i4 = this.f9700c;
                if (i < i4) {
                    if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
                    }
                    return false;
                } else if (i2 < i4) {
                    if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
                    }
                    return false;
                } else {
                    synchronized (this) {
                        int i5 = this.f9701d + 1;
                        this.f9701d = i5;
                        if (i5 >= 50) {
                            this.f9701d = 0;
                            int length = f9695i.list().length;
                            if (f9697k != -1) {
                                i3 = f9697k;
                            } else {
                                i3 = this.f9699b;
                            }
                            long j = i3;
                            if (length < j) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            this.f9702e = z5;
                            if (!z5 && Log.isLoggable("Downsampler", 5)) {
                                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j);
                            }
                        }
                        z4 = this.f9702e;
                    }
                    if (z4) {
                        return true;
                    }
                    if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                    }
                    return false;
                }
            }
        }
    }
}
