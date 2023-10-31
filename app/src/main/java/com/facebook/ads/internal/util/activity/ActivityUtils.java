package com.facebook.ads.internal.util.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import com.facebook.ads.redexgen.p036X.C44458z;
import com.facebook.ads.redexgen.p036X.C444690;
import com.facebook.ads.redexgen.p036X.C5064JR;
import com.facebook.ads.redexgen.p036X.C5184LT;
import com.facebook.ads.redexgen.p036X.C5952Xx;
import com.facebook.ads.redexgen.p036X.C5953Xy;
import com.facebook.ads.redexgen.p036X.ExecutorC5239MM;
import com.facebook.ads.redexgen.p036X.InterfaceC5182LP;
import com.facebook.ads.redexgen.p036X.RunnableC5181LO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: assets/audience_network.dex */
public final class ActivityUtils implements Application.ActivityLifecycleCallbacks {
    public static Context A01;
    public static C5952Xx A02;
    public static byte[] A03;
    public static String[] A04 = {"ouMPsLdF8VOzsynXqmRiTnVq9sCULlEK", "RDluICFSUJyOT3sC2lXOFgStPQc7gg7Y", "UmtUlnThENixw5hdz8sG1KFdsGmJDk97", "fTn296Ch3TXxkAVBDyGQxp9TrJ", "IUqXVRs0X8uhoFuXuWrDHC", "AqSoSQ8lTXl56yd6tw1FPxb5AEpw6", "5ylHfIThOZnGyEtaFkstDkkPbeVs18fd", "i0x"};
    public static final C5184LT A05;
    public static final List<InterfaceC5182LP> A06;
    public static final List<Runnable> A07;
    public static final Map<Activity, Integer> A08;
    public final Class<? extends Activity> A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A04;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "4AKSMNDzmxTAf23dNNcZP8";
            strArr2[7] = "cH1";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 12);
            i4++;
        }
    }

    public static void A02() {
        A03 = new byte[]{54, 58, 91, 121, 110, 115, 108, 115, 110, 99, 32, 58, 92, 80, 2, 21, 22, 74, 80, 115, 81, 70, 91, 68, 91, 70, 75, 18, 86, 91, 65, 81, 64, 87, 66, 83, 92, 81, 91, 87, 65, 28, 55, 6, 6, 53, 25, 24, 2, 19, 14, 2, 86, 31, 5, 86, 24, 25, 2, 86, 55, 6, 6, 26, 31, 21, 23, 2, 31, 25, 24, 88, 40, 4, 5, 8, 30, 25, 25, 14, 5, 31, 75, 6, 4, 15, 2, 13, 2, 8, 10, 31, 2, 4, 5, 75, 14, 19, 8, 14, 27, 31, 2, 4, 5, 75, 31, 3, 25, 4, 28, 5, 15, 30, 25, 2, 5, 12, 75, 25, 14, 12, 2, 24, 31, 14, 25, 42, 8, 31, 2, 29, 2, 31, 18, 40, 10, 7, 7, 9, 10, 8, 0, 24, 39, 2, 24, 31, 14, 5, 14, 25, 10, 41, 33, 101, 36, 38, 49, 44, 51, 44, 49, 60, 101, 54, 49, 36, 49, 32, Byte.MAX_VALUE, 101, 115, 66, 86, 80, 70, 71, 3, 66, 64, 87, 74, 85, 74, 87, 90, 3, 74, 80, 3, 77, 76, 87, 3, 81, 70, 80, 86, 78, 70, 71, 13, 74, 125, 107, 34, 56, 31, 29, 10, 33, 11, 10, 23, 18, 4, 21, 12};
    }

    static {
        A02();
        A08 = Collections.synchronizedMap(new WeakHashMap());
        A06 = Collections.synchronizedList(new ArrayList());
        A07 = new ArrayList();
        A05 = C5184LT.A00();
    }

    public ActivityUtils(Class<? extends Activity> adsActivityClass) {
        this.A00 = adsActivityClass;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: all -> 0x009d, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x000e, B:8:0x0014, B:10:0x0027, B:13:0x0031, B:19:0x003d, B:20:0x0041, B:24:0x0049), top: B:33:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b A[DONT_GENERATE] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized android.app.Activity A00() {
        /*
            java.lang.Class<com.facebook.ads.internal.util.activity.ActivityUtils> r9 = com.facebook.ads.internal.util.activity.ActivityUtils.class
            monitor-enter(r9)
            r6 = 0
            java.util.Map<android.app.Activity, java.lang.Integer> r0 = com.facebook.ads.internal.util.activity.ActivityUtils.A08     // Catch: java.lang.Throwable -> L9d
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L9d
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L9d
        Le:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L2d
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L9d
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r0 = r2.getValue()     // Catch: java.lang.Throwable -> L9d
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L9d
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L9d
            r0 = 3
            if (r1 != r0) goto Le
            java.lang.Object r6 = r2.getKey()     // Catch: java.lang.Throwable -> L9d
            android.app.Activity r6 = (android.app.Activity) r6     // Catch: java.lang.Throwable -> L9d
        L2d:
            r5 = 0
            r8 = 1
            if (r6 == 0) goto L3a
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L9d
            r0 = 28
            if (r1 >= r0) goto L38
            goto L3a
        L38:
            r1 = 0
            goto L3b
        L3a:
            r1 = 1
        L3b:
            if (r1 == 0) goto L41
            android.app.Activity r5 = com.facebook.ads.redexgen.p036X.C5179LM.A00()     // Catch: java.lang.Throwable -> L9d
        L41:
            com.facebook.ads.redexgen.X.Xx r0 = com.facebook.ads.internal.util.activity.ActivityUtils.A02     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L97
            if (r1 == 0) goto L97
            if (r6 == r5) goto L97
            r2 = 19
            r1 = 23
            r0 = 62
            java.lang.String r7 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> L9d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r3.<init>()     // Catch: java.lang.Throwable -> L9d
            r2 = 203(0xcb, float:2.84E-43)
            r1 = 5
            r0 = 20
            java.lang.String r0 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> L9d
            r3.append(r0)     // Catch: java.lang.Throwable -> L9d
            r3.append(r6)     // Catch: java.lang.Throwable -> L9d
            r2 = 12
            r1 = 7
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r0 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> L9d
            r3.append(r0)     // Catch: java.lang.Throwable -> L9d
            r3.append(r5)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L9d
            com.facebook.ads.redexgen.X.90 r4 = new com.facebook.ads.redexgen.X.90     // Catch: java.lang.Throwable -> L9d
            r4.<init>(r7, r0)     // Catch: java.lang.Throwable -> L9d
            r4.A03(r8)     // Catch: java.lang.Throwable -> L9d
            com.facebook.ads.redexgen.X.Xx r0 = com.facebook.ads.internal.util.activity.ActivityUtils.A02     // Catch: java.lang.Throwable -> L9d
            com.facebook.ads.redexgen.X.8y r3 = r0.A06()     // Catch: java.lang.Throwable -> L9d
            r2 = 208(0xd0, float:2.91E-43)
            r1 = 8
            r0 = 114(0x72, float:1.6E-43)
            java.lang.String r1 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> L9d
            int r0 = com.facebook.ads.redexgen.p036X.C44458z.A03     // Catch: java.lang.Throwable -> L9d
            r3.A8y(r1, r0, r4)     // Catch: java.lang.Throwable -> L9d
        L97:
            if (r6 == 0) goto L9b
            monitor-exit(r9)
            return r6
        L9b:
            monitor-exit(r9)
            return r5
        L9d:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.util.activity.ActivityUtils.A00():android.app.Activity");
    }

    public static void A03(@NonNull C5953Xy c5953Xy) {
        if (!C5064JR.A19(c5953Xy) || Build.VERSION.SDK_INT >= 29) {
            return;
        }
        RunnableC5181LO runnableC5181LO = new RunnableC5181LO(c5953Xy);
        synchronized (A07) {
            A07.add(runnableC5181LO);
        }
        ExecutorC5239MM.A01.A01().postDelayed(runnableC5181LO, 2000L);
    }

    public static synchronized void A04(C5952Xx c5952Xx, Class<? extends Activity> cls) {
        synchronized (ActivityUtils.class) {
            A02 = c5952Xx;
            A01 = c5952Xx.getApplicationContext();
            if (A01 instanceof Application) {
                ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListener = ANActivityLifecycleCallbacksListener.getANActivityLifecycleCallbacksListener();
                if (aNActivityLifecycleCallbacksListener != null) {
                    Map<Activity, Integer> activityStateMap = aNActivityLifecycleCallbacksListener.getActivityStateMap();
                    synchronized (activityStateMap) {
                        try {
                            A08.putAll(activityStateMap);
                        } catch (ConcurrentModificationException unused) {
                            c5952Xx.A06().A8y(A01(208, 8, 114), C44458z.A02, new C444690(A01(72, 80, 103)));
                        }
                    }
                    ANActivityLifecycleCallbacksListener.unregisterActivityCallbacks(c5952Xx);
                }
                ((Application) A01).registerActivityLifecycleCallbacks(new ActivityUtils(cls));
            } else {
                c5952Xx.A06().A8y(A01(216, 3, 105), C44458z.A0d, new C444690(A01(42, 30, 122)));
            }
        }
    }

    public static void A05(InterfaceC5182LP interfaceC5182LP) {
        A06.add(interfaceC5182LP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        A08.put(activity, 1);
        for (InterfaceC5182LP interfaceC5182LP : A06) {
            interfaceC5182LP.onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        A08.put(activity, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList;
        Integer num = A08.get(activity);
        if (num == null || num.intValue() != 3) {
            C444690 c444690 = new C444690(A01(172, 31, 47), A01(152, 20, 73) + num + A01(0, 12, 22) + activity);
            c444690.A03(0);
            A02.A06().A8y(A01(208, 8, 114), C44458z.A03, c444690);
        }
        A08.put(activity, 4);
        if (activity.getClass() != this.A00) {
            synchronized (A07) {
                arrayList = new ArrayList(A07);
                A07.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ExecutorC5239MM.A01.A01().removeCallbacks((Runnable) it.next());
            }
        }
        A05.A01();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        A08.put(activity, 3);
        A05.A02();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        A08.put(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        A08.put(activity, 5);
    }
}
