package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import androidx.collection.C0482i;
import androidx.core.p003os.BuildCompat;
import androidx.core.view.C0957k;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.C1484n;
import androidx.lifecycle.FragmentC1502w;
import androidx.lifecycle.InterfaceC1483m;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.app.l */
/* loaded from: classes.dex */
public class ActivityC0629l extends Activity implements InterfaceC1483m, C0957k.InterfaceC0958a {
    private C0482i<Class<? extends C0630a>, C0630a> mExtraDataMap = new C0482i<>();
    private C1484n mLifecycleRegistry = new C1484n(this);

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    /* renamed from: androidx.core.app.l$a */
    /* loaded from: classes.dex */
    public static class C0630a {
    }

    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    private static boolean shouldSkipDump(@Nullable String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -645125871:
                if (str.equals("--translation")) {
                    c = 0;
                    break;
                }
                break;
            case 100470631:
                if (str.equals("--dump-dumpable")) {
                    c = 1;
                    break;
                }
                break;
            case 472614934:
                if (str.equals("--list-dumpables")) {
                    c = 2;
                    break;
                }
                break;
            case 1159329357:
                if (str.equals("--contentcapture")) {
                    c = 3;
                    break;
                }
                break;
            case 1455016274:
                if (str.equals("--autofill")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Build.VERSION.SDK_INT >= 31;
            case 1:
            case 2:
                return BuildCompat.m11866c();
            case 3:
                return Build.VERSION.SDK_INT >= 29;
            case 4:
                return Build.VERSION.SDK_INT >= 26;
            default:
                return false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0957k.m11427a(decorView, keyEvent)) {
            return C0957k.m11426b(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0957k.m11427a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public <T extends C0630a> T getExtraData(Class<T> cls) {
        return (T) this.mExtraDataMap.getOrDefault(cls, null);
    }

    @NonNull
    public AbstractC1464h getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC1502w.f3479b;
        FragmentC1502w.C1504b.m10521b(this);
    }

    @Override // android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        C1484n c1484n = this.mLifecycleRegistry;
        AbstractC1464h.EnumC1468b enumC1468b = AbstractC1464h.EnumC1468b.CREATED;
        c1484n.getClass();
        c1484n.m10535e("markState");
        c1484n.m10532h(enumC1468b);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public void putExtraData(C0630a c0630a) {
        this.mExtraDataMap.put(c0630a.getClass(), c0630a);
    }

    public final boolean shouldDumpInternalState(@Nullable String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    @Override // androidx.core.view.C0957k.InterfaceC0958a
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public boolean superDispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
