package com.ambrose.overwall.p007v2;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import androidx.core.app.C0637o;
import androidx.core.app.C0638p;
import androidx.core.app.NotificationCompat$Action;
import androidx.databinding.C1082a;
import cn.hutool.core.codec.C2024a;
import com.ambrose.overwall.MainActivity;
import com.ambrose.overwall.R;
import com.ambrose.overwall.p007v2.C2530g;
import com.android.tool.util.util.C2599d;
import com.android.tool.util.util.C2603g;
import io.reactivex.rxjava3.core.AbstractC10151d;
import io.reactivex.rxjava3.functions.InterfaceC10174b;
import io.reactivex.rxjava3.internal.disposables.EnumC10175a;
import io.reactivex.rxjava3.internal.functions.C10179a;
import io.reactivex.rxjava3.internal.observers.C10187b;
import io.reactivex.rxjava3.internal.operators.observable.C10193c;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.coroutines.C10781g;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10773e;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.coroutines.jvm.internal.AbstractC10790f;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.C10858w;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC10936a;
import kotlinx.coroutines.C11093p0;
import kotlinx.coroutines.C11094p1;
import kotlinx.coroutines.C11153w1;
import kotlinx.coroutines.C11160z;
import kotlinx.coroutines.InterfaceC10976e0;
import kotlinx.coroutines.scheduling.C11107c;
import libv2ray.Libv2ray;
import libv2ray.ServerConfig;
import libv2ray.V2RayPoint;
import libv2ray.V2RayVPNServiceSupportsSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ambrose.overwall.v2.f */
/* loaded from: classes.dex */
public final class C2525f {
    @NotNull

    /* renamed from: a */
    public static final String f6010a;
    @NotNull

    /* renamed from: b */
    public static final V2RayPoint f6011b;
    @NotNull

    /* renamed from: c */
    public static final C2526a f6012c;
    @Nullable

    /* renamed from: d */
    public static SoftReference<InterfaceC2522c> f6013d;
    @Nullable

    /* renamed from: e */
    public static ServerConfig f6014e;

    /* renamed from: f */
    public static long f6015f;
    @Nullable

    /* renamed from: g */
    public static C0638p f6016g;
    @Nullable

    /* renamed from: h */
    public static C10187b f6017h;
    @Nullable

    /* renamed from: i */
    public static NotificationManager f6018i;

