package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.util.C7408g0;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: com.google.android.exoplayer2.upstream.f */
/* loaded from: classes.dex */
public final class C7359f extends AbstractC7358e {

    /* renamed from: e */
    public final ContentResolver f13761e;
    @Nullable

    /* renamed from: f */
    public Uri f13762f;
    @Nullable

    /* renamed from: g */
    public AssetFileDescriptor f13763g;
    @Nullable

    /* renamed from: h */
    public FileInputStream f13764h;

    /* renamed from: i */
    public long f13765i;

    /* renamed from: j */
    public boolean f13766j;

    /* renamed from: com.google.android.exoplayer2.upstream.f$a */
    /* loaded from: classes.dex */
    public static class C7360a extends C7365j {
        public C7360a(@Nullable IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public C7359f(Context context) {
        super(false);
        this.f13761e = context.getContentResolver();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    public final void close() throws C7360a {
        this.f13762f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f13764h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f13764h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f13763g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C7360a(e, AdError.SERVER_ERROR_CODE);
                    }
                } finally {
                    this.f13763g = null;
                    if (this.f13766j) {
                        this.f13766j = false;
                        m5174m();
                    }
                }
            } catch (Throwable th) {
                this.f13764h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f13763g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f13763g = null;
                        if (this.f13766j) {
                            this.f13766j = false;
                            m5174m();
                        }
                        throw th;
                    } finally {
                        this.f13763g = null;
                        if (this.f13766j) {
                            this.f13766j = false;
                            m5174m();
                        }
                    }
                } catch (IOException e2) {
                    throw new C7360a(e2, AdError.SERVER_ERROR_CODE);
                }
            }
        } catch (IOException e3) {
            throw new C7360a(e3, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: g */
    public final long mo5146g(DataSpec dataSpec) throws C7360a {
        int i = AdError.SERVER_ERROR_CODE;
        try {
            Uri uri = dataSpec.f13712a;
            this.f13762f = uri;
            m5173n(dataSpec);
            AssetFileDescriptor openAssetFileDescriptor = this.f13761e.openAssetFileDescriptor(uri, "r");
            this.f13763g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(valueOf.length() + 36);
                sb.append("Could not open file descriptor for: ");
                sb.append(valueOf);
                throw new C7360a(new IOException(sb.toString()), AdError.SERVER_ERROR_CODE);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f13764h = fileInputStream;
            int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
            long j = dataSpec.f13717f;
            if (i2 == 0 || j <= length) {
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j) - startOffset;
                if (skip == j) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f13765i = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f13765i = position;
                            if (position < 0) {
                                throw new C7360a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j2 = length - skip;
                        this.f13765i = j2;
                        if (j2 < 0) {
                            throw new C7360a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j3 = dataSpec.f13718g;
                    int i3 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
                    if (i3 != 0) {
                        long j4 = this.f13765i;
                        this.f13765i = j4 == -1 ? j3 : Math.min(j4, j3);
                    }
                    this.f13766j = true;
                    m5172o(dataSpec);
                    return i3 != 0 ? j3 : this.f13765i;
                }
                throw new C7360a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            throw new C7360a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (C7360a e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            }
            throw new C7360a(e2, i);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    @Nullable
    /* renamed from: k */
    public final Uri mo5145k() {
        return this.f13762f;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7361g
    public final int read(byte[] bArr, int i, int i2) throws C7360a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13765i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C7360a(e, AdError.SERVER_ERROR_CODE);
            }
        }
        FileInputStream fileInputStream = this.f13764h;
        int i3 = C7408g0.f13905a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f13765i;
        if (j2 != -1) {
            this.f13765i = j2 - read;
        }
        m5175l(read);
        return read;
    }
}
