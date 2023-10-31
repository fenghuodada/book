package androidx.core.view.inputmethod;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.inputmethod.C0948m;

/* renamed from: androidx.core.view.inputmethod.f */
/* loaded from: classes.dex */
public final class C0941f extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0943h f2640a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0941f(InputConnection inputConnection, C0940e c0940e) {
        super(inputConnection, false);
        this.f2640a = c0940e;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C0948m c0948m;
        if (inputContentInfo == null || Build.VERSION.SDK_INT < 25) {
            c0948m = null;
        } else {
            c0948m = new C0948m(new C0948m.C0949a(inputContentInfo));
        }
        if (((C0940e) this.f2640a).m11444a(c0948m, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