    /* renamed from: com.ambrose.overwall.v2.f$a */
    /* loaded from: classes.dex */
    public static final class C2526a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(@Nullable Context context, @Nullable Intent intent) {
            InterfaceC2522c interfaceC2522c;
            Integer num;
            String str;
            Intent intent2;
            SoftReference<InterfaceC2522c> softReference = C2525f.f6013d;
            if (softReference != null && (interfaceC2522c = softReference.get()) != null) {
                String str2 = null;
                if (intent != null) {
                    num = Integer.valueOf(intent.getIntExtra("key", 0));
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == 1) {
                    boolean isRunning = C2525f.f6011b.getIsRunning();
                    Service ctx = interfaceC2522c.getService();
                    try {
                        if (isRunning) {
                            C10843j.m430f(ctx, "ctx");
                            intent2 = new Intent();
                            intent2.setAction("com.ambrose.overwall.action.activity");
                            intent2.setPackage("com.ambrose.overwall");
                            intent2.putExtra("key", 11);
                            intent2.putExtra("content", (Serializable) "");
                        } else {
                            C10843j.m430f(ctx, "ctx");
                            intent2 = new Intent();
                            intent2.setAction("com.ambrose.overwall.action.activity");
                            intent2.setPackage("com.ambrose.overwall");
                            intent2.putExtra("key", 12);
                            intent2.putExtra("content", (Serializable) "");
                        }
                        ctx.sendBroadcast(intent2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if ((num == null || num.intValue() != 2) && (num == null || num.intValue() != 3)) {
                    if (num != null && num.intValue() == 4) {
                        interfaceC2522c.stopService();
                    } else if (num != null && num.intValue() == 5) {
                        C2525f.m9387d();
                    }
                }
                if (intent != null) {
                    str = intent.getAction();
                } else {
                    str = null;
                }
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -2128145023) {
                        if (hashCode == -1454123155 && str.equals("android.intent.action.SCREEN_ON")) {
                            Log.e("com.ambrose.overwall", "SCREEN_ON, start querying stats");
                            C2525f.m9388c();
                        }
                    } else if (str.equals("android.intent.action.SCREEN_OFF")) {
                        Log.e("com.ambrose.overwall", "SCREEN_OFF, stop querying stats");
                        C10187b c10187b = C2525f.f6017h;
                        if (c10187b != null) {
                            EnumC10175a.m1212a(c10187b);
                            C2525f.f6017h = null;
                            ServerConfig serverConfig = C2525f.f6014e;
                            if (serverConfig != null) {
                                str2 = serverConfig.getRemarks();
                            }
                            C2525f.m9385f(str2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ambrose.overwall.v2.f$b */
    /* loaded from: classes.dex */
    public static final class C2527b implements V2RayVPNServiceSupportsSet {
        @Override // libv2ray.V2RayVPNServiceSupportsSet
        public final long onEmitStatus(long j, @Nullable String str) {
            return 0L;
        }

        @Override // libv2ray.V2RayVPNServiceSupportsSet
        public final long prepare() {
            return 0L;
        }

        @Override // libv2ray.V2RayVPNServiceSupportsSet
        public final boolean protect(long j) {
            InterfaceC2522c interfaceC2522c;
            String str = C2525f.f6010a;
            SoftReference<InterfaceC2522c> softReference = C2525f.f6013d;
            if (softReference != null && (interfaceC2522c = softReference.get()) != null) {
                return interfaceC2522c.vpnProtect((int) j);
            }
            return true;
        }

        @Override // libv2ray.V2RayVPNServiceSupportsSet
        public final long setup(@NotNull String s) {
            InterfaceC2522c interfaceC2522c;
            C10843j.m430f(s, "s");
            SoftReference<InterfaceC2522c> softReference = C2525f.f6013d;
            if (softReference != null && (interfaceC2522c = softReference.get()) != null) {
                try {
                    interfaceC2522c.startService();
                    C2525f.f6015f = System.currentTimeMillis();
                    C2525f.m9388c();
                    return 0L;
                } catch (Exception unused) {
                }
            }
            return -1L;
        }

        /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
            java.lang.NullPointerException
            */
        @Override // libv2ray.V2RayVPNServiceSupportsSet
        public final long shutdown() {
            /*
                r3 = this;
                java.lang.String r0 = com.ambrose.overwall.p007v2.C2525f.f6010a
                java.lang.ref.SoftReference<com.ambrose.overwall.v2.c> r0 = com.ambrose.overwall.p007v2.C2525f.f6013d
                r1 = -1
                if (r0 == 0) goto L16
                java.lang.Object r0 = r0.get()
                com.ambrose.overwall.v2.c r0 = (com.ambrose.overwall.p007v2.InterfaceC2522c) r0
                if (r0 != 0) goto L11
                goto L16
            L11:
                r0.stopService()     // Catch: java.lang.Exception -> L16
                r1 = 0
            L16:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ambrose.overwall.p007v2.C2525f.C2527b.shutdown():long");
        }
    }

    @SourceDebugExtension({"SMAP\nV2RayServiceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V2RayServiceManager.kt\ncom/ambrose/overwall/v2/V2RayServiceManager$startSpeedNotification$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,322:1\n1855#2,2:323\n*S KotlinDebug\n*F\n+ 1 V2RayServiceManager.kt\ncom/ambrose/overwall/v2/V2RayServiceManager$startSpeedNotification$1\n*L\n297#1:323,2\n*E\n"})
    /* renamed from: com.ambrose.overwall.v2.f$c */
    /* loaded from: classes.dex */
    public static final class C2528c<T> implements InterfaceC10174b {

        /* renamed from: b */
        public final /* synthetic */ List<String> f6019b;

        /* renamed from: c */
        public final /* synthetic */ C10858w f6020c;

        /* renamed from: d */
        public final /* synthetic */ C10858w f6021d;

        public C2528c(List<String> list, C10858w c10858w, C10858w c10858w2) {
            this.f6019b = list;
            this.f6020c = c10858w;
            this.f6021d = c10858w2;
        }

        @Override // io.reactivex.rxjava3.functions.InterfaceC10174b
        public final void accept(Object obj) {
            ((Number) obj).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            double d = (currentTimeMillis - C2525f.f6015f) / 1000.0d;
            StringBuilder sb = new StringBuilder();
            List<String> list = this.f6019b;
            if (list != null) {
                for (String str : list) {
                    V2RayPoint v2RayPoint = C2525f.f6011b;
                    long queryStats = v2RayPoint.queryStats(str, "uplink");
                    long queryStats2 = v2RayPoint.queryStats(str, "downlink");
                    C10858w c10858w = this.f6020c;
                    c10858w.f21409a += queryStats;
                    C10858w c10858w2 = this.f6021d;
                    c10858w2.f21409a += queryStats2;
                    String m9380b = C2533i.m9380b(c10858w.f21409a);
                    String m9380b2 = C2533i.m9380b(c10858w2.f21409a);
                    StringBuilder sb2 = new StringBuilder("↑");
                    sb2.append(C2533i.m9380b((long) (queryStats / d)) + "/s");
                    sb2.append(" - ");
                    sb2.append(m9380b);
                    sb2.append("    ↓");
                    sb2.append(C2533i.m9380b((long) (queryStats2 / d)) + "/s");
                    sb2.append(" - ");
                    sb2.append(m9380b2);
                    sb.append(sb2.toString());
                }
            }
            String str2 = C2525f.f6010a;
            C2525f.m9385f(sb.toString());
            C2525f.f6015f = currentTimeMillis;
        }
    }

    @DebugMetadata(m454c = "com.ambrose.overwall.v2.V2RayServiceManager$stopV2rayPoint$1", m453f = "V2RayServiceManager.kt", m452i = {}, m451l = {}, m450m = "invokeSuspend", m449n = {}, m448s = {})
    /* renamed from: com.ambrose.overwall.v2.f$d */
    /* loaded from: classes.dex */
    public static final class C2529d extends AbstractC10790f implements InterfaceC10824p<InterfaceC10976e0, InterfaceC10772d<? super C10868p>, Object> {
        public C2529d(InterfaceC10772d<? super C2529d> interfaceC10772d) {
            super(2, interfaceC10772d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @NotNull
        public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
            return new C2529d(interfaceC10772d);
        }

        @Override // kotlin.jvm.functions.InterfaceC10824p
        public final Object invoke(InterfaceC10976e0 interfaceC10976e0, InterfaceC10772d<? super C10868p> interfaceC10772d) {
            return new C2529d(interfaceC10772d).invokeSuspend(C10868p.f21418a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C10864l.m418b(obj);
            try {
                String str = C2525f.f6010a;
                C2525f.f6011b.stopLoop();
            } catch (Exception e) {
                Log.e("com.ambrose.overwall", e.toString());
            }
            return C10868p.f21418a;
        }
    }

    static {
        String m9723a = C2024a.m9723a("XW0m2SmclNIP7moU");
        C10843j.m431e(m9723a, "decodeStr(\"XW0m2SmclNIP7moU\")");
        f6010a = m9723a;
        V2RayPoint newV2RayPoint = Libv2ray.newV2RayPoint(new C2527b(), Build.VERSION.SDK_INT >= 25);
        C10843j.m431e(newV2RayPoint, "newV2RayPoint(V2RayCallb…ld.VERSION.SDK_INT >= 25)");
        f6011b = newV2RayPoint;
        f6012c = new C2526a();
    }

    /* renamed from: a */
    public static void m9390a() {
        InterfaceC2522c interfaceC2522c;
        Service service;
        SoftReference<InterfaceC2522c> softReference = f6013d;
        if (softReference != null && (interfaceC2522c = softReference.get()) != null && (service = interfaceC2522c.getService()) != null) {
            service.stopForeground(true);
            f6016g = null;
            C10187b c10187b = f6017h;
            if (c10187b != null) {
                EnumC10175a.m1212a(c10187b);
            }
            f6017h = null;
        }
    }

    /* renamed from: b */
    public static NotificationManager m9389b() {
        InterfaceC2522c interfaceC2522c;
        Service service;
        if (f6018i == null) {
            SoftReference<InterfaceC2522c> softReference = f6013d;
            if (softReference == null || (interfaceC2522c = softReference.get()) == null || (service = interfaceC2522c.getService()) == null) {
                return null;
            }
            Object systemService = service.getSystemService("notification");
            C10843j.m432d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            f6018i = (NotificationManager) systemService;
        }
        return f6018i;
    }

    /* renamed from: c */
    public static void m9388c() {
        List<String> list;
        if (f6017h == null && f6011b.getIsRunning()) {
            ServerConfig serverConfig = f6014e;
            if (serverConfig != null) {
                list = serverConfig.getAllOutboundTags();
            } else {
                list = null;
            }
            C10858w c10858w = new C10858w();
            C10858w c10858w2 = new C10858w();
            C10193c m1224a = AbstractC10151d.m1224a(TimeUnit.SECONDS);
            C10187b c10187b = new C10187b(new C2528c(list, c10858w, c10858w2), C10179a.f20440d);
            m1224a.m1221d(c10187b);
            f6017h = c10187b;
        }
    }

    /* renamed from: d */
    public static void m9387d() {
        InterfaceC2522c interfaceC2522c;
        Service service;
        InterfaceC2522c interfaceC2522c2;
        Service service2;
        SoftReference<InterfaceC2522c> softReference = f6013d;
        if (softReference != null && (interfaceC2522c = softReference.get()) != null && (service = interfaceC2522c.getService()) != null) {
            String m9340b = C2599d.m9340b(C1082a.m11204a(C2603g.m9338b(f6010a)));
            C2520a.f5999a.getClass();
            ServerConfig m9400a = C2520a.m9400a(m9340b);
            if (m9400a == null) {
                return;
            }
            C2530g.C2531a m9399b = C2520a.m9399b(service, m9400a);
            V2RayPoint v2RayPoint = f6011b;
            if (v2RayPoint.getIsRunning() || !m9399b.f6022a) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter("com.ambrose.overwall.action.service");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                service.registerReceiver(f6012c, intentFilter);
            } catch (Exception e) {
                Log.e("com.ambrose.overwall", "===========  " + e);
            }
            v2RayPoint.setConfigureFileContent(m9399b.f6023b);
            v2RayPoint.setDomainName(m9400a.getV2rayPointDomainAndPort());
            f6014e = m9400a;
            try {
                v2RayPoint.runLoop(false);
            } catch (Exception e2) {
                Log.e("com.ambrose.overwall", "-*--**-- " + e2 + ".toString()");
            }
            String str = "";
            if (v2RayPoint.getIsRunning()) {
                try {
                    Intent intent = new Intent();
                    intent.setAction("com.ambrose.overwall.action.activity");
                    intent.setPackage("com.ambrose.overwall");
                    intent.putExtra("key", 31);
                    intent.putExtra("content", (Serializable) "");
                    service.sendBroadcast(intent);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                SoftReference<InterfaceC2522c> softReference2 = f6013d;
                if (softReference2 != null && (interfaceC2522c2 = softReference2.get()) != null && (service2 = interfaceC2522c2.getService()) != null) {
                    PendingIntent activity = PendingIntent.getActivity(service2, 0, new Intent(service2, MainActivity.class), 33554432);
                    Intent intent2 = new Intent("com.ambrose.overwall.action.service");
                    intent2.setPackage("com.ambrose.overwall");
                    intent2.putExtra("key", 4);
                    PendingIntent broadcast = PendingIntent.getBroadcast(service2, 1, intent2, 33554432);
                    if (Build.VERSION.SDK_INT >= 26) {
                        NotificationChannel notificationChannel = new NotificationChannel("GoFly_Notification_ID", "GoFly_Notification_Service", 4);
                        notificationChannel.setLightColor(-12303292);
                        notificationChannel.setImportance(0);
                        notificationChannel.setLockscreenVisibility(0);
                        NotificationManager m9389b = m9389b();
                        if (m9389b != null) {
                            m9389b.createNotificationChannel(notificationChannel);
                        }
                        str = "GoFly_Notification_ID";
                    }
                    C0638p c0638p = new C0638p(service2, str);
                    c0638p.f2316o.icon = R.drawable.ic_ovpn;
                    c0638p.f2306e = C0638p.m12059b(C2603g.m9338b("SELECTSERVERNAME"));
                    c0638p.f2309h = -2;
                    c0638p.m12058c(2);
                    c0638p.f2310i = false;
                    c0638p.m12058c(8);
                    c0638p.f2308g = activity;
                    c0638p.f2303b.add(new NotificationCompat$Action(R.drawable.ic_close_grey_800_24dp, service2.getString(R.string.notification_action_stop_v2ray), broadcast));
                    f6016g = c0638p;
                    service2.startForeground(1, c0638p.m12060a());
                    return;
                }
                return;
            }
            try {
                Intent intent3 = new Intent();
                intent3.setAction("com.ambrose.overwall.action.activity");
                intent3.setPackage("com.ambrose.overwall");
                intent3.putExtra("key", 32);
                intent3.putExtra("content", (Serializable) "");
                service.sendBroadcast(intent3);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            m9390a();
        }
    }

    /* renamed from: e */
    public static void m9386e() {
        InterfaceC2522c interfaceC2522c;
        Service service;
        int i;
        AbstractC10936a c11153w1;
        SoftReference<InterfaceC2522c> softReference = f6013d;
        if (softReference != null && (interfaceC2522c = softReference.get()) != null && (service = interfaceC2522c.getService()) != null) {
            if (f6011b.getIsRunning()) {
                InterfaceC10775f interfaceC10775f = C11093p0.f21708a;
                C2529d c2529d = new C2529d(null);
                boolean z = true & true;
                InterfaceC10775f interfaceC10775f2 = C10781g.f21377a;
                if (z) {
                    interfaceC10775f = interfaceC10775f2;
                }
                boolean z2 = false;
                if (true & true) {
                    i = 1;
                } else {
                    i = 0;
                }
                InterfaceC10775f m102a = C11160z.m102a(interfaceC10775f2, interfaceC10775f, true);
                C11107c c11107c = C11093p0.f21708a;
                if (m102a != c11107c && m102a.mo195a(InterfaceC10773e.C10774a.f21375a) == null) {
                    m102a = m102a.mo190f(c11107c);
                }
                if (i != 0) {
                    if (i == 2) {
                        z2 = true;
                    }
                    if (z2) {
                        c11153w1 = new C11094p1(m102a, c2529d);
                    } else {
                        c11153w1 = new C11153w1(m102a, true);
                    }
                    c11153w1.m355d0(i, c11153w1, c2529d);
                } else {
                    throw null;
                }
            }
            try {
                Intent intent = new Intent();
                intent.setAction("com.ambrose.overwall.action.activity");
                intent.setPackage("com.ambrose.overwall");
                intent.putExtra("key", 41);
                intent.putExtra("content", (Serializable) "");
                service.sendBroadcast(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
            m9390a();
            try {
                service.unregisterReceiver(f6012c);
            } catch (Exception e2) {
                Log.e("com.ambrose.overwall", "//////// " + e2 + ".toString()");
            }
        }
    }

    /* renamed from: f */
    public static void m9385f(String str) {
        Notification notification;
        C0638p c0638p = f6016g;
        if (c0638p != null) {
            C0637o c0637o = new C0637o();
            c0637o.f2301b = C0638p.m12059b(str);
            c0638p.m12057d(c0637o);
            C0638p c0638p2 = f6016g;
            if (c0638p2 != null) {
                c0638p2.f2307f = C0638p.m12059b(str);
            }
            NotificationManager m9389b = m9389b();
            if (m9389b != null) {
                C0638p c0638p3 = f6016g;
                if (c0638p3 != null) {
                    notification = c0638p3.m12060a();
                } else {
                    notification = null;
                }
                m9389b.notify(1, notification);
            }
        }
    }
}
