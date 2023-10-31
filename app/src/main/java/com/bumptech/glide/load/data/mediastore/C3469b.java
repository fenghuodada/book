package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.ComponentCallbacks2C3409b;
import com.bumptech.glide.EnumC3432i;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.data.InterfaceC3452d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.mediastore.b */
/* loaded from: classes.dex */
public final class C3469b implements InterfaceC3452d<InputStream> {

    /* renamed from: a */
    public final Uri f9217a;

    /* renamed from: b */
    public final C3473d f9218b;

    /* renamed from: c */
    public InputStream f9219c;

    /* renamed from: com.bumptech.glide.load.data.mediastore.b$a */
    /* loaded from: classes.dex */
    public static class C3470a implements InterfaceC3472c {

        /* renamed from: b */
        public static final String[] f9220b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f9221a;

        public C3470a(ContentResolver contentResolver) {
            this.f9221a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.InterfaceC3472c
        /* renamed from: a */
        public final Cursor mo6716a(Uri uri) {
            return this.f9221a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f9220b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.mediastore.b$b */
    /* loaded from: classes.dex */
    public static class C3471b implements InterfaceC3472c {

        /* renamed from: b */
        public static final String[] f9222b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f9223a;

        public C3471b(ContentResolver contentResolver) {
            this.f9223a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.InterfaceC3472c
        /* renamed from: a */
        public final Cursor mo6716a(Uri uri) {
            return this.f9223a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f9222b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @VisibleForTesting
    public C3469b(Uri uri, C3473d c3473d) {
        this.f9217a = uri;
        this.f9218b = c3473d;
    }

    /* renamed from: c */
    public static C3469b m6718c(Context context, Uri uri, InterfaceC3472c interfaceC3472c) {
        return new C3469b(uri, new C3473d(ComponentCallbacks2C3409b.m6786b(context).f9036d.m6742f(), interfaceC3472c, ComponentCallbacks2C3409b.m6786b(context).f9037e, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    @NonNull
    /* renamed from: a */
    public final Class<InputStream> mo6579a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    /* renamed from: b */
    public final void mo6578b() {
        InputStream inputStream = this.f9219c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    @NonNull
    /* renamed from: d */
    public final EnumC3444a mo6577d() {
        return EnumC3444a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    /* renamed from: e */
    public final void mo6576e(@NonNull EnumC3432i enumC3432i, @NonNull InterfaceC3452d.InterfaceC3453a<? super InputStream> interfaceC3453a) {
        try {
            InputStream m6717f = m6717f();
            this.f9219c = m6717f;
            interfaceC3453a.mo6589f(m6717f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            interfaceC3453a.mo6590c(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r7 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r7 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0025: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:10:0x0025 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.InputStream m6717f() throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.mediastore.C3469b.m6717f():java.io.InputStream");
    }
}
