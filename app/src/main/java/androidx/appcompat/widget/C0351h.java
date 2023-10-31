package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.C0700a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: androidx.appcompat.widget.h */
/* loaded from: classes.dex */
public final class C0351h {
    @NonNull

    /* renamed from: a */
    public final CheckedTextView f1258a;

    /* renamed from: b */
    public ColorStateList f1259b = null;

    /* renamed from: c */
    public PorterDuff.Mode f1260c = null;

    /* renamed from: d */
    public boolean f1261d = false;

    /* renamed from: e */
    public boolean f1262e = false;

    /* renamed from: f */
    public boolean f1263f;

    public C0351h(@NonNull CheckedTextView checkedTextView) {
        this.f1258a = checkedTextView;
    }

    /* renamed from: a */
    public final void m12630a() {
        CheckedTextView checkedTextView = this.f1258a;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1261d || this.f1262e) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f1261d) {
                    C0700a.C0702b.m11924h(mutate, this.f1259b);
                }
                if (this.f1262e) {
                    C0700a.C0702b.m11923i(mutate, this.f1260c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(mutate);
            }
        }
    }
}
