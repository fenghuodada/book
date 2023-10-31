package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.applovin.impl.sdk.p033e.C3132a0;
import com.bumptech.glide.load.C3578h;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.f0 */
/* loaded from: classes.dex */
public final class C3690f0<T> implements InterfaceC3583k<T, Bitmap> {

    /* renamed from: d */
    public static final C3578h<Long> f9652d = new C3578h<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C3691a());

    /* renamed from: e */
    public static final C3578h<Integer> f9653e = new C3578h<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C3692b());

    /* renamed from: f */
    public static final C3695e f9654f = new C3695e();

    /* renamed from: a */
    public final InterfaceC3696f<T> f9655a;

    /* renamed from: b */
    public final InterfaceC3485d f9656b;

    /* renamed from: c */
    public final C3695e f9657c = f9654f;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.f0$a */
    /* loaded from: classes.dex */
    public class C3691a implements C3578h.InterfaceC3580b<Long> {

        /* renamed from: a */
        public final ByteBuffer f9658a = ByteBuffer.allocate(8);

        @Override // com.bumptech.glide.load.C3578h.InterfaceC3580b
        /* renamed from: a */
        public final void mo6564a(@NonNull byte[] bArr, @NonNull Long l, @NonNull MessageDigest messageDigest) {
            Long l2 = l;
            messageDigest.update(bArr);
            synchronized (this.f9658a) {
                this.f9658a.position(0);
                messageDigest.update(this.f9658a.putLong(l2.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.f0$b */
    /* loaded from: classes.dex */
    public class C3692b implements C3578h.InterfaceC3580b<Integer> {

        /* renamed from: a */
        public final ByteBuffer f9659a = ByteBuffer.allocate(4);

        @Override // com.bumptech.glide.load.C3578h.InterfaceC3580b
        /* renamed from: a */
        public final void mo6564a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 != null) {
                messageDigest.update(bArr);
                synchronized (this.f9659a) {
                    this.f9659a.position(0);
                    messageDigest.update(this.f9659a.putInt(num2.intValue()).array());
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.f0$c */
    /* loaded from: classes.dex */
    public static final class C3693c implements InterfaceC3696f<AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.resource.bitmap.C3690f0.InterfaceC3696f
        /* renamed from: a */
        public final void mo6563a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    @RequiresApi(23)
    /* renamed from: com.bumptech.glide.load.resource.bitmap.f0$d */
    /* loaded from: classes.dex */
    public static final class C3694d implements InterfaceC3696f<ByteBuffer> {
        @Override // com.bumptech.glide.load.resource.bitmap.C3690f0.InterfaceC3696f
        /* renamed from: a */
        public final void mo6563a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new C3700g0(byteBuffer));
        }
    }

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.resource.bitmap.f0$e */
    /* loaded from: classes.dex */
    public static class C3695e {
    }

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.resource.bitmap.f0$f */
    /* loaded from: classes.dex */
    public interface InterfaceC3696f<T> {
        /* renamed from: a */
        void mo6563a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.f0$g */
    /* loaded from: classes.dex */
    public static final class C3697g implements InterfaceC3696f<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.resource.bitmap.C3690f0.InterfaceC3696f
        /* renamed from: a */
        public final void mo6563a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.f0$h */
    /* loaded from: classes.dex */
    public static final class C3698h extends RuntimeException {
        public C3698h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public C3690f0(InterfaceC3485d interfaceC3485d, InterfaceC3696f<T> interfaceC3696f) {
        this.f9656b = interfaceC3485d;
        this.f9655a = interfaceC3696f;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    @androidx.annotation.Nullable
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap m6565c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, com.bumptech.glide.load.resource.bitmap.AbstractC3710l r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L60
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L60
            if (r14 == r0) goto L60
            com.bumptech.glide.load.resource.bitmap.l$f r0 = com.bumptech.glide.load.resource.bitmap.AbstractC3710l.f9673d
            if (r15 == r0) goto L60
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch: java.lang.Throwable -> L51
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L51
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch: java.lang.Throwable -> L51
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L51
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch: java.lang.Throwable -> L51
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L51
            r3 = 90
            if (r2 == r3) goto L36
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L39
        L36:
            r8 = r1
            r1 = r0
            r0 = r8
        L39:
            float r13 = r15.mo6554b(r0, r1, r13, r14)     // Catch: java.lang.Throwable -> L51
            float r14 = (float) r0     // Catch: java.lang.Throwable -> L51
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch: java.lang.Throwable -> L51
            float r14 = (float) r1     // Catch: java.lang.Throwable -> L51
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch: java.lang.Throwable -> L51
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = com.bumptech.glide.load.resource.bitmap.C3688e0.m6566a(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L51
            goto L61
        L51:
            r13 = move-exception
            r14 = 3
            java.lang.String r15 = "VideoDecoder"
            boolean r14 = android.util.Log.isLoggable(r15, r14)
            if (r14 == 0) goto L60
            java.lang.String r14 = "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"
            android.util.Log.d(r15, r14, r13)
        L60:
            r13 = 0
        L61:
            if (r13 != 0) goto L67
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L67:
            if (r13 == 0) goto L6a
            return r13
        L6a:
            com.bumptech.glide.load.resource.bitmap.f0$h r9 = new com.bumptech.glide.load.resource.bitmap.f0$h
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C3690f0.m6565c(android.media.MediaMetadataRetriever, long, int, int, int, com.bumptech.glide.load.resource.bitmap.l):android.graphics.Bitmap");
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: a */
    public final boolean mo6504a(@NonNull T t, @NonNull C3581i c3581i) {
        return true;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: b */
    public final InterfaceC3573x<Bitmap> mo6503b(@NonNull T t, int i, int i2, @NonNull C3581i c3581i) throws IOException {
        long longValue = ((Long) c3581i.m6606c(f9652d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(C3132a0.m7696a("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
        Integer num = (Integer) c3581i.m6606c(f9653e);
        if (num == null) {
            num = 2;
        }
        AbstractC3710l abstractC3710l = (AbstractC3710l) c3581i.m6606c(AbstractC3710l.f9675f);
        if (abstractC3710l == null) {
            abstractC3710l = AbstractC3710l.f9674e;
        }
        AbstractC3710l abstractC3710l2 = abstractC3710l;
        this.f9657c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f9655a.mo6563a(mediaMetadataRetriever, t);
            Bitmap m6565c = m6565c(mediaMetadataRetriever, longValue, num.intValue(), i, i2, abstractC3710l2);
            mediaMetadataRetriever.release();
            return C3687e.m6567b(m6565c, this.f9656b);
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }
}
