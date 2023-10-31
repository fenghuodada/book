package com.google.android.exoplayer2;

import com.facebook.ads.AdError;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.C */
/* loaded from: classes.dex */
public final class C6622C {

    /* renamed from: a */
    public static final UUID f10466a = new UUID(0, 0);

    /* renamed from: b */
    public static final UUID f10467b = new UUID(1186680826959645954L, -5988876978535335093L);

    /* renamed from: c */
    public static final UUID f10468c = new UUID(-2129748144642739255L, 8654423357094679310L);

    /* renamed from: d */
    public static final UUID f10469d = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* renamed from: e */
    public static final UUID f10470e = new UUID(-7348484286925749626L, -6083546864340672619L);

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$AudioAllowedCapturePolicy */
    /* loaded from: classes.dex */
    public @interface AudioAllowedCapturePolicy {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$AudioContentType */
    /* loaded from: classes.dex */
    public @interface AudioContentType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$AudioFlags */
    /* loaded from: classes.dex */
    public @interface AudioFlags {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$AudioFocusGain */
    /* loaded from: classes.dex */
    public @interface AudioFocusGain {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$AudioUsage */
    /* loaded from: classes.dex */
    public @interface AudioUsage {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$BufferFlags */
    /* loaded from: classes.dex */
    public @interface BufferFlags {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$ColorRange */
    /* loaded from: classes.dex */
    public @interface ColorRange {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$ColorSpace */
    /* loaded from: classes.dex */
    public @interface ColorSpace {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$ColorTransfer */
    /* loaded from: classes.dex */
    public @interface ColorTransfer {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$ContentType */
    /* loaded from: classes.dex */
    public @interface ContentType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$CryptoMode */
    /* loaded from: classes.dex */
    public @interface CryptoMode {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$DataType */
    /* loaded from: classes.dex */
    public @interface DataType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$Encoding */
    /* loaded from: classes.dex */
    public @interface Encoding {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$FormatSupport */
    /* loaded from: classes.dex */
    public @interface FormatSupport {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$NetworkType */
    /* loaded from: classes.dex */
    public @interface NetworkType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$PcmEncoding */
    /* loaded from: classes.dex */
    public @interface PcmEncoding {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$Projection */
    /* loaded from: classes.dex */
    public @interface Projection {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$RoleFlags */
    /* loaded from: classes.dex */
    public @interface RoleFlags {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$SelectionFlags */
    /* loaded from: classes.dex */
    public @interface SelectionFlags {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$StereoMode */
    /* loaded from: classes.dex */
    public @interface StereoMode {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$StreamType */
    /* loaded from: classes.dex */
    public @interface StreamType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$VideoOutputMode */
    /* loaded from: classes.dex */
    public @interface VideoOutputMode {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$VideoScalingMode */
    /* loaded from: classes.dex */
    public @interface VideoScalingMode {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$WakeMode */
    /* loaded from: classes.dex */
    public @interface WakeMode {
    }

    /* renamed from: a */
    public static int m6218a(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i != 10) {
            if (i != 7) {
                if (i != 8) {
                    switch (i) {
                        case 15:
                            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                        case 16:
                        case 18:
                            return 6005;
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            return 6004;
                        default:
                            switch (i) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                    return AdError.ICONVIEW_MISSING_ERROR_CODE;
                                default:
                                    return 6006;
                            }
                    }
                }
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            }
            return 6005;
        }
        return 6004;
    }

    /* renamed from: b */
    public static long m6217b(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* renamed from: c */
    public static long m6216c(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }
}
