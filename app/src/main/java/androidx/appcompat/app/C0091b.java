package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.b */
/* loaded from: classes.dex */
public final class C0091b implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertController f222a;

    /* renamed from: b */
    public final /* synthetic */ AlertController.C0083b f223b;

    public C0091b(AlertController.C0083b c0083b, AlertController alertController) {
        this.f223b = c0083b;
        this.f222a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        AlertController.C0083b c0083b = this.f223b;
        DialogInterface.OnClickListener onClickListener = c0083b.f200l;
        AlertController alertController = this.f222a;
        onClickListener.onClick(alertController.f161b, i);
        if (c0083b.f202n) {
            return;
        }
        alertController.f161b.dismiss();
    }
}
