package android.support.p000v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaDescriptionCompat */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0007a();

    /* renamed from: a */
    public final String f4a;

    /* renamed from: b */
    public final CharSequence f5b;

    /* renamed from: c */
    public final CharSequence f6c;

    /* renamed from: d */
    public final CharSequence f7d;

    /* renamed from: e */
    public final Bitmap f8e;

    /* renamed from: f */
    public final Uri f9f;

    /* renamed from: g */
    public final Bundle f10g;

    /* renamed from: h */
    public final Uri f11h;

    /* renamed from: i */
    public MediaDescription f12i;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    /* loaded from: classes.dex */
    public class C0007a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m13074b(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public MediaDescriptionCompat() {
        throw null;
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f4a = str;
        this.f5b = charSequence;
        this.f6c = charSequence2;
        this.f7d = charSequence3;
        this.f8e = bitmap;
        this.f9f = uri;
        this.f10g = bundle;
        this.f11h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.p000v4.media.MediaDescriptionCompat m13074b(java.lang.Object r13) {
        /*
            r0 = 0
            if (r13 == 0) goto L5d
            android.media.MediaDescription r13 = (android.media.MediaDescription) r13
            java.lang.String r2 = r13.getMediaId()
            java.lang.CharSequence r3 = r13.getTitle()
            java.lang.CharSequence r4 = r13.getSubtitle()
            java.lang.CharSequence r5 = r13.getDescription()
            android.graphics.Bitmap r6 = r13.getIconBitmap()
            android.net.Uri r7 = r13.getIconUri()
            android.os.Bundle r1 = r13.getExtras()
            if (r1 == 0) goto L27
            android.os.Bundle r1 = android.support.p000v4.media.session.MediaSessionCompat.m13072b(r1)
        L27:
            java.lang.String r8 = "android.support.v4.media.description.MEDIA_URI"
            if (r1 == 0) goto L32
            android.os.Parcelable r9 = r1.getParcelable(r8)
            android.net.Uri r9 = (android.net.Uri) r9
            goto L33
        L32:
            r9 = r0
        L33:
            if (r9 == 0) goto L4c
            java.lang.String r10 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r11 = r1.containsKey(r10)
            if (r11 == 0) goto L46
            int r11 = r1.size()
            r12 = 2
            if (r11 != r12) goto L46
            r8 = r0
            goto L4d
        L46:
            r1.remove(r8)
            r1.remove(r10)
        L4c:
            r8 = r1
        L4d:
            if (r9 == 0) goto L50
            goto L55
        L50:
            android.net.Uri r0 = r13.getMediaUri()
            r9 = r0
        L55:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.f12i = r13
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.media.MediaDescriptionCompat.m13074b(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f5b) + ", " + ((Object) this.f6c) + ", " + ((Object) this.f7d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescription = this.f12i;
        if (mediaDescription == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f4a);
            builder.setTitle(this.f5b);
            builder.setSubtitle(this.f6c);
            builder.setDescription(this.f7d);
            builder.setIconBitmap(this.f8e);
            builder.setIconUri(this.f9f);
            builder.setExtras(this.f10g);
            builder.setMediaUri(this.f11h);
            mediaDescription = builder.build();
            this.f12i = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i);
    }
}
