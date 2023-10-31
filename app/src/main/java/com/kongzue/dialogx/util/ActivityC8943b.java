package com.kongzue.dialogx.util;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActivityC0101d;
import com.ambrose.overwall.R;
import com.google.android.gms.ads.AdRequest;
import com.kongzue.dialogx.interfaces.BaseDialog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.kongzue.dialogx.util.b */
/* loaded from: classes3.dex */
public final class ActivityC8943b extends ActivityC0101d {

    /* renamed from: d */
    public static WeakReference<ActivityC8943b> f17045d;

    /* renamed from: a */
    public int f17046a;

    /* renamed from: b */
    public final ArrayList f17047b = new ArrayList();

    /* renamed from: c */
    public WeakReference<Activity> f17048c;

    /* renamed from: com.kongzue.dialogx.util.b$a */
    /* loaded from: classes3.dex */
    public class View$OnTouchListenerC8944a implements View.OnTouchListener {
        public View$OnTouchListenerC8944a() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 3) {
                ActivityC8943b activityC8943b = ActivityC8943b.this;
                if (activityC8943b.m2847o() == null || activityC8943b.m2847o() == null || (activityC8943b.m2847o() instanceof ActivityC8943b)) {
                    return false;
                }
                return activityC8943b.m2847o().dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        WeakReference<ActivityC8943b> weakReference = f17045d;
        if (weakReference != null) {
            weakReference.clear();
        }
        f17045d = null;
        super.finish();
        if (Integer.valueOf(Build.VERSION.SDK_INT).intValue() > 5) {
            overridePendingTransition(0, 0);
        }
    }

    /* renamed from: n */
    public final void m2848n(String str) {
        ArrayList arrayList = this.f17047b;
        arrayList.remove(str);
        if (arrayList.isEmpty()) {
            WeakReference<ActivityC8943b> weakReference = f17045d;
            if (weakReference != null) {
                weakReference.clear();
            }
            f17045d = null;
            super.finish();
            if (Integer.valueOf(Build.VERSION.SDK_INT).intValue() > 5) {
                overridePendingTransition(0, 0);
            }
        }
    }

    /* renamed from: o */
    public final Activity m2847o() {
        WeakReference<Activity> weakReference = this.f17048c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0629l, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        InterfaceC8942a interfaceC8942a;
        f17045d = new WeakReference<>(this);
        super.onCreate(bundle);
        setContentView(R.layout.layout_dialogx_empty);
        int intExtra = getIntent().getIntExtra("fromActivityUiStatus", 0);
        if (intExtra == 0) {
            getWindow().getDecorView().setSystemUiVisibility(AdRequest.MAX_CONTENT_URL_LENGTH);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(intExtra | AdRequest.MAX_CONTENT_URL_LENGTH);
        }
        this.f17046a = getIntent().getIntExtra("from", 0);
        String stringExtra = getIntent().getStringExtra("dialogXKey");
        if (stringExtra == null) {
            interfaceC8942a = null;
        } else {
            interfaceC8942a = (InterfaceC8942a) BaseDialog.f17009t.get(stringExtra);
        }
        if (interfaceC8942a == null) {
            finish();
        } else {
            this.f17047b.add(stringExtra);
            interfaceC8942a.mo2849a(this);
        }
        getWindow().getDecorView().setOnTouchListener(new View$OnTouchListenerC8944a());
    }
}
