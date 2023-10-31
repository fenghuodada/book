package com.applovin.impl.sdk;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.C3294g;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.u */
/* loaded from: classes.dex */
public class C3283u {

    /* renamed from: a */
    private final C3214m f8670a;

    /* renamed from: b */
    private final LocationManager f8671b;

    /* renamed from: c */
    private C3282t f8672c;

    public C3283u(C3214m c3214m) {
        this.f8670a = c3214m;
        this.f8671b = (LocationManager) c3214m.m7476L().getSystemService(FirebaseAnalytics.Param.LOCATION);
    }

    @Nullable
    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    private Location m7057a(String str, String str2) {
        C3349v m7487A;
        StringBuilder sb;
        String str3;
        if (C3294g.m7026a(str2, this.f8670a.m7476L())) {
            try {
                return this.f8671b.getLastKnownLocation(str);
            } catch (IllegalArgumentException e) {
                e = e;
                if (C3349v.m6862a()) {
                    m7487A = this.f8670a.m7487A();
                    sb = new StringBuilder("Failed to retrieve location from ");
                    sb.append(str);
                    str3 = ": device does not support this location provider.";
                    sb.append(str3);
                    m7487A.m6854b("LocationManager", sb.toString(), e);
                }
                return null;
            } catch (NullPointerException e2) {
                e = e2;
                if (C3349v.m6862a()) {
                    m7487A = this.f8670a.m7487A();
                    sb = new StringBuilder("Failed to retrieve location from ");
                    sb.append(str);
                    str3 = ": location provider is not available.";
                    sb.append(str3);
                    m7487A.m6854b("LocationManager", sb.toString(), e);
                }
                return null;
            } catch (SecurityException e3) {
                e = e3;
                if (C3349v.m6862a()) {
                    m7487A = this.f8670a.m7487A();
                    sb = new StringBuilder("Failed to retrieve location from ");
                    sb.append(str);
                    str3 = ": access denied.";
                    sb.append(str3);
                    m7487A.m6854b("LocationManager", sb.toString(), e);
                }
                return null;
            } catch (Throwable th) {
                e = th;
                if (C3349v.m6862a()) {
                    m7487A = this.f8670a.m7487A();
                    sb = new StringBuilder("Failed to retrieve location from ");
                    sb.append(str);
                    str3 = ".";
                    sb.append(str3);
                    m7487A.m6854b("LocationManager", sb.toString(), e);
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean m7058a() {
        return C3294g.m7026a("android.permission.ACCESS_COARSE_LOCATION", this.f8670a.m7476L());
    }

    /* renamed from: b */
    public boolean m7056b() {
        boolean isLocationEnabled;
        if (!C3294g.m7019h()) {
            return (C3294g.m7024c() && Settings.Secure.getInt(this.f8670a.m7476L().getContentResolver(), "location_mode", 0) == 0) ? false : true;
        }
        isLocationEnabled = this.f8671b.isLocationEnabled();
        return isLocationEnabled;
    }

    @Nullable
    /* renamed from: c */
    public C3282t m7055c() {
        if (this.f8670a.m7396p().isLocationCollectionEnabled() && ((Boolean) this.f8670a.m7456a(C3109b.f7975dW)).booleanValue()) {
            long millis = TimeUnit.MINUTES.toMillis(((Long) this.f8670a.m7456a(C3109b.f7976dX)).longValue());
            if (this.f8672c == null || System.currentTimeMillis() - this.f8672c.m7059c() >= millis) {
                Location m7057a = m7057a("gps", "android.permission.ACCESS_FINE_LOCATION");
                if (m7057a == null) {
                    m7057a = m7057a("network", "android.permission.ACCESS_COARSE_LOCATION");
                }
                if (m7057a != null) {
                    this.f8672c = new C3282t(m7057a.getLatitude(), m7057a.getLongitude(), System.currentTimeMillis());
                }
                return this.f8672c;
            }
            return this.f8672c;
        }
        return null;
    }
}
