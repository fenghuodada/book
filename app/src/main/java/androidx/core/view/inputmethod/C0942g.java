package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* renamed from: androidx.core.view.inputmethod.g */
/* loaded from: classes.dex */
public final class C0942g extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0943h f2641a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0942g(InputConnection inputConnection, C0940e c0940e) {
        super(inputConnection, false);
        this.f2641a = c0940e;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        byte b;
        String str2;
        ResultReceiver resultReceiver;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        InterfaceC0943h interfaceC0943h = this.f2641a;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        if (bundle != null) {
            if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                b = 0;
            } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                b = 1;
            }
            if (b != 0) {
                str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            } else {
                str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(str2);
                if (b != 0) {
                    str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                } else {
                    str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                }
            } catch (Throwable th) {
                th = th;
                resultReceiver = null;
            }
            try {
                Uri uri = (Uri) bundle.getParcelable(str3);
                if (b != 0) {
                    str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                } else {
                    str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                }
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(str4);
                if (b != 0) {
                    str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                } else {
                    str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                }
                Uri uri2 = (Uri) bundle.getParcelable(str5);
                if (b != 0) {
                    str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                } else {
                    str6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                }
                int i = bundle.getInt(str6);
                if (b != 0) {
                    str7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                } else {
                    str7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                }
                Bundle bundle2 = (Bundle) bundle.getParcelable(str7);
                if (uri != null && clipDescription != null) {
                    z = ((C0940e) interfaceC0943h).m11444a(new C0948m(uri, clipDescription, uri2), i, bundle2);
                }
                if (resultReceiver != null) {
                    resultReceiver.send(z ? 1 : 0, null);
                }
            } catch (Throwable th2) {
                th = th2;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        }
        if (z) {
            return true;
        }
        return super.performPrivateCommand(str, bundle);
    }
}
