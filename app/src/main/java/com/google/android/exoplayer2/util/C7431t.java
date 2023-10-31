package com.google.android.exoplayer2.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.exoplayer2.util.t */
/* loaded from: classes.dex */
public final class C7431t {
    @Nullable

    /* renamed from: e */
    public static C7431t f13967e;

    /* renamed from: a */
    public final Handler f13968a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final CopyOnWriteArrayList<WeakReference<InterfaceC7432a>> f13969b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final Object f13970c = new Object();
    @GuardedBy("networkTypeLock")

    /* renamed from: d */
    public int f13971d = 0;

    /* renamed from: com.google.android.exoplayer2.util.t$a */
    /* loaded from: classes.dex */
    public interface InterfaceC7432a {
        /* renamed from: a */
        void mo5032a(int i);
    }

    /* renamed from: com.google.android.exoplayer2.util.t$b */
    /* loaded from: classes.dex */
    public final class C7433b extends BroadcastReceiver {
        public C7433b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
            if (com.google.android.exoplayer2.util.C7408g0.f13905a >= 29) goto L16;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x006b A[Catch: RuntimeException -> 0x0078, TryCatch #0 {RuntimeException -> 0x0078, blocks: (B:34:0x0057, B:36:0x006b, B:38:0x0074, B:37:0x006f), top: B:44:0x0057 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x006f A[Catch: RuntimeException -> 0x0078, TryCatch #0 {RuntimeException -> 0x0078, blocks: (B:34:0x0057, B:36:0x006b, B:38:0x0074, B:37:0x006f), top: B:44:0x0057 }] */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onReceive(android.content.Context r9, android.content.Intent r10) {
            /*
                r8 = this;
                java.lang.String r10 = "connectivity"
                java.lang.Object r10 = r9.getSystemService(r10)
                android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
                r0 = 29
                r1 = 5
                r2 = 1
                r3 = 0
                if (r10 != 0) goto L10
                goto L4e
            L10:
                android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L4e
                if (r10 == 0) goto L4c
                boolean r4 = r10.isConnected()
                if (r4 != 0) goto L1d
                goto L4c
            L1d:
                int r4 = r10.getType()
                r5 = 9
                r6 = 6
                r7 = 4
                if (r4 == 0) goto L36
                if (r4 == r2) goto L44
                if (r4 == r7) goto L36
                if (r4 == r1) goto L36
                if (r4 == r6) goto L46
                if (r4 == r5) goto L34
                r5 = 8
                goto L4f
            L34:
                r5 = 7
                goto L4f
            L36:
                int r10 = r10.getSubtype()
                switch(r10) {
                    case 1: goto L4a;
                    case 2: goto L4a;
                    case 3: goto L48;
                    case 4: goto L48;
                    case 5: goto L48;
                    case 6: goto L48;
                    case 7: goto L48;
                    case 8: goto L48;
                    case 9: goto L48;
                    case 10: goto L48;
                    case 11: goto L48;
                    case 12: goto L48;
                    case 13: goto L46;
                    case 14: goto L48;
                    case 15: goto L48;
                    case 16: goto L3d;
                    case 17: goto L48;
                    case 18: goto L44;
                    case 19: goto L3d;
                    case 20: goto L3f;
                    default: goto L3d;
                }
            L3d:
                r5 = r6
                goto L4f
            L3f:
                int r10 = com.google.android.exoplayer2.util.C7408g0.f13905a
                if (r10 < r0) goto L4e
                goto L4f
            L44:
                r5 = 2
                goto L4f
            L46:
                r5 = r1
                goto L4f
            L48:
                r5 = r7
                goto L4f
            L4a:
                r5 = 3
                goto L4f
            L4c:
                r5 = r2
                goto L4f
            L4e:
                r5 = r3
            L4f:
                int r10 = com.google.android.exoplayer2.util.C7408g0.f13905a
                com.google.android.exoplayer2.util.t r4 = com.google.android.exoplayer2.util.C7431t.this
                if (r10 < r0) goto L78
                if (r5 != r1) goto L78
                java.lang.String r0 = "phone"
                java.lang.Object r9 = r9.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L78
                android.telephony.TelephonyManager r9 = (android.telephony.TelephonyManager) r9     // Catch: java.lang.RuntimeException -> L78
                r9.getClass()     // Catch: java.lang.RuntimeException -> L78
                com.google.android.exoplayer2.util.t$c r0 = new com.google.android.exoplayer2.util.t$c     // Catch: java.lang.RuntimeException -> L78
                r0.<init>()     // Catch: java.lang.RuntimeException -> L78
                r1 = 31
                if (r10 >= r1) goto L6f
                r9.listen(r0, r2)     // Catch: java.lang.RuntimeException -> L78
                goto L74
            L6f:
                r10 = 1048576(0x100000, float:1.469368E-39)
                r9.listen(r0, r10)     // Catch: java.lang.RuntimeException -> L78
            L74:
                r9.listen(r0, r3)     // Catch: java.lang.RuntimeException -> L78
                return
            L78:
                com.google.android.exoplayer2.util.C7431t.m5034a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.C7431t.C7433b.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: com.google.android.exoplayer2.util.t$c */
    /* loaded from: classes.dex */
    public class C7434c extends PhoneStateListener {
        public C7434c() {
        }

        @Override // android.telephony.PhoneStateListener
        @RequiresApi(31)
        public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType;
            overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            C7431t.m5034a(C7431t.this, overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        @Override // android.telephony.PhoneStateListener
        public final void onServiceStateChanged(@Nullable ServiceState serviceState) {
            String serviceState2 = serviceState == null ? "" : serviceState.toString();
            C7431t.m5034a(C7431t.this, serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    public C7431t(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C7433b(), intentFilter);
    }

    /* renamed from: a */
    public static void m5034a(C7431t c7431t, int i) {
        synchronized (c7431t.f13970c) {
            if (c7431t.f13971d != i) {
                c7431t.f13971d = i;
                Iterator<WeakReference<InterfaceC7432a>> it = c7431t.f13969b.iterator();
                while (it.hasNext()) {
                    WeakReference<InterfaceC7432a> next = it.next();
                    InterfaceC7432a interfaceC7432a = next.get();
                    if (interfaceC7432a != null) {
                        interfaceC7432a.mo5032a(i);
                    } else {
                        c7431t.f13969b.remove(next);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final int m5033b() {
        int i;
        synchronized (this.f13970c) {
            i = this.f13971d;
        }
        return i;
    }
}
