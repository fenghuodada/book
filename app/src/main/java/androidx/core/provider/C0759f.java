package androidx.core.provider;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Comparator;

/* renamed from: androidx.core.provider.f */
/* loaded from: classes.dex */
public final class C0759f {

    /* renamed from: a */
    public static final C0757d f2438a = new Comparator() { // from class: androidx.core.provider.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                byte b2 = bArr2[i];
                if (b != b2) {
                    return b - b2;
                }
            }
            return 0;
        }
    };

    @RequiresApi(16)
    /* renamed from: androidx.core.provider.f$a */
    /* loaded from: classes.dex */
    public static class C0760a {
        @DoNotInline
        /* renamed from: a */
        public static Cursor m11825a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[LOOP:1: B:14:0x004c->B:29:0x008f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0093 A[EDGE_INSN: B:79:0x0093->B:31:0x0093 ?: BREAK  , SYNTHETIC] */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.core.provider.C0769n m11826a(@androidx.annotation.NonNull android.content.Context r20, @androidx.annotation.NonNull androidx.core.provider.C0762h r21) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C0759f.m11826a(android.content.Context, androidx.core.provider.h):androidx.core.provider.n");
    }
}
