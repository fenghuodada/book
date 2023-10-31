package com.unity3d.services.core.device;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.unity3d.services.core.properties.C9568a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.unity3d.services.core.device.k */
/* loaded from: classes3.dex */
public class C9515k {

    /* renamed from: a */
    private static ContentObserver f18841a;

    /* renamed from: b */
    private static ArrayList<InterfaceC9502d> f18842b;

    /* renamed from: com.unity3d.services.core.device.k$a */
    /* loaded from: classes3.dex */
    public static class C9516a extends ContentObserver {
        public C9516a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return false;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            C9515k.m2074e();
        }
    }

    /* renamed from: a */
    public static void m2079a(InterfaceC9502d interfaceC9502d) {
        if (f18842b == null) {
            f18842b = new ArrayList<>();
        }
        if (f18842b.contains(interfaceC9502d)) {
            return;
        }
        m2076c();
        f18842b.add(interfaceC9502d);
    }

    /* renamed from: b */
    public static void m2078b() {
        ArrayList<InterfaceC9502d> arrayList = f18842b;
        if (arrayList != null) {
            arrayList.clear();
        }
        m2075d();
        f18842b = null;
    }

    /* renamed from: b */
    public static void m2077b(InterfaceC9502d interfaceC9502d) {
        if (f18842b.contains(interfaceC9502d)) {
            f18842b.remove(interfaceC9502d);
        }
        ArrayList<InterfaceC9502d> arrayList = f18842b;
        if (arrayList == null || arrayList.size() == 0) {
            m2075d();
        }
    }

    /* renamed from: c */
    public static void m2076c() {
        ContentResolver contentResolver;
        if (f18841a == null) {
            f18841a = new C9516a(new Handler(Looper.getMainLooper()));
            Context m1959e = C9568a.m1959e();
            if (m1959e == null || (contentResolver = m1959e.getContentResolver()) == null) {
                return;
            }
            contentResolver.registerContentObserver(Settings.System.CONTENT_URI, true, f18841a);
        }
    }

    /* renamed from: d */
    public static void m2075d() {
        ContentResolver contentResolver;
        if (f18841a != null) {
            Context m1959e = C9568a.m1959e();
            if (m1959e != null && (contentResolver = m1959e.getContentResolver()) != null) {
                contentResolver.unregisterContentObserver(f18841a);
            }
            f18841a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static void m2074e() {
        ArrayList<InterfaceC9502d> arrayList = f18842b;
        if (arrayList != null) {
            Iterator<InterfaceC9502d> it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC9502d next = it.next();
                next.mo2103a(C9498b.m2134b(next.mo2104a()));
            }
        }
    }
}
