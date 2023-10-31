package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.C0321d0;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.InterfaceC0959k0;
import androidx.core.view.InterfaceC0969m0;
import androidx.core.view.ViewCompat;
import androidx.core.widget.C1059n;
import androidx.core.widget.InterfaceC1061p;
import androidx.core.widget.TextViewCompat;
import com.ambrose.overwall.R;

/* renamed from: androidx.appcompat.widget.k */
/* loaded from: classes.dex */
public class C0368k extends EditText implements InterfaceC0969m0, InterfaceC0959k0, InterfaceC1061p {

    /* renamed from: a */
    public final C0326e f1288a;

    /* renamed from: b */
    public final C0327e0 f1289b;

    /* renamed from: c */
    public final C0321d0 f1290c;

    /* renamed from: d */
    public final C1059n f1291d;
    @NonNull

    /* renamed from: e */
    public final C0379l f1292e;
    @Nullable

    /* renamed from: f */
    public C0369a f1293f;

    @RequiresApi(api = 26)
    /* renamed from: androidx.appcompat.widget.k$a */
    /* loaded from: classes.dex */
    public class C0369a {
        public C0369a() {
        }
    }

    public C0368k(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0368k(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.editTextStyle);
        C0419u1.m12491a(context);
        C0413s1.m12501a(this, getContext());
        C0326e c0326e = new C0326e(this);
        this.f1288a = c0326e;
        c0326e.m12684d(attributeSet, R.attr.editTextStyle);
        C0327e0 c0327e0 = new C0327e0(this);
        this.f1289b = c0327e0;
        c0327e0.m12673f(attributeSet, R.attr.editTextStyle);
        c0327e0.m12677b();
        this.f1290c = new C0321d0(this);
        this.f1291d = new C1059n();
        C0379l c0379l = new C0379l(this);
        this.f1292e = c0379l;
        c0379l.m12585b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener m12586a = c0379l.m12586a(keyListener);
            if (m12586a != keyListener) {
                super.setKeyListener(m12586a);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @NonNull
    @RequiresApi(26)
    @UiThread
    private C0369a getSuperCaller() {
        if (this.f1293f == null) {
            this.f1293f = new C0369a();
        }
        return this.f1293f;
    }

    @Override // androidx.core.view.InterfaceC0959k0
    @Nullable
    /* renamed from: a */
    public final ContentInfoCompat mo11407a(@NonNull ContentInfoCompat contentInfoCompat) {
        return this.f1291d.mo11242a(this, contentInfoCompat);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0326e c0326e = this.f1288a;
        if (c0326e != null) {
            c0326e.m12687a();
        }
        C0327e0 c0327e0 = this.f1289b;
        if (c0327e0 != null) {
            c0327e0.m12677b();
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
        C0326e c0326e = this.f1288a;
        if (c0326e != null) {
            return c0326e.m12686b();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0326e c0326e = this.f1288a;
        if (c0326e != null) {
            return c0326e.m12685c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1289b.m12675d();
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1289b.m12674e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    @Nullable
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        C0321d0 c0321d0;
        if (Build.VERSION.SDK_INT < 28 && (c0321d0 = this.f1290c) != null) {
            TextClassifier textClassifier = c0321d0.f1169b;
            if (textClassifier == null) {
                return C0321d0.C0322a.m12691a(c0321d0.f1168a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
        if (r1 != null) goto L18;
     */
    @Override // android.widget.TextView, android.view.View
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(@androidx.annotation.NonNull android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            androidx.appcompat.widget.e0 r1 = r7.f1289b
            r1.getClass()
            androidx.appcompat.widget.C0327e0.m12671h(r7, r0, r8)
            androidx.appcompat.widget.C0388n.m12565a(r7, r8, r0)
            if (r0 == 0) goto L76
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L76
            java.lang.String[] r2 = androidx.core.view.ViewCompat.m11778g(r7)
            if (r2 == 0) goto L76
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            androidx.core.view.inputmethod.C0936a.m11448a(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            androidx.core.view.inputmethod.e r2 = new androidx.core.view.inputmethod.e
            r2.<init>(r7)
            if (r1 < r5) goto L4c
            androidx.core.view.inputmethod.f r1 = new androidx.core.view.inputmethod.f
            r1.<init>(r0, r2)
        L4a:
            r0 = r1
            goto L76
        L4c:
            java.lang.String[] r6 = androidx.core.view.inputmethod.C0939d.f2638a
            if (r1 < r5) goto L58
            java.lang.String[] r1 = androidx.core.view.inputmethod.C0937b.m11447a(r8)
            if (r1 == 0) goto L6c
        L56:
            r6 = r1
            goto L6c
        L58:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5d
            goto L6c
        L5d:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L69
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L69:
            if (r1 == 0) goto L6c
            goto L56
        L6c:
            int r1 = r6.length
            if (r1 != 0) goto L70
            goto L76
        L70:
            androidx.core.view.inputmethod.g r1 = new androidx.core.view.inputmethod.g
            r1.<init>(r0, r2)
            goto L4a
        L76:
            androidx.appcompat.widget.l r1 = r7.f1292e
            android.view.inputmethod.InputConnection r8 = r1.m12584c(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0368k.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && ViewCompat.m11778g(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = C0423w.m12486a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        ContentInfoCompat.InterfaceC0806b c0807c;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (i2 < 31 && ViewCompat.m11778g(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i2 >= 31) {
                    c0807c = new ContentInfoCompat.C0805a(primaryClip, 1);
                } else {
                    c0807c = new ContentInfoCompat.C0807c(primaryClip, 1);
                }
                if (i != 16908322) {
                    i3 = 1;
                }
                c0807c.mo11789b(i3);
                ViewCompat.m11775j(this, c0807c.build());
            }
            i3 = 1;
        }
        if (i3 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0326e c0326e = this.f1288a;
        if (c0326e != null) {
            c0326e.m12683e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        C0326e c0326e = this.f1288a;
        if (c0326e != null) {
            c0326e.m12682f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0327e0 c0327e0 = this.f1289b;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0327e0 c0327e0 = this.f1289b;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m11298e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1292e.m12583d(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.f1292e.m12586a(keyListener));
    }

    @Override // androidx.core.view.InterfaceC0969m0
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C0326e c0326e = this.f1288a;
        if (c0326e != null) {
            c0326e.m12680h(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C0326e c0326e = this.f1288a;
        if (c0326e != null) {
            c0326e.m12679i(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1061p
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        C0327e0 c0327e0 = this.f1289b;
        c0327e0.m12667l(colorStateList);
        c0327e0.m12677b();
    }

    @Override // androidx.core.widget.InterfaceC1061p
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        C0327e0 c0327e0 = this.f1289b;
        c0327e0.m12666m(mode);
        c0327e0.m12677b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0327e0 c0327e0 = this.f1289b;
        if (c0327e0 != null) {
            c0327e0.m12672g(context, i);
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        C0321d0 c0321d0;
        if (Build.VERSION.SDK_INT < 28 && (c0321d0 = this.f1290c) != null) {
            c0321d0.f1169b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }
}
