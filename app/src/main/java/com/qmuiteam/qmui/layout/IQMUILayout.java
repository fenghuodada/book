package com.qmuiteam.qmui.layout;

import androidx.annotation.ColorInt;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public interface IQMUILayout {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface HideRadiusSide {
    }

    /* renamed from: a */
    boolean mo2547a();

    /* renamed from: b */
    boolean mo2546b();

    /* renamed from: c */
    boolean mo2545c();

    /* renamed from: e */
    void mo2544e(int i);

    /* renamed from: g */
    boolean mo2543g();

    /* renamed from: h */
    void mo2542h(int i);

    /* renamed from: i */
    boolean mo2541i();

    /* renamed from: p */
    void mo2540p(int i);

    /* renamed from: q */
    void mo2539q(int i);

    void setBorderColor(@ColorInt int i);
}
