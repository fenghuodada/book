package com.qmuiteam.qmui.arch;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActivityC0101d;
import com.qmuiteam.qmui.arch.annotation.LatestVisitRecord;
import com.qmuiteam.qmui.arch.record.C9050a;
import com.qmuiteam.qmui.arch.record.C9053d;
import com.qmuiteam.qmui.arch.record.InterfaceC9051b;
import com.qmuiteam.qmui.skin.C9108h;
import com.qmuiteam.qmui.skin.LayoutInflater$Factory2C9107g;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.qmuiteam.qmui.arch.a */
/* loaded from: classes3.dex */
public class ActivityC9007a extends ActivityC0101d {

    /* renamed from: d */
    public static final AtomicInteger f17197d = new AtomicInteger(1);

    /* renamed from: a */
    public boolean f17198a = false;

    /* renamed from: b */
    public int f17199b = -100;

    /* renamed from: c */
    public C9108h f17200c;

    public ActivityC9007a() {
        f17197d.getAndIncrement();
    }

    @Override // androidx.appcompat.app.ActivityC0101d, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    @SuppressLint({"WrongConstant"})
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f17198a) {
            this.f17198a = false;
            try {
                Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this, new Object[0]);
            } catch (Throwable unused) {
            }
            int i = this.f17199b;
            if (i != -100) {
                super.setRequestedOrientation(i);
                this.f17199b = -100;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0629l, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        LayoutInflater from = LayoutInflater.from(this);
        from.setFactory2(new LayoutInflater$Factory2C9107g(this, from));
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LatestVisitRecord latestVisitRecord = (LatestVisitRecord) getClass().getAnnotation(LatestVisitRecord.class);
        if (latestVisitRecord != null && !latestVisitRecord.onlyForDebug()) {
            C9031h m2797a = C9031h.m2797a(this);
            m2797a.getClass();
            int idByRecordClass = m2797a.f17251c.getIdByRecordClass(getClass());
            if (idByRecordClass != -1) {
                C9053d c9053d = m2797a.f17252d;
                c9053d.m2760a();
                InterfaceC9051b m2796b = m2797a.m2796b();
                HashMap hashMap = new HashMap(c9053d.f17305a);
                C9050a c9050a = (C9050a) m2796b;
                SharedPreferences.Editor edit = c9050a.f17302a.edit();
                edit.putInt("id_qmui_a_r", idByRecordClass);
                c9050a.m2761b(edit, "a_a_", hashMap);
                edit.apply();
                c9053d.m2760a();
            }
        } else {
            C9050a c9050a2 = (C9050a) C9031h.m2797a(this).m2796b();
            SharedPreferences.Editor edit2 = c9050a2.f17302a.edit();
            edit2.remove("id_qmui_a_r");
            c9050a2.m2762a(edit2, "a_a_");
            edit2.apply();
        }
        super.onResume();
    }

    @Override // androidx.appcompat.app.ActivityC0101d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        C9108h c9108h = this.f17200c;
        if (c9108h != null) {
            c9108h.m2666j(this);
        }
    }

    @Override // androidx.appcompat.app.ActivityC0101d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        C9108h c9108h = this.f17200c;
        if (c9108h != null) {
            c9108h.m2664l(this);
        }
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i) {
        int i2;
        if (!this.f17198a || ((i2 = Build.VERSION.SDK_INT) != 26 && i2 != 27)) {
            super.setRequestedOrientation(i);
            return;
        }
        Log.i("InnerBaseActivity", "setRequestedOrientation when activity is translucent");
        this.f17199b = i;
    }
}
