package androidx.datastore.preferences.protobuf;

import android.net.Uri;

/* renamed from: androidx.datastore.preferences.protobuf.a1 */
/* loaded from: classes.dex */
public final class C1155a1 {
    /* renamed from: a */
    public static boolean m11147a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
}
