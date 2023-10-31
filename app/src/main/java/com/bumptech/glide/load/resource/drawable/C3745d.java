package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.drawable.d */
/* loaded from: classes.dex */
public final class C3745d implements InterfaceC3583k<Uri, Drawable> {

    /* renamed from: a */
    public final Context f9724a;

    public C3745d(Context context) {
        this.f9724a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: a */
    public final boolean mo6504a(@NonNull Uri uri, @NonNull C3581i c3581i) throws IOException {
        return uri.getScheme().equals("android.resource");
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    @Nullable
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC3573x<Drawable> mo6503b(@NonNull Uri uri, int i, int i2, @NonNull C3581i c3581i) throws IOException {
        return m6519c(uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bumptech.glide.load.engine.InterfaceC3573x m6519c(@androidx.annotation.NonNull android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.getAuthority()
            android.content.Context r1 = r7.f9724a
            java.lang.String r2 = r1.getPackageName()
            boolean r2 = r0.equals(r2)
            r3 = 0
            if (r2 == 0) goto L12
            goto L22
        L12:
            android.content.Context r0 = r1.createPackageContext(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L17
            goto L23
        L17:
            r2 = move-exception
            java.lang.String r4 = r1.getPackageName()
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto Lb6
        L22:
            r0 = r1
        L23:
            java.util.List r2 = r8.getPathSegments()
            int r4 = r2.size()
            r5 = 2
            r6 = 1
            if (r4 != r5) goto L6e
            java.util.List r2 = r8.getPathSegments()
            java.lang.String r4 = r8.getAuthority()
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            android.content.res.Resources r5 = r0.getResources()
            int r4 = r5.getIdentifier(r2, r3, r4)
            if (r4 != 0) goto L57
            android.content.res.Resources r4 = android.content.res.Resources.getSystem()
            java.lang.String r5 = "android"
            int r4 = r4.getIdentifier(r2, r3, r5)
        L57:
            if (r4 == 0) goto L5a
            goto L84
        L5a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to find resource id for: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L6e:
            int r2 = r2.size()
            java.lang.String r4 = "Unrecognized Uri format: "
            if (r2 != r6) goto La4
            java.util.List r2 = r8.getPathSegments()
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.NumberFormatException -> L91
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.NumberFormatException -> L91
            int r4 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L91
        L84:
            r8 = 0
            android.graphics.drawable.Drawable r0 = com.bumptech.glide.load.resource.drawable.C3742a.m6520a(r1, r0, r4, r8)
            if (r0 == 0) goto L90
            com.bumptech.glide.load.resource.drawable.c r8 = new com.bumptech.glide.load.resource.drawable.c
            r8.<init>(r0)
        L90:
            return r8
        L91:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.<init>(r8, r0)
            throw r1
        La4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        Lb6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to obtain context or unrecognized Uri format for: "
            r1.<init>(r3)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.drawable.C3745d.m6519c(android.net.Uri):com.bumptech.glide.load.engine.x");
    }
}
