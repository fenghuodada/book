package com.ambrose.overwall.fragment.child;

import android.widget.TextView;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.widget.grouplist.QMUICommonListItemView;
import io.reactivex.rxjava3.functions.InterfaceC10174b;

/* renamed from: com.ambrose.overwall.fragment.child.p */
/* loaded from: classes.dex */
public final class C2441p implements InterfaceC10174b<Long> {

    /* renamed from: b */
    public final /* synthetic */ C2439o f5851b;

    public C2441p(C2439o c2439o) {
        this.f5851b = c2439o;
    }

    @Override // io.reactivex.rxjava3.functions.InterfaceC10174b
    public final void accept(Long l) throws Throwable {
        TextView textView;
        String str;
        String m9416x = C2439o.m9416x();
        C2439o c2439o = this.f5851b;
        c2439o.f5843A = m9416x;
        QMUICommonListItemView qMUICommonListItemView = c2439o.f5846w;
        if (qMUICommonListItemView != null) {
            qMUICommonListItemView.setDetailText(m9416x);
        }
        if (!c2439o.f5843A.contains("192.168") && (textView = c2439o.f5844B.f5777c) != null) {
            str = c2439o.getString(R.string.local_iptps);
        } else {
            textView = c2439o.f5844B.f5777c;
            str = "";
        }
        textView.setText(str);
    }
}
