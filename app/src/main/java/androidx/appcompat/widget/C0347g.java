package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.C0158a;
import androidx.core.view.InterfaceC0969m0;
import androidx.core.widget.InterfaceC1061p;
import androidx.core.widget.TextViewCompat;

/* renamed from: androidx.appcompat.widget.g */
/* loaded from: classes.dex */
public final class C0347g extends CheckedTextView implements InterfaceC0969m0, InterfaceC1061p {

    /* renamed from: a */
    public final C0351h f1247a;

    /* renamed from: b */
    public final C0326e f1248b;

    /* renamed from: c */
    public final C0327e0 f1249c;
    @NonNull

    /* renamed from: d */
    public C0382m f1250d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:3:0x0047, B:5:0x004e, B:7:0x0054, B:11:0x0063, B:13:0x0069, B:15:0x006f, B:16:0x007a, B:18:0x0081, B:19:0x0088, B:21:0x008f), top: B:28:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #0 {all -> 0x00a7, blocks: (B:3:0x0047, B:5:0x004e, B:7:0x0054, B:11:0x0063, B:13:0x0069, B:15:0x006f, B:16:0x007a, B:18:0x0081, B:19:0x0088, B:21:0x008f), top: B:28:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0347g(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.Nullable android.util.AttributeSet r9) {
        /*
            r7 = this;
            androidx.appcompat.widget.C0419u1.m12491a(r8)
            r0 = 2130968818(0x7f0400f2, float:1.75463E38)
            r7.<init>(r8, r9, r0)
            android.content.Context r8 = r7.getContext()
            androidx.appcompat.widget.C0413s1.m12501a(r7, r8)
            androidx.appcompat.widget.e0 r8 = new androidx.appcompat.widget.e0
            r8.<init>(r7)
            r7.f1249c = r8
            r8.m12673f(r9, r0)
            r8.m12677b()
            androidx.appcompat.widget.e r8 = new androidx.appcompat.widget.e
            r8.<init>(r7)
            r7.f1248b = r8
            r8.m12684d(r9, r0)
            androidx.appcompat.widget.h r8 = new androidx.appcompat.widget.h
            r8.<init>(r7)
            r7.f1247a = r8
            android.content.Context r8 = r7.getContext()
            int[] r3 = androidx.appcompat.C0157c.f421l
            androidx.appcompat.widget.x1 r8 = androidx.appcompat.widget.C0430x1.m12465m(r8, r9, r3, r0)
            android.content.Context r2 = r7.getContext()
            android.content.res.TypedArray r5 = r8.f1406b
            r6 = 2130968818(0x7f0400f2, float:1.75463E38)
            r1 = r7
            r4 = r9
            androidx.core.view.ViewCompat.m11772m(r1, r2, r3, r4, r5, r6)
            r1 = 1
            boolean r2 = r8.m12466l(r1)     // Catch: java.lang.Throwable -> La7
            r3 = 0
            if (r2 == 0) goto L60
            int r2 = r8.m12469i(r1, r3)     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto L60
            android.content.Context r4 = r7.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L60 java.lang.Throwable -> La7
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.C0158a.m12920a(r4, r2)     // Catch: android.content.res.Resources.NotFoundException -> L60 java.lang.Throwable -> La7
            r7.setCheckMarkDrawable(r2)     // Catch: android.content.res.Resources.NotFoundException -> L60 java.lang.Throwable -> La7
            goto L61
        L60:
            r1 = r3
        L61:
            if (r1 != 0) goto L7a
            boolean r1 = r8.m12466l(r3)     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L7a
            int r1 = r8.m12469i(r3, r3)     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L7a
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> La7
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.C0158a.m12920a(r2, r1)     // Catch: java.lang.Throwable -> La7
            r7.setCheckMarkDrawable(r1)     // Catch: java.lang.Throwable -> La7
        L7a:
            r1 = 2
            boolean r2 = r8.m12466l(r1)     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto L88
            android.content.res.ColorStateList r1 = r8.m12476b(r1)     // Catch: java.lang.Throwable -> La7
            r7.setCheckMarkTintList(r1)     // Catch: java.lang.Throwable -> La7
        L88:
            r1 = 3
            boolean r2 = r8.m12466l(r1)     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto L9c
            r2 = -1
            int r1 = r8.m12470h(r1, r2)     // Catch: java.lang.Throwable -> La7
            r2 = 0
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.widget.C0427x0.m12479c(r1, r2)     // Catch: java.lang.Throwable -> La7
            r7.setCheckMarkTintMode(r1)     // Catch: java.lang.Throwable -> La7
        L9c:
            r8.m12464n()
            androidx.appcompat.widget.m r8 = r7.getEmojiTextViewHelper()
            r8.m12579b(r9, r0)
            return
        La7:
            r9 = move-exception
            r8.m12464n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0347g.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @NonNull
    private C0382m getEmojiTextViewHelper() {
        if (this.f1250d == null) {
            this.f1250d = new C0382m(this);
        }
        return this.f1250d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0327e0 c0327e0 = this.f1249c;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
        C0326e c0326e = this.f1248b;
        if (c0326e != null) {
            c0326e.m12687a();
        }
        C0351h c0351h = this.f1247a;
        if (c0351h != null) {
            c0351h.m12630a();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.m11299d(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0326e c0326e = this.f1248b;
        if (c0326e != null) {
            return c0326e.m12686b();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0326e c0326e = this.f1248b;
        if (c0326e != null) {
            return c0326e.m12685c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCheckMarkTintList() {
        C0351h c0351h = this.f1247a;
        if (c0351h != null) {
            return c0351h.f1259b;
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0351h c0351h = this.f1247a;
        if (c0351h != null) {
            return c0351h.f1260c;
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1249c.m12675d();
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1249c.m12674e();
    }

    @Override // android.widget.TextView, android.view.View
    @Nullable
    public final InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0388n.m12565a(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m12578c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0326e c0326e = this.f1248b;
        if (c0326e != null) {
            c0326e.m12683e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        C0326e c0326e = this.f1248b;
        if (c0326e != null) {
            c0326e.m12682f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@DrawableRes int i) {
        setCheckMarkDrawable(C0158a.m12920a(getContext(), i));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@Nullable Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0351h c0351h = this.f1247a;
        if (c0351h != null) {
            if (c0351h.f1263f) {
                c0351h.f1263f = false;
                return;
            }
            c0351h.f1263f = true;
            c0351h.m12630a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0327e0 c0327e0 = this.f1249c;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0327e0 c0327e0 = this.f1249c;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m11298e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m12577d(z);
    }

    @Override // androidx.core.view.InterfaceC0969m0
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C0326e c0326e = this.f1248b;
        if (c0326e != null) {
            c0326e.m12680h(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C0326e c0326e = this.f1248b;
        if (c0326e != null) {
            c0326e.m12679i(mode);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintList(@Nullable ColorStateList colorStateList) {
        C0351h c0351h = this.f1247a;
        if (c0351h != null) {
            c0351h.f1259b = colorStateList;
            c0351h.f1261d = true;
            c0351h.m12630a();
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode mode) {
        C0351h c0351h = this.f1247a;
        if (c0351h != null) {
            c0351h.f1260c = mode;
            c0351h.f1262e = true;
            c0351h.m12630a();
        }
    }

    @Override // androidx.core.widget.InterfaceC1061p
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        C0327e0 c0327e0 = this.f1249c;
        c0327e0.m12667l(colorStateList);
        c0327e0.m12677b();
    }

    @Override // androidx.core.widget.InterfaceC1061p
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        C0327e0 c0327e0 = this.f1249c;
        c0327e0.m12666m(mode);
        c0327e0.m12677b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(@NonNull Context context, int i) {
        super.setTextAppearance(context, i);
        C0327e0 c0327e0 = this.f1249c;
        if (c0327e0 != null) {
            c0327e0.m12672g(context, i);
        }
    }
}
