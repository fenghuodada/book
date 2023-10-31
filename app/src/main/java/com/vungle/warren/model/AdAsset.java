package com.vungle.warren.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class AdAsset {

    /* renamed from: a */
    public final String f19701a;

    /* renamed from: b */
    public final String f19702b;

    /* renamed from: c */
    public String f19703c;

    /* renamed from: d */
    public final String f19704d;

    /* renamed from: e */
    public final String f19705e;

    /* renamed from: f */
    public int f19706f;

    /* renamed from: g */
    public int f19707g;

    /* renamed from: h */
    public long f19708h;

    /* renamed from: i */
    public int f19709i;

    /* renamed from: j */
    public int f19710j;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ErrorType {
        public static final int CANNOT_RETRY_ERROR = 2;
        public static final int CAN_RETRY_ERROR = 1;
        public static final int NO_ERROR = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface FileType {
        public static final int ASSET = 2;
        public static final int ZIP = 0;
        public static final int ZIP_ASSET = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Status {
        public static final int DOWNLOAD_FAILED = 2;
        public static final int DOWNLOAD_RUNNING = 1;
        public static final int DOWNLOAD_SUCCESS = 3;
        public static final int NEW = 0;
        public static final int PROCESSED = 4;
    }

    public AdAsset(@NonNull String str, @Nullable String str2, @NonNull String str3) {
        this(str, str2, str3, UUID.randomUUID().toString());
    }

    public AdAsset(@NonNull String str, @Nullable String str2, @NonNull String str3, String str4) {
        this.f19701a = str4;
        this.f19702b = str;
        this.f19704d = str2;
        this.f19705e = str3;
        this.f19708h = -1L;
        this.f19709i = 0;
        this.f19710j = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdAsset.class != obj.getClass()) {
            return false;
        }
        AdAsset adAsset = (AdAsset) obj;
        if (this.f19706f == adAsset.f19706f && this.f19707g == adAsset.f19707g && this.f19708h == adAsset.f19708h && this.f19709i == adAsset.f19709i && this.f19710j == adAsset.f19710j) {
            String str = adAsset.f19701a;
            String str2 = this.f19701a;
            if (str2 == null ? str == null : str2.equals(str)) {
                String str3 = adAsset.f19702b;
                String str4 = this.f19702b;
                if (str4 == null ? str3 == null : str4.equals(str3)) {
                    String str5 = this.f19703c;
                    if (str5 == null ? adAsset.f19703c == null : str5.equals(adAsset.f19703c)) {
                        String str6 = adAsset.f19704d;
                        String str7 = this.f19704d;
                        if (str7 == null ? str6 == null : str7.equals(str6)) {
                            String str8 = adAsset.f19705e;
                            String str9 = this.f19705e;
                            return str9 != null ? str9.equals(str8) : str8 == null;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19701a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f19702b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19703c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f19704d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f19705e;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        long j = this.f19708h;
        return ((((((((((hashCode4 + hashCode5) * 31) + this.f19706f) * 31) + this.f19707g) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f19709i) * 31) + this.f19710j;
    }

    public final String toString() {
        return "AdAsset{identifier='" + this.f19701a + "', adIdentifier='" + this.f19702b + "', serverPath='" + this.f19704d + "', localPath='" + this.f19705e + "', status=" + this.f19706f + ", fileType=" + this.f19707g + ", fileSize=" + this.f19708h + ", retryCount=" + this.f19709i + ", retryTypeError=" + this.f19710j + '}';
    }
}
