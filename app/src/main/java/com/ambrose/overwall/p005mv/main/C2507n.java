package com.ambrose.overwall.p005mv.main;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.os.Process;
import androidx.appcompat.app.ActivityC0101d;
import androidx.databinding.C1082a;
import androidx.lifecycle.C1445a;
import androidx.lifecycle.C1489r;
import androidx.security.crypto.C1699b;
import androidx.security.crypto.SharedPreferencesC1695a;
import com.ambrose.overwall.MyApplication;
import com.ambrose.overwall.p007v2.C2520a;
import com.ambrose.overwall.p007v2.C2523d;
import com.ambrose.overwall.p007v2.C2524e;
import com.android.tool.bean.PingBean;
import com.android.tool.pref.C2556b;
import com.android.tool.pref.C2557c;
import com.android.tool.util.proxy.WifiDirectService;
import com.android.tool.util.util.C2599d;
import com.android.tool.util.util.C2603g;
import com.qmuiteam.qmui.util.C9141b;
import com.qmuiteam.qmui.util.C9144e;
import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlin.C10795h;
import kotlin.C10864l;
import kotlin.C10865m;
import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10790f;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.C10859x;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C10929r;
import kotlinx.coroutines.C10975e;
import kotlinx.coroutines.C10981f0;
import kotlinx.coroutines.C11093p0;
import kotlinx.coroutines.InterfaceC10976e0;
import kotlinx.coroutines.internal.C11064v;
import kotlinx.coroutines.scheduling.C11107c;
import libv2ray.Libv2ray;
import libv2ray.ServerConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ambrose.overwall.mv.main.n */
/* loaded from: classes.dex */
public final class C2507n extends C1445a {
    @NotNull

    /* renamed from: b */
    public final C10865m f5974b;
    @NotNull

    /* renamed from: c */
    public final C10865m f5975c;
    @Nullable

    /* renamed from: d */
    public final String f5976d;
    @Nullable

    /* renamed from: e */
    public final String f5977e;
    @NotNull

    /* renamed from: f */
    public final C10865m f5978f;
    @NotNull

    /* renamed from: g */
    public final C2506m f5979g;
    @SuppressLint({"StaticFieldLeak"})
    @Nullable

    /* renamed from: h */
    public ActivityC0101d f5980h;
    @NotNull

    /* renamed from: i */
    public final C2556b f5981i;
    @Nullable

    /* renamed from: j */
    public final SharedPreferencesC1695a f5982j;
    @NotNull

    /* renamed from: k */
    public final C2511c f5983k;

