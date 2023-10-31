package com.qmuiteam.qmui.widget.dialog;

import com.ambrose.overwall.R;
import com.qmuiteam.qmui.layout.C9057a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public final class QMUIDialogAction {

    /* renamed from: a */
    public final CharSequence f17681a;

    /* renamed from: f */
    public C9057a f17686f;

    /* renamed from: b */
    public int f17682b = 0;

    /* renamed from: c */
    public int f17683c = 1;

    /* renamed from: d */
    public int f17684d = R.attr.qmui_skin_support_dialog_action_divider_color;

    /* renamed from: g */
    public final boolean f17687g = true;

    /* renamed from: e */
    public InterfaceC9166a f17685e = null;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Prop {
    }

    /* renamed from: com.qmuiteam.qmui.widget.dialog.QMUIDialogAction$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC9166a {
        /* renamed from: a */
        void mo2596a(DialogC9181l dialogC9181l);
    }

    public QMUIDialogAction(String str) {
        this.f17681a = str;
    }
}
