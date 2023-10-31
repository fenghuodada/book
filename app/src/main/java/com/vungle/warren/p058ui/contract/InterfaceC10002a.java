package com.vungle.warren.p058ui.contract;

import android.content.DialogInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.warren.p058ui.C10011f;
import com.vungle.warren.p058ui.InterfaceC10009e;
import com.vungle.warren.p058ui.contract.InterfaceC10003b;

/* renamed from: com.vungle.warren.ui.contract.a */
/* loaded from: classes3.dex */
public interface InterfaceC10002a<T extends InterfaceC10003b> {
    /* renamed from: c */
    void mo1306c();

    void close();

    /* renamed from: d */
    void mo1314d();

    /* renamed from: e */
    void mo1305e(String str, @NonNull String str2, C10011f c10011f, InterfaceC10009e interfaceC10009e);

    /* renamed from: g */
    void mo1304g();

    String getWebsiteUrl();

    /* renamed from: h */
    void mo1303h();

    /* renamed from: k */
    void mo1313k(@Nullable String str, @Nullable String str2, @NonNull String str3, @NonNull String str4, @Nullable DialogInterface.OnClickListener onClickListener);

    /* renamed from: n */
    boolean mo1301n();

    /* renamed from: o */
    void mo1300o(@NonNull String str);

    /* renamed from: p */
    void mo1299p();

    /* renamed from: q */
    void mo1298q(long j);

    /* renamed from: r */
    void mo1312r();

    void setOrientation(int i);

    void setPresenter(@NonNull T t);
}