    @DebugMetadata(m454c = "com.ambrose.overwall.mv.main.MainViewModel$d$1", m453f = "MainViewModel.kt", m452i = {}, m451l = {}, m450m = "invokeSuspend", m449n = {}, m448s = {})
    @SourceDebugExtension({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/ambrose/overwall/mv/main/MainViewModel$d$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n1#2:305\n*E\n"})
    /* renamed from: com.ambrose.overwall.mv.main.n$a */
    /* loaded from: classes.dex */
    public static final class C2508a extends AbstractC10790f implements InterfaceC10824p<InterfaceC10976e0, InterfaceC10772d<? super C10868p>, Object> {

        /* renamed from: a */
        public /* synthetic */ Object f5984a;

        /* renamed from: b */
        public final /* synthetic */ C10859x<ServerConfig> f5985b;

        /* renamed from: c */
        public final /* synthetic */ C2507n f5986c;

        /* renamed from: d */
        public final /* synthetic */ Integer f5987d;

        @DebugMetadata(m454c = "com.ambrose.overwall.mv.main.MainViewModel$d$1$1", m453f = "MainViewModel.kt", m452i = {}, m451l = {}, m450m = "invokeSuspend", m449n = {}, m448s = {})
        @SourceDebugExtension({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/ambrose/overwall/mv/main/MainViewModel$d$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n1#2:305\n*E\n"})
        /* renamed from: com.ambrose.overwall.mv.main.n$a$a */
        /* loaded from: classes.dex */
        public static final class C2509a extends AbstractC10790f implements InterfaceC10824p<InterfaceC10976e0, InterfaceC10772d<? super C10868p>, Object> {

            /* renamed from: a */
            public final /* synthetic */ C2507n f5988a;

            /* renamed from: b */
            public final /* synthetic */ Integer f5989b;

            /* renamed from: c */
            public final /* synthetic */ long f5990c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2509a(C2507n c2507n, Integer num, long j, InterfaceC10772d<? super C2509a> interfaceC10772d) {
                super(2, interfaceC10772d);
                this.f5988a = c2507n;
                this.f5989b = num;
                this.f5990c = j;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
            @NotNull
            public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
                return new C2509a(this.f5988a, this.f5989b, this.f5990c, interfaceC10772d);
            }

            @Override // kotlin.jvm.functions.InterfaceC10824p
            public final Object invoke(InterfaceC10976e0 interfaceC10976e0, InterfaceC10772d<? super C10868p> interfaceC10772d) {
                return ((C2509a) create(interfaceC10976e0, interfaceC10772d)).invokeSuspend(C10868p.f21418a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                PingBean pingBean;
                C10864l.m418b(obj);
                C1489r c1489r = (C1489r) this.f5988a.f5975c.getValue();
                Integer num = this.f5989b;
                if (num != null) {
                    pingBean = new PingBean(num.intValue(), new Long(this.f5990c));
                } else {
                    pingBean = null;
                }
                c1489r.mo10510i(pingBean);
                return C10868p.f21418a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2508a(C10859x<ServerConfig> c10859x, C2507n c2507n, Integer num, InterfaceC10772d<? super C2508a> interfaceC10772d) {
            super(2, interfaceC10772d);
            this.f5985b = c10859x;
            this.f5986c = c2507n;
            this.f5987d = num;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @NotNull
        public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
            C2508a c2508a = new C2508a(this.f5985b, this.f5986c, this.f5987d, interfaceC10772d);
            c2508a.f5984a = obj;
            return c2508a;
        }

        @Override // kotlin.jvm.functions.InterfaceC10824p
        public final Object invoke(InterfaceC10976e0 interfaceC10976e0, InterfaceC10772d<? super C10868p> interfaceC10772d) {
            return ((C2508a) create(interfaceC10976e0, interfaceC10772d)).invokeSuspend(C10868p.f21418a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            long j;
            C10864l.m418b(obj);
            InterfaceC10976e0 interfaceC10976e0 = (InterfaceC10976e0) this.f5984a;
            int i = C2523d.f6007a;
            ServerConfig serverConfig = this.f5985b.f21410a;
            if (serverConfig != null) {
                C2520a c2520a = C2520a.f5999a;
                MyApplication myApplication = MyApplication.f5741c;
                C10843j.m431e(myApplication, "getContext()");
                c2520a.getClass();
                str = C2520a.m9399b(myApplication, serverConfig).f6023b;
            } else {
                str = null;
            }
            try {
                j = Libv2ray.measureOutboundDelay(str);
            } catch (Exception unused) {
                j = 999999;
            }
            long j2 = j;
            C11107c c11107c = C11093p0.f21708a;
            C10975e.m310a(interfaceC10976e0, C11064v.f21674a, new C2509a(this.f5986c, this.f5987d, j2, null), 2);
            return C10868p.f21418a;
        }
    }

    /* renamed from: com.ambrose.overwall.mv.main.n$b */
    /* loaded from: classes.dex */
    public static final class C2510b extends AbstractC10844k implements InterfaceC10809a<C1489r<Boolean>> {

        /* renamed from: a */
        public static final C2510b f5991a = new C2510b();

        public C2510b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.InterfaceC10809a
        public final C1489r<Boolean> invoke() {
            return new C1489r<>();
        }
    }

    /* renamed from: com.ambrose.overwall.mv.main.n$c */
    /* loaded from: classes.dex */
    public static final class C2511c extends BroadcastReceiver {
        public C2511c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@Nullable Context context, @Nullable Intent intent) {
            C1489r<Boolean> m9405c;
            Boolean bool;
            Integer valueOf = intent != null ? Integer.valueOf(intent.getIntExtra("key", 0)) : null;
            C2507n c2507n = C2507n.this;
            if (valueOf == null || valueOf.intValue() != 11) {
                if (valueOf == null || valueOf.intValue() != 12) {
                    if (valueOf == null || valueOf.intValue() != 31) {
                        if ((valueOf == null || valueOf.intValue() != 32) && (valueOf == null || valueOf.intValue() != 41)) {
                            if (valueOf == null) {
                                return;
                            }
                            valueOf.intValue();
                            return;
                        }
                    }
                }
                m9405c = c2507n.m9405c();
                bool = Boolean.FALSE;
                m9405c.mo10510i(bool);
            }
            m9405c = c2507n.m9405c();
            bool = Boolean.TRUE;
            m9405c.mo10510i(bool);
        }
    }

    /* renamed from: com.ambrose.overwall.mv.main.n$d */
    /* loaded from: classes.dex */
    public static final class C2512d extends AbstractC10844k implements InterfaceC10809a<InterfaceC10976e0> {

        /* renamed from: a */
        public static final C2512d f5993a = new C2512d();

        public C2512d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.InterfaceC10809a
        public final InterfaceC10976e0 invoke() {
            return C10981f0.m308a(C11093p0.f21709b);
        }
    }

    /* renamed from: com.ambrose.overwall.mv.main.n$e */
    /* loaded from: classes.dex */
    public static final class C2513e extends AbstractC10844k implements InterfaceC10809a<C1489r<PingBean>> {

        /* renamed from: a */
        public static final C2513e f5994a = new C2513e();

        public C2513e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.InterfaceC10809a
        public final C1489r<PingBean> invoke() {
            return new C1489r<>();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2507n(@NotNull Application application) {
        super(application);
        Locale locale;
        LocaleList locales;
        String str;
        C10843j.m430f(application, "application");
        this.f5974b = C10795h.m446a(C2512d.f5993a);
        this.f5975c = C10795h.m446a(C2513e.f5994a);
        this.f5978f = C10795h.m446a(C2510b.f5991a);
        this.f5983k = new C2511c();
        C2556b c2556b = new C2556b(new C2557c());
        this.f5981i = c2556b;
        C2603g.m9335e(c2556b.m9373c());
        try {
            String m10037a = C1699b.m10037a(C1699b.f4148a);
            Application application2 = this.f3407a;
            C10843j.m432d(application2, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
            this.f5982j = SharedPreferencesC1695a.m10044a(m10037a, application2, SharedPreferencesC1695a.EnumC1697b.f4142b, SharedPreferencesC1695a.EnumC1698c.f4145b);
        } catch (IOException | GeneralSecurityException e) {
            e.printStackTrace();
        }
        this.f5979g = new C2506m();
        String m9338b = C2603g.m9338b("LocalX");
        this.f5976d = m9338b;
        if (m9338b == null) {
            String locale2 = Locale.getDefault().toString();
            C10843j.m431e(locale2, "getDefault().toString()");
            if (C10929r.m379m(locale2, "zh")) {
                str = "cn";
            } else {
                str = "fa";
            }
            this.f5976d = str;
        }
        MyApplication myApplication = MyApplication.f5741c;
        int i = C9141b.f17577a;
        Configuration configuration = myApplication.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            locale = locales.get(0);
        } else {
            locale = configuration.locale;
        }
        if (locale.getCountry().equalsIgnoreCase("CN")) {
            this.f5976d = "cn";
        }
        this.f5977e = C9144e.m2641a(MyApplication.f5741c);
    }

    @SuppressLint({"SimpleDateFormat"})
    @NotNull
    /* renamed from: b */
    public static String m9406b() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + "ADTimeRecord";
    }

    /* renamed from: f */
    public static void m9402f() {
        C2524e c2524e = C2524e.f6008a;
        MyApplication myApplication = MyApplication.f5741c;
        C10843j.m431e(myApplication, "getContext()");
        try {
            Intent intent = new Intent();
            intent.setAction("com.ambrose.overwall.action.service");
            intent.setPackage("com.ambrose.overwall");
            intent.putExtra("key", 4);
            intent.putExtra("content", (Serializable) "");
            myApplication.sendBroadcast(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [libv2ray.ServerConfig, T] */
    @NotNull
    /* renamed from: a */
    public final C1489r<PingBean> m9407a(@Nullable String str, @Nullable Integer num) {
        C10859x c10859x = new C10859x();
        C2520a c2520a = C2520a.f5999a;
        String m9340b = C2599d.m9340b(C1082a.m11204a(str));
        c2520a.getClass();
        c10859x.f21410a = C2520a.m9400a(m9340b);
        C10975e.m310a((InterfaceC10976e0) this.f5974b.getValue(), null, new C2508a(c10859x, this, num, null), 3);
        return (C1489r) this.f5975c.getValue();
    }

    @NotNull
    /* renamed from: c */
    public final C1489r<Boolean> m9405c() {
        return (C1489r) this.f5978f.getValue();
    }

    /* renamed from: d */
    public final void m9404d() {
        Intent intent = new Intent(this.f5980h, WifiDirectService.class);
        m9402f();
        ActivityC0101d activityC0101d = this.f5980h;
        C10843j.m433c(activityC0101d);
        activityC0101d.stopService(intent);
        ActivityC0101d activityC0101d2 = this.f5980h;
        C10843j.m433c(activityC0101d2);
        activityC0101d2.finish();
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* renamed from: e */
    public final void m9403e(boolean z) {
        C2556b c2556b = this.f5981i;
        if (z) {
            c2556b.m9375a(MyApplication.f5741c.getPackageName());
        } else {
            c2556b.m9374b(MyApplication.f5741c.getPackageName());
        }
        C2603g.m9335e(c2556b.m9373c());
    }

    @Override // androidx.lifecycle.AbstractC1460f0
    public final void onCleared() {
        Application application = this.f3407a;
        C10843j.m432d(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        ((MyApplication) application).unregisterReceiver(this.f5983k);
        synchronized (C2524e.f6008a) {
            Iterator<Socket> it = C2524e.f6009b.iterator();
            while (it.hasNext()) {
                Socket next = it.next();
                if (next != null) {
                    next.close();
                }
            }
            C2524e.f6009b.clear();
            C10868p c10868p = C10868p.f21418a;
        }
        super.onCleared();
    }
}
