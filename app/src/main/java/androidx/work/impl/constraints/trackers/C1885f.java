package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.net.C0729a;
import androidx.work.AbstractC2005l;
import androidx.work.impl.constraints.C1866b;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.constraints.trackers.f */
/* loaded from: classes.dex */
public final class C1885f extends AbstractC1882d<C1866b> {

    /* renamed from: j */
    public static final String f4575j = AbstractC2005l.m9732e("NetworkStateTracker");

    /* renamed from: g */
    public final ConnectivityManager f4576g;
    @RequiresApi(24)

    /* renamed from: h */
    public final C1887b f4577h;

    /* renamed from: i */
    public final C1886a f4578i;

    /* renamed from: androidx.work.impl.constraints.trackers.f$a */
    /* loaded from: classes.dex */
    public class C1886a extends BroadcastReceiver {
        public C1886a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            AbstractC2005l.m9733c().mo9731a(C1885f.f4575j, "Network broadcast received", new Throwable[0]);
            C1885f c1885f = C1885f.this;
            c1885f.m9850c(c1885f.m9846f());
        }
    }

    @RequiresApi(24)
    /* renamed from: androidx.work.impl.constraints.trackers.f$b */
    /* loaded from: classes.dex */
    public class C1887b extends ConnectivityManager.NetworkCallback {
        public C1887b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            AbstractC2005l.m9733c().mo9731a(C1885f.f4575j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            C1885f c1885f = C1885f.this;
            c1885f.m9850c(c1885f.m9846f());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NonNull Network network) {
            AbstractC2005l.m9733c().mo9731a(C1885f.f4575j, "Network connection lost", new Throwable[0]);
            C1885f c1885f = C1885f.this;
            c1885f.m9850c(c1885f.m9846f());
        }
    }

    public C1885f(@NonNull Context context, @NonNull InterfaceC1998a interfaceC1998a) {
        super(context, interfaceC1998a);
        boolean z;
        this.f4576g = (ConnectivityManager) this.f4569b.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f4577h = new C1887b();
        } else {
            this.f4578i = new C1886a();
        }
    }

    @Override // androidx.work.impl.constraints.trackers.AbstractC1882d
    /* renamed from: a */
    public final C1866b mo9845a() {
        return m9846f();
    }

    @Override // androidx.work.impl.constraints.trackers.AbstractC1882d
    /* renamed from: d */
    public final void mo9848d() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        String str = f4575j;
        if (z) {
            try {
                AbstractC2005l.m9733c().mo9731a(str, "Registering network callback", new Throwable[0]);
                this.f4576g.registerDefaultNetworkCallback(this.f4577h);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                AbstractC2005l.m9733c().mo9730b(str, "Received exception while registering network callback", e);
                return;
            }
        }
        AbstractC2005l.m9733c().mo9731a(str, "Registering broadcast receiver", new Throwable[0]);
        this.f4569b.registerReceiver(this.f4578i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // androidx.work.impl.constraints.trackers.AbstractC1882d
    /* renamed from: e */
    public final void mo9847e() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        String str = f4575j;
        if (z) {
            try {
                AbstractC2005l.m9733c().mo9731a(str, "Unregistering network callback", new Throwable[0]);
                this.f4576g.unregisterNetworkCallback(this.f4577h);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                AbstractC2005l.m9733c().mo9730b(str, "Received exception while unregistering network callback", e);
                return;
            }
        }
        AbstractC2005l.m9733c().mo9731a(str, "Unregistering broadcast receiver", new Throwable[0]);
        this.f4569b.unregisterReceiver(this.f4578i);
    }

    /* renamed from: f */
    public final C1866b m9846f() {
        boolean z;
        boolean z2;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f4576g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z3 = true;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = true;
        } else {
            z = false;
        }
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e) {
            AbstractC2005l.m9733c().mo9730b(f4575j, "Unable to validate active network", e);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z2 = true;
                boolean m11869a = C0729a.m11869a(connectivityManager);
                if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                    z3 = false;
                }
                return new C1866b(z, z2, m11869a, z3);
            }
        }
        z2 = false;
        boolean m11869a2 = C0729a.m11869a(connectivityManager);
        if (activeNetworkInfo != null) {
        }
        z3 = false;
        return new C1866b(z, z2, m11869a2, z3);
    }
}
