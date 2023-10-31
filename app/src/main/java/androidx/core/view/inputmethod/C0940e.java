package androidx.core.view.inputmethod;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.C0948m;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* renamed from: androidx.core.view.inputmethod.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0940e implements InterfaceC0943h, Deferred.DeferredHandler {

    /* renamed from: a */
    public final /* synthetic */ Object f2639a;

    public /* synthetic */ C0940e(Object obj) {
        this.f2639a = obj;
    }

    /* renamed from: a */
    public final boolean m11444a(C0948m c0948m, int i, Bundle bundle) {
        ContentInfoCompat.InterfaceC0806b c0807c;
        View view = (View) this.f2639a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                c0948m.f2642a.mo11438b();
                InputContentInfo inputContentInfo = (InputContentInfo) c0948m.f2642a.mo11436d();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        }
        ClipDescription description = c0948m.f2642a.getDescription();
        C0948m.InterfaceC0951c interfaceC0951c = c0948m.f2642a;
        ClipData clipData = new ClipData(description, new ClipData.Item(interfaceC0951c.mo11439a()));
        if (i2 >= 31) {
            c0807c = new ContentInfoCompat.C0805a(clipData, 2);
        } else {
            c0807c = new ContentInfoCompat.C0807c(clipData, 2);
        }
        c0807c.mo11790a(interfaceC0951c.mo11437c());
        c0807c.setExtras(bundle);
        if (ViewCompat.m11775j(view, c0807c.build()) == null) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public final void handle(Provider provider) {
        CrashlyticsNativeComponentDeferredProxy.m3350a((CrashlyticsNativeComponentDeferredProxy) this.f2639a, provider);
    }
}
