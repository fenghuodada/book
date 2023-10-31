package androidx.emoji2.viewsintegration;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.emoji2.text.C1319n;

/* renamed from: androidx.emoji2.viewsintegration.b */
/* loaded from: classes.dex */
public final class C1330b extends Editable.Factory {

    /* renamed from: a */
    public static final Object f3230a = new Object();
    @GuardedBy("INSTANCE_LOCK")

    /* renamed from: b */
    public static volatile C1330b f3231b;
    @Nullable

    /* renamed from: c */
    public static Class<?> f3232c;

    @SuppressLint({"PrivateApi"})
    public C1330b() {
        try {
            f3232c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C1330b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(@NonNull CharSequence charSequence) {
        Class<?> cls = f3232c;
        if (cls != null) {
            return new C1319n(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
