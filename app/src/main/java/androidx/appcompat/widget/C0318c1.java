package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: androidx.appcompat.widget.c1 */
/* loaded from: classes.dex */
public final class C0318c1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    public final /* synthetic */ C0334e1 f1163a;

    public C0318c1(C0334e1 c0334e1) {
        this.f1163a = c0334e1;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C0435z0 c0435z0;
        if (i == -1 || (c0435z0 = this.f1163a.f1198c) == null) {
            return;
        }
        c0435z0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
